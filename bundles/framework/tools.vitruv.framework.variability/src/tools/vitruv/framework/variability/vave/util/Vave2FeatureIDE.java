package tools.vitruv.framework.variability.vave.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static tools.vitruv.framework.variability.vave.VaveConstants.EXTFEATUREMODEL;
import static tools.vitruv.framework.variability.vave.VaveConstants.PROPERTIES;
import static tools.vitruv.framework.variability.vave.VaveConstants.STRUCT;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONSTRAINTS;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONSTRAINT;
import static tools.vitruv.framework.variability.vave.VaveConstants.CALCULATIONS;
import static tools.vitruv.framework.variability.vave.VaveConstants.COMMENTS;
import static tools.vitruv.framework.variability.vave.VaveConstants.FEATUREORDER;
import static tools.vitruv.framework.variability.vave.VaveConstants.NAME;
import static tools.vitruv.framework.variability.vave.VaveConstants.AND;
import static tools.vitruv.framework.variability.vave.VaveConstants.OR;
import static tools.vitruv.framework.variability.vave.VaveConstants.ALT;
import static tools.vitruv.framework.variability.vave.VaveConstants.MANDATORY;
import static tools.vitruv.framework.variability.vave.VaveConstants.ABSTRACT;
import static tools.vitruv.framework.variability.vave.VaveConstants.TRUE;
import static tools.vitruv.framework.variability.vave.VaveConstants.RULE;
import static tools.vitruv.framework.variability.vave.VaveConstants.EXPRESSION;
import static tools.vitruv.framework.variability.vave.VaveConstants.IMPLICATIONIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONJUNCTIONIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.DISJUNCTIONIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.NOTIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.VARIABLEIMPL;
import static tools.vitruv.framework.variability.vave.VaveConstants.IMP;
import static tools.vitruv.framework.variability.vave.VaveConstants.CONJ;
import static tools.vitruv.framework.variability.vave.VaveConstants.DISJ;
import static tools.vitruv.framework.variability.vave.VaveConstants.NOT;
import static tools.vitruv.framework.variability.vave.VaveConstants.TERM;
import static tools.vitruv.framework.variability.vave.VaveConstants.VAR;
import static tools.vitruv.framework.variability.vave.VaveConstants.FEATURE;

public class Vave2FeatureIDE {

	public static void createFeatureModelInstance(Resource res, Document newDoc)
			throws IOException, ParserConfigurationException, TransformerException {
		Element rootElement = newDoc.createElement(EXTFEATUREMODEL);
		newDoc.appendChild(rootElement);
		Element properties = newDoc.createElement(PROPERTIES);
		rootElement.appendChild(properties);
		Element struct = newDoc.createElement(STRUCT);
		rootElement.appendChild(struct);
		Element constraints = newDoc.createElement(CONSTRAINTS);
		rootElement.appendChild(constraints);
		Element calculations = newDoc.createElement(CALCULATIONS);
		rootElement.appendChild(calculations);
		Element comments = newDoc.createElement(COMMENTS);
		rootElement.appendChild(comments);
		Element featureOrder = newDoc.createElement(FEATUREORDER);
		rootElement.appendChild(featureOrder);
		createModelFile(newDoc);
		TreeIterator<EObject> iterator = res.getAllContents();
		EObject childElementIn = null;
		boolean rootProcessed = false;
		while (iterator.hasNext() && !rootProcessed) {
			childElementIn = iterator.next();
			if (childElementIn == null || childElementIn.eContainingFeature() == null) {
				continue;
			}
			String nodeName = childElementIn.eContainingFeature().getName();
			Node newChild = null;
			if (nodeName == "variant") {
				if (getFeatureValue(childElementIn, NAME) != null) {
					String featureName = (String) getFeatureValue(childElementIn, NAME);
					newChild = newDoc.createElement(AND);
					addAttribute(newDoc, newChild, ABSTRACT, TRUE);
					addAttribute(newDoc, newChild, MANDATORY, TRUE);
					addAttribute(newDoc, newChild, NAME, featureName);
					struct.appendChild(newChild);
					rootProcessed = true;
					iterateFeatureModel(newDoc, childElementIn, newChild);
				}
			}
			if (nodeName == CONSTRAINT) {
				createFeatureModelConstraints(childElementIn, newDoc, constraints);
			}
		}
	}

