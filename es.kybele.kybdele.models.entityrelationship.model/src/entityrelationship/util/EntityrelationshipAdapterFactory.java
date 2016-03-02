/**
 */
package entityrelationship.util;

import entityrelationship.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipPackage
 * @generated
 */
public class EntityrelationshipAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EntityrelationshipPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityrelationshipAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EntityrelationshipPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityrelationshipSwitch<Adapter> modelSwitch =
		new EntityrelationshipSwitch<Adapter>() {
			
			public Adapter caseEntity_Relationship_Model(Entity_Relationship_Model object) {
				return createEntity_Relationship_ModelAdapter();
			}
			
			public Adapter caseElements_with_Attributes(Elements_with_Attributes object) {
				return createElements_with_AttributesAdapter();
			}
			
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			
			public Adapter caseAttribute_Composite(Attribute_Composite object) {
				return createAttribute_CompositeAdapter();
			}
			
			public Adapter caseRelationships_Restriction(Relationships_Restriction object) {
				return createRelationships_RestrictionAdapter();
			}
			
			public Adapter caseConnection_E_R_Restriction(Connection_E_R_Restriction object) {
				return createConnection_E_R_RestrictionAdapter();
			}
			
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			
			public Adapter caseConnection_With_Attribute(Connection_With_Attribute object) {
				return createConnection_With_AttributeAdapter();
			}
			
			public Adapter caseConnection_Generalization_Entity(Connection_Generalization_Entity object) {
				return createConnection_Generalization_EntityAdapter();
			}
			
			public Adapter caseConnection_EntityRelationship(Connection_EntityRelationship object) {
				return createConnection_EntityRelationshipAdapter();
			}
			
			public Adapter caseConnection_Entity2Relationship(Connection_Entity2Relationship object) {
				return createConnection_Entity2RelationshipAdapter();
			}
			
			public Adapter caseConnection_Relationship2Entity(Connection_Relationship2Entity object) {
				return createConnection_Relationship2EntityAdapter();
			}
			
			public Adapter caseConnection_ConnectionEntityRelationship2Attribute(Connection_ConnectionEntityRelationship2Attribute object) {
				return createConnection_ConnectionEntityRelationship2AttributeAdapter();
			}
			
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Entity_Relationship_Model <em>Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Entity_Relationship_Model
	 * @generated
	 */
	public Adapter createEntity_Relationship_ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Elements_with_Attributes <em>Elements with Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Elements_with_Attributes
	 * @generated
	 */
	public Adapter createElements_with_AttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Attribute_Composite <em>Attribute Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Attribute_Composite
	 * @generated
	 */
	public Adapter createAttribute_CompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Relationships_Restriction <em>Relationships Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Relationships_Restriction
	 * @generated
	 */
	public Adapter createRelationships_RestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_E_R_Restriction <em>Connection ERRestriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_E_R_Restriction
	 * @generated
	 */
	public Adapter createConnection_E_R_RestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_With_Attribute <em>Connection With Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_With_Attribute
	 * @generated
	 */
	public Adapter createConnection_With_AttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_Generalization_Entity <em>Connection Generalization Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_Generalization_Entity
	 * @generated
	 */
	public Adapter createConnection_Generalization_EntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_EntityRelationship <em>Connection Entity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_EntityRelationship
	 * @generated
	 */
	public Adapter createConnection_EntityRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_Entity2Relationship <em>Connection Entity2 Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_Entity2Relationship
	 * @generated
	 */
	public Adapter createConnection_Entity2RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_Relationship2Entity <em>Connection Relationship2 Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_Relationship2Entity
	 * @generated
	 */
	public Adapter createConnection_Relationship2EntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute <em>Connection Connection Entity Relationship2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute
	 * @generated
	 */
	public Adapter createConnection_ConnectionEntityRelationship2AttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EntityrelationshipAdapterFactory
