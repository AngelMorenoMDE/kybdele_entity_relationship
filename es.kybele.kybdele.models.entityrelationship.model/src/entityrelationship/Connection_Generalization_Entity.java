/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Generalization Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Connection_Generalization_Entity#getMinimum_cardinality <em>Minimum cardinality</em>}</li>
 *   <li>{@link entityrelationship.Connection_Generalization_Entity#getMaximum_cardinality <em>Maximum cardinality</em>}</li>
 *   <li>{@link entityrelationship.Connection_Generalization_Entity#getConnection_Generalization <em>Connection Generalization</em>}</li>
 *   <li>{@link entityrelationship.Connection_Generalization_Entity#getConnection_Entity <em>Connection Entity</em>}</li>
 *   <li>{@link entityrelationship.Connection_Generalization_Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getConnection_Generalization_Entity()
 * @model
 * @generated
 */
public interface Connection_Generalization_Entity extends EObject {
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
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Generalization_Entity_Minimum_cardinality()
	 * @model default="1"
	 * @generated
	 */
	String getMinimum_cardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Generalization_Entity#getMinimum_cardinality <em>Minimum cardinality</em>}' attribute.
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
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Generalization_Entity_Maximum_cardinality()
	 * @model default="1"
	 * @generated
	 */
	String getMaximum_cardinality();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Generalization_Entity#getMaximum_cardinality <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum cardinality</em>' attribute.
	 * @see #getMaximum_cardinality()
	 * @generated
	 */
	void setMaximum_cardinality(String value);

	/**
	 * Returns the value of the '<em><b>Connection Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Generalization</em>' reference.
	 * @see #setConnection_Generalization(Generalization)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Generalization_Entity_Connection_Generalization()
	 * @model required="true"
	 * @generated
	 */
	Generalization getConnection_Generalization();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Generalization_Entity#getConnection_Generalization <em>Connection Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Generalization</em>' reference.
	 * @see #getConnection_Generalization()
	 * @generated
	 */
	void setConnection_Generalization(Generalization value);

	/**
	 * Returns the value of the '<em><b>Connection Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Entity</em>' reference.
	 * @see #setConnection_Entity(Entity)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Generalization_Entity_Connection_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getConnection_Entity();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Generalization_Entity#getConnection_Entity <em>Connection Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Entity</em>' reference.
	 * @see #getConnection_Entity()
	 * @generated
	 */
	void setConnection_Entity(Entity value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Gen <em>ERM Has Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getConnection_Generalization_Entity_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_Gen
	 * @model opposite="ERM_Has_Gen" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Connection_Generalization_Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Connection_Generalization_Entity
