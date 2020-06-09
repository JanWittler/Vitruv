package tools.vitruv.framework.variability.vave.util;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static tools.vitruv.framework.variability.vave.VaveConstants.CONSTRAINTS;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONSTRAINT;
import static tools.vitruv.framework.variability.vave.VaveConstants.NAME;
import static tools.vitruv.framework.variability.vave.VaveConstants.AND;
import static tools.vitruv.framework.variability.vave.VaveConstants.OR;
import static tools.vitruv.framework.variability.vave.VaveConstants.ALT;
import static tools.vitruv.framework.variability.vave.VaveConstants.MANDATORY;
import static tools.vitruv.framework.variability.vave.VaveConstants.TRUE;
import static tools.vitruv.framework.variability.vave.VaveConstants.RULE;
import static tools.vitruv.framework.variability.vave.VaveConstants.EXPRESSION;
import static tools.vitruv.framework.variability.vave.VaveConstants.IMPLICATIONIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONJUNCTIONIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.DISJUNCTIONIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.NOTIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.IMP;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONJ;
import static tools.vitruv.framework.variability.vave.VaveConstants.DISJ;
import static tools.vitruv.framework.variability.vave.VaveConstants.NOT;
import static tools.vitruv.framework.variability.vave.VaveConstants.VAR;
import static tools.vitruv.framework.variability.vave.VaveConstants.ATTRIBUTE;

import vavemodel.Constraint;
import vavemodel.GroupType;
import vavemodel.TreeConstraint;
import vavemodel.Variable;
import vavemodel.Variant;
import vavemodel.VavemodelFactory;

public class FeatureIDE2Vave {

	@SuppressWarnings("unchecked")
	public static void createFeatureModelInstance(Resource vavemodel, EObject system, Document oldDoc, Node rootFeature,
			Node struct) throws ParserConfigurationException, IOException, TransformerException {
		// create root feature
		Variant rootVariant = VavemodelFactory.eINSTANCE.createVariant();
		String name = rootFeature.getAttributes().getNamedItem(NAME).getNodeValue();
		rootVariant.setName(name);
		EStructuralFeature rootVariantFeature = getStructuralFeatureValue(system, NAME, "variant");

		if (rootVariant != null) {
			((EList<EObject>) system.eGet(rootVariantFeature)).add(rootVariant);
		}
		iterateFeatureModel(vavemodel, rootVariant, rootFeature);

		// iterate and process the feature model constraints
		if (oldDoc.getElementsByTagName(CONSTRAINTS) != null) {
			Node constraints = oldDoc.getElementsByTagName(CONSTRAINTS).item(0);
			createFeatureModelConstraints(vavemodel, system, rootVariant, constraints);
		}
	}

