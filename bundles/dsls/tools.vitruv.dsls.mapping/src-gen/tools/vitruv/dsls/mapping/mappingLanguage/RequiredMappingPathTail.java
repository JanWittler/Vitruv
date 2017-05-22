/**
 * generated by Xtext 2.10.0
 */
package tools.vitruv.dsls.mapping.mappingLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Mapping Path Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getRequiredMapping <em>Required Mapping</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.mapping.mappingLanguage.MappingLanguagePackage#getRequiredMappingPathTail()
 * @model
 * @generated
 */
public interface RequiredMappingPathTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Required Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Mapping</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Mapping</em>' reference.
   * @see #setRequiredMapping(RequiredMapping)
   * @see tools.vitruv.dsls.mapping.mappingLanguage.MappingLanguagePackage#getRequiredMappingPathTail_RequiredMapping()
   * @model
   * @generated
   */
  RequiredMapping getRequiredMapping();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getRequiredMapping <em>Required Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Mapping</em>' reference.
   * @see #getRequiredMapping()
   * @generated
   */
  void setRequiredMapping(RequiredMapping value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(RequiredMappingPathTail)
   * @see tools.vitruv.dsls.mapping.mappingLanguage.MappingLanguagePackage#getRequiredMappingPathTail_Tail()
   * @model containment="true"
   * @generated
   */
  RequiredMappingPathTail getTail();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(RequiredMappingPathTail value);

} // RequiredMappingPathTail