	static void iterateFeatureModel(Document newDoc, EObject featureIn, Node featureOut)
			throws IOException, ParserConfigurationException, TransformerException {
		EList<EObject> childs = featureIn.eContents();
		for (EObject childElementIn : childs) {
			if (childElementIn == null || childElementIn.eContainingFeature() == null) {
				continue;
			}
			String nodeName = childElementIn.eContainingFeature().getName();
			Node newChild = null;

			if (nodeName == "variationpoint") {
				String variationPointType = getFeatureValue(childElementIn, "type").toString();
				int children = childElementIn.eContents().size();
				// if variation point type is xor and variant is not in a group, the feature is
				// mandatory (if optional, feature is "and" but not mandatory)
				if (children == 1 && variationPointType == "XOR") {
					newChild = newDoc.createElement(AND);
					EObject variationPointChild = childElementIn.eContents().get(0);
					String name = getFeatureValue(variationPointChild, "name").toString();
					addAttribute(newDoc, newChild, NAME, name);
					addAttribute(newDoc, newChild, MANDATORY, TRUE);
					featureOut.appendChild(newChild);
					iterateFeatureModel(newDoc, variationPointChild, newChild);

				} else { // !XOR || children != 1 (all other features are not mandatory)
					if (variationPointType == "OR") {
						newDoc.renameNode(featureOut, null, OR);
						// ((Element) featureOut).removeAttribute(MANDATORY);
					}
					if (variationPointType == "XOR") {
						newDoc.renameNode(featureOut, null, ALT);
					}

					for (EObject vpChild : childElementIn.eContents()) {
						String name = getFeatureValue(vpChild, "name").toString();
						newChild = newDoc.createElement("feature");
						addAttribute(newDoc, newChild, NAME, name);
						featureOut.appendChild(newChild);
						createModelFile(newDoc);
						iterateFeatureModel(newDoc, vpChild, newChild);
					}
				}
			}
		}
	}

	public static void createFeatureModelConstraints(EObject childElementIn, Document newDoc, Element constraints) {
		Node rule = newDoc.createElement(RULE);
		constraints.appendChild(rule);
		EObject expr = (EObject) getFeatureValue(childElementIn, EXPRESSION);
		createExpression(newDoc, expr, rule);
	}

