/**
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.impl;

import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.CorrespondingModelElementRetrieve;
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ModelPathCodeBlock;
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ResponseLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corresponding Model Element Retrieve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.impl.CorrespondingModelElementRetrieveImpl#getRenamedModelFileName <em>Renamed Model File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrespondingModelElementRetrieveImpl extends CorrespondingModelElementRetrieveOrDeleteImpl implements CorrespondingModelElementRetrieve
{
  /**
   * The cached value of the '{@link #getRenamedModelFileName() <em>Renamed Model File Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRenamedModelFileName()
   * @generated
   * @ordered
   */
  protected ModelPathCodeBlock renamedModelFileName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CorrespondingModelElementRetrieveImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ResponseLanguagePackage.Literals.CORRESPONDING_MODEL_ELEMENT_RETRIEVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPathCodeBlock getRenamedModelFileName()
  {
    return renamedModelFileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRenamedModelFileName(ModelPathCodeBlock newRenamedModelFileName, NotificationChain msgs)
  {
    ModelPathCodeBlock oldRenamedModelFileName = renamedModelFileName;
    renamedModelFileName = newRenamedModelFileName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME, oldRenamedModelFileName, newRenamedModelFileName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRenamedModelFileName(ModelPathCodeBlock newRenamedModelFileName)
  {
    if (newRenamedModelFileName != renamedModelFileName)
    {
      NotificationChain msgs = null;
      if (renamedModelFileName != null)
        msgs = ((InternalEObject)renamedModelFileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME, null, msgs);
      if (newRenamedModelFileName != null)
        msgs = ((InternalEObject)newRenamedModelFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME, null, msgs);
      msgs = basicSetRenamedModelFileName(newRenamedModelFileName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME, newRenamedModelFileName, newRenamedModelFileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME:
        return basicSetRenamedModelFileName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME:
        return getRenamedModelFileName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME:
        setRenamedModelFileName((ModelPathCodeBlock)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME:
        setRenamedModelFileName((ModelPathCodeBlock)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ResponseLanguagePackage.CORRESPONDING_MODEL_ELEMENT_RETRIEVE__RENAMED_MODEL_FILE_NAME:
        return renamedModelFileName != null;
    }
    return super.eIsSet(featureID);
  }

} //CorrespondingModelElementRetrieveImpl
