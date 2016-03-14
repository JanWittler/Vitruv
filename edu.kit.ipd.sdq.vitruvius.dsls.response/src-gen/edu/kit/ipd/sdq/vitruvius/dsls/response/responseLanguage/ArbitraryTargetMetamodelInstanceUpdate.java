/**
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage;

import edu.kit.ipd.sdq.vitruvius.dsls.mirbase.mirBase.MetamodelReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Target Metamodel Instance Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ArbitraryTargetMetamodelInstanceUpdate#getMetamodelReference <em>Metamodel Reference</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ResponseLanguagePackage#getArbitraryTargetMetamodelInstanceUpdate()
 * @model
 * @generated
 */
public interface ArbitraryTargetMetamodelInstanceUpdate extends TargetChange
{
  /**
   * Returns the value of the '<em><b>Metamodel Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Reference</em>' containment reference.
   * @see #setMetamodelReference(MetamodelReference)
   * @see edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ResponseLanguagePackage#getArbitraryTargetMetamodelInstanceUpdate_MetamodelReference()
   * @model containment="true"
   * @generated
   */
  MetamodelReference getMetamodelReference();

  /**
   * Sets the value of the '{@link edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ArbitraryTargetMetamodelInstanceUpdate#getMetamodelReference <em>Metamodel Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel Reference</em>' containment reference.
   * @see #getMetamodelReference()
   * @generated
   */
  void setMetamodelReference(MetamodelReference value);

} // ArbitraryTargetMetamodelInstanceUpdate
