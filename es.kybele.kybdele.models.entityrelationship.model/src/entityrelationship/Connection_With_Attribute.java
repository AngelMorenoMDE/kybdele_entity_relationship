/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection With Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_With_Attribute#getType_attribute <em>Type attribute</em>}</li>
 *   <li>{@link entityrelationship.Connection_With_Attribute#getConnection_attribute <em>Connection attribute</em>}</li>
 *   <li>{@link entityrelationship.Connection_With_Attribute#getElement <em>Element</em>}</li>
 *   <li>{@link entityrelationship.Connection_With_Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_With_Attribute()
 * @model
 * @generated
 */
public interface Connection_With_Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Type attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type attribute</em>' attribute.
	 * @see entityrelationship.TypeAttribute
	 * @see #setType_attribute(TypeAttribute)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_With_Attribute_Type_attribute()
	 * @model
	 * @generated
	 */
	TypeAttribute getType_attribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_With_Attribute#getType_attribute <em>Type attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type attribute</em>' attribute.
	 * @see entityrelationship.TypeAttribute
	 * @see #getType_attribute()
	 * @generated
	 */
	void setType_attribute(TypeAttribute value);

	/**
	 * Returns the value of the '<em><b>Connection attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Attribute#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection attribute</em>' reference.
	 * @see #setConnection_attribute(Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_With_Attribute_Connection_attribute()
	 * @see entityrelationship.Attribute#getConnected
	 * @model opposite="connected" required="true"
	 * @generated
	 */
	Attribute getConnection_attribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_With_Attribute#getConnection_attribute <em>Connection attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection attribute</em>' reference.
	 * @see #getConnection_attribute()
	 * @generated
	 */
	void setConnection_attribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Elements_with_Attributes#getConnected_with_attribute <em>Connected with attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Elements_with_Attributes)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_With_Attribute_Element()
	 * @see entityrelationship.Elements_with_Attributes#getConnected_with_attribute
	 * @model opposite="connected_with_attribute" required="true"
	 * @generated
	 */
	Elements_with_Attributes getElement();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_With_Attribute#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Elements_with_Attributes value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_CEA <em>ERM Has CEA</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_With_Attribute_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_CEA
	 * @model opposite="ERM_Has_CEA" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_With_Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Connection_With_Attribute
