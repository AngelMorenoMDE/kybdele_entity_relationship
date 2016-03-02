/**
 */
package entityrelationship;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Entity2 Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_Entity2Relationship#getSource_entity <em>Source entity</em>}</li>
 *   <li>{@link entityrelationship.Connection_Entity2Relationship#getTarget_relationship <em>Target relationship</em>}</li>
 *   <li>{@link entityrelationship.Connection_Entity2Relationship#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_Entity2Relationship()
 * @model
 * @generated
 */
public interface Connection_Entity2Relationship extends Connection_EntityRelationship {
	/**
	 * Returns the value of the '<em><b>Source entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity#getEntity_connected_to_entity2relationship <em>Entity connected to entity2relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source entity</em>' reference.
	 * @see #setSource_entity(Entity)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Entity2Relationship_Source_entity()
	 * @see entityrelationship.Entity#getEntity_connected_to_entity2relationship
	 * @model opposite="entity_connected_to_entity2relationship"
	 * @generated
	 */
	Entity getSource_entity();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Entity2Relationship#getSource_entity <em>Source entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source entity</em>' reference.
	 * @see #getSource_entity()
	 * @generated
	 */
	void setSource_entity(Entity value);

	/**
	 * Returns the value of the '<em><b>Target relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Relationship#getRelationship_connected_to_entity2relationship <em>Relationship connected to entity2relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target relationship</em>' reference.
	 * @see #setTarget_relationship(Relationship)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Entity2Relationship_Target_relationship()
	 * @see entityrelationship.Relationship#getRelationship_connected_to_entity2relationship
	 * @model opposite="relationship_connected_to_entity2relationship"
	 * @generated
	 */
	Relationship getTarget_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Entity2Relationship#getTarget_relationship <em>Target relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target relationship</em>' reference.
	 * @see #getTarget_relationship()
	 * @generated
	 */
	void setTarget_relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionEntity2Relationship <em>ERM Has Connection Entity2 Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Entity2Relationship_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionEntity2Relationship
	 * @model opposite="ERM_Has_ConnectionEntity2Relationship" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Entity2Relationship#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Connection_Entity2Relationship
