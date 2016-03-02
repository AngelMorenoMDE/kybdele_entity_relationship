/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link entityrelationship.Attribute_Composite#getName_at_composite <em>Name at composite</em>}</li>
 *   <li>{@link entityrelationship.Attribute_Composite#getIdentifier_at_composite <em>Identifier at composite</em>}</li>
 *   <li>{@link entityrelationship.Attribute_Composite#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link entityrelationship.Attribute_Composite#getInAttribute <em>In Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Composite()
 * @model
 * @generated
 */
public interface Attribute_Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name at composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name at composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name at composite</em>' attribute.
	 * @see #setName_at_composite(String)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Composite_Name_at_composite()
	 * @model
	 * @generated
	 */
	String getName_at_composite();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute_Composite#getName_at_composite <em>Name at composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name at composite</em>' attribute.
	 * @see #getName_at_composite()
	 * @generated
	 */
	void setName_at_composite(String value);

	/**
	 * Returns the value of the '<em><b>Identifier at composite</b></em>' attribute.
	 * The literals are from the enumeration {@link entityrelationship.TypeIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier at composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier at composite</em>' attribute.
	 * @see entityrelationship.TypeIdentifier
	 * @see #setIdentifier_at_composite(TypeIdentifier)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Composite_Identifier_at_composite()
	 * @model
	 * @generated
	 */
	TypeIdentifier getIdentifier_at_composite();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute_Composite#getIdentifier_at_composite <em>Identifier at composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier at composite</em>' attribute.
	 * @see entityrelationship.TypeIdentifier
	 * @see #getIdentifier_at_composite()
	 * @generated
	 */
	void setIdentifier_at_composite(TypeIdentifier value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Composite_Attributes()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttributes();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute_Composite#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attribute value);

	/**
	 * Returns the value of the '<em><b>In Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link entityrelationship.Attribute#getAttributes_composites <em>Attributes composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Attribute</em>' container reference.
	 * @see #setInAttribute(Attribute)
	 * @see entityrelationship.EntityrelationshipPackage#getAttribute_Composite_InAttribute()
	 * @see entityrelationship.Attribute#getAttributes_composites
	 * @model opposite="attributes_composites" transient="false"
	 * @generated
	 */
	Attribute getInAttribute();

	/**
	 * Sets the value of the '{@link entityrelationship.Attribute_Composite#getInAttribute <em>In Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Attribute</em>' container reference.
	 * @see #getInAttribute()
	 * @generated
	 */
	void setInAttribute(Attribute value);

} // Attribute_Composite
