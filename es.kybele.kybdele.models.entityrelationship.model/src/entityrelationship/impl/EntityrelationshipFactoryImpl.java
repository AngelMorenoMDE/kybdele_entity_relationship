/**
 */
package entityrelationship.impl;

import entityrelationship.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityrelationshipFactoryImpl extends EFactoryImpl implements EntityrelationshipFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityrelationshipFactory init() {
		try {
			EntityrelationshipFactory theEntityrelationshipFactory = (EntityrelationshipFactory)EPackage.Registry.INSTANCE.getEFactory(EntityrelationshipPackage.eNS_URI);
			if (theEntityrelationshipFactory != null) {
				return theEntityrelationshipFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EntityrelationshipFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityrelationshipFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL: return createEntity_Relationship_Model();
			case EntityrelationshipPackage.ELEMENTS_WITH_ATTRIBUTES: return createElements_with_Attributes();
			case EntityrelationshipPackage.ENTITY: return createEntity();
			case EntityrelationshipPackage.RELATIONSHIP: return createRelationship();
			case EntityrelationshipPackage.ATTRIBUTE: return createAttribute();
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE: return createAttribute_Composite();
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION: return createRelationships_Restriction();
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION: return createConnection_E_R_Restriction();
			case EntityrelationshipPackage.GENERALIZATION: return createGeneralization();
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE: return createConnection_With_Attribute();
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY: return createConnection_Generalization_Entity();
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP: return createConnection_Entity2Relationship();
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY: return createConnection_Relationship2Entity();
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE: return createConnection_ConnectionEntityRelationship2Attribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EntityrelationshipPackage.TYPE_ENTITY:
				return createTypeEntityFromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_ATTRIBUTE:
				return createTypeAttributeFromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_IDENTIFIER:
				return createTypeIdentifierFromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_RELATIONSHIP:
				return createTypeRelationshipFromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION:
				return createTypeRestrictionFromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION2:
				return createTypeRestriction2FromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION_INHERITANCE1:
				return createTypeRestrictionInheritance1FromString(eDataType, initialValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION_INHERITANCE2:
				return createTypeRestrictionInheritance2FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EntityrelationshipPackage.TYPE_ENTITY:
				return convertTypeEntityToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_ATTRIBUTE:
				return convertTypeAttributeToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_IDENTIFIER:
				return convertTypeIdentifierToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_RELATIONSHIP:
				return convertTypeRelationshipToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION:
				return convertTypeRestrictionToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION2:
				return convertTypeRestriction2ToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION_INHERITANCE1:
				return convertTypeRestrictionInheritance1ToString(eDataType, instanceValue);
			case EntityrelationshipPackage.TYPE_RESTRICTION_INHERITANCE2:
				return convertTypeRestrictionInheritance2ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model createEntity_Relationship_Model() {
		Entity_Relationship_ModelImpl entity_Relationship_Model = new Entity_Relationship_ModelImpl();
		return entity_Relationship_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements_with_Attributes createElements_with_Attributes() {
		Elements_with_AttributesImpl elements_with_Attributes = new Elements_with_AttributesImpl();
		return elements_with_Attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_Composite createAttribute_Composite() {
		Attribute_CompositeImpl attribute_Composite = new Attribute_CompositeImpl();
		return attribute_Composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationships_Restriction createRelationships_Restriction() {
		Relationships_RestrictionImpl relationships_Restriction = new Relationships_RestrictionImpl();
		return relationships_Restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_E_R_Restriction createConnection_E_R_Restriction() {
		Connection_E_R_RestrictionImpl connection_E_R_Restriction = new Connection_E_R_RestrictionImpl();
		return connection_E_R_Restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_With_Attribute createConnection_With_Attribute() {
		Connection_With_AttributeImpl connection_With_Attribute = new Connection_With_AttributeImpl();
		return connection_With_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_Generalization_Entity createConnection_Generalization_Entity() {
		Connection_Generalization_EntityImpl connection_Generalization_Entity = new Connection_Generalization_EntityImpl();
		return connection_Generalization_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_Entity2Relationship createConnection_Entity2Relationship() {
		Connection_Entity2RelationshipImpl connection_Entity2Relationship = new Connection_Entity2RelationshipImpl();
		return connection_Entity2Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_Relationship2Entity createConnection_Relationship2Entity() {
		Connection_Relationship2EntityImpl connection_Relationship2Entity = new Connection_Relationship2EntityImpl();
		return connection_Relationship2Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_ConnectionEntityRelationship2Attribute createConnection_ConnectionEntityRelationship2Attribute() {
		Connection_ConnectionEntityRelationship2AttributeImpl connection_ConnectionEntityRelationship2Attribute = new Connection_ConnectionEntityRelationship2AttributeImpl();
		return connection_ConnectionEntityRelationship2Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEntity createTypeEntityFromString(EDataType eDataType, String initialValue) {
		TypeEntity result = TypeEntity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeEntityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttribute createTypeAttributeFromString(EDataType eDataType, String initialValue) {
		TypeAttribute result = TypeAttribute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeIdentifier createTypeIdentifierFromString(EDataType eDataType, String initialValue) {
		TypeIdentifier result = TypeIdentifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeIdentifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelationship createTypeRelationshipFromString(EDataType eDataType, String initialValue) {
		TypeRelationship result = TypeRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestriction createTypeRestrictionFromString(EDataType eDataType, String initialValue) {
		TypeRestriction result = TypeRestriction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestriction2 createTypeRestriction2FromString(EDataType eDataType, String initialValue) {
		TypeRestriction2 result = TypeRestriction2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestriction2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestrictionInheritance1 createTypeRestrictionInheritance1FromString(EDataType eDataType, String initialValue) {
		TypeRestrictionInheritance1 result = TypeRestrictionInheritance1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionInheritance1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestrictionInheritance2 createTypeRestrictionInheritance2FromString(EDataType eDataType, String initialValue) {
		TypeRestrictionInheritance2 result = TypeRestrictionInheritance2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionInheritance2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityrelationshipPackage getEntityrelationshipPackage() {
		return (EntityrelationshipPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EntityrelationshipPackage getPackage() {
		return EntityrelationshipPackage.eINSTANCE;
	}

} //EntityrelationshipFactoryImpl
