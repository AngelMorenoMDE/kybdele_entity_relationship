/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Relationships_Restriction#getType_restriction <em>Type restriction</em>}</li>
 *   <li>{@link entityrelationship.Relationships_Restriction#getSource_relationship <em>Source relationship</em>}</li>
 *   <li>{@link entityrelationship.Relationships_Restriction#getTarget_relationship <em>Target relationship</em>}</li>
 *   <li>{@link entityrelationship.Relationships_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getRelationships_Restriction()
 * @model
 * @generated
 */
public interface Relationships_Restriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Type restriction</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeRestriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type restriction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type restriction</em>' attribute.
	 * @see entityrelationship.TypeRestriction
	 * @see #setType_restriction(TypeRestriction)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationships_Restriction_Type_restriction()
	 * @model
	 * @generated
	 */
	TypeRestriction getType_restriction();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationships_Restriction#getType_restriction <em>Type restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type restriction</em>' attribute.
	 * @see entityrelationship.TypeRestriction
	 * @see #getType_restriction()
	 * @generated
	 */
	void setType_restriction(TypeRestriction value);

	/**
	 * Returns the value of the '<em><b>Source relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source relationship</em>' reference.
	 * @see #setSource_relationship(Relationship)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationships_Restriction_Source_relationship()
	 * @model required="true"
	 * @generated
	 */
	Relationship getSource_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationships_Restriction#getSource_relationship <em>Source relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source relationship</em>' reference.
	 * @see #getSource_relationship()
	 * @generated
	 */
	void setSource_relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Target relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Relationship#getTarget_restrictions <em>Target restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target relationship</em>' reference.
	 * @see #setTarget_relationship(Relationship)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationships_Restriction_Target_relationship()
	 * @see entityrelationship.Relationship#getTarget_restrictions
	 * @model opposite="target_restrictions" required="true"
	 * @generated
	 */
	Relationship getTarget_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationships_Restriction#getTarget_relationship <em>Target relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target relationship</em>' reference.
	 * @see #getTarget_relationship()
	 * @generated
	 */
	void setTarget_relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Rt <em>ERM Has Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationships_Restriction_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_Rt
	 * @model opposite="ERM_Has_Rt" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationships_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Relationships_Restriction
