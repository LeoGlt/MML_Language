/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.mml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.DT#isMaxdepthSpecified <em>Maxdepth Specified</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.DT#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.DT#isCriterionSpecified <em>Criterion Specified</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.DT#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mml.MmlPackage#getDT()
 * @model
 * @generated
 */
public interface DT extends MLAlgorithm
{
  /**
   * Returns the value of the '<em><b>Maxdepth Specified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxdepth Specified</em>' attribute.
   * @see #setMaxdepthSpecified(boolean)
   * @see org.xtext.example.mydsl.mml.MmlPackage#getDT_MaxdepthSpecified()
   * @model
   * @generated
   */
  boolean isMaxdepthSpecified();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mml.DT#isMaxdepthSpecified <em>Maxdepth Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxdepth Specified</em>' attribute.
   * @see #isMaxdepthSpecified()
   * @generated
   */
  void setMaxdepthSpecified(boolean value);

  /**
   * Returns the value of the '<em><b>Max depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max depth</em>' attribute.
   * @see #setMax_depth(int)
   * @see org.xtext.example.mydsl.mml.MmlPackage#getDT_Max_depth()
   * @model
   * @generated
   */
  int getMax_depth();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mml.DT#getMax_depth <em>Max depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max depth</em>' attribute.
   * @see #getMax_depth()
   * @generated
   */
  void setMax_depth(int value);

  /**
   * Returns the value of the '<em><b>Criterion Specified</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criterion Specified</em>' attribute.
   * @see #setCriterionSpecified(boolean)
   * @see org.xtext.example.mydsl.mml.MmlPackage#getDT_CriterionSpecified()
   * @model
   * @generated
   */
  boolean isCriterionSpecified();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mml.DT#isCriterionSpecified <em>Criterion Specified</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criterion Specified</em>' attribute.
   * @see #isCriterionSpecified()
   * @generated
   */
  void setCriterionSpecified(boolean value);

  /**
   * Returns the value of the '<em><b>Criterion</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.mml.DTCriterion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criterion</em>' attribute.
   * @see org.xtext.example.mydsl.mml.DTCriterion
   * @see #setCriterion(DTCriterion)
   * @see org.xtext.example.mydsl.mml.MmlPackage#getDT_Criterion()
   * @model
   * @generated
   */
  DTCriterion getCriterion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mml.DT#getCriterion <em>Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criterion</em>' attribute.
   * @see org.xtext.example.mydsl.mml.DTCriterion
   * @see #getCriterion()
   * @generated
   */
  void setCriterion(DTCriterion value);

} // DT