	@SuppressWarnings("unchecked")
	public static void createExpression(Document newDoc, EObject expr, Node rule) {
		Boolean isBinaryExpr = true;
		Boolean isVariableExpr = false;
		Node out = null;
		if (expr.getClass().getSimpleName().matches(IMPLICATIONIMPL)) {
			out = newDoc.createElement(IMP);
		} else if (expr.getClass().getSimpleName().matches(CONJUNCTIONIMPL)) {
			out = newDoc.createElement(CONJ);
		} else if (expr.getClass().getSimpleName().matches(DISJUNCTIONIMPL)) {
			out = newDoc.createElement(DISJ);
		} else if (expr.getClass().getSimpleName().matches(NOTIMPL)) {
			out = newDoc.createElement(NOT);
			isBinaryExpr = false;
		} else if (expr.getClass().getSimpleName().matches(VARIABLEIMPL)) {
			isVariableExpr = true;
		} else {
			throw new RuntimeException(expr.getClass().getSimpleName());
		}
		if (!isVariableExpr) {
			rule.appendChild(out); // here, out is never null
		}
		// process unary expression
		EObject feature = null;
		EObject term = null;
		if (!isBinaryExpr) {
			term = (EObject) getFeatureValue(expr, TERM);
			feature = (EObject) getFeatureValue(term, NAME);
			Node var = newDoc.createElement(VAR);
			var.setTextContent((String) getFeatureValue(feature, NAME));
			out.appendChild(var);
			return;
		}
		// process binary expression
		/*
		 * -- only subexprs as operands, hopefully with eContent we get the correct
		 * order! binary - binary, binary - unary, unary - unary, unary - binary ---
		 * mixed unary - feature, binary - feature, feature - binary, feature - unary,
		 * -a feature - feature //simple, a->b
		 */
		// the order is relevant.
		//
		// in case there is only one expression as operand is present, we need
		// 1. get all features of this expression (expr)
		// 2. get all features of the operand expression (direct and indirect,
		// getFeatureList)
		// 3. find the difference - it shall be exactly one single feature,
		// Note 1: the features of operand expression are expected to be at
		// the begin or at the end of the expr-Features in the same order. If they are
		// at the beginning,
		// then the difference-feature is the second operand otherwise it is the first
		// operand.
		// Example 1: a -> (b or c): Features of expr: a,b,c. features of subexpr:
		// (b,c), diff: a at first place
		// so a is the first operand and or-expr shall be passed to the recursive call.
		// Example 2: (b or c)->a: Features of expr: b,c,a. features of subexpr: (b,c),
		// diff: a at last place
		// so a is the second(!) operand and or-expr shall be passed to the recursive
		// call as first operand.
		else {
			Node var = null;
			if (expr.getClass().getSimpleName().matches(VARIABLEIMPL)) { // one variable
				var = newDoc.createElement(VAR);
				EObject featurename = (EObject) getFeatureValue(expr, NAME);
				var.setTextContent((String) getFeatureValue(featurename, NAME));
				rule.appendChild(var);
				return;
			}
			EList<EObject> featureList = (EList<EObject>) getFeatureValue(expr, TERM);
			// case feature - feature
			if (featureList.get(0).getClass().getSimpleName().matches(VARIABLEIMPL)
					&& featureList.get(1).getClass().getSimpleName().matches(VARIABLEIMPL)) {
				for (EObject feat : featureList) { // assumption: there are exactly two elements
					var = newDoc.createElement(VAR);
					EObject featurename = (EObject) getFeatureValue(feat, NAME);
					var.setTextContent((String) getFeatureValue(featurename, NAME));
					out.appendChild(var);
				}
				return;
			}
			// case expr, expr (both can be unary or binary; -a v -b)
			if (expr.eContents().size() == 2) {
				if (expr.eContents().get(0) != null && expr.eContents().get(1) != null) {
					EObject subexpr1 = expr.eContents().get(0);
					EObject subexpr2 = expr.eContents().get(1);
					// TODO: retrieve these two exprs in correct order!
					createExpression(newDoc, subexpr1, out);
					createExpression(newDoc, subexpr2, out);
				}
			} else if (expr.eContents().size() == 1) {
				// case expr - feature or feature - expr (-a v b); ((a v b ) A c); a->b v c
				EList<EObject> allFeatures = (EList<EObject>) getFeatureValue(expr, FEATURE);
				EObject subexpr1 = expr.eContents().get(0);
				featureList = (EList<EObject>) getFeatureValue(subexpr1, FEATURE);
				EObject uncommonFeature = getUncommonFeature(allFeatures, featureList);
				var = newDoc.createElement(VAR);
				var.setTextContent((String) getFeatureValue(uncommonFeature, NAME));
				out.appendChild(var);
				// process subexpression
				createExpression(newDoc, subexpr1, out);
			}
		}
	}

	private static EObject getUncommonFeature(EList<EObject> allFeatures, EList<EObject> featureList) {
		EObject uncommonFeature = null;
		for (Object obj : allFeatures) {
			if (!featureList.contains(obj)) {
				uncommonFeature = (EObject) obj;
			}
		}
		return uncommonFeature;
	}

	private static void addAttribute(Document doc, Node element, String name, String value) {
		Attr attr = doc.createAttribute(name);
		attr.setValue(value);
		((Element) element).setAttributeNode(attr);
	}

	public static void createModelFile(Document newDoc) throws TransformerException {
		newDoc.setXmlStandalone(true);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "");
		DOMSource source = new DOMSource(newDoc);
		String filename = "featureIDEModel";
		StreamResult result = new StreamResult(new File("models/", filename));
		transformer.transform(source, result);
	}

	private static Object getFeatureValue(EObject object, String attrName) {
		Object attr = object.eGet(object.eClass().getEStructuralFeature(attrName));
		return attr;
	}

}
