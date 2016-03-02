/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Elements_with_Attributes;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipFactory;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.TypeAttribute;
import entityrelationship.TypeEntity;
import entityrelationship.TypeIdentifier;
import entityrelationship.TypeRelationship;
import entityrelationship.TypeRestriction;
import entityrelationship.TypeRestriction2;
import entityrelationship.TypeRestrictionInheritance1;
import entityrelationship.TypeRestrictionInheritance2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityrelationshipPackageImpl extends EPackageImpl implements EntityrelationshipPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entity_Relationship_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elements_with_AttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_CompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationships_RestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_E_R_RestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_With_AttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_Generalization_EntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_EntityRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_Entity2RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_Relationship2EntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_ConnectionEntityRelationship2AttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEntityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeIdentifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRelationshipEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRestrictionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRestriction2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRestrictionInheritance1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRestrictionInheritance2EEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see entityrelationship.EntityrelationshipPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntityrelationshipPackageImpl() {
		super(eNS_URI, EntityrelationshipFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EntityrelationshipPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntityrelationshipPackage init() {
		if (isInited) return (EntityrelationshipPackage)EPackage.Registry.INSTANCE.getEPackage(EntityrelationshipPackage.eNS_URI);

		// Obtain or create and register package
		EntityrelationshipPackageImpl theEntityrelationshipPackage = (EntityrelationshipPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EntityrelationshipPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EntityrelationshipPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEntityrelationshipPackage.createPackageContents();

		// Initialize created meta-data
		theEntityrelationshipPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntityrelationshipPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntityrelationshipPackage.eNS_URI, theEntityrelationshipPackage);
		return theEntityrelationshipPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity_Relationship_Model() {
		return entity_Relationship_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Relationship_Model_Name() {
		return (EAttribute)entity_Relationship_ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_E() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_Rt() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_ConnectionEntity2Relationship() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_ConnectionRelationship2Entity() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_HasConnectionEntityRelationship2Attribute() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_Gen() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_Rt2() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_CEA() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_At() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationship_Model_ERM_Has_G() {
		return (EReference)entity_Relationship_ModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElements_with_Attributes() {
		return elements_with_AttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElements_with_Attributes_Connected_with_attribute() {
		return (EReference)elements_with_AttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElements_with_Attributes_InEntityRelationshipModel() {
		return (EReference)elements_with_AttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name_entity() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Type_entity() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Entity_connected_to_entity2relationship() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Entity_connected_to_relationship2entity() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Subclass_generalizations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Name_relationship() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Order() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Cardinality() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Type_relationship() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source_restrictions() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target_restrictions() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Relationship_connected_to_entity2relationship() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Relationship_connected_to_relationship2entity() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name_attribute() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Identifier() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attributes_composites() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attributes_identification() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Connected() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_InAttribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_InEntityRelationshipModel() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attribute_connected_to_conection_entityrelationship_to_attribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_Composite() {
		return attribute_CompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Composite_Name_at_composite() {
		return (EAttribute)attribute_CompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Composite_Identifier_at_composite() {
		return (EAttribute)attribute_CompositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Composite_Attributes() {
		return (EReference)attribute_CompositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Composite_InAttribute() {
		return (EReference)attribute_CompositeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationships_Restriction() {
		return relationships_RestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationships_Restriction_Type_restriction() {
		return (EAttribute)relationships_RestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationships_Restriction_Source_relationship() {
		return (EReference)relationships_RestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationships_Restriction_Target_relationship() {
		return (EReference)relationships_RestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationships_Restriction_InEntityRelationshipModel() {
		return (EReference)relationships_RestrictionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_E_R_Restriction() {
		return connection_E_R_RestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_E_R_Restriction_Connection_source_entity_relationship() {
		return (EReference)connection_E_R_RestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_E_R_Restriction_Type_restriction() {
		return (EAttribute)connection_E_R_RestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_E_R_Restriction_Connection_target_entity_relationship() {
		return (EReference)connection_E_R_RestrictionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_E_R_Restriction_InEntityRelationshipModel() {
		return (EReference)connection_E_R_RestrictionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_Restriction_inheritance_1() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_Restriction_inheritance_2() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Subclasses() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Superclass() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_InEntityRelationshipModel() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_With_Attribute() {
		return connection_With_AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_With_Attribute_Type_attribute() {
		return (EAttribute)connection_With_AttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_With_Attribute_Connection_attribute() {
		return (EReference)connection_With_AttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_With_Attribute_Element() {
		return (EReference)connection_With_AttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_With_Attribute_InEntityRelationshipModel() {
		return (EReference)connection_With_AttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_Generalization_Entity() {
		return connection_Generalization_EntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Generalization_Entity_Minimum_cardinality() {
		return (EAttribute)connection_Generalization_EntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Generalization_Entity_Maximum_cardinality() {
		return (EAttribute)connection_Generalization_EntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Generalization_Entity_Connection_Generalization() {
		return (EReference)connection_Generalization_EntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Generalization_Entity_Connection_Entity() {
		return (EReference)connection_Generalization_EntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Generalization_Entity_InEntityRelationshipModel() {
		return (EReference)connection_Generalization_EntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_EntityRelationship() {
		return connection_EntityRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_EntityRelationship_Role() {
		return (EAttribute)connection_EntityRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_EntityRelationship_Minimum_cardinality() {
		return (EAttribute)connection_EntityRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_EntityRelationship_Maximum_cardinality() {
		return (EAttribute)connection_EntityRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_Entity2Relationship() {
		return connection_Entity2RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Entity2Relationship_Source_entity() {
		return (EReference)connection_Entity2RelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Entity2Relationship_Target_relationship() {
		return (EReference)connection_Entity2RelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Entity2Relationship_InEntityRelationshipModel() {
		return (EReference)connection_Entity2RelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_Relationship2Entity() {
		return connection_Relationship2EntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Relationship2Entity_Source_relationship() {
		return (EReference)connection_Relationship2EntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Relationship2Entity_Target_entity() {
		return (EReference)connection_Relationship2EntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Relationship2Entity_InEntityRelationshipModel() {
		return (EReference)connection_Relationship2EntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection_ConnectionEntityRelationship2Attribute() {
		return connection_ConnectionEntityRelationship2AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionEntityRelationship2Attribute_Source_connection() {
		return (EReference)connection_ConnectionEntityRelationship2AttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionEntityRelationship2Attribute_Target_attribute() {
		return (EReference)connection_ConnectionEntityRelationship2AttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ConnectionEntityRelationship2Attribute_InEntityRelationshipModel() {
		return (EReference)connection_ConnectionEntityRelationship2AttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeEntity() {
		return typeEntityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAttribute() {
		return typeAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeIdentifier() {
		return typeIdentifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRelationship() {
		return typeRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestriction() {
		return typeRestrictionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestriction2() {
		return typeRestriction2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestrictionInheritance1() {
		return typeRestrictionInheritance1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestrictionInheritance2() {
		return typeRestrictionInheritance2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityrelationshipFactory getEntityrelationshipFactory() {
		return (EntityrelationshipFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		entity_Relationship_ModelEClass = createEClass(ENTITY_RELATIONSHIP_MODEL);
		createEAttribute(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__NAME);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT);
		createEReference(entity_Relationship_ModelEClass, ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G);

		elements_with_AttributesEClass = createEClass(ELEMENTS_WITH_ATTRIBUTES);
		createEReference(elements_with_AttributesEClass, ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE);
		createEReference(elements_with_AttributesEClass, ELEMENTS_WITH_ATTRIBUTES__IN_ENTITY_RELATIONSHIP_MODEL);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME_ENTITY);
		createEAttribute(entityEClass, ENTITY__TYPE_ENTITY);
		createEReference(entityEClass, ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP);
		createEReference(entityEClass, ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY);
		createEReference(entityEClass, ENTITY__SUBCLASS_GENERALIZATIONS);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__NAME_RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__ORDER);
		createEAttribute(relationshipEClass, RELATIONSHIP__CARDINALITY);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE_RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE_RESTRICTIONS);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET_RESTRICTIONS);
		createEReference(relationshipEClass, RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME_ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IDENTIFIER);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTES_COMPOSITES);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTES_IDENTIFICATION);
		createEReference(attributeEClass, ATTRIBUTE__CONNECTED);
		createEReference(attributeEClass, ATTRIBUTE__IN_ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE);

		attribute_CompositeEClass = createEClass(ATTRIBUTE_COMPOSITE);
		createEAttribute(attribute_CompositeEClass, ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE);
		createEAttribute(attribute_CompositeEClass, ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE);
		createEReference(attribute_CompositeEClass, ATTRIBUTE_COMPOSITE__ATTRIBUTES);
		createEReference(attribute_CompositeEClass, ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE);

		relationships_RestrictionEClass = createEClass(RELATIONSHIPS_RESTRICTION);
		createEAttribute(relationships_RestrictionEClass, RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION);
		createEReference(relationships_RestrictionEClass, RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP);
		createEReference(relationships_RestrictionEClass, RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP);
		createEReference(relationships_RestrictionEClass, RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL);

		connection_E_R_RestrictionEClass = createEClass(CONNECTION_ERRESTRICTION);
		createEReference(connection_E_R_RestrictionEClass, CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP);
		createEAttribute(connection_E_R_RestrictionEClass, CONNECTION_ERRESTRICTION__TYPE_RESTRICTION);
		createEReference(connection_E_R_RestrictionEClass, CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP);
		createEReference(connection_E_R_RestrictionEClass, CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL);

		generalizationEClass = createEClass(GENERALIZATION);
		createEAttribute(generalizationEClass, GENERALIZATION__RESTRICTION_INHERITANCE_1);
		createEAttribute(generalizationEClass, GENERALIZATION__RESTRICTION_INHERITANCE_2);
		createEReference(generalizationEClass, GENERALIZATION__SUBCLASSES);
		createEReference(generalizationEClass, GENERALIZATION__SUPERCLASS);
		createEReference(generalizationEClass, GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL);

		connection_With_AttributeEClass = createEClass(CONNECTION_WITH_ATTRIBUTE);
		createEAttribute(connection_With_AttributeEClass, CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE);
		createEReference(connection_With_AttributeEClass, CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE);
		createEReference(connection_With_AttributeEClass, CONNECTION_WITH_ATTRIBUTE__ELEMENT);
		createEReference(connection_With_AttributeEClass, CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL);

		connection_Generalization_EntityEClass = createEClass(CONNECTION_GENERALIZATION_ENTITY);
		createEAttribute(connection_Generalization_EntityEClass, CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY);
		createEAttribute(connection_Generalization_EntityEClass, CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY);
		createEReference(connection_Generalization_EntityEClass, CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION);
		createEReference(connection_Generalization_EntityEClass, CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY);
		createEReference(connection_Generalization_EntityEClass, CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL);

		connection_EntityRelationshipEClass = createEClass(CONNECTION_ENTITY_RELATIONSHIP);
		createEAttribute(connection_EntityRelationshipEClass, CONNECTION_ENTITY_RELATIONSHIP__ROLE);
		createEAttribute(connection_EntityRelationshipEClass, CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY);
		createEAttribute(connection_EntityRelationshipEClass, CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY);

		connection_Entity2RelationshipEClass = createEClass(CONNECTION_ENTITY2_RELATIONSHIP);
		createEReference(connection_Entity2RelationshipEClass, CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY);
		createEReference(connection_Entity2RelationshipEClass, CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP);
		createEReference(connection_Entity2RelationshipEClass, CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL);

		connection_Relationship2EntityEClass = createEClass(CONNECTION_RELATIONSHIP2_ENTITY);
		createEReference(connection_Relationship2EntityEClass, CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP);
		createEReference(connection_Relationship2EntityEClass, CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY);
		createEReference(connection_Relationship2EntityEClass, CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL);

		connection_ConnectionEntityRelationship2AttributeEClass = createEClass(CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE);
		createEReference(connection_ConnectionEntityRelationship2AttributeEClass, CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION);
		createEReference(connection_ConnectionEntityRelationship2AttributeEClass, CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE);
		createEReference(connection_ConnectionEntityRelationship2AttributeEClass, CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL);

		// Create enums
		typeEntityEEnum = createEEnum(TYPE_ENTITY);
		typeAttributeEEnum = createEEnum(TYPE_ATTRIBUTE);
		typeIdentifierEEnum = createEEnum(TYPE_IDENTIFIER);
		typeRelationshipEEnum = createEEnum(TYPE_RELATIONSHIP);
		typeRestrictionEEnum = createEEnum(TYPE_RESTRICTION);
		typeRestriction2EEnum = createEEnum(TYPE_RESTRICTION2);
		typeRestrictionInheritance1EEnum = createEEnum(TYPE_RESTRICTION_INHERITANCE1);
		typeRestrictionInheritance2EEnum = createEEnum(TYPE_RESTRICTION_INHERITANCE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getElements_with_Attributes());
		relationshipEClass.getESuperTypes().add(this.getElements_with_Attributes());
		connection_Entity2RelationshipEClass.getESuperTypes().add(this.getConnection_EntityRelationship());
		connection_Relationship2EntityEClass.getESuperTypes().add(this.getConnection_EntityRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(entity_Relationship_ModelEClass, Entity_Relationship_Model.class, "Entity_Relationship_Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Relationship_Model_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_E(), this.getElements_with_Attributes(), this.getElements_with_Attributes_InEntityRelationshipModel(), "ERM_Has_E", null, 1, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_Rt(), this.getRelationships_Restriction(), this.getRelationships_Restriction_InEntityRelationshipModel(), "ERM_Has_Rt", null, 0, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_ConnectionEntity2Relationship(), this.getConnection_Entity2Relationship(), this.getConnection_Entity2Relationship_InEntityRelationshipModel(), "ERM_Has_ConnectionEntity2Relationship", null, 0, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_ConnectionRelationship2Entity(), this.getConnection_Relationship2Entity(), this.getConnection_Relationship2Entity_InEntityRelationshipModel(), "ERM_Has_ConnectionRelationship2Entity", null, 0, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_HasConnectionEntityRelationship2Attribute(), this.getConnection_ConnectionEntityRelationship2Attribute(), this.getConnection_ConnectionEntityRelationship2Attribute_InEntityRelationshipModel(), "ERM_HasConnectionEntityRelationship2Attribute", null, 0, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_Gen(), this.getConnection_Generalization_Entity(), this.getConnection_Generalization_Entity_InEntityRelationshipModel(), "ERM_Has_Gen", null, 2, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_Rt2(), this.getConnection_E_R_Restriction(), this.getConnection_E_R_Restriction_InEntityRelationshipModel(), "ERM_Has_Rt2", null, 0, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_CEA(), this.getConnection_With_Attribute(), this.getConnection_With_Attribute_InEntityRelationshipModel(), "ERM_Has_CEA", null, 1, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_At(), this.getAttribute(), null, "ERM_Has_At", null, 1, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationship_Model_ERM_Has_G(), this.getGeneralization(), this.getGeneralization_InEntityRelationshipModel(), "ERM_Has_G", null, 0, -1, Entity_Relationship_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elements_with_AttributesEClass, Elements_with_Attributes.class, "Elements_with_Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElements_with_Attributes_Connected_with_attribute(), this.getConnection_With_Attribute(), this.getConnection_With_Attribute_Element(), "connected_with_attribute", null, 0, -1, Elements_with_Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElements_with_Attributes_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_E(), "inEntityRelationshipModel", null, 0, 1, Elements_with_Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name_entity(), ecorePackage.getEString(), "name_entity", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Type_entity(), this.getTypeEntity(), "type_entity", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Entity_connected_to_entity2relationship(), this.getConnection_Entity2Relationship(), this.getConnection_Entity2Relationship_Source_entity(), "entity_connected_to_entity2relationship", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Entity_connected_to_relationship2entity(), this.getConnection_Relationship2Entity(), this.getConnection_Relationship2Entity_Target_entity(), "entity_connected_to_relationship2entity", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Subclass_generalizations(), this.getGeneralization(), this.getGeneralization_Subclasses(), "subclass_generalizations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Name_relationship(), ecorePackage.getEString(), "name_relationship", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Type_relationship(), this.getTypeRelationship(), "type_relationship", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source_restrictions(), this.getRelationships_Restriction(), null, "source_restrictions", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target_restrictions(), this.getRelationships_Restriction(), this.getRelationships_Restriction_Target_relationship(), "target_restrictions", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Relationship_connected_to_entity2relationship(), this.getConnection_Entity2Relationship(), this.getConnection_Entity2Relationship_Target_relationship(), "relationship_connected_to_entity2relationship", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Relationship_connected_to_relationship2entity(), this.getConnection_Relationship2Entity(), this.getConnection_Relationship2Entity_Source_relationship(), "relationship_connected_to_relationship2entity", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name_attribute(), ecorePackage.getEString(), "name_attribute", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Identifier(), this.getTypeIdentifier(), "identifier", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attributes_composites(), this.getAttribute_Composite(), this.getAttribute_Composite_InAttribute(), "attributes_composites", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attributes_identification(), this.getAttribute(), this.getAttribute_InAttribute(), "attributes_identification", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Connected(), this.getConnection_With_Attribute(), this.getConnection_With_Attribute_Connection_attribute(), "connected", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_InAttribute(), this.getAttribute(), this.getAttribute_Attributes_identification(), "inAttribute", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), null, "inEntityRelationshipModel", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attribute_connected_to_conection_entityrelationship_to_attribute(), this.getConnection_ConnectionEntityRelationship2Attribute(), this.getConnection_ConnectionEntityRelationship2Attribute_Target_attribute(), "attribute_connected_to_conection_entityrelationship_to_attribute", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attribute_CompositeEClass, Attribute_Composite.class, "Attribute_Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Composite_Name_at_composite(), ecorePackage.getEString(), "name_at_composite", null, 0, 1, Attribute_Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Composite_Identifier_at_composite(), this.getTypeIdentifier(), "identifier_at_composite", null, 0, 1, Attribute_Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Composite_Attributes(), this.getAttribute(), null, "attributes", null, 1, 1, Attribute_Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Composite_InAttribute(), this.getAttribute(), this.getAttribute_Attributes_composites(), "inAttribute", null, 0, 1, Attribute_Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationships_RestrictionEClass, Relationships_Restriction.class, "Relationships_Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationships_Restriction_Type_restriction(), this.getTypeRestriction(), "type_restriction", null, 0, 1, Relationships_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationships_Restriction_Source_relationship(), this.getRelationship(), null, "source_relationship", null, 1, 1, Relationships_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationships_Restriction_Target_relationship(), this.getRelationship(), this.getRelationship_Target_restrictions(), "target_relationship", null, 1, 1, Relationships_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationships_Restriction_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_Rt(), "inEntityRelationshipModel", null, 0, 1, Relationships_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_E_R_RestrictionEClass, Connection_E_R_Restriction.class, "Connection_E_R_Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_E_R_Restriction_Connection_source_entity_relationship(), this.getConnection_EntityRelationship(), null, "connection_source_entity_relationship", null, 1, 1, Connection_E_R_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_E_R_Restriction_Type_restriction(), this.getTypeRestriction2(), "type_restriction", null, 0, 1, Connection_E_R_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_E_R_Restriction_Connection_target_entity_relationship(), this.getConnection_EntityRelationship(), null, "connection_target_entity_relationship", null, 1, 1, Connection_E_R_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_E_R_Restriction_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_Rt2(), "inEntityRelationshipModel", null, 0, 1, Connection_E_R_Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralization_Restriction_inheritance_1(), this.getTypeRestrictionInheritance1(), "restriction_inheritance_1", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralization_Restriction_inheritance_2(), this.getTypeRestrictionInheritance2(), "restriction_inheritance_2", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Subclasses(), this.getEntity(), this.getEntity_Subclass_generalizations(), "subclasses", null, 2, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Superclass(), this.getEntity(), null, "superclass", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_G(), "inEntityRelationshipModel", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_With_AttributeEClass, Connection_With_Attribute.class, "Connection_With_Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_With_Attribute_Type_attribute(), this.getTypeAttribute(), "type_attribute", null, 0, 1, Connection_With_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_With_Attribute_Connection_attribute(), this.getAttribute(), this.getAttribute_Connected(), "connection_attribute", null, 1, 1, Connection_With_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_With_Attribute_Element(), this.getElements_with_Attributes(), this.getElements_with_Attributes_Connected_with_attribute(), "element", null, 1, 1, Connection_With_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_With_Attribute_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_CEA(), "inEntityRelationshipModel", null, 0, 1, Connection_With_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_Generalization_EntityEClass, Connection_Generalization_Entity.class, "Connection_Generalization_Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Generalization_Entity_Minimum_cardinality(), ecorePackage.getEString(), "minimum_cardinality", "1", 0, 1, Connection_Generalization_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Generalization_Entity_Maximum_cardinality(), ecorePackage.getEString(), "maximum_cardinality", "1", 0, 1, Connection_Generalization_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Generalization_Entity_Connection_Generalization(), this.getGeneralization(), null, "Connection_Generalization", null, 1, 1, Connection_Generalization_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Generalization_Entity_Connection_Entity(), this.getEntity(), null, "Connection_Entity", null, 1, 1, Connection_Generalization_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Generalization_Entity_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_Gen(), "inEntityRelationshipModel", null, 0, 1, Connection_Generalization_Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_EntityRelationshipEClass, Connection_EntityRelationship.class, "Connection_EntityRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_EntityRelationship_Role(), ecorePackage.getEString(), "role", null, 0, 1, Connection_EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_EntityRelationship_Minimum_cardinality(), ecorePackage.getEString(), "minimum_cardinality", "1", 0, 1, Connection_EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_EntityRelationship_Maximum_cardinality(), ecorePackage.getEString(), "maximum_cardinality", "1", 0, 1, Connection_EntityRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_Entity2RelationshipEClass, Connection_Entity2Relationship.class, "Connection_Entity2Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Entity2Relationship_Source_entity(), this.getEntity(), this.getEntity_Entity_connected_to_entity2relationship(), "source_entity", null, 0, 1, Connection_Entity2Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Entity2Relationship_Target_relationship(), this.getRelationship(), this.getRelationship_Relationship_connected_to_entity2relationship(), "target_relationship", null, 0, 1, Connection_Entity2Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Entity2Relationship_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_ConnectionEntity2Relationship(), "inEntityRelationshipModel", null, 0, 1, Connection_Entity2Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_Relationship2EntityEClass, Connection_Relationship2Entity.class, "Connection_Relationship2Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Relationship2Entity_Source_relationship(), this.getRelationship(), this.getRelationship_Relationship_connected_to_relationship2entity(), "source_relationship", null, 0, 1, Connection_Relationship2Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Relationship2Entity_Target_entity(), this.getEntity(), this.getEntity_Entity_connected_to_relationship2entity(), "target_entity", null, 0, 1, Connection_Relationship2Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Relationship2Entity_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_Has_ConnectionRelationship2Entity(), "inEntityRelationshipModel", null, 0, 1, Connection_Relationship2Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_ConnectionEntityRelationship2AttributeEClass, Connection_ConnectionEntityRelationship2Attribute.class, "Connection_ConnectionEntityRelationship2Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_ConnectionEntityRelationship2Attribute_Source_connection(), this.getConnection_EntityRelationship(), null, "source_connection", null, 1, 1, Connection_ConnectionEntityRelationship2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ConnectionEntityRelationship2Attribute_Target_attribute(), this.getAttribute(), this.getAttribute_Attribute_connected_to_conection_entityrelationship_to_attribute(), "target_attribute", null, 1, 1, Connection_ConnectionEntityRelationship2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ConnectionEntityRelationship2Attribute_InEntityRelationshipModel(), this.getEntity_Relationship_Model(), this.getEntity_Relationship_Model_ERM_HasConnectionEntityRelationship2Attribute(), "inEntityRelationshipModel", null, 0, 1, Connection_ConnectionEntityRelationship2Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEntityEEnum, TypeEntity.class, "TypeEntity");
		addEEnumLiteral(typeEntityEEnum, TypeEntity.WEAK);
		addEEnumLiteral(typeEntityEEnum, TypeEntity.REGULAR);

		initEEnum(typeAttributeEEnum, TypeAttribute.class, "TypeAttribute");
		addEEnumLiteral(typeAttributeEEnum, TypeAttribute.NORMAL);
		addEEnumLiteral(typeAttributeEEnum, TypeAttribute.COMPOSITE);
		addEEnumLiteral(typeAttributeEEnum, TypeAttribute.MULTIVALUED);
		addEEnumLiteral(typeAttributeEEnum, TypeAttribute.OPTIONAL);
		addEEnumLiteral(typeAttributeEEnum, TypeAttribute.DERIVED);
		addEEnumLiteral(typeAttributeEEnum, TypeAttribute.DEPENDENCE_IN_IDENTIFICATION);

		initEEnum(typeIdentifierEEnum, TypeIdentifier.class, "TypeIdentifier");
		addEEnumLiteral(typeIdentifierEEnum, TypeIdentifier.NO_IDENTIFIER);
		addEEnumLiteral(typeIdentifierEEnum, TypeIdentifier.PRIMARY_IDENTIFIER);
		addEEnumLiteral(typeIdentifierEEnum, TypeIdentifier.ALTERNATIVE_IDENTIFIER);

		initEEnum(typeRelationshipEEnum, TypeRelationship.class, "TypeRelationship");
		addEEnumLiteral(typeRelationshipEEnum, TypeRelationship.REGULAR);
		addEEnumLiteral(typeRelationshipEEnum, TypeRelationship.WEAK_DEPENDENCE_IN_EXISTENCE);
		addEEnumLiteral(typeRelationshipEEnum, TypeRelationship.WEAK_DEPENDENCE_IN_IDENTIFICATION);

		initEEnum(typeRestrictionEEnum, TypeRestriction.class, "TypeRestriction");
		addEEnumLiteral(typeRestrictionEEnum, TypeRestriction.EXCLUSION);
		addEEnumLiteral(typeRestrictionEEnum, TypeRestriction.INCLUSION);

		initEEnum(typeRestriction2EEnum, TypeRestriction2.class, "TypeRestriction2");
		addEEnumLiteral(typeRestriction2EEnum, TypeRestriction2.EXCLUSIVENESS);
		addEEnumLiteral(typeRestriction2EEnum, TypeRestriction2.INCLUSIVENESS);

		initEEnum(typeRestrictionInheritance1EEnum, TypeRestrictionInheritance1.class, "TypeRestrictionInheritance1");
		addEEnumLiteral(typeRestrictionInheritance1EEnum, TypeRestrictionInheritance1.TOTAL);
		addEEnumLiteral(typeRestrictionInheritance1EEnum, TypeRestrictionInheritance1.PARTIAL);

		initEEnum(typeRestrictionInheritance2EEnum, TypeRestrictionInheritance2.class, "TypeRestrictionInheritance2");
		addEEnumLiteral(typeRestrictionInheritance2EEnum, TypeRestrictionInheritance2.EXCLUSIVE);
		addEEnumLiteral(typeRestrictionInheritance2EEnum, TypeRestrictionInheritance2.OVERLAPPED);

		// Create resource
		createResource(eNS_URI);
	}

} //EntityrelationshipPackageImpl
