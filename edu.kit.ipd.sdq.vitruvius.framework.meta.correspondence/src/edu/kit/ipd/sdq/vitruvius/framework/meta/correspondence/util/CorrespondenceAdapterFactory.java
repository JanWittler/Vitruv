/**
 */
package edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.util;

import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.CorrespondencePackage
 * @generated
 */
public class CorrespondenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorrespondencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrespondenceSwitch<Adapter> modelSwitch =
		new CorrespondenceSwitch<Adapter>() {
			@Override
			public Adapter caseCorrespondences(Correspondences object) {
				return createCorrespondencesAdapter();
			}
			@Override
			public Adapter caseCorrespondence(Correspondence object) {
				return createCorrespondenceAdapter();
			}
			@Override
			public <T extends Object> Adapter caseSameTypeCorrespondence(SameTypeCorrespondence<T> object) {
				return createSameTypeCorrespondenceAdapter();
			}
			@Override
			public Adapter caseEObjectCorrespondence(EObjectCorrespondence object) {
				return createEObjectCorrespondenceAdapter();
			}
			@Override
			public <T extends EStructuralFeature> Adapter caseEFeatureCorrespondence(EFeatureCorrespondence<T> object) {
				return createEFeatureCorrespondenceAdapter();
			}
			@Override
			public Adapter caseEAttributeCorrespondence(EAttributeCorrespondence object) {
				return createEAttributeCorrespondenceAdapter();
			}
			@Override
			public Adapter caseEReferenceCorrespondence(EReferenceCorrespondence object) {
				return createEReferenceCorrespondenceAdapter();
			}
			@Override
			public Adapter caseEContainmentReferenceCorrespondence(EContainmentReferenceCorrespondence object) {
				return createEContainmentReferenceCorrespondenceAdapter();
			}
			@Override
			public <TValue extends Object> Adapter casePartialEFeatureCorrespondence(PartialEFeatureCorrespondence<TValue> object) {
				return createPartialEFeatureCorrespondenceAdapter();
			}
			@Override
			public <TValue extends Object> Adapter casePartialEAttributeCorrespondence(PartialEAttributeCorrespondence<TValue> object) {
				return createPartialEAttributeCorrespondenceAdapter();
			}
			@Override
			public <TValue extends EObject> Adapter casePartialEReferenceCorrespondence(PartialEReferenceCorrespondence<TValue> object) {
				return createPartialEReferenceCorrespondenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.Correspondences <em>Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.Correspondences
	 * @generated
	 */
	public Adapter createCorrespondencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.Correspondence <em>Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.Correspondence
	 * @generated
	 */
	public Adapter createCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.SameTypeCorrespondence <em>Same Type Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.SameTypeCorrespondence
	 * @generated
	 */
	public Adapter createSameTypeCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EObjectCorrespondence <em>EObject Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EObjectCorrespondence
	 * @generated
	 */
	public Adapter createEObjectCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EFeatureCorrespondence <em>EFeature Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EFeatureCorrespondence
	 * @generated
	 */
	public Adapter createEFeatureCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EAttributeCorrespondence <em>EAttribute Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EAttributeCorrespondence
	 * @generated
	 */
	public Adapter createEAttributeCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EReferenceCorrespondence <em>EReference Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EReferenceCorrespondence
	 * @generated
	 */
	public Adapter createEReferenceCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EContainmentReferenceCorrespondence <em>EContainment Reference Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EContainmentReferenceCorrespondence
	 * @generated
	 */
	public Adapter createEContainmentReferenceCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEFeatureCorrespondence <em>Partial EFeature Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEFeatureCorrespondence
	 * @generated
	 */
	public Adapter createPartialEFeatureCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEAttributeCorrespondence <em>Partial EAttribute Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEAttributeCorrespondence
	 * @generated
	 */
	public Adapter createPartialEAttributeCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEReferenceCorrespondence <em>Partial EReference Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEReferenceCorrespondence
	 * @generated
	 */
	public Adapter createPartialEReferenceCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CorrespondenceAdapterFactory
