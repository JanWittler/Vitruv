/**
 */
package edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl;

import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.Correspondence;
import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.CorrespondencePackage;
import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.CorrespondenceType;
import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EAttributeCorrespondence;
import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.EFeatureCorrespondence;
import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.PartialEAttributeCorrespondence;
import edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.SameTypeCorrespondence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial EAttribute Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getDependentCorrespondences <em>Dependent Correspondences</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getElementA <em>Element A</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getElementB <em>Element B</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getValueA <em>Value A</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.framework.meta.correspondence.impl.PartialEAttributeCorrespondenceImpl#getValueB <em>Value B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartialEAttributeCorrespondenceImpl<TValue extends Object> extends PartialEFeatureCorrespondenceImpl<TValue> implements PartialEAttributeCorrespondence<TValue> {
	/**
	 * The cached value of the '{@link #getDependentCorrespondences() <em>Dependent Correspondences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<Correspondence> dependentCorrespondences;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Correspondence parent;

	/**
	 * The cached value of the '{@link #getElementA() <em>Element A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementA()
	 * @generated
	 * @ordered
	 */
	protected EAttribute elementA;

	/**
	 * The cached value of the '{@link #getElementB() <em>Element B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementB()
	 * @generated
	 * @ordered
	 */
	protected EAttribute elementB;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CorrespondenceType TYPE_EDEFAULT = CorrespondenceType.IDENTITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CorrespondenceType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueA() <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueA()
	 * @generated
	 * @ordered
	 */
	protected TValue valueA;

	/**
	 * The cached value of the '{@link #getValueB() <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueB()
	 * @generated
	 * @ordered
	 */
	protected TValue valueB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialEAttributeCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorrespondencePackage.Literals.PARTIAL_EATTRIBUTE_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Correspondence> getDependentCorrespondences() {
		if (dependentCorrespondences == null) {
			dependentCorrespondences = new EObjectResolvingEList<Correspondence>(Correspondence.class, this, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES);
		}
		return dependentCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondence getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Correspondence)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondence basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Correspondence newParent) {
		Correspondence oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementA() {
		if (elementA != null && ((EObject)elementA).eIsProxy()) {
			InternalEObject oldElementA = (InternalEObject)elementA;
			elementA = (EAttribute)eResolveProxy(oldElementA);
			if (elementA != oldElementA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A, oldElementA, elementA));
			}
		}
		return elementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetElementA() {
		return elementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementA(EAttribute newElementA) {
		EAttribute oldElementA = elementA;
		elementA = newElementA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A, oldElementA, elementA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementB() {
		if (elementB != null && ((EObject)elementB).eIsProxy()) {
			InternalEObject oldElementB = (InternalEObject)elementB;
			elementB = (EAttribute)eResolveProxy(oldElementB);
			if (elementB != oldElementB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B, oldElementB, elementB));
			}
		}
		return elementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetElementB() {
		return elementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementB(EAttribute newElementB) {
		EAttribute oldElementB = elementB;
		elementB = newElementB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B, oldElementB, elementB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrespondenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CorrespondenceType newType) {
		CorrespondenceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValue getValueA() {
		return valueA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueA(TValue newValueA) {
		TValue oldValueA = valueA;
		valueA = newValueA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_A, oldValueA, valueA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValue getValueB() {
		return valueB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueB(TValue newValueB) {
		TValue oldValueB = valueB;
		valueB = newValueB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_B, oldValueB, valueB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAllInvolvedEObjects() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES:
				return getDependentCorrespondences();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A:
				if (resolve) return getElementA();
				return basicGetElementA();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B:
				if (resolve) return getElementB();
				return basicGetElementB();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE:
				return getType();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_A:
				return getValueA();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_B:
				return getValueB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES:
				getDependentCorrespondences().clear();
				getDependentCorrespondences().addAll((Collection<? extends Correspondence>)newValue);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT:
				setParent((Correspondence)newValue);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A:
				setElementA((EAttribute)newValue);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B:
				setElementB((EAttribute)newValue);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE:
				setType((CorrespondenceType)newValue);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_A:
				setValueA((TValue)newValue);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_B:
				setValueB((TValue)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES:
				getDependentCorrespondences().clear();
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT:
				setParent((Correspondence)null);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A:
				setElementA((EAttribute)null);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B:
				setElementB((EAttribute)null);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_A:
				setValueA((TValue)null);
				return;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_B:
				setValueB((TValue)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES:
				return dependentCorrespondences != null && !dependentCorrespondences.isEmpty();
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT:
				return parent != null;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A:
				return elementA != null;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B:
				return elementB != null;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE:
				return type != TYPE_EDEFAULT;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_A:
				return valueA != null;
			case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__VALUE_B:
				return valueB != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Correspondence.class) {
			switch (derivedFeatureID) {
				case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES: return CorrespondencePackage.CORRESPONDENCE__DEPENDENT_CORRESPONDENCES;
				case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT: return CorrespondencePackage.CORRESPONDENCE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == SameTypeCorrespondence.class) {
			switch (derivedFeatureID) {
				case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A: return CorrespondencePackage.SAME_TYPE_CORRESPONDENCE__ELEMENT_A;
				case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B: return CorrespondencePackage.SAME_TYPE_CORRESPONDENCE__ELEMENT_B;
				default: return -1;
			}
		}
		if (baseClass == EFeatureCorrespondence.class) {
			switch (derivedFeatureID) {
				case CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE: return CorrespondencePackage.EFEATURE_CORRESPONDENCE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == EAttributeCorrespondence.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Correspondence.class) {
			switch (baseFeatureID) {
				case CorrespondencePackage.CORRESPONDENCE__DEPENDENT_CORRESPONDENCES: return CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__DEPENDENT_CORRESPONDENCES;
				case CorrespondencePackage.CORRESPONDENCE__PARENT: return CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == SameTypeCorrespondence.class) {
			switch (baseFeatureID) {
				case CorrespondencePackage.SAME_TYPE_CORRESPONDENCE__ELEMENT_A: return CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_A;
				case CorrespondencePackage.SAME_TYPE_CORRESPONDENCE__ELEMENT_B: return CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__ELEMENT_B;
				default: return -1;
			}
		}
		if (baseClass == EFeatureCorrespondence.class) {
			switch (baseFeatureID) {
				case CorrespondencePackage.EFEATURE_CORRESPONDENCE__TYPE: return CorrespondencePackage.PARTIAL_EATTRIBUTE_CORRESPONDENCE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == EAttributeCorrespondence.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", valueA: ");
		result.append(valueA);
		result.append(", valueB: ");
		result.append(valueB);
		result.append(')');
		return result.toString();
	}

} //PartialEAttributeCorrespondenceImpl
