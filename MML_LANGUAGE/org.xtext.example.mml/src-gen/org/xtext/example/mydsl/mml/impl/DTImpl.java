/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.mml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.mml.DT;
import org.xtext.example.mydsl.mml.DTCriterion;
import org.xtext.example.mydsl.mml.MmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.DTImpl#isMaxdepthSpecified <em>Maxdepth Specified</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.DTImpl#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.DTImpl#isCriterionSpecified <em>Criterion Specified</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.DTImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTImpl extends MLAlgorithmImpl implements DT
{
  /**
   * The default value of the '{@link #isMaxdepthSpecified() <em>Maxdepth Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxdepthSpecified()
   * @generated
   * @ordered
   */
  protected static final boolean MAXDEPTH_SPECIFIED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMaxdepthSpecified() <em>Maxdepth Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxdepthSpecified()
   * @generated
   * @ordered
   */
  protected boolean maxdepthSpecified = MAXDEPTH_SPECIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getMax_depth() <em>Max depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_depth()
   * @generated
   * @ordered
   */
  protected static final int MAX_DEPTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax_depth() <em>Max depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_depth()
   * @generated
   * @ordered
   */
  protected int max_depth = MAX_DEPTH_EDEFAULT;

  /**
   * The default value of the '{@link #isCriterionSpecified() <em>Criterion Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCriterionSpecified()
   * @generated
   * @ordered
   */
  protected static final boolean CRITERION_SPECIFIED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCriterionSpecified() <em>Criterion Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCriterionSpecified()
   * @generated
   * @ordered
   */
  protected boolean criterionSpecified = CRITERION_SPECIFIED_EDEFAULT;

  /**
   * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriterion()
   * @generated
   * @ordered
   */
  protected static final DTCriterion CRITERION_EDEFAULT = DTCriterion.GINI;

  /**
   * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriterion()
   * @generated
   * @ordered
   */
  protected DTCriterion criterion = CRITERION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DTImpl()
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
    return MmlPackage.Literals.DT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMaxdepthSpecified()
  {
    return maxdepthSpecified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxdepthSpecified(boolean newMaxdepthSpecified)
  {
    boolean oldMaxdepthSpecified = maxdepthSpecified;
    maxdepthSpecified = newMaxdepthSpecified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.DT__MAXDEPTH_SPECIFIED, oldMaxdepthSpecified, maxdepthSpecified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMax_depth()
  {
    return max_depth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMax_depth(int newMax_depth)
  {
    int oldMax_depth = max_depth;
    max_depth = newMax_depth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.DT__MAX_DEPTH, oldMax_depth, max_depth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isCriterionSpecified()
  {
    return criterionSpecified;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCriterionSpecified(boolean newCriterionSpecified)
  {
    boolean oldCriterionSpecified = criterionSpecified;
    criterionSpecified = newCriterionSpecified;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.DT__CRITERION_SPECIFIED, oldCriterionSpecified, criterionSpecified));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DTCriterion getCriterion()
  {
    return criterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCriterion(DTCriterion newCriterion)
  {
    DTCriterion oldCriterion = criterion;
    criterion = newCriterion == null ? CRITERION_EDEFAULT : newCriterion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.DT__CRITERION, oldCriterion, criterion));
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
      case MmlPackage.DT__MAXDEPTH_SPECIFIED:
        return isMaxdepthSpecified();
      case MmlPackage.DT__MAX_DEPTH:
        return getMax_depth();
      case MmlPackage.DT__CRITERION_SPECIFIED:
        return isCriterionSpecified();
      case MmlPackage.DT__CRITERION:
        return getCriterion();
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
      case MmlPackage.DT__MAXDEPTH_SPECIFIED:
        setMaxdepthSpecified((Boolean)newValue);
        return;
      case MmlPackage.DT__MAX_DEPTH:
        setMax_depth((Integer)newValue);
        return;
      case MmlPackage.DT__CRITERION_SPECIFIED:
        setCriterionSpecified((Boolean)newValue);
        return;
      case MmlPackage.DT__CRITERION:
        setCriterion((DTCriterion)newValue);
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
      case MmlPackage.DT__MAXDEPTH_SPECIFIED:
        setMaxdepthSpecified(MAXDEPTH_SPECIFIED_EDEFAULT);
        return;
      case MmlPackage.DT__MAX_DEPTH:
        setMax_depth(MAX_DEPTH_EDEFAULT);
        return;
      case MmlPackage.DT__CRITERION_SPECIFIED:
        setCriterionSpecified(CRITERION_SPECIFIED_EDEFAULT);
        return;
      case MmlPackage.DT__CRITERION:
        setCriterion(CRITERION_EDEFAULT);
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
      case MmlPackage.DT__MAXDEPTH_SPECIFIED:
        return maxdepthSpecified != MAXDEPTH_SPECIFIED_EDEFAULT;
      case MmlPackage.DT__MAX_DEPTH:
        return max_depth != MAX_DEPTH_EDEFAULT;
      case MmlPackage.DT__CRITERION_SPECIFIED:
        return criterionSpecified != CRITERION_SPECIFIED_EDEFAULT;
      case MmlPackage.DT__CRITERION:
        return criterion != CRITERION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (maxdepthSpecified: ");
    result.append(maxdepthSpecified);
    result.append(", max_depth: ");
    result.append(max_depth);
    result.append(", criterionSpecified: ");
    result.append(criterionSpecified);
    result.append(", criterion: ");
    result.append(criterion);
    result.append(')');
    return result.toString();
  }

} //DTImpl
