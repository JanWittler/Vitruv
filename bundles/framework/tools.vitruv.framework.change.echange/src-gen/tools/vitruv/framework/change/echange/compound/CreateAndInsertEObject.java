/**
 */
package tools.vitruv.framework.change.echange.compound;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import tools.vitruv.framework.change.echange.AtomicEChange;

import tools.vitruv.framework.change.echange.eobject.CreateEObject;
import tools.vitruv.framework.change.echange.eobject.EObjectAddedEChange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create And Insert EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertEObject#getCreateChange <em>Create Change</em>}</li>
 *   <li>{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertEObject#getInsertChange <em>Insert Change</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.framework.change.echange.compound.CompoundPackage#getCreateAndInsertEObject()
 * @model abstract="true" TBounds="tools.vitruv.framework.change.echange.compound.EObj"
 * @generated
 */
public interface CreateAndInsertEObject<T extends EObject, C extends EObjectAddedEChange<T>> extends CompoundEChange {
	/**
	 * Returns the value of the '<em><b>Create Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Change</em>' containment reference.
	 * @see #setCreateChange(CreateEObject)
	 * @see tools.vitruv.framework.change.echange.compound.CompoundPackage#getCreateAndInsertEObject_CreateChange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CreateEObject<T> getCreateChange();

	/**
	 * Sets the value of the '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertEObject#getCreateChange <em>Create Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Change</em>' containment reference.
	 * @see #getCreateChange()
	 * @generated
	 */
	void setCreateChange(CreateEObject<T> value);

	/**
	 * Returns the value of the '<em><b>Insert Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Change</em>' containment reference.
	 * @see #setInsertChange(EObjectAddedEChange)
	 * @see tools.vitruv.framework.change.echange.compound.CompoundPackage#getCreateAndInsertEObject_InsertChange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	C getInsertChange();

	/**
	 * Sets the value of the '{@link tools.vitruv.framework.change.echange.compound.CreateAndInsertEObject#getInsertChange <em>Insert Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Change</em>' containment reference.
	 * @see #getInsertChange()
	 * @generated
	 */
	void setInsertChange(C value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%tools.vitruv.framework.change.echange.AtomicEChange%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%tools.vitruv.framework.change.echange.AtomicEChange%>>();\n<%tools.vitruv.framework.change.echange.eobject.CreateEObject%><T> _createChange = this.getCreateChange();\nresult.add(_createChange);\nC _insertChange = this.getInsertChange();\nresult.add(_insertChange);\nreturn result;'"
	 * @generated
	 */
	EList<AtomicEChange> getAtomicChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resourceSetDataType="tools.vitruv.framework.change.echange.compound.ResourceSet" resourceSetUnique="false" applyChangeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (applyChange)\n{\n\t<%tools.vitruv.framework.change.echange.eobject.CreateEObject%><T> _createChange = this.getCreateChange();\n\t<%tools.vitruv.framework.change.echange.EChange%> _resolveApply = _createChange.resolveApply(resourceSet);\n\tthis.setCreateChange(((<%tools.vitruv.framework.change.echange.eobject.CreateEObject%><T>) _resolveApply));\n\tC _insertChange = this.getInsertChange();\n\t<%tools.vitruv.framework.change.echange.EChange%> _resolveApply_1 = _insertChange.resolveApply(resourceSet);\n\tthis.setInsertChange(((C) _resolveApply_1));\n}\nelse\n{\n\tC _insertChange_1 = this.getInsertChange();\n\t<%tools.vitruv.framework.change.echange.EChange%> _resolveRevert = _insertChange_1.resolveRevert(resourceSet);\n\tthis.setInsertChange(((C) _resolveRevert));\n\t<%tools.vitruv.framework.change.echange.eobject.CreateEObject%><T> _createChange_1 = this.getCreateChange();\n\t<%tools.vitruv.framework.change.echange.EChange%> _resolveRevert_1 = _createChange_1.resolveRevert(resourceSet);\n\tthis.setCreateChange(((<%tools.vitruv.framework.change.echange.eobject.CreateEObject%><T>) _resolveRevert_1));\n}'"
	 * @generated
	 */
	void resolveAtomicChanges(ResourceSet resourceSet, boolean applyChange);

} // CreateAndInsertEObject
