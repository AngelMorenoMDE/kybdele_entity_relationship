/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Connection Entity Relationship2 Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getSource_connection <em>Source connection</em>}</li>
 *   <li>{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getTarget_attribute <em>Target attribute</em>}</li>
 *   <li>{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_ConnectionEntityRelationship2Attribute()
 * @model
 * @generated
 */
public interface Connection_ConnectionEntityRelationship2Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Source connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source connection</em>' reference.
	 * @see #setSource_connection(Connection_EntityRelationship)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_ConnectionEntityRelationship2Attribute_Source_connection()
	 * @model required="true"
	 * @generated
	 */
	Connection_EntityRelationship getSource_connection();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getSource_connection <em>Source connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source connection</em>' reference.
	 * @see #getSource_connection()
	 * @generated
	 */
	void setSource_connection(Connection_EntityRelationship value);

	/**
	 * Returns the value of the '<em><b>Target attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Attribute#getAttribute_connected_to_conection_entityrelationship_to_attribute <em>Attribute connected to conection entityrelationship to attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target attribute</em>' reference.
	 * @see #setTarget_attribute(Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_ConnectionEntityRelationship2Attribute_Target_attribute()
	 * @see entityrelationship.Attribute#getAttribute_connected_to_conection_entityrelationship_to_attribute
	 * @model opposite="attribute_connected_to_conection_entityrelationship_to_attribute" required="true"
	 * @generated
	 */
	Attribute getTarget_attribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getTarget_attribute <em>Target attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target attribute</em>' reference.
	 * @see #getTarget_attribute()
	 * @generated
	 */
	void setTarget_attribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_HasConnectionEntityRelationship2Attribute <em>ERM Has Connection Entity Relationship2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_ConnectionEntityRelationship2Attribute_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_HasConnectionEntityRelationship2Attribute
	 * @model opposite="ERM_HasConnectionEntityRelationship2Attribute" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Connection_ConnectionEntityRelationship2Attribute
