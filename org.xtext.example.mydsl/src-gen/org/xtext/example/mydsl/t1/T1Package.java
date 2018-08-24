/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.t1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.t1.T1Factory
 * @model kind="package"
 * @generated
 */
public interface T1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "t1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/T1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "t1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  T1Package eINSTANCE = org.xtext.example.mydsl.t1.impl.T1PackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.t1.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.t1.impl.ModelImpl
   * @see org.xtext.example.mydsl.t1.impl.T1PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VARS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.t1.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.t1.impl.VarImpl
   * @see org.xtext.example.mydsl.t1.impl.T1PackageImpl#getVar()
   * @generated
   */
  int VAR = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.t1.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.t1.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.t1.Model#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see org.xtext.example.mydsl.t1.Model#getVars()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Vars();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.t1.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see org.xtext.example.mydsl.t1.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.t1.Var#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Declarations</em>'.
   * @see org.xtext.example.mydsl.t1.Var#getDeclarations()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Declarations();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  T1Factory getT1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.t1.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.t1.impl.ModelImpl
     * @see org.xtext.example.mydsl.t1.impl.T1PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__VARS = eINSTANCE.getModel_Vars();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.t1.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.t1.impl.VarImpl
     * @see org.xtext.example.mydsl.t1.impl.T1PackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__DECLARATIONS = eINSTANCE.getVar_Declarations();

  }

} //T1Package