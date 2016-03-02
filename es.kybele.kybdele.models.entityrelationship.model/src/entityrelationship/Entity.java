/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Entity#getName_entity <em>Name entity</em>}</li>
 *   <li>{@link entityrelationship.Entity#getType_entity <em>Type entity</em>}</li>
 *   <li>{@link entityrelationship.Entity#getEntity_connected_to_entity2relationship <em>Entity connected to entity2relationship</em>}</li>
 *   <li>{@link entityrelationship.Entity#getEntity_connected_to_relationship2entity <em>Entity connected to relationship2entity</em>}</li>
 *   <li>{@link entityrelationship.Entity#getSubclass_generalizations <em>Subclass generalizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Elements_with_Attributes {
	/**
	 * Returns the value of the '<em><b>Name entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name entity</em>' attribute.
	 * @see #setName_entity(String)
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Name_entity()
	 * @model
	 * @generated
	 */
	String getName_entity();

	/**
	 * Sets the value of the '{@link entityrelationship.Entity#getName_entity <em>Name entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name entity</em>' attribute.
	 * @see #getName_entity()
	 * @generated
	 */
	void setName_entity(String value);

	/**
	 * Returns the value of the '<em><b>Type entity</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type entity</em>' attribute.
	 * @see entityrelationship.TypeEntity
	 * @see #setType_entity(TypeEntity)
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Type_entity()
	 * @model
	 * @generated
	 */
	TypeEntity getType_entity();

	/**
	 * Sets the value of the '{@link entityrelationship.Entity#getType_entity <em>Type entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type entity</em>' attribute.
	 * @see entityrelationship.TypeEntity
	 * @see #getType_entity()
	 * @generated
	 */
	void setType_entity(TypeEntity value);

	/**
	 * Returns the value of the '<em><b>Entity connected to entity2relationship</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Entity2Relationship}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Entity2Relationship#getSource_entity <em>Source entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity connected to entity2relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity connected to entity2relationship</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Entity_connected_to_entity2relationship()
	 * @see entityrelationship.Connection_Entity2Relationship#getSource_entity
	 * @model opposite="source_entity" resolveProxies="false"
	 * @generated
	 */
	EList<Connection_Entity2Relationship> getEntity_connected_to_entity2relationship();

	/**
	 * Returns the value of the '<em><b>Entity connected to relationship2entity</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Connection_Relationship2Entity}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Connection_Relationship2Entity#getTarget_entity <em>Target entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity connected to relationship2entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity connected to relationship2entity</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Entity_connected_to_relationship2entity()
	 * @see entityrelationship.Connection_Relationship2Entity#getTarget_entity
	 * @model opposite="target_entity" resolveProxies="false"
	 * @generated
	 */
	EList<Connection_Relationship2Entity> getEntity_connected_to_relationship2entity();

	/**
	 * Returns the value of the '<em><b>Subclass generalizations</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Generalization}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Generalization#getSubclasses <em>Subclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass generalizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass generalizations</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getEntity_Subclass_generalizations()
	 * @see entityrelationship.Generalization#getSubclasses
	 * @model opposite="subclasses"
	 * @generated
	 */
	EList<Generalization> getSubclass_generalizations();

} // Entity
