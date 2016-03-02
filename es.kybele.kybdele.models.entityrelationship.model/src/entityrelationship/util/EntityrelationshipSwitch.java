/**
 */
package entityrelationship.util;

import entityrelationship.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipPackage
 * @generated
 */
public class EntityrelationshipSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EntityrelationshipPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityrelationshipSwitch() {
		if (modelPackage == null) {
			modelPackage = EntityrelationshipPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL: {
				Entity_Relationship_Model entity_Relationship_Model = (Entity_Relationship_Model)theEObject;
				T result = caseEntity_Relationship_Model(entity_Relationship_Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.ELEMENTS_WITH_ATTRIBUTES: {
				Elements_with_Attributes elements_with_Attributes = (Elements_with_Attributes)theEObject;
				T result = caseElements_with_Attributes(elements_with_Attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseElements_with_Attributes(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElements_with_Attributes(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE: {
				Attribute_Composite attribute_Composite = (Attribute_Composite)theEObject;
				T result = caseAttribute_Composite(attribute_Composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION: {
				Relationships_Restriction relationships_Restriction = (Relationships_Restriction)theEObject;
				T result = caseRelationships_Restriction(relationships_Restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION: {
				Connection_E_R_Restriction connection_E_R_Restriction = (Connection_E_R_Restriction)theEObject;
				T result = caseConnection_E_R_Restriction(connection_E_R_Restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE: {
				Connection_With_Attribute connection_With_Attribute = (Connection_With_Attribute)theEObject;
				T result = caseConnection_With_Attribute(connection_With_Attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY: {
				Connection_Generalization_Entity connection_Generalization_Entity = (Connection_Generalization_Entity)theEObject;
				T result = caseConnection_Generalization_Entity(connection_Generalization_Entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP: {
				Connection_EntityRelationship connection_EntityRelationship = (Connection_EntityRelationship)theEObject;
				T result = caseConnection_EntityRelationship(connection_EntityRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP: {
				Connection_Entity2Relationship connection_Entity2Relationship = (Connection_Entity2Relationship)theEObject;
				T result = caseConnection_Entity2Relationship(connection_Entity2Relationship);
				if (result == null) result = caseConnection_EntityRelationship(connection_Entity2Relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY: {
				Connection_Relationship2Entity connection_Relationship2Entity = (Connection_Relationship2Entity)theEObject;
				T result = caseConnection_Relationship2Entity(connection_Relationship2Entity);
				if (result == null) result = caseConnection_EntityRelationship(connection_Relationship2Entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE: {
				Connection_ConnectionEntityRelationship2Attribute connection_ConnectionEntityRelationship2Attribute = (Connection_ConnectionEntityRelationship2Attribute)theEObject;
				T result = caseConnection_ConnectionEntityRelationship2Attribute(connection_ConnectionEntityRelationship2Attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Relationship Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Relationship Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity_Relationship_Model(Entity_Relationship_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elements with Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elements with Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElements_with_Attributes(Elements_with_Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_Composite(Attribute_Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationships Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationships Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationships_Restriction(Relationships_Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection ERRestriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection ERRestriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_E_R_Restriction(Connection_E_R_Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection With Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection With Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_With_Attribute(Connection_With_Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Generalization Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Generalization Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_Generalization_Entity(Connection_Generalization_Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Entity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Entity Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_EntityRelationship(Connection_EntityRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Entity2 Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Entity2 Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_Entity2Relationship(Connection_Entity2Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Relationship2 Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Relationship2 Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_Relationship2Entity(Connection_Relationship2Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Connection Entity Relationship2 Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Connection Entity Relationship2 Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_ConnectionEntityRelationship2Attribute(Connection_ConnectionEntityRelationship2Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	
	public T defaultCase(EObject object) {
		return null;
	}

} //EntityrelationshipSwitch
