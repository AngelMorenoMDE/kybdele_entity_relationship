/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Relationship Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_E <em>ERM Has E</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Rt <em>ERM Has Rt</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionEntity2Relationship <em>ERM Has Connection Entity2 Relationship</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionRelationship2Entity <em>ERM Has Connection Relationship2 Entity</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_HasConnectionEntityRelationship2Attribute <em>ERM Has Connection Entity Relationship2 Attribute</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Gen <em>ERM Has Gen</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Rt2 <em>ERM Has Rt2</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_CEA <em>ERM Has CEA</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_At <em>ERM Has At</em>}</li>
 *   <li>{@link entityrelationship.Entity_Relationship_Model#getERM_Has_G <em>ERM Has G</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model()
 * @model
 * @generated
 */
public interface Entity_Relationship_Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link entityrelationship.Entity_Relationship_Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ERM Has E</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Elements_with_Attributes}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Elements_with_Attributes#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has E</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has E</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_E()
	 * @see entityrelationship.Elements_with_Attributes#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true" required="true"
	 * @generated
	 */
	EList<Elements_with_Attributes> getERM_Has_E();

	/**
	 * Returns the value of the '<em><b>ERM Has Rt</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Relationships_Restriction}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Relationships_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has Rt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has Rt</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_Rt()
	 * @see entityrelationship.Relationships_Restriction#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true"
	 * @generated
	 */
	EList<Relationships_Restriction> getERM_Has_Rt();

	/**
	 * Returns the value of the '<em><b>ERM Has Connection Entity2 Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Entity2Relationship}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Entity2Relationship#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has Connection Entity2 Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has Connection Entity2 Relationship</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_ConnectionEntity2Relationship()
	 * @see entityrelationship.Connection_Entity2Relationship#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true"
	 * @generated
	 */
	EList<Connection_Entity2Relationship> getERM_Has_ConnectionEntity2Relationship();

	/**
	 * Returns the value of the '<em><b>ERM Has Connection Relationship2 Entity</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Relationship2Entity}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Relationship2Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has Connection Relationship2 Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has Connection Relationship2 Entity</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_ConnectionRelationship2Entity()
	 * @see entityrelationship.Connection_Relationship2Entity#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true"
	 * @generated
	 */
	EList<Connection_Relationship2Entity> getERM_Has_ConnectionRelationship2Entity();

	/**
	 * Returns the value of the '<em><b>ERM Has Connection Entity Relationship2 Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has Connection Entity Relationship2 Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has Connection Entity Relationship2 Attribute</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_HasConnectionEntityRelationship2Attribute()
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true"
	 * @generated
	 */
	EList<Connection_ConnectionEntityRelationship2Attribute> getERM_HasConnectionEntityRelationship2Attribute();

	/**
	 * Returns the value of the '<em><b>ERM Has Gen</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Generalization_Entity}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Generalization_Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has Gen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has Gen</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_Gen()
	 * @see entityrelationship.Connection_Generalization_Entity#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true" lower="2"
	 * @generated
	 */
	EList<Connection_Generalization_Entity> getERM_Has_Gen();

	/**
	 * Returns the value of the '<em><b>ERM Has Rt2</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Connection_E_R_Restriction}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_E_R_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has Rt2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has Rt2</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_Rt2()
	 * @see entityrelationship.Connection_E_R_Restriction#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true"
	 * @generated
	 */
	EList<Connection_E_R_Restriction> getERM_Has_Rt2();

	/**
	 * Returns the value of the '<em><b>ERM Has CEA</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Connection_With_Attribute}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_With_Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has CEA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has CEA</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_CEA()
	 * @see entityrelationship.Connection_With_Attribute#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true" required="true"
	 * @generated
	 */
	EList<Connection_With_Attribute> getERM_Has_CEA();

	/**
	 * Returns the value of the '<em><b>ERM Has At</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has At</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has At</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_At()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getERM_Has_At();

	/**
	 * Returns the value of the '<em><b>ERM Has G</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Generalization}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Generalization#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERM Has G</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERM Has G</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Relationship_Model_ERM_Has_G()
	 * @see entityrelationship.Generalization#getInEntityRelationshipModel
	 * @model opposite="inEntityRelationshipModel" containment="true"
	 * @generated
	 */
	EList<Generalization> getERM_Has_G();

} // Entity_Relationship_Model
