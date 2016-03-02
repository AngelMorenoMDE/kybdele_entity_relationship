/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Attribute#getName_attribute <em>Name attribute</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getAttributes_composites <em>Attributes composites</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getAttributes_identification <em>Attributes identification</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getConnected <em>Connected</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getInAttribute <em>In Attribute</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 *   <li>{@link entityrelationship.Attribute#getAttribute_connected_to_conection_entityrelationship_to_attribute <em>Attribute connected to conection entityrelationship to attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name attribute</em>' attribute.
	 * @see #setName_attribute(String)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Name_attribute()
	 * @model
	 * @generated
	 */
	String getName_attribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getName_attribute <em>Name attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name attribute</em>' attribute.
	 * @see #getName_attribute()
	 * @generated
	 */
	void setName_attribute(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see entityrelationship.TypeIdentifier
	 * @see #setIdentifier(TypeIdentifier)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Identifier()
	 * @model
	 * @generated
	 */
	TypeIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see entityrelationship.TypeIdentifier
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(TypeIdentifier value);

	/**
	 * Returns the value of the '<em><b>Attributes composites</b></em>' containment reference list.
	 * The list contents are of type {@link entityrelationship.Attribute_Composite}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Attribute_Composite#getInAttribute <em>In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes composites</em>' containment reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Attributes_composites()
	 * @see entityrelationship.Attribute_Composite#getInAttribute
	 * @model opposite="inAttribute" containment="true"
	 * @generated
	 */
	EList<Attribute_Composite> getAttributes_composites();

	/**
	 * Returns the value of the '<em><b>Attributes identification</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Attribute}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Attribute#getInAttribute <em>In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes identification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes identification</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Attributes_identification()
	 * @see entityrelationship.Attribute#getInAttribute
	 * @model opposite="inAttribute"
	 * @generated
	 */
	EList<Attribute> getAttributes_identification();

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_With_Attribute#getConnection_attribute <em>Connection attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference.
	 * @see #setConnected(Connection_With_Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Connected()
	 * @see entityrelationship.Connection_With_Attribute#getConnection_attribute
	 * @model opposite="connection_attribute" required="true"
	 * @generated
	 */
	Connection_With_Attribute getConnected();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getConnected <em>Connected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' reference.
	 * @see #getConnected()
	 * @generated
	 */
	void setConnected(Connection_With_Attribute value);

	/**
	 * Returns the value of the '<em><b>In Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Attribute#getAttributes_identification <em>Attributes identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Attribute</em>' reference.
	 * @see #setInAttribute(Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_InAttribute()
	 * @see entityrelationship.Attribute#getAttributes_identification
	 * @model opposite="attributes_identification"
	 * @generated
	 */
	Attribute getInAttribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getInAttribute <em>In Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Attribute</em>' reference.
	 * @see #getInAttribute()
	 * @generated
	 */
	void setInAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_InEntityRelationshipModel()
	 * @model
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

	/**
	 * Returns the value of the '<em><b>Attribute connected to conection entityrelationship to attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getTarget_attribute <em>Target attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute connected to conection entityrelationship to attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute connected to conection entityrelationship to attribute</em>' reference.
	 * @see #setAttribute_connected_to_conection_entityrelationship_to_attribute(Connection_ConnectionEntityRelationship2Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Attribute_connected_to_conection_entityrelationship_to_attribute()
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getTarget_attribute
	 * @model opposite="target_attribute"
	 * @generated
	 */
	Connection_ConnectionEntityRelationship2Attribute getAttribute_connected_to_conection_entityrelationship_to_attribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute#getAttribute_connected_to_conection_entityrelationship_to_attribute <em>Attribute connected to conection entityrelationship to attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute connected to conection entityrelationship to attribute</em>' reference.
	 * @see #getAttribute_connected_to_conection_entityrelationship_to_attribute()
	 * @generated
	 */
	void setAttribute_connected_to_conection_entityrelationship_to_attribute(Connection_ConnectionEntityRelationship2Attribute value);

} // Attribute
