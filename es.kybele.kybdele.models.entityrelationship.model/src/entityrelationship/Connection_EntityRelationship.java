/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_EntityRelationship#getRole <em>Role</em>}</li>
 *   <li>{@link entityrelationship.Connection_EntityRelationship#getMinimum_cardinality <em>Minimum cardinality</em>}</li>
 *   <li>{@link entityrelationship.Connection_EntityRelationship#getMaximum_cardinality <em>Maximum cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_EntityRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Connection_EntityRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_EntityRelationship_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_EntityRelationship#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Minimum cardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum cardinality</em>' attribute.
	 * @see #setMinimum_cardinality(String)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_EntityRelationship_Minimum_cardinality()
	 * @model default="1"
	 * @generated
	 */
	String getMinimum_cardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_EntityRelationship#getMinimum_cardinality <em>Minimum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum cardinality</em>' attribute.
	 * @see #getMinimum_cardinality()
	 * @generated
	 */
	void setMinimum_cardinality(String value);

	/**
	 * Returns the value of the '<em><b>Maximum cardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum cardinality</em>' attribute.
	 * @see #setMaximum_cardinality(String)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_EntityRelationship_Maximum_cardinality()
	 * @model default="1"
	 * @generated
	 */
	String getMaximum_cardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_EntityRelationship#getMaximum_cardinality <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum cardinality</em>' attribute.
	 * @see #getMaximum_cardinality()
	 * @generated
	 */
	void setMaximum_cardinality(String value);

} // Connection_EntityRelationship