	@SuppressWarnings("unchecked")
	static void iterateFeatureModel(Resource vm, EObject element, Node featureIn)
			throws IOException, ParserConfigurationException, TransformerException {
		NodeList childs = featureIn.getChildNodes();
		
		// Find variation point type through combination of parents node type and whether a feature is mandatory or not
		TreeConstraint treeconstraint = VavemodelFactory.eINSTANCE.createTreeConstraint();
		EStructuralFeature variationPointFeature = getStructuralFeatureValue(element, NAME, "variationpoint");
		
		for (int i = 0; i < childs.getLength(); i++) {
			Node childElementIn = childs.item(i);
			if (childElementIn.getNodeType() != Node.ELEMENT_NODE || childElementIn.getNodeName() == ATTRIBUTE) {
				continue;
			}
			((EList<EObject>) element.eGet(variationPointFeature)).add(treeconstraint); // add variationpoint to rootvariant
			Variant variant = VavemodelFactory.eINSTANCE.createVariant();

			if (childElementIn.getParentNode().getNodeName() == AND) { // variation point has mandatory variant
				Node attr = childElementIn.getAttributes().getNamedItem(MANDATORY);
				if ((attr != null) && (attr.getNodeValue().equals(TRUE))) {
					treeconstraint.setType(GroupType.XOR);
					EStructuralFeature variantFeature = getStructuralFeatureValue(treeconstraint, NAME, "variant");
					((EList<EObject>) treeconstraint.eGet(variantFeature)).add(variant);
				}
				else {
					treeconstraint.setType(GroupType.XORNONE); // variation point has optional variant
					EStructuralFeature variantFeature = getStructuralFeatureValue(treeconstraint, NAME, "variant");
					((EList<EObject>) treeconstraint.eGet(variantFeature)).add(variant);
				}
			} else if (childElementIn.getParentNode().getNodeName() == OR) {
				treeconstraint.setType(GroupType.OR);
					EStructuralFeature variantFeature = getStructuralFeatureValue(treeconstraint, NAME, "variant");
					((EList<EObject>) treeconstraint.eGet(variantFeature)).add(variant);
			
			} else if (childElementIn.getParentNode().getNodeName() == ALT) {
				treeconstraint.setType(GroupType.XOR);
				EStructuralFeature variantFeature = getStructuralFeatureValue(treeconstraint, NAME, "variant");
				((EList<EObject>) treeconstraint.eGet(variantFeature)).add(variant);
			}

			String name = childElementIn.getAttributes().getNamedItem(NAME).getNodeValue();
			if (((Element) childElementIn).hasAttribute(NAME)) {
				variant.setName(name);
			}
			VaveXMIResourceImpl.saveResource(vm);
			iterateFeatureModel(vm, variant, childElementIn);
		}
	}

	/**
	 * Traverses the constraint section of the feature model and writes the
	 * constraints to the variability model instance which conforms to the
	 * variability metamodel of the INTEGRATE platform.
	 * 
	 * @param newDoc      the new document to create
	 * @param constraints the constraints of the feature model
	 */
	public static void createFeatureModelConstraints(Resource vm, EObject root, EObject rootElemNew, Node constraints) {
		NodeList rules = ((Element) constraints).getElementsByTagName(RULE);
		for (int i = 0; i < rules.getLength(); i++) {
			Element rule = (Element) rules.item(i);
			NodeList exprs = rule.getChildNodes();
			for (int j = 0; j < exprs.getLength(); j++) {
				// a rule contains one single sub-element. It is an expression.
				if (exprs.item(j).getNodeType() == Node.ELEMENT_NODE) {
					Node expr = rule.getElementsByTagName("*").item(0);
					Constraint constraintNew = VavemodelFactory.eINSTANCE.createCrossTreeConstraint();
					createExpression(root, vm, (Element) expr, constraintNew);

					@SuppressWarnings("unchecked")
					EList<EObject> constraintList = (EList<EObject>) root.eGet(root.eClass().getEStructuralFeature(CONSTRAINT));
					constraintList.add(constraintNew);
					VaveXMIResourceImpl.saveResource(vm);
					break;
				}
			}
		}
	}

