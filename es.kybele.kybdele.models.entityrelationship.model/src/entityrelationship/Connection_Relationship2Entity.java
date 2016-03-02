/**
 */
package entityrelationship;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Relationship2 Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_Relationship2Entity#getSource_relationship <em>Source relationship</em>}</li>
 *   <li>{@link entityrelationship.Connection_Relationship2Entity#getTarget_entity <em>Target entity</em>}</li>
 *   <li>{@link entityrelationship.Connection_Relationship2Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_Relationship2Entity()
 * @model
 * @generated
 */
public interface Connection_Relationship2Entity extends Connection_EntityRelationship {
	/**
	 * Returns the value of the '<em><b>Source relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Relationship#getRelationship_connected_to_relationship2entity <em>Relationship connected to relationship2entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source relationship</em>' reference.
	 * @see #setSource_relationship(Relationship)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Relationship2Entity_Source_relationship()
	 * @see entityrelationship.Relationship#getRelationship_connected_to_relationship2entity
	 * @model opposite="relationship_connected_to_relationship2entity"
	 * @generated
	 */
	Relationship getSource_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Relationship2Entity#getSource_relationship <em>Source relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source relationship</em>' reference.
	 * @see #getSource_relationship()
	 * @generated
	 */
	void setSource_relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Target entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity#getEntity_connected_to_relationship2entity <em>Entity connected to relationship2entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target entity</em>' reference.
	 * @see #setTarget_entity(Entity)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Relationship2Entity_Target_entity()
	 * @see entityrelationship.Entity#getEntity_connected_to_relationship2entity
	 * @model opposite="entity_connected_to_relationship2entity"
	 * @generated
	 */
	Entity getTarget_entity();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Relationship2Entity#getTarget_entity <em>Target entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target entity</em>' reference.
	 * @see #getTarget_entity()
	 * @generated
	 */
	void setTarget_entity(Entity value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionRelationship2Entity <em>ERM Has Connection Relationship2 Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Relationship2Entity_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionRelationship2Entity
	 * @model opposite="ERM_Has_ConnectionRelationship2Entity" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Relationship2Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Connection_Relationship2Entity
