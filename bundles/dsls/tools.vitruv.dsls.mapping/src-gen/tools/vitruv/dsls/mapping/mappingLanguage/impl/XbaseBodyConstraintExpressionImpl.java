/**
 * generated by Xtext 2.10.0
 */
package tools.vitruv.dsls.mapping.mappingLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import tools.vitruv.dsls.mapping.mappingLanguage.MappingLanguagePackage;
import tools.vitruv.dsls.mapping.mappingLanguage.XbaseBodyConstraintExpression;

import tools.vitruv.dsls.mirbase.mirBase.MetamodelReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xbase Body Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mapping.mappingLanguage.impl.XbaseBodyConstraintExpressionImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mapping.mappingLanguage.impl.XbaseBodyConstraintExpressionImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XbaseBodyConstraintExpressionImpl extends ConstraintExpressionImpl implements XbaseBodyConstraintExpression
{
  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected MetamodelReference metamodel;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected XExpression block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XbaseBodyConstraintExpressionImpl()
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
    return MappingLanguagePackage.Literals.XBASE_BODY_CONSTRAINT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelReference getMetamodel()
  {
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetamodel(MetamodelReference newMetamodel, NotificationChain msgs)
  {
    MetamodelReference oldMetamodel = metamodel;
    metamodel = newMetamodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL, oldMetamodel, newMetamodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetamodel(MetamodelReference newMetamodel)
  {
    if (newMetamodel != metamodel)
    {
      NotificationChain msgs = null;
      if (metamodel != null)
        msgs = ((InternalEObject)metamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL, null, msgs);
      if (newMetamodel != null)
        msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL, null, msgs);
      msgs = basicSetMetamodel(newMetamodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL, newMetamodel, newMetamodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(XExpression newBlock, NotificationChain msgs)
  {
    XExpression oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(XExpression newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK, newBlock, newBlock));
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
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL:
        return basicSetMetamodel(null, msgs);
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL:
        return getMetamodel();
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK:
        return getBlock();
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
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL:
        setMetamodel((MetamodelReference)newValue);
        return;
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK:
        setBlock((XExpression)newValue);
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
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL:
        setMetamodel((MetamodelReference)null);
        return;
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK:
        setBlock((XExpression)null);
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
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__METAMODEL:
        return metamodel != null;
      case MappingLanguagePackage.XBASE_BODY_CONSTRAINT_EXPRESSION__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //XbaseBodyConstraintExpressionImpl