	/**
	 * Creates an unary or binary expression that contains features and logical
	 * expressions between them.
	 * 
	 * @param xmlOldDoc     The new document to create
	 * @param exprIn        The outer expression
	 * @param xmlExprOutOld The inner expression
	 */
	@SuppressWarnings("unchecked")
	public static void createExpression(EObject root, Resource vm, Element exprIn, EObject exprOut) {
		// at VAR, recursion ends, here set correct feature name
		if (exprIn.getNodeName() == VAR) {
			Variable variable = VavemodelFactory.eINSTANCE.createVariable();
			String featureName = exprIn.getTextContent().trim();
			String type = exprOut.getClass().getSimpleName();

			if (type.equals(NOTIMPL)) {
				TreeIterator<EObject> iterator = root.eAllContents();
				while (iterator.hasNext()) {
					EObject obj = iterator.next();
					if (getStructuralFeature(obj, NAME) != null // find correct feature
							&& (getStructuralFeature(obj, NAME).equals(featureName))) {
						EStructuralFeature term = getStructuralFeatureValue(exprOut, NAME, "term");
						exprOut.eSet(term, variable);
						Object var = getStructuralFeature(exprOut, "term"); // var has name, must be featureImpl
						EStructuralFeature termname = getStructuralFeatureValue((EObject) var, NAME, NAME);
						((EObject) var).eSet(termname, obj);
					}
				}
			} else if (type.equals(IMPLICATIONIMPL) || type.equals(DISJUNCTIONIMPL) || type.equals(CONJUNCTIONIMPL)) {
				TreeIterator<EObject> iterator = root.eAllContents();
				// find correct feature
				while (iterator.hasNext()) {
					EObject obj = iterator.next();
					if (getStructuralFeature(obj, NAME) != null
							&& (getStructuralFeature(obj, NAME).equals(featureName))) {
						EStructuralFeature term = getStructuralFeatureValue(exprOut, NAME, "term");
						((List<EObject>) exprOut.eGet(term)).add(variable);
						EStructuralFeature termname = getStructuralFeatureValue((EObject) variable, NAME, NAME);
						((EObject) variable).eSet(termname, obj);
					}
				}
			}
			VaveXMIResourceImpl.saveResource(vm);
			return; // vars have no childs
		}
		// These exprs have childs
		if (exprIn.getNodeName() == NOT) {
			EObject not = VavemodelFactory.eINSTANCE.createNot();
			addChild(exprOut, not);
			exprOut = not;
		} else if (exprIn.getNodeName() == IMP) {
			EObject impl = VavemodelFactory.eINSTANCE.createImplication();
			addChild(exprOut, impl);
			exprOut = impl;
		} else if (exprIn.getNodeName() == DISJ) {
//			EStructuralFeature expr = getStructuralFeatureValue(exprOut, NAME, EXPRESSION);
			EObject disj = VavemodelFactory.eINSTANCE.createDisjunction();
			addChild(exprOut, disj);
			exprOut = disj;
		} else if (exprIn.getNodeName() == CONJ) {
			EObject conj = VavemodelFactory.eINSTANCE.createConjunction();
			addChild(exprOut, conj);
			exprOut = conj;
		} else {
			return;
		}
		// process childs
		NodeList exprChilds = exprIn.getElementsByTagName("*");
		for (int j = 0; j < exprChilds.getLength(); j++) {
			Node exprChild = exprChilds.item(j);
			if (exprChild.getParentNode() == exprIn) {
				createExpression(root, vm, (Element) exprChild, exprOut);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void addChild(EObject exprOut, EObject child) {
		EStructuralFeature expr = getStructuralFeatureValue(exprOut, NAME, EXPRESSION); // type
		if (exprOut.getClass().getSimpleName().equals(NOTIMPL)
				|| exprOut.getClass().getSimpleName().equals("ConstraintImpl")) {
			exprOut.eSet(expr, child);
		} else {
			EStructuralFeature term = getStructuralFeatureValue(exprOut, NAME, "term");
			((List<EObject>) exprOut.eGet(term)).add(child);
		}
	}

	private static Object getStructuralFeature(EObject object, String attrName) {
		Object attr = null;
		try {
			attr = object.eGet(object.eClass().getEStructuralFeature(attrName));
		} catch (NullPointerException e) {
			java.lang.System.out.println(e.getMessage());
		}
		return attr;
	}

	private static EStructuralFeature getStructuralFeatureValue(EObject object, String attrKey, String attrValue) {
		EList<EStructuralFeature> allFeatures = object.eClass().getEAllStructuralFeatures();
		EStructuralFeature feat = null;
		for (EStructuralFeature feature : allFeatures) {
			if (getStructuralFeature(feature, attrKey) == attrValue)
				feat = feature;
		}
		return feat;
	}

}
