/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl;

import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingLanguagePackage;
import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.XbaseSignatureConstraintExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xbase Signature Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.XbaseSignatureConstraintExpressionImpl#getCheckBlock <em>Check Block</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.XbaseSignatureConstraintExpressionImpl#getEnforceBlock <em>Enforce Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XbaseSignatureConstraintExpressionImpl extends ConstraintExpressionImpl implements XbaseSignatureConstraintExpression
{
  /**
   * The cached value of the '{@link #getCheckBlock() <em>Check Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckBlock()
   * @generated
   * @ordered
   */
  protected XExpression checkBlock;

  /**
   * The cached value of the '{@link #getEnforceBlock() <em>Enforce Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnforceBlock()
   * @generated
   * @ordered
   */
  protected XExpression enforceBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XbaseSignatureConstraintExpressionImpl()
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
    return MappingLanguagePackage.Literals.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getCheckBlock()
  {
    return checkBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckBlock(XExpression newCheckBlock, NotificationChain msgs)
  {
    XExpression oldCheckBlock = checkBlock;
    checkBlock = newCheckBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK, oldCheckBlock, newCheckBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckBlock(XExpression newCheckBlock)
  {
    if (newCheckBlock != checkBlock)
    {
      NotificationChain msgs = null;
      if (checkBlock != null)
        msgs = ((InternalEObject)checkBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK, null, msgs);
      if (newCheckBlock != null)
        msgs = ((InternalEObject)newCheckBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK, null, msgs);
      msgs = basicSetCheckBlock(newCheckBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK, newCheckBlock, newCheckBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getEnforceBlock()
  {
    return enforceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnforceBlock(XExpression newEnforceBlock, NotificationChain msgs)
  {
    XExpression oldEnforceBlock = enforceBlock;
    enforceBlock = newEnforceBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK, oldEnforceBlock, newEnforceBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnforceBlock(XExpression newEnforceBlock)
  {
    if (newEnforceBlock != enforceBlock)
    {
      NotificationChain msgs = null;
      if (enforceBlock != null)
        msgs = ((InternalEObject)enforceBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK, null, msgs);
      if (newEnforceBlock != null)
        msgs = ((InternalEObject)newEnforceBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK, null, msgs);
      msgs = basicSetEnforceBlock(newEnforceBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK, newEnforceBlock, newEnforceBlock));
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
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK:
        return basicSetCheckBlock(null, msgs);
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK:
        return basicSetEnforceBlock(null, msgs);
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
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK:
        return getCheckBlock();
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK:
        return getEnforceBlock();
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
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK:
        setCheckBlock((XExpression)newValue);
        return;
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK:
        setEnforceBlock((XExpression)newValue);
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
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK:
        setCheckBlock((XExpression)null);
        return;
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK:
        setEnforceBlock((XExpression)null);
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
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__CHECK_BLOCK:
        return checkBlock != null;
      case MappingLanguagePackage.XBASE_SIGNATURE_CONSTRAINT_EXPRESSION__ENFORCE_BLOCK:
        return enforceBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //XbaseSignatureConstraintExpressionImpl