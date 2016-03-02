/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipPackage
 * @generated
 */
public interface EntityrelationshipFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityrelationshipFactory eINSTANCE = entityrelationship.impl.EntityrelationshipFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity Relationship Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Relationship Model</em>'.
	 * @generated
	 */
	Entity_Relationship_Model createEntity_Relationship_Model();

	/**
	 * Returns a new object of class '<em>Elements with Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elements with Attributes</em>'.
	 * @generated
	 */
	Elements_with_Attributes createElements_with_Attributes();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Composite</em>'.
	 * @generated
	 */
	Attribute_Composite createAttribute_Composite();

	/**
	 * Returns a new object of class '<em>Relationships Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationships Restriction</em>'.
	 * @generated
	 */
	Relationships_Restriction createRelationships_Restriction();

	/**
	 * Returns a new object of class '<em>Connection ERRestriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection ERRestriction</em>'.
	 * @generated
	 */
	Connection_E_R_Restriction createConnection_E_R_Restriction();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Connection With Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection With Attribute</em>'.
	 * @generated
	 */
	Connection_With_Attribute createConnection_With_Attribute();

	/**
	 * Returns a new object of class '<em>Connection Generalization Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Generalization Entity</em>'.
	 * @generated
	 */
	Connection_Generalization_Entity createConnection_Generalization_Entity();

	/**
	 * Returns a new object of class '<em>Connection Entity2 Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Entity2 Relationship</em>'.
	 * @generated
	 */
	Connection_Entity2Relationship createConnection_Entity2Relationship();

	/**
	 * Returns a new object of class '<em>Connection Relationship2 Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Relationship2 Entity</em>'.
	 * @generated
	 */
	Connection_Relationship2Entity createConnection_Relationship2Entity();

	/**
	 * Returns a new object of class '<em>Connection Connection Entity Relationship2 Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Connection Entity Relationship2 Attribute</em>'.
	 * @generated
	 */
	Connection_ConnectionEntityRelationship2Attribute createConnection_ConnectionEntityRelationship2Attribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EntityrelationshipPackage getEntityrelationshipPackage();

} //EntityrelationshipFactory
