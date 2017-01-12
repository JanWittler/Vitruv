/**
 */
package tools.vitruv.framework.change.echange.compound;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tools.vitruv.framework.change.echange.EChangePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tools.vitruv.framework.change.echange.compound.CompoundFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='Change' basePackage='tools.vitruv.framework.change.echange'"
 * @generated
 */
public interface CompoundPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compound";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tools.vitruv/EChange/Compound/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compound";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompoundPackage eINSTANCE = tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl.init();

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.CompoundEChangeImpl <em>EChange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundEChangeImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCompoundEChange()
	 * @generated
	 */
	int COMPOUND_ECHANGE = 0;

	/**
	 * The number of structural features of the '<em>EChange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ECHANGE_FEATURE_COUNT = EChangePackage.ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ECHANGE___GET_ATOMIC_CHANGES = EChangePackage.ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>EChange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ECHANGE_OPERATION_COUNT = EChangePackage.ECHANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.MoveEObjectImpl <em>Move EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.MoveEObjectImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getMoveEObject()
	 * @generated
	 */
	int MOVE_EOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Subtract Where Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT__SUBTRACT_WHERE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtract What Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT__SUBTRACT_WHAT_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Add Where Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT__ADD_WHERE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Add What Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT__ADD_WHAT_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Move EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EOBJECT_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.CompoundSubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundSubtractionImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCompoundSubtraction()
	 * @generated
	 */
	int COMPOUND_SUBTRACTION = 4;

	/**
	 * The feature id for the '<em><b>Subtractive Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SUBTRACTION__SUBTRACTIVE_CHANGES = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SUBTRACTION_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SUBTRACTION___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SUBTRACTION_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.ExplicitUnsetEFeatureImpl <em>Explicit Unset EFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.ExplicitUnsetEFeatureImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getExplicitUnsetEFeature()
	 * @generated
	 */
	int EXPLICIT_UNSET_EFEATURE = 2;

	/**
	 * The feature id for the '<em><b>Subtractive Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_UNSET_EFEATURE__SUBTRACTIVE_CHANGES = COMPOUND_SUBTRACTION__SUBTRACTIVE_CHANGES;

	/**
	 * The number of structural features of the '<em>Explicit Unset EFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_UNSET_EFEATURE_FEATURE_COUNT = COMPOUND_SUBTRACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_UNSET_EFEATURE___GET_ATOMIC_CHANGES = COMPOUND_SUBTRACTION___GET_ATOMIC_CHANGES;

	/**
	 * The number of operations of the '<em>Explicit Unset EFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_UNSET_EFEATURE_OPERATION_COUNT = COMPOUND_SUBTRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.ReplaceInEListImpl <em>Replace In EList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.ReplaceInEListImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getReplaceInEList()
	 * @generated
	 */
	int REPLACE_IN_ELIST = 3;

	/**
	 * The feature id for the '<em><b>Remove Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_IN_ELIST__REMOVE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_IN_ELIST__INSERT_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replace In EList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_IN_ELIST_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_IN_ELIST___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Replace In EList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_IN_ELIST_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.CompoundAdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundAdditionImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCompoundAddition()
	 * @generated
	 */
	int COMPOUND_ADDITION = 5;

	/**
	 * The feature id for the '<em><b>Additive Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ADDITION__ADDITIVE_CHANGES = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ADDITION_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ADDITION___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ADDITION_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertRootImpl <em>Create And Insert Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertRootImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCreateAndInsertRoot()
	 * @generated
	 */
	int CREATE_AND_INSERT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Create Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_ROOT__CREATE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_ROOT__INSERT_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create And Insert Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_ROOT_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_ROOT___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE___GET_ATOMIC_CHANGES;

	/**
	 * The number of operations of the '<em>Create And Insert Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_ROOT_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteRootImpl <em>Remove And Delete Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteRootImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getRemoveAndDeleteRoot()
	 * @generated
	 */
	int REMOVE_AND_DELETE_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Remove Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_ROOT__REMOVE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_ROOT__DELETE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove And Delete Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_ROOT_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_ROOT___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE___GET_ATOMIC_CHANGES;

	/**
	 * The number of operations of the '<em>Remove And Delete Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_ROOT_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertNonRootImpl <em>Create And Insert Non Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertNonRootImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCreateAndInsertNonRoot()
	 * @generated
	 */
	int CREATE_AND_INSERT_NON_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Create Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_NON_ROOT__CREATE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_NON_ROOT__INSERT_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create And Insert Non Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_NON_ROOT_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_NON_ROOT___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE___GET_ATOMIC_CHANGES;

	/**
	 * The number of operations of the '<em>Create And Insert Non Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_INSERT_NON_ROOT_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteNonRootImpl <em>Remove And Delete Non Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteNonRootImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getRemoveAndDeleteNonRoot()
	 * @generated
	 */
	int REMOVE_AND_DELETE_NON_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Remove Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_NON_ROOT__REMOVE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_NON_ROOT__DELETE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove And Delete Non Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_NON_ROOT_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_NON_ROOT___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE___GET_ATOMIC_CHANGES;

	/**
	 * The number of operations of the '<em>Remove And Delete Non Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_AND_DELETE_NON_ROOT_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tools.vitruv.framework.change.echange.compound.impl.CreateAndReplaceAndDeleteNonRootImpl <em>Create And Replace And Delete Non Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tools.vitruv.framework.change.echange.compound.impl.CreateAndReplaceAndDeleteNonRootImpl
	 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCreateAndReplaceAndDeleteNonRoot()
	 * @generated
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT = 10;

	/**
	 * The feature id for the '<em><b>Create Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT__CREATE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replace Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT__REPLACE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delete Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT__DELETE_CHANGE = COMPOUND_ECHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create And Replace And Delete Non Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT_FEATURE_COUNT = COMPOUND_ECHANGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Atomic Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT___GET_ATOMIC_CHANGES = COMPOUND_ECHANGE___GET_ATOMIC_CHANGES;

	/**
	 * The number of operations of the '<em>Create And Replace And Delete Non Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AND_REPLACE_AND_DELETE_NON_ROOT_OPERATION_COUNT = COMPOUND_ECHANGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.CompoundEChange <em>EChange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EChange</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundEChange
	 * @generated
	 */
	EClass getCompoundEChange();

	/**
	 * Returns the meta object for the '{@link tools.vitruv.framework.change.echange.compound.CompoundEChange#getAtomicChanges() <em>Get Atomic Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atomic Changes</em>' operation.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundEChange#getAtomicChanges()
	 * @generated
	 */
	EOperation getCompoundEChange__GetAtomicChanges();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.MoveEObject <em>Move EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move EObject</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.MoveEObject
	 * @generated
	 */
	EClass getMoveEObject();

	/**
	 * Returns the meta object for the reference '{@link tools.vitruv.framework.change.echange.compound.MoveEObject#getSubtractWhereChange <em>Subtract Where Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtract Where Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.MoveEObject#getSubtractWhereChange()
	 * @see #getMoveEObject()
	 * @generated
	 */
	EReference getMoveEObject_SubtractWhereChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.MoveEObject#getSubtractWhatChange <em>Subtract What Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtract What Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.MoveEObject#getSubtractWhatChange()
	 * @see #getMoveEObject()
	 * @generated
	 */
	EReference getMoveEObject_SubtractWhatChange();

	/**
	 * Returns the meta object for the reference '{@link tools.vitruv.framework.change.echange.compound.MoveEObject#getAddWhereChange <em>Add Where Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Where Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.MoveEObject#getAddWhereChange()
	 * @see #getMoveEObject()
	 * @generated
	 */
	EReference getMoveEObject_AddWhereChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.MoveEObject#getAddWhatChange <em>Add What Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add What Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.MoveEObject#getAddWhatChange()
	 * @see #getMoveEObject()
	 * @generated
	 */
	EReference getMoveEObject_AddWhatChange();

	/**
	 * Returns the meta object for the '{@link tools.vitruv.framework.change.echange.compound.MoveEObject#getAtomicChanges() <em>Get Atomic Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atomic Changes</em>' operation.
	 * @see tools.vitruv.framework.change.echange.compound.MoveEObject#getAtomicChanges()
	 * @generated
	 */
	EOperation getMoveEObject__GetAtomicChanges();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.ExplicitUnsetEFeature <em>Explicit Unset EFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Unset EFeature</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.ExplicitUnsetEFeature
	 * @generated
	 */
	EClass getExplicitUnsetEFeature();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.ReplaceInEList <em>Replace In EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace In EList</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.ReplaceInEList
	 * @generated
	 */
	EClass getReplaceInEList();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.ReplaceInEList#getRemoveChange <em>Remove Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.ReplaceInEList#getRemoveChange()
	 * @see #getReplaceInEList()
	 * @generated
	 */
	EReference getReplaceInEList_RemoveChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.ReplaceInEList#getInsertChange <em>Insert Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.ReplaceInEList#getInsertChange()
	 * @see #getReplaceInEList()
	 * @generated
	 */
	EReference getReplaceInEList_InsertChange();

	/**
	 * Returns the meta object for the '{@link tools.vitruv.framework.change.echange.compound.ReplaceInEList#getAtomicChanges() <em>Get Atomic Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atomic Changes</em>' operation.
	 * @see tools.vitruv.framework.change.echange.compound.ReplaceInEList#getAtomicChanges()
	 * @generated
	 */
	EOperation getReplaceInEList__GetAtomicChanges();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.CompoundSubtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundSubtraction
	 * @generated
	 */
	EClass getCompoundSubtraction();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.framework.change.echange.compound.CompoundSubtraction#getSubtractiveChanges <em>Subtractive Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtractive Changes</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundSubtraction#getSubtractiveChanges()
	 * @see #getCompoundSubtraction()
	 * @generated
	 */
	EReference getCompoundSubtraction_SubtractiveChanges();

	/**
	 * Returns the meta object for the '{@link tools.vitruv.framework.change.echange.compound.CompoundSubtraction#getAtomicChanges() <em>Get Atomic Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atomic Changes</em>' operation.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundSubtraction#getAtomicChanges()
	 * @generated
	 */
	EOperation getCompoundSubtraction__GetAtomicChanges();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.CompoundAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundAddition
	 * @generated
	 */
	EClass getCompoundAddition();

	/**
	 * Returns the meta object for the containment reference list '{@link tools.vitruv.framework.change.echange.compound.CompoundAddition#getAdditiveChanges <em>Additive Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additive Changes</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundAddition#getAdditiveChanges()
	 * @see #getCompoundAddition()
	 * @generated
	 */
	EReference getCompoundAddition_AdditiveChanges();

	/**
	 * Returns the meta object for the '{@link tools.vitruv.framework.change.echange.compound.CompoundAddition#getAtomicChanges() <em>Get Atomic Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atomic Changes</em>' operation.
	 * @see tools.vitruv.framework.change.echange.compound.CompoundAddition#getAtomicChanges()
	 * @generated
	 */
	EOperation getCompoundAddition__GetAtomicChanges();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertRoot <em>Create And Insert Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create And Insert Root</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndInsertRoot
	 * @generated
	 */
	EClass getCreateAndInsertRoot();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertRoot#getCreateChange <em>Create Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndInsertRoot#getCreateChange()
	 * @see #getCreateAndInsertRoot()
	 * @generated
	 */
	EReference getCreateAndInsertRoot_CreateChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertRoot#getInsertChange <em>Insert Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndInsertRoot#getInsertChange()
	 * @see #getCreateAndInsertRoot()
	 * @generated
	 */
	EReference getCreateAndInsertRoot_InsertChange();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.RemoveAndDeleteRoot <em>Remove And Delete Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove And Delete Root</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.RemoveAndDeleteRoot
	 * @generated
	 */
	EClass getRemoveAndDeleteRoot();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.RemoveAndDeleteRoot#getRemoveChange <em>Remove Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.RemoveAndDeleteRoot#getRemoveChange()
	 * @see #getRemoveAndDeleteRoot()
	 * @generated
	 */
	EReference getRemoveAndDeleteRoot_RemoveChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.RemoveAndDeleteRoot#getDeleteChange <em>Delete Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.RemoveAndDeleteRoot#getDeleteChange()
	 * @see #getRemoveAndDeleteRoot()
	 * @generated
	 */
	EReference getRemoveAndDeleteRoot_DeleteChange();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot <em>Create And Insert Non Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create And Insert Non Root</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot
	 * @generated
	 */
	EClass getCreateAndInsertNonRoot();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot#getCreateChange <em>Create Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot#getCreateChange()
	 * @see #getCreateAndInsertNonRoot()
	 * @generated
	 */
	EReference getCreateAndInsertNonRoot_CreateChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot#getInsertChange <em>Insert Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot#getInsertChange()
	 * @see #getCreateAndInsertNonRoot()
	 * @generated
	 */
	EReference getCreateAndInsertNonRoot_InsertChange();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.RemoveAndDeleteNonRoot <em>Remove And Delete Non Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove And Delete Non Root</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.RemoveAndDeleteNonRoot
	 * @generated
	 */
	EClass getRemoveAndDeleteNonRoot();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.RemoveAndDeleteNonRoot#getRemoveChange <em>Remove Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.RemoveAndDeleteNonRoot#getRemoveChange()
	 * @see #getRemoveAndDeleteNonRoot()
	 * @generated
	 */
	EReference getRemoveAndDeleteNonRoot_RemoveChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.RemoveAndDeleteNonRoot#getDeleteChange <em>Delete Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.RemoveAndDeleteNonRoot#getDeleteChange()
	 * @see #getRemoveAndDeleteNonRoot()
	 * @generated
	 */
	EReference getRemoveAndDeleteNonRoot_DeleteChange();

	/**
	 * Returns the meta object for class '{@link tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot <em>Create And Replace And Delete Non Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create And Replace And Delete Non Root</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot
	 * @generated
	 */
	EClass getCreateAndReplaceAndDeleteNonRoot();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot#getCreateChange <em>Create Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot#getCreateChange()
	 * @see #getCreateAndReplaceAndDeleteNonRoot()
	 * @generated
	 */
	EReference getCreateAndReplaceAndDeleteNonRoot_CreateChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot#getReplaceChange <em>Replace Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replace Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot#getReplaceChange()
	 * @see #getCreateAndReplaceAndDeleteNonRoot()
	 * @generated
	 */
	EReference getCreateAndReplaceAndDeleteNonRoot_ReplaceChange();

	/**
	 * Returns the meta object for the containment reference '{@link tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot#getDeleteChange <em>Delete Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Change</em>'.
	 * @see tools.vitruv.framework.change.echange.compound.CreateAndReplaceAndDeleteNonRoot#getDeleteChange()
	 * @see #getCreateAndReplaceAndDeleteNonRoot()
	 * @generated
	 */
	EReference getCreateAndReplaceAndDeleteNonRoot_DeleteChange();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompoundFactory getCompoundFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.CompoundEChangeImpl <em>EChange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundEChangeImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCompoundEChange()
		 * @generated
		 */
		EClass COMPOUND_ECHANGE = eINSTANCE.getCompoundEChange();

		/**
		 * The meta object literal for the '<em><b>Get Atomic Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOUND_ECHANGE___GET_ATOMIC_CHANGES = eINSTANCE.getCompoundEChange__GetAtomicChanges();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.MoveEObjectImpl <em>Move EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.MoveEObjectImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getMoveEObject()
		 * @generated
		 */
		EClass MOVE_EOBJECT = eINSTANCE.getMoveEObject();

		/**
		 * The meta object literal for the '<em><b>Subtract Where Change</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_EOBJECT__SUBTRACT_WHERE_CHANGE = eINSTANCE.getMoveEObject_SubtractWhereChange();

		/**
		 * The meta object literal for the '<em><b>Subtract What Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_EOBJECT__SUBTRACT_WHAT_CHANGE = eINSTANCE.getMoveEObject_SubtractWhatChange();

		/**
		 * The meta object literal for the '<em><b>Add Where Change</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_EOBJECT__ADD_WHERE_CHANGE = eINSTANCE.getMoveEObject_AddWhereChange();

		/**
		 * The meta object literal for the '<em><b>Add What Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_EOBJECT__ADD_WHAT_CHANGE = eINSTANCE.getMoveEObject_AddWhatChange();

		/**
		 * The meta object literal for the '<em><b>Get Atomic Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOVE_EOBJECT___GET_ATOMIC_CHANGES = eINSTANCE.getMoveEObject__GetAtomicChanges();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.ExplicitUnsetEFeatureImpl <em>Explicit Unset EFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.ExplicitUnsetEFeatureImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getExplicitUnsetEFeature()
		 * @generated
		 */
		EClass EXPLICIT_UNSET_EFEATURE = eINSTANCE.getExplicitUnsetEFeature();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.ReplaceInEListImpl <em>Replace In EList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.ReplaceInEListImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getReplaceInEList()
		 * @generated
		 */
		EClass REPLACE_IN_ELIST = eINSTANCE.getReplaceInEList();

		/**
		 * The meta object literal for the '<em><b>Remove Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_IN_ELIST__REMOVE_CHANGE = eINSTANCE.getReplaceInEList_RemoveChange();

		/**
		 * The meta object literal for the '<em><b>Insert Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_IN_ELIST__INSERT_CHANGE = eINSTANCE.getReplaceInEList_InsertChange();

		/**
		 * The meta object literal for the '<em><b>Get Atomic Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPLACE_IN_ELIST___GET_ATOMIC_CHANGES = eINSTANCE.getReplaceInEList__GetAtomicChanges();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.CompoundSubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundSubtractionImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCompoundSubtraction()
		 * @generated
		 */
		EClass COMPOUND_SUBTRACTION = eINSTANCE.getCompoundSubtraction();

		/**
		 * The meta object literal for the '<em><b>Subtractive Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SUBTRACTION__SUBTRACTIVE_CHANGES = eINSTANCE.getCompoundSubtraction_SubtractiveChanges();

		/**
		 * The meta object literal for the '<em><b>Get Atomic Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOUND_SUBTRACTION___GET_ATOMIC_CHANGES = eINSTANCE.getCompoundSubtraction__GetAtomicChanges();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.CompoundAdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundAdditionImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCompoundAddition()
		 * @generated
		 */
		EClass COMPOUND_ADDITION = eINSTANCE.getCompoundAddition();

		/**
		 * The meta object literal for the '<em><b>Additive Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ADDITION__ADDITIVE_CHANGES = eINSTANCE.getCompoundAddition_AdditiveChanges();

		/**
		 * The meta object literal for the '<em><b>Get Atomic Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOUND_ADDITION___GET_ATOMIC_CHANGES = eINSTANCE.getCompoundAddition__GetAtomicChanges();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertRootImpl <em>Create And Insert Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertRootImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCreateAndInsertRoot()
		 * @generated
		 */
		EClass CREATE_AND_INSERT_ROOT = eINSTANCE.getCreateAndInsertRoot();

		/**
		 * The meta object literal for the '<em><b>Create Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_INSERT_ROOT__CREATE_CHANGE = eINSTANCE.getCreateAndInsertRoot_CreateChange();

		/**
		 * The meta object literal for the '<em><b>Insert Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_INSERT_ROOT__INSERT_CHANGE = eINSTANCE.getCreateAndInsertRoot_InsertChange();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteRootImpl <em>Remove And Delete Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteRootImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getRemoveAndDeleteRoot()
		 * @generated
		 */
		EClass REMOVE_AND_DELETE_ROOT = eINSTANCE.getRemoveAndDeleteRoot();

		/**
		 * The meta object literal for the '<em><b>Remove Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_AND_DELETE_ROOT__REMOVE_CHANGE = eINSTANCE.getRemoveAndDeleteRoot_RemoveChange();

		/**
		 * The meta object literal for the '<em><b>Delete Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_AND_DELETE_ROOT__DELETE_CHANGE = eINSTANCE.getRemoveAndDeleteRoot_DeleteChange();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertNonRootImpl <em>Create And Insert Non Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.CreateAndInsertNonRootImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCreateAndInsertNonRoot()
		 * @generated
		 */
		EClass CREATE_AND_INSERT_NON_ROOT = eINSTANCE.getCreateAndInsertNonRoot();

		/**
		 * The meta object literal for the '<em><b>Create Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_INSERT_NON_ROOT__CREATE_CHANGE = eINSTANCE.getCreateAndInsertNonRoot_CreateChange();

		/**
		 * The meta object literal for the '<em><b>Insert Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_INSERT_NON_ROOT__INSERT_CHANGE = eINSTANCE.getCreateAndInsertNonRoot_InsertChange();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteNonRootImpl <em>Remove And Delete Non Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.RemoveAndDeleteNonRootImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getRemoveAndDeleteNonRoot()
		 * @generated
		 */
		EClass REMOVE_AND_DELETE_NON_ROOT = eINSTANCE.getRemoveAndDeleteNonRoot();

		/**
		 * The meta object literal for the '<em><b>Remove Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_AND_DELETE_NON_ROOT__REMOVE_CHANGE = eINSTANCE.getRemoveAndDeleteNonRoot_RemoveChange();

		/**
		 * The meta object literal for the '<em><b>Delete Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_AND_DELETE_NON_ROOT__DELETE_CHANGE = eINSTANCE.getRemoveAndDeleteNonRoot_DeleteChange();

		/**
		 * The meta object literal for the '{@link tools.vitruv.framework.change.echange.compound.impl.CreateAndReplaceAndDeleteNonRootImpl <em>Create And Replace And Delete Non Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tools.vitruv.framework.change.echange.compound.impl.CreateAndReplaceAndDeleteNonRootImpl
		 * @see tools.vitruv.framework.change.echange.compound.impl.CompoundPackageImpl#getCreateAndReplaceAndDeleteNonRoot()
		 * @generated
		 */
		EClass CREATE_AND_REPLACE_AND_DELETE_NON_ROOT = eINSTANCE.getCreateAndReplaceAndDeleteNonRoot();

		/**
		 * The meta object literal for the '<em><b>Create Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_REPLACE_AND_DELETE_NON_ROOT__CREATE_CHANGE = eINSTANCE.getCreateAndReplaceAndDeleteNonRoot_CreateChange();

		/**
		 * The meta object literal for the '<em><b>Replace Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_REPLACE_AND_DELETE_NON_ROOT__REPLACE_CHANGE = eINSTANCE.getCreateAndReplaceAndDeleteNonRoot_ReplaceChange();

		/**
		 * The meta object literal for the '<em><b>Delete Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_AND_REPLACE_AND_DELETE_NON_ROOT__DELETE_CHANGE = eINSTANCE.getCreateAndReplaceAndDeleteNonRoot_DeleteChange();

	}

} //CompoundPackage
