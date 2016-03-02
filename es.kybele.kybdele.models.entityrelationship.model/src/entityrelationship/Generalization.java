/**
 */
package entityrelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Generalization#getRestriction_inheritance_1 <em>Restriction inheritance 1</em>}</li>
 *   <li>{@link entityrelationship.Generalization#getRestriction_inheritance_2 <em>Restriction inheritance 2</em>}</li>
 *   <li>{@link entityrelationship.Generalization#getSubclasses <em>Subclasses</em>}</li>
 *   <li>{@link entityrelationship.Generalization#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link entityrelationship.Generalization#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends EObject {
	/**
	 * Returns the value of the '<em><b>Restriction inheritance 1</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeRestrictionInheritance1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction inheritance 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction inheritance 1</em>' attribute.
	 * @see entityrelationship.TypeRestrictionInheritance1
	 * @see #setRestriction_inheritance_1(TypeRestrictionInheritance1)
	 * @see entityrelationship.EntityrelationshipPackage#getGeneralization_Restriction_inheritance_1()
	 * @model
	 * @generated
	 */
	TypeRestrictionInheritance1 getRestriction_inheritance_1();

	/**
	 * Sets the value of the '{@link entityrelationship.Generalization#getRestriction_inheritance_1 <em>Restriction inheritance 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction inheritance 1</em>' attribute.
	 * @see entityrelationship.TypeRestrictionInheritance1
	 * @see #getRestriction_inheritance_1()
	 * @generated
	 */
	void setRestriction_inheritance_1(TypeRestrictionInheritance1 value);

	/**
	 * Returns the value of the '<em><b>Restriction inheritance 2</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeRestrictionInheritance2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction inheritance 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction inheritance 2</em>' attribute.
	 * @see entityrelationship.TypeRestrictionInheritance2
	 * @see #setRestriction_inheritance_2(TypeRestrictionInheritance2)
	 * @see entityrelationship.EntityrelationshipPackage#getGeneralization_Restriction_inheritance_2()
	 * @model
	 * @generated
	 */
	TypeRestrictionInheritance2 getRestriction_inheritance_2();

	/**
	 * Sets the value of the '{@link entityrelationship.Generalization#getRestriction_inheritance_2 <em>Restriction inheritance 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction inheritance 2</em>' attribute.
	 * @see entityrelationship.TypeRestrictionInheritance2
	 * @see #getRestriction_inheritance_2()
	 * @generated
	 */
	void setRestriction_inheritance_2(TypeRestrictionInheritance2 value);

	/**
	 * Returns the value of the '<em><b>Subclasses</b></em>' reference list.
	 * The list contents are of type {@link entityrelationship.Entity}.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity#getSubclass_generalizations <em>Subclass generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclasses</em>' reference list.
	 * @see entityrelationship.EntityrelationshipPackage#getGeneralization_Subclasses()
	 * @see entityrelationship.Entity#getSubclass_generalizations
	 * @model opposite="subclass_generalizations" lower="2"
	 * @generated
	 */
	EList<Entity> getSubclasses();

	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(Entity)
	 * @see entityrelationship.EntityrelationshipPackage#getGeneralization_Superclass()
	 * @model required="true"
	 * @generated
	 */
	Entity getSuperclass();

	/**
	 * Sets the value of the '{@link entityrelationship.Generalization#getSuperclass <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(Entity value);

	/**
	 * Returns the value of the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_G <em>ERM Has G</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Entity Relationship Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #setInEntityRelationshipModel(Entity_Relationship_Model)
	 * @see entityrelationship.EntityrelationshipPackage#getGeneralization_InEntityRelationshipModel()
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_G
	 * @model opposite="ERM_Has_G" transient="false"
	 * @generated
	 */
	Entity_Relationship_Model getInEntityRelationshipModel();

	/**
	 * Sets the value of the '{@link entityrelationship.Generalization#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Entity Relationship Model</em>' container reference.
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 */
	void setInEntityRelationshipModel(Entity_Relationship_Model value);

} // Generalization
