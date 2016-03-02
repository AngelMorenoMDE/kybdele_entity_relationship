/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements with Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Elements_with_Attributes#getConnected_with_attribute <em>Connected with attribute</em>}</li>
 *   <li>{@link entityrelationship.Elements_with_Attributes#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getElements_with_Attributes()
 * @model
 * @generated
 */
public interface Elements_with_Attributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Connected with attribute</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Connection_With_Attribute}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_With_Attribute#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected with attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected with attribute</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getElements_with_Attributes_Connected_with_attribute()
	 * @see entityrelationship.Connection_With_Attribute#getElement
	 * @model opposite="element"
	 * @generated
	 */
	EList<Connection_With_Attribute> getConnected_with_attribute();

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_E <em>ERM Has E</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getElements_with_Attributes_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_E
	 * @model opposite="ERM_Has_E" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Elements_with_Attributes#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Elements_with_Attributes
