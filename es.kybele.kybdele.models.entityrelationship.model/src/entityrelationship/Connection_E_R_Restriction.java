/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection ERRestriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_E_R_Restriction#getConnection_source_entity_relationship <em>Connection source entity relationship</em>}</li>
 *   <li>{@link entityrelationship.Connection_E_R_Restriction#getType_restriction <em>Type restriction</em>}</li>
 *   <li>{@link entityrelationship.Connection_E_R_Restriction#getConnection_target_entity_relationship <em>Connection target entity relationship</em>}</li>
 *   <li>{@link entityrelationship.Connection_E_R_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_E_R_Restriction()
 * @model
 * @generated
 */
public interface Connection_E_R_Restriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection source entity relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection source entity relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection source entity relationship</em>' reference.
	 * @see #setConnection_source_entity_relationship(Connection_EntityRelationship)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_E_R_Restriction_Connection_source_entity_relationship()
	 * @model required="true"
	 * @generated
	 */
	Connection_EntityRelationship getConnection_source_entity_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_E_R_Restriction#getConnection_source_entity_relationship <em>Connection source entity relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection source entity relationship</em>' reference.
	 * @see #getConnection_source_entity_relationship()
	 * @generated
	 */
	void setConnection_source_entity_relationship(Connection_EntityRelationship value);

	/**
	 * Returns the value of the '<em><b>Type restriction</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeRestriction2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type restriction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type restriction</em>' attribute.
	 * @see entityrelationship.TypeRestriction2
	 * @see #setType_restriction(TypeRestriction2)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_E_R_Restriction_Type_restriction()
	 * @model
	 * @generated
	 */
	TypeRestriction2 getType_restriction();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_E_R_Restriction#getType_restriction <em>Type restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type restriction</em>' attribute.
	 * @see entityrelationship.TypeRestriction2
	 * @see #getType_restriction()
	 * @generated
	 */
	void setType_restriction(TypeRestriction2 value);

	/**
	 * Returns the value of the '<em><b>Connection target entity relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection target entity relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection target entity relationship</em>' reference.
	 * @see #setConnection_target_entity_relationship(Connection_EntityRelationship)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_E_R_Restriction_Connection_target_entity_relationship()
	 * @model required="true"
	 * @generated
	 */
	Connection_EntityRelationship getConnection_target_entity_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_E_R_Restriction#getConnection_target_entity_relationship <em>Connection target entity relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection target entity relationship</em>' reference.
	 * @see #getConnection_target_entity_relationship()
	 * @generated
	 */
	void setConnection_target_entity_relationship(Connection_EntityRelationship value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Rt2 <em>ERM Has Rt2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_E_R_Restriction_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_Rt2
	 * @model opposite="ERM_Has_Rt2" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_E_R_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Connection_E_R_Restriction
