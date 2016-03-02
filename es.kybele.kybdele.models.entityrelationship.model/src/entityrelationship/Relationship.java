/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Relationship#getName_relationship <em>Name relationship</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getOrder <em>Order</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getType_relationship <em>Type relationship</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getSource_restrictions <em>Source restrictions</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getTarget_restrictions <em>Target restrictions</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getRelationship_connected_to_entity2relationship <em>Relationship connected to entity2relationship</em>}</li>
 *   <li>{@link entityrelationship.Relationship#getRelationship_connected_to_relationship2entity <em>Relationship connected to relationship2entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Elements_with_Attributes {
	/**
	 * Returns the value of the '<em><b>Name relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name relationship</em>' attribute.
	 * @see #setName_relationship(String)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Name_relationship()
	 * @model
	 * @generated
	 */
	String getName_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationship#getName_relationship <em>Name relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name relationship</em>' attribute.
	 * @see #getName_relationship()
	 * @generated
	 */
	void setName_relationship(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationship#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Cardinality()
	 * @model
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationship#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Type relationship</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type relationship</em>' attribute.
	 * @see entityrelationship.TypeRelationship
	 * @see #setType_relationship(TypeRelationship)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Type_relationship()
	 * @model
	 * @generated
	 */
	TypeRelationship getType_relationship();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationship#getType_relationship <em>Type relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type relationship</em>' attribute.
	 * @see entityrelationship.TypeRelationship
	 * @see #getType_relationship()
	 * @generated
	 */
	void setType_relationship(TypeRelationship value);

	/**
	 * Returns the value of the '<em><b>Source restrictions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source restrictions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source restrictions</em>' reference.
	 * @see #setSource_restrictions(Relationships_Restriction)
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Source_restrictions()
	 * @model
	 * @generated
	 */
	Relationships_Restriction getSource_restrictions();

	/**
	 * Sets the value of the '{@link entityrelationship.Relationship#getSource_restrictions <em>Source restrictions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source restrictions</em>' reference.
	 * @see #getSource_restrictions()
	 * @generated
	 */
	void setSource_restrictions(Relationships_Restriction value);

	/**
	 * Returns the value of the '<em><b>Target restrictions</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Relationships_Restriction}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Relationships_Restriction#getTarget_relationship <em>Target relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target restrictions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target restrictions</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Target_restrictions()
	 * @see entityrelationship.Relationships_Restriction#getTarget_relationship
	 * @model opposite="target_relationship"
	 * @generated
	 */
	EList<Relationships_Restriction> getTarget_restrictions();

	/**
	 * Returns the value of the '<em><b>Relationship connected to entity2relationship</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Entity2Relationship}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Entity2Relationship#getTarget_relationship <em>Target relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship connected to entity2relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship connected to entity2relationship</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Relationship_connected_to_entity2relationship()
	 * @see entityrelationship.Connection_Entity2Relationship#getTarget_relationship
	 * @model opposite="target_relationship" resolveProxies="false"
	 * @generated
	 */
	EList<Connection_Entity2Relationship> getRelationship_connected_to_entity2relationship();

	/**
	 * Returns the value of the '<em><b>Relationship connected to relationship2entity</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Relationship2Entity}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Relationship2Entity#getSource_relationship <em>Source relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship connected to relationship2entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship connected to relationship2entity</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getRelationship_Relationship_connected_to_relationship2entity()
	 * @see entityrelationship.Connection_Relationship2Entity#getSource_relationship
	 * @model opposite="source_relationship" resolveProxies="false"
	 * @generated
	 */
	EList<Connection_Relationship2Entity> getRelationship_connected_to_relationship2entity();

} // Relationship
