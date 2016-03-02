/**
 */
package entityrelationship;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipFactory
 * @model kind="package"
 * @generated
 */
public interface EntityrelationshipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entityrelationship";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://entityrelationship/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entityrelationship";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityrelationshipPackage eINSTANCE = entityrelationship.impl.EntityrelationshipPackageImpl.init();

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Entity_Relationship_ModelImpl <em>Entity Relationship Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Entity_Relationship_ModelImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getEntity_Relationship_Model()
	 * @generated
	 */
	int ENTITY_RELATIONSHIP_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>ERM Has E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E = 1;

	/**
	 * The feature id for the '<em><b>ERM Has Rt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT = 2;

	/**
	 * The feature id for the '<em><b>ERM Has Connection Entity2 Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>ERM Has Connection Relationship2 Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>ERM Has Connection Entity Relationship2 Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>ERM Has Gen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN = 6;

	/**
	 * The feature id for the '<em><b>ERM Has Rt2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2 = 7;

	/**
	 * The feature id for the '<em><b>ERM Has CEA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA = 8;

	/**
	 * The feature id for the '<em><b>ERM Has At</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT = 9;

	/**
	 * The feature id for the '<em><b>ERM Has G</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G = 10;

	/**
	 * The number of structural features of the '<em>Entity Relationship Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Entity Relationship Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Elements_with_AttributesImpl <em>Elements with Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Elements_with_AttributesImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getElements_with_Attributes()
	 * @generated
	 */
	int ELEMENTS_WITH_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Connected with attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_WITH_ATTRIBUTES__IN_ENTITY_RELATIONSHIP_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Elements with Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elements with Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_WITH_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.EntityImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Connected with attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONNECTED_WITH_ATTRIBUTE = ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IN_ENTITY_RELATIONSHIP_MODEL = ELEMENTS_WITH_ATTRIBUTES__IN_ENTITY_RELATIONSHIP_MODEL;

	/**
	 * The feature id for the '<em><b>Name entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME_ENTITY = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE_ENTITY = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity connected to entity2relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity connected to relationship2entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subclass generalizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUBCLASS_GENERALIZATIONS = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ELEMENTS_WITH_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.RelationshipImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Connected with attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CONNECTED_WITH_ATTRIBUTE = ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL = ELEMENTS_WITH_ATTRIBUTES__IN_ENTITY_RELATIONSHIP_MODEL;

	/**
	 * The feature id for the '<em><b>Name relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME_RELATIONSHIP = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ORDER = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CARDINALITY = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE_RELATIONSHIP = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source restrictions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE_RESTRICTIONS = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target restrictions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET_RESTRICTIONS = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relationship connected to entity2relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship connected to relationship2entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENTS_WITH_ATTRIBUTES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENTS_WITH_ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.AttributeImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Attributes composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTES_COMPOSITES = 2;

	/**
	 * The feature id for the '<em><b>Attributes identification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTES_IDENTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONNECTED = 4;

	/**
	 * The feature id for the '<em><b>In Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IN_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Attribute connected to conection entityrelationship to attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Attribute_CompositeImpl <em>Attribute Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Attribute_CompositeImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getAttribute_Composite()
	 * @generated
	 */
	int ATTRIBUTE_COMPOSITE = 5;

	/**
	 * The feature id for the '<em><b>Name at composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE = 0;

	/**
	 * The feature id for the '<em><b>Identifier at composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPOSITE__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>In Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Attribute Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPOSITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Relationships_RestrictionImpl <em>Relationships Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Relationships_RestrictionImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getRelationships_Restriction()
	 * @generated
	 */
	int RELATIONSHIPS_RESTRICTION = 6;

	/**
	 * The feature id for the '<em><b>Type restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION = 0;

	/**
	 * The feature id for the '<em><b>Source relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Target relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Relationships Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_RESTRICTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relationships Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_E_R_RestrictionImpl <em>Connection ERRestriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_E_R_RestrictionImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_E_R_Restriction()
	 * @generated
	 */
	int CONNECTION_ERRESTRICTION = 7;

	/**
	 * The feature id for the '<em><b>Connection source entity relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Type restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ERRESTRICTION__TYPE_RESTRICTION = 1;

	/**
	 * The feature id for the '<em><b>Connection target entity relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Connection ERRestriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ERRESTRICTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection ERRestriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ERRESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.GeneralizationImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 8;

	/**
	 * The feature id for the '<em><b>Restriction inheritance 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RESTRICTION_INHERITANCE_1 = 0;

	/**
	 * The feature id for the '<em><b>Restriction inheritance 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RESTRICTION_INHERITANCE_2 = 1;

	/**
	 * The feature id for the '<em><b>Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SUBCLASSES = 2;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SUPERCLASS = 3;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_With_AttributeImpl <em>Connection With Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_With_AttributeImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_With_Attribute()
	 * @generated
	 */
	int CONNECTION_WITH_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Type attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Connection attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_WITH_ATTRIBUTE__ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Connection With Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_WITH_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection With Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_WITH_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_Generalization_EntityImpl <em>Connection Generalization Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_Generalization_EntityImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_Generalization_Entity()
	 * @generated
	 */
	int CONNECTION_GENERALIZATION_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Minimum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Maximum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Connection Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Connection Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL = 4;

	/**
	 * The number of structural features of the '<em>Connection Generalization Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connection Generalization Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_GENERALIZATION_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_EntityRelationshipImpl <em>Connection Entity Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_EntityRelationshipImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_EntityRelationship()
	 * @generated
	 */
	int CONNECTION_ENTITY_RELATIONSHIP = 11;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY_RELATIONSHIP__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Minimum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Maximum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY = 2;

	/**
	 * The number of structural features of the '<em>Connection Entity Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection Entity Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_Entity2RelationshipImpl <em>Connection Entity2 Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_Entity2RelationshipImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_Entity2Relationship()
	 * @generated
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP__ROLE = CONNECTION_ENTITY_RELATIONSHIP__ROLE;

	/**
	 * The feature id for the '<em><b>Minimum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP__MINIMUM_CARDINALITY = CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Maximum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP__MAXIMUM_CARDINALITY = CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Source entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Entity2 Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP_FEATURE_COUNT = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Entity2 Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_ENTITY2_RELATIONSHIP_OPERATION_COUNT = CONNECTION_ENTITY_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_Relationship2EntityImpl <em>Connection Relationship2 Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_Relationship2EntityImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_Relationship2Entity()
	 * @generated
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY = 13;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY__ROLE = CONNECTION_ENTITY_RELATIONSHIP__ROLE;

	/**
	 * The feature id for the '<em><b>Minimum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY__MINIMUM_CARDINALITY = CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Maximum cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY__MAXIMUM_CARDINALITY = CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Source relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Relationship2 Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY_FEATURE_COUNT = CONNECTION_ENTITY_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Relationship2 Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RELATIONSHIP2_ENTITY_OPERATION_COUNT = CONNECTION_ENTITY_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl <em>Connection Connection Entity Relationship2 Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_ConnectionEntityRelationship2Attribute()
	 * @generated
	 */
	int CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Source connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Target attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>In Entity Relationship Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Connection Connection Entity Relationship2 Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection Connection Entity Relationship2 Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeEntity <em>Type Entity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeEntity
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeEntity()
	 * @generated
	 */
	int TYPE_ENTITY = 15;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeAttribute <em>Type Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeAttribute
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeAttribute()
	 * @generated
	 */
	int TYPE_ATTRIBUTE = 16;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeIdentifier <em>Type Identifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeIdentifier
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeIdentifier()
	 * @generated
	 */
	int TYPE_IDENTIFIER = 17;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeRelationship <em>Type Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeRelationship
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRelationship()
	 * @generated
	 */
	int TYPE_RELATIONSHIP = 18;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeRestriction <em>Type Restriction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeRestriction
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestriction()
	 * @generated
	 */
	int TYPE_RESTRICTION = 19;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeRestriction2 <em>Type Restriction2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeRestriction2
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestriction2()
	 * @generated
	 */
	int TYPE_RESTRICTION2 = 20;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeRestrictionInheritance1 <em>Type Restriction Inheritance1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeRestrictionInheritance1
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestrictionInheritance1()
	 * @generated
	 */
	int TYPE_RESTRICTION_INHERITANCE1 = 21;

	/**
	 * The meta object id for the '{@link entityrelationship.TypeRestrictionInheritance2 <em>Type Restriction Inheritance2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see entityrelationship.TypeRestrictionInheritance2
	 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestrictionInheritance2()
	 * @generated
	 */
	int TYPE_RESTRICTION_INHERITANCE2 = 22;


	/**
	 * Returns the meta object for class '{@link entityrelationship.Entity_Relationship_Model <em>Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Relationship Model</em>'.
	 * @see entityrelationship.Entity_Relationship_Model
	 * @generated
	 */
	EClass getEntity_Relationship_Model();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Entity_Relationship_Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getName()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EAttribute getEntity_Relationship_Model_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_E <em>ERM Has E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has E</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_E()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_E();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Rt <em>ERM Has Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has Rt</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_Rt()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_Rt();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionEntity2Relationship <em>ERM Has Connection Entity2 Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has Connection Entity2 Relationship</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionEntity2Relationship()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_ConnectionEntity2Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionRelationship2Entity <em>ERM Has Connection Relationship2 Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has Connection Relationship2 Entity</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_ConnectionRelationship2Entity()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_ConnectionRelationship2Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_HasConnectionEntityRelationship2Attribute <em>ERM Has Connection Entity Relationship2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has Connection Entity Relationship2 Attribute</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_HasConnectionEntityRelationship2Attribute()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_HasConnectionEntityRelationship2Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Gen <em>ERM Has Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has Gen</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_Gen()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_Gen();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_Rt2 <em>ERM Has Rt2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has Rt2</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_Rt2()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_Rt2();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_CEA <em>ERM Has CEA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has CEA</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_CEA()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_CEA();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_At <em>ERM Has At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has At</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_At()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_At();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Entity_Relationship_Model#getERM_Has_G <em>ERM Has G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ERM Has G</em>'.
	 * @see entityrelationship.Entity_Relationship_Model#getERM_Has_G()
	 * @see #getEntity_Relationship_Model()
	 * @generated
	 */
	EReference getEntity_Relationship_Model_ERM_Has_G();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Elements_with_Attributes <em>Elements with Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements with Attributes</em>'.
	 * @see entityrelationship.Elements_with_Attributes
	 * @generated
	 */
	EClass getElements_with_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Elements_with_Attributes#getConnected_with_attribute <em>Connected with attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected with attribute</em>'.
	 * @see entityrelationship.Elements_with_Attributes#getConnected_with_attribute()
	 * @see #getElements_with_Attributes()
	 * @generated
	 */
	EReference getElements_with_Attributes_Connected_with_attribute();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Elements_with_Attributes#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Elements_with_Attributes#getInEntityRelationshipModel()
	 * @see #getElements_with_Attributes()
	 * @generated
	 */
	EReference getElements_with_Attributes_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see entityrelationship.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Entity#getName_entity <em>Name entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name entity</em>'.
	 * @see entityrelationship.Entity#getName_entity()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name_entity();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Entity#getType_entity <em>Type entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type entity</em>'.
	 * @see entityrelationship.Entity#getType_entity()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Type_entity();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Entity#getEntity_connected_to_entity2relationship <em>Entity connected to entity2relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity connected to entity2relationship</em>'.
	 * @see entityrelationship.Entity#getEntity_connected_to_entity2relationship()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity_connected_to_entity2relationship();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Entity#getEntity_connected_to_relationship2entity <em>Entity connected to relationship2entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity connected to relationship2entity</em>'.
	 * @see entityrelationship.Entity#getEntity_connected_to_relationship2entity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity_connected_to_relationship2entity();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Entity#getSubclass_generalizations <em>Subclass generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subclass generalizations</em>'.
	 * @see entityrelationship.Entity#getSubclass_generalizations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Subclass_generalizations();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see entityrelationship.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relationship#getName_relationship <em>Name relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name relationship</em>'.
	 * @see entityrelationship.Relationship#getName_relationship()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name_relationship();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relationship#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see entityrelationship.Relationship#getOrder()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Order();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relationship#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see entityrelationship.Relationship#getCardinality()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relationship#getType_relationship <em>Type relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type relationship</em>'.
	 * @see entityrelationship.Relationship#getType_relationship()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type_relationship();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Relationship#getSource_restrictions <em>Source restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source restrictions</em>'.
	 * @see entityrelationship.Relationship#getSource_restrictions()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source_restrictions();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Relationship#getTarget_restrictions <em>Target restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target restrictions</em>'.
	 * @see entityrelationship.Relationship#getTarget_restrictions()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target_restrictions();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Relationship#getRelationship_connected_to_entity2relationship <em>Relationship connected to entity2relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship connected to entity2relationship</em>'.
	 * @see entityrelationship.Relationship#getRelationship_connected_to_entity2relationship()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Relationship_connected_to_entity2relationship();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Relationship#getRelationship_connected_to_relationship2entity <em>Relationship connected to relationship2entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship connected to relationship2entity</em>'.
	 * @see entityrelationship.Relationship#getRelationship_connected_to_relationship2entity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Relationship_connected_to_relationship2entity();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see entityrelationship.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute#getName_attribute <em>Name attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name attribute</em>'.
	 * @see entityrelationship.Attribute#getName_attribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name_attribute();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see entityrelationship.Attribute#getIdentifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link entityrelationship.Attribute#getAttributes_composites <em>Attributes composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes composites</em>'.
	 * @see entityrelationship.Attribute#getAttributes_composites()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributes_composites();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Attribute#getAttributes_identification <em>Attributes identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes identification</em>'.
	 * @see entityrelationship.Attribute#getAttributes_identification()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributes_identification();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Attribute#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected</em>'.
	 * @see entityrelationship.Attribute#getConnected()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Connected();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Attribute#getInAttribute <em>In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Attribute</em>'.
	 * @see entityrelationship.Attribute#getInAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InAttribute();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Attribute#getInEntityRelationshipModel()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InEntityRelationshipModel();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Attribute#getAttribute_connected_to_conection_entityrelationship_to_attribute <em>Attribute connected to conection entityrelationship to attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute connected to conection entityrelationship to attribute</em>'.
	 * @see entityrelationship.Attribute#getAttribute_connected_to_conection_entityrelationship_to_attribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attribute_connected_to_conection_entityrelationship_to_attribute();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Attribute_Composite <em>Attribute Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Composite</em>'.
	 * @see entityrelationship.Attribute_Composite
	 * @generated
	 */
	EClass getAttribute_Composite();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute_Composite#getName_at_composite <em>Name at composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name at composite</em>'.
	 * @see entityrelationship.Attribute_Composite#getName_at_composite()
	 * @see #getAttribute_Composite()
	 * @generated
	 */
	EAttribute getAttribute_Composite_Name_at_composite();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Attribute_Composite#getIdentifier_at_composite <em>Identifier at composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier at composite</em>'.
	 * @see entityrelationship.Attribute_Composite#getIdentifier_at_composite()
	 * @see #getAttribute_Composite()
	 * @generated
	 */
	EAttribute getAttribute_Composite_Identifier_at_composite();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Attribute_Composite#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see entityrelationship.Attribute_Composite#getAttributes()
	 * @see #getAttribute_Composite()
	 * @generated
	 */
	EReference getAttribute_Composite_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Attribute_Composite#getInAttribute <em>In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Attribute</em>'.
	 * @see entityrelationship.Attribute_Composite#getInAttribute()
	 * @see #getAttribute_Composite()
	 * @generated
	 */
	EReference getAttribute_Composite_InAttribute();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Relationships_Restriction <em>Relationships Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships Restriction</em>'.
	 * @see entityrelationship.Relationships_Restriction
	 * @generated
	 */
	EClass getRelationships_Restriction();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Relationships_Restriction#getType_restriction <em>Type restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type restriction</em>'.
	 * @see entityrelationship.Relationships_Restriction#getType_restriction()
	 * @see #getRelationships_Restriction()
	 * @generated
	 */
	EAttribute getRelationships_Restriction_Type_restriction();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Relationships_Restriction#getSource_relationship <em>Source relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source relationship</em>'.
	 * @see entityrelationship.Relationships_Restriction#getSource_relationship()
	 * @see #getRelationships_Restriction()
	 * @generated
	 */
	EReference getRelationships_Restriction_Source_relationship();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Relationships_Restriction#getTarget_relationship <em>Target relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target relationship</em>'.
	 * @see entityrelationship.Relationships_Restriction#getTarget_relationship()
	 * @see #getRelationships_Restriction()
	 * @generated
	 */
	EReference getRelationships_Restriction_Target_relationship();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Relationships_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Relationships_Restriction#getInEntityRelationshipModel()
	 * @see #getRelationships_Restriction()
	 * @generated
	 */
	EReference getRelationships_Restriction_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_E_R_Restriction <em>Connection ERRestriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection ERRestriction</em>'.
	 * @see entityrelationship.Connection_E_R_Restriction
	 * @generated
	 */
	EClass getConnection_E_R_Restriction();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_E_R_Restriction#getConnection_source_entity_relationship <em>Connection source entity relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection source entity relationship</em>'.
	 * @see entityrelationship.Connection_E_R_Restriction#getConnection_source_entity_relationship()
	 * @see #getConnection_E_R_Restriction()
	 * @generated
	 */
	EReference getConnection_E_R_Restriction_Connection_source_entity_relationship();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_E_R_Restriction#getType_restriction <em>Type restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type restriction</em>'.
	 * @see entityrelationship.Connection_E_R_Restriction#getType_restriction()
	 * @see #getConnection_E_R_Restriction()
	 * @generated
	 */
	EAttribute getConnection_E_R_Restriction_Type_restriction();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_E_R_Restriction#getConnection_target_entity_relationship <em>Connection target entity relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection target entity relationship</em>'.
	 * @see entityrelationship.Connection_E_R_Restriction#getConnection_target_entity_relationship()
	 * @see #getConnection_E_R_Restriction()
	 * @generated
	 */
	EReference getConnection_E_R_Restriction_Connection_target_entity_relationship();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Connection_E_R_Restriction#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Connection_E_R_Restriction#getInEntityRelationshipModel()
	 * @see #getConnection_E_R_Restriction()
	 * @generated
	 */
	EReference getConnection_E_R_Restriction_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see entityrelationship.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Generalization#getRestriction_inheritance_1 <em>Restriction inheritance 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction inheritance 1</em>'.
	 * @see entityrelationship.Generalization#getRestriction_inheritance_1()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Restriction_inheritance_1();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Generalization#getRestriction_inheritance_2 <em>Restriction inheritance 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction inheritance 2</em>'.
	 * @see entityrelationship.Generalization#getRestriction_inheritance_2()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Restriction_inheritance_2();

	/**
	 * Returns the meta object for the reference list '{@link entityrelationship.Generalization#getSubclasses <em>Subclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subclasses</em>'.
	 * @see entityrelationship.Generalization#getSubclasses()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Subclasses();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Generalization#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see entityrelationship.Generalization#getSuperclass()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Superclass();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Generalization#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Generalization#getInEntityRelationshipModel()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_With_Attribute <em>Connection With Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection With Attribute</em>'.
	 * @see entityrelationship.Connection_With_Attribute
	 * @generated
	 */
	EClass getConnection_With_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_With_Attribute#getType_attribute <em>Type attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type attribute</em>'.
	 * @see entityrelationship.Connection_With_Attribute#getType_attribute()
	 * @see #getConnection_With_Attribute()
	 * @generated
	 */
	EAttribute getConnection_With_Attribute_Type_attribute();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_With_Attribute#getConnection_attribute <em>Connection attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection attribute</em>'.
	 * @see entityrelationship.Connection_With_Attribute#getConnection_attribute()
	 * @see #getConnection_With_Attribute()
	 * @generated
	 */
	EReference getConnection_With_Attribute_Connection_attribute();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_With_Attribute#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see entityrelationship.Connection_With_Attribute#getElement()
	 * @see #getConnection_With_Attribute()
	 * @generated
	 */
	EReference getConnection_With_Attribute_Element();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Connection_With_Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Connection_With_Attribute#getInEntityRelationshipModel()
	 * @see #getConnection_With_Attribute()
	 * @generated
	 */
	EReference getConnection_With_Attribute_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_Generalization_Entity <em>Connection Generalization Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Generalization Entity</em>'.
	 * @see entityrelationship.Connection_Generalization_Entity
	 * @generated
	 */
	EClass getConnection_Generalization_Entity();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_Generalization_Entity#getMinimum_cardinality <em>Minimum cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum cardinality</em>'.
	 * @see entityrelationship.Connection_Generalization_Entity#getMinimum_cardinality()
	 * @see #getConnection_Generalization_Entity()
	 * @generated
	 */
	EAttribute getConnection_Generalization_Entity_Minimum_cardinality();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_Generalization_Entity#getMaximum_cardinality <em>Maximum cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum cardinality</em>'.
	 * @see entityrelationship.Connection_Generalization_Entity#getMaximum_cardinality()
	 * @see #getConnection_Generalization_Entity()
	 * @generated
	 */
	EAttribute getConnection_Generalization_Entity_Maximum_cardinality();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_Generalization_Entity#getConnection_Generalization <em>Connection Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Generalization</em>'.
	 * @see entityrelationship.Connection_Generalization_Entity#getConnection_Generalization()
	 * @see #getConnection_Generalization_Entity()
	 * @generated
	 */
	EReference getConnection_Generalization_Entity_Connection_Generalization();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_Generalization_Entity#getConnection_Entity <em>Connection Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Entity</em>'.
	 * @see entityrelationship.Connection_Generalization_Entity#getConnection_Entity()
	 * @see #getConnection_Generalization_Entity()
	 * @generated
	 */
	EReference getConnection_Generalization_Entity_Connection_Entity();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Connection_Generalization_Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Connection_Generalization_Entity#getInEntityRelationshipModel()
	 * @see #getConnection_Generalization_Entity()
	 * @generated
	 */
	EReference getConnection_Generalization_Entity_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_EntityRelationship <em>Connection Entity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Entity Relationship</em>'.
	 * @see entityrelationship.Connection_EntityRelationship
	 * @generated
	 */
	EClass getConnection_EntityRelationship();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_EntityRelationship#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see entityrelationship.Connection_EntityRelationship#getRole()
	 * @see #getConnection_EntityRelationship()
	 * @generated
	 */
	EAttribute getConnection_EntityRelationship_Role();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_EntityRelationship#getMinimum_cardinality <em>Minimum cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum cardinality</em>'.
	 * @see entityrelationship.Connection_EntityRelationship#getMinimum_cardinality()
	 * @see #getConnection_EntityRelationship()
	 * @generated
	 */
	EAttribute getConnection_EntityRelationship_Minimum_cardinality();

	/**
	 * Returns the meta object for the attribute '{@link entityrelationship.Connection_EntityRelationship#getMaximum_cardinality <em>Maximum cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum cardinality</em>'.
	 * @see entityrelationship.Connection_EntityRelationship#getMaximum_cardinality()
	 * @see #getConnection_EntityRelationship()
	 * @generated
	 */
	EAttribute getConnection_EntityRelationship_Maximum_cardinality();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_Entity2Relationship <em>Connection Entity2 Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Entity2 Relationship</em>'.
	 * @see entityrelationship.Connection_Entity2Relationship
	 * @generated
	 */
	EClass getConnection_Entity2Relationship();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_Entity2Relationship#getSource_entity <em>Source entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source entity</em>'.
	 * @see entityrelationship.Connection_Entity2Relationship#getSource_entity()
	 * @see #getConnection_Entity2Relationship()
	 * @generated
	 */
	EReference getConnection_Entity2Relationship_Source_entity();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_Entity2Relationship#getTarget_relationship <em>Target relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target relationship</em>'.
	 * @see entityrelationship.Connection_Entity2Relationship#getTarget_relationship()
	 * @see #getConnection_Entity2Relationship()
	 * @generated
	 */
	EReference getConnection_Entity2Relationship_Target_relationship();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Connection_Entity2Relationship#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Connection_Entity2Relationship#getInEntityRelationshipModel()
	 * @see #getConnection_Entity2Relationship()
	 * @generated
	 */
	EReference getConnection_Entity2Relationship_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_Relationship2Entity <em>Connection Relationship2 Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Relationship2 Entity</em>'.
	 * @see entityrelationship.Connection_Relationship2Entity
	 * @generated
	 */
	EClass getConnection_Relationship2Entity();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_Relationship2Entity#getSource_relationship <em>Source relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source relationship</em>'.
	 * @see entityrelationship.Connection_Relationship2Entity#getSource_relationship()
	 * @see #getConnection_Relationship2Entity()
	 * @generated
	 */
	EReference getConnection_Relationship2Entity_Source_relationship();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_Relationship2Entity#getTarget_entity <em>Target entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target entity</em>'.
	 * @see entityrelationship.Connection_Relationship2Entity#getTarget_entity()
	 * @see #getConnection_Relationship2Entity()
	 * @generated
	 */
	EReference getConnection_Relationship2Entity_Target_entity();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Connection_Relationship2Entity#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Connection_Relationship2Entity#getInEntityRelationshipModel()
	 * @see #getConnection_Relationship2Entity()
	 * @generated
	 */
	EReference getConnection_Relationship2Entity_InEntityRelationshipModel();

	/**
	 * Returns the meta object for class '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute <em>Connection Connection Entity Relationship2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Connection Entity Relationship2 Attribute</em>'.
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute
	 * @generated
	 */
	EClass getConnection_ConnectionEntityRelationship2Attribute();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getSource_connection <em>Source connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source connection</em>'.
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getSource_connection()
	 * @see #getConnection_ConnectionEntityRelationship2Attribute()
	 * @generated
	 */
	EReference getConnection_ConnectionEntityRelationship2Attribute_Source_connection();

	/**
	 * Returns the meta object for the reference '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getTarget_attribute <em>Target attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target attribute</em>'.
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getTarget_attribute()
	 * @see #getConnection_ConnectionEntityRelationship2Attribute()
	 * @generated
	 */
	EReference getConnection_ConnectionEntityRelationship2Attribute_Target_attribute();

	/**
	 * Returns the meta object for the container reference '{@link entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Entity Relationship Model</em>'.
	 * @see entityrelationship.Connection_ConnectionEntityRelationship2Attribute#getInEntityRelationshipModel()
	 * @see #getConnection_ConnectionEntityRelationship2Attribute()
	 * @generated
	 */
	EReference getConnection_ConnectionEntityRelationship2Attribute_InEntityRelationshipModel();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeEntity <em>Type Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Entity</em>'.
	 * @see entityrelationship.TypeEntity
	 * @generated
	 */
	EEnum getTypeEntity();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeAttribute <em>Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Attribute</em>'.
	 * @see entityrelationship.TypeAttribute
	 * @generated
	 */
	EEnum getTypeAttribute();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeIdentifier <em>Type Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Identifier</em>'.
	 * @see entityrelationship.TypeIdentifier
	 * @generated
	 */
	EEnum getTypeIdentifier();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeRelationship <em>Type Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Relationship</em>'.
	 * @see entityrelationship.TypeRelationship
	 * @generated
	 */
	EEnum getTypeRelationship();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeRestriction <em>Type Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Restriction</em>'.
	 * @see entityrelationship.TypeRestriction
	 * @generated
	 */
	EEnum getTypeRestriction();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeRestriction2 <em>Type Restriction2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Restriction2</em>'.
	 * @see entityrelationship.TypeRestriction2
	 * @generated
	 */
	EEnum getTypeRestriction2();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeRestrictionInheritance1 <em>Type Restriction Inheritance1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Restriction Inheritance1</em>'.
	 * @see entityrelationship.TypeRestrictionInheritance1
	 * @generated
	 */
	EEnum getTypeRestrictionInheritance1();

	/**
	 * Returns the meta object for enum '{@link entityrelationship.TypeRestrictionInheritance2 <em>Type Restriction Inheritance2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Restriction Inheritance2</em>'.
	 * @see entityrelationship.TypeRestrictionInheritance2
	 * @generated
	 */
	EEnum getTypeRestrictionInheritance2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityrelationshipFactory getEntityrelationshipFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Entity_Relationship_ModelImpl <em>Entity Relationship Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Entity_Relationship_ModelImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getEntity_Relationship_Model()
		 * @generated
		 */
		EClass ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getEntity_Relationship_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATIONSHIP_MODEL__NAME = eINSTANCE.getEntity_Relationship_Model_Name();

		/**
		 * The meta object literal for the '<em><b>ERM Has E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E = eINSTANCE.getEntity_Relationship_Model_ERM_Has_E();

		/**
		 * The meta object literal for the '<em><b>ERM Has Rt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT = eINSTANCE.getEntity_Relationship_Model_ERM_Has_Rt();

		/**
		 * The meta object literal for the '<em><b>ERM Has Connection Entity2 Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP = eINSTANCE.getEntity_Relationship_Model_ERM_Has_ConnectionEntity2Relationship();

		/**
		 * The meta object literal for the '<em><b>ERM Has Connection Relationship2 Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY = eINSTANCE.getEntity_Relationship_Model_ERM_Has_ConnectionRelationship2Entity();

		/**
		 * The meta object literal for the '<em><b>ERM Has Connection Entity Relationship2 Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE = eINSTANCE.getEntity_Relationship_Model_ERM_HasConnectionEntityRelationship2Attribute();

		/**
		 * The meta object literal for the '<em><b>ERM Has Gen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN = eINSTANCE.getEntity_Relationship_Model_ERM_Has_Gen();

		/**
		 * The meta object literal for the '<em><b>ERM Has Rt2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2 = eINSTANCE.getEntity_Relationship_Model_ERM_Has_Rt2();

		/**
		 * The meta object literal for the '<em><b>ERM Has CEA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA = eINSTANCE.getEntity_Relationship_Model_ERM_Has_CEA();

		/**
		 * The meta object literal for the '<em><b>ERM Has At</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT = eINSTANCE.getEntity_Relationship_Model_ERM_Has_At();

		/**
		 * The meta object literal for the '<em><b>ERM Has G</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G = eINSTANCE.getEntity_Relationship_Model_ERM_Has_G();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Elements_with_AttributesImpl <em>Elements with Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Elements_with_AttributesImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getElements_with_Attributes()
		 * @generated
		 */
		EClass ELEMENTS_WITH_ATTRIBUTES = eINSTANCE.getElements_with_Attributes();

		/**
		 * The meta object literal for the '<em><b>Connected with attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE = eINSTANCE.getElements_with_Attributes_Connected_with_attribute();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS_WITH_ATTRIBUTES__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getElements_with_Attributes_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.EntityImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME_ENTITY = eINSTANCE.getEntity_Name_entity();

		/**
		 * The meta object literal for the '<em><b>Type entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TYPE_ENTITY = eINSTANCE.getEntity_Type_entity();

		/**
		 * The meta object literal for the '<em><b>Entity connected to entity2relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP = eINSTANCE.getEntity_Entity_connected_to_entity2relationship();

		/**
		 * The meta object literal for the '<em><b>Entity connected to relationship2entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY = eINSTANCE.getEntity_Entity_connected_to_relationship2entity();

		/**
		 * The meta object literal for the '<em><b>Subclass generalizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUBCLASS_GENERALIZATIONS = eINSTANCE.getEntity_Subclass_generalizations();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.RelationshipImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Name relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME_RELATIONSHIP = eINSTANCE.getRelationship_Name_relationship();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__ORDER = eINSTANCE.getRelationship_Order();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__CARDINALITY = eINSTANCE.getRelationship_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Type relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE_RELATIONSHIP = eINSTANCE.getRelationship_Type_relationship();

		/**
		 * The meta object literal for the '<em><b>Source restrictions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE_RESTRICTIONS = eINSTANCE.getRelationship_Source_restrictions();

		/**
		 * The meta object literal for the '<em><b>Target restrictions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET_RESTRICTIONS = eINSTANCE.getRelationship_Target_restrictions();

		/**
		 * The meta object literal for the '<em><b>Relationship connected to entity2relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP = eINSTANCE.getRelationship_Relationship_connected_to_entity2relationship();

		/**
		 * The meta object literal for the '<em><b>Relationship connected to relationship2entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY = eINSTANCE.getRelationship_Relationship_connected_to_relationship2entity();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.AttributeImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME_ATTRIBUTE = eINSTANCE.getAttribute_Name_attribute();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IDENTIFIER = eINSTANCE.getAttribute_Identifier();

		/**
		 * The meta object literal for the '<em><b>Attributes composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTES_COMPOSITES = eINSTANCE.getAttribute_Attributes_composites();

		/**
		 * The meta object literal for the '<em><b>Attributes identification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTES_IDENTIFICATION = eINSTANCE.getAttribute_Attributes_identification();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONNECTED = eINSTANCE.getAttribute_Connected();

		/**
		 * The meta object literal for the '<em><b>In Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IN_ATTRIBUTE = eINSTANCE.getAttribute_InAttribute();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getAttribute_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '<em><b>Attribute connected to conection entityrelationship to attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE = eINSTANCE.getAttribute_Attribute_connected_to_conection_entityrelationship_to_attribute();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Attribute_CompositeImpl <em>Attribute Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Attribute_CompositeImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getAttribute_Composite()
		 * @generated
		 */
		EClass ATTRIBUTE_COMPOSITE = eINSTANCE.getAttribute_Composite();

		/**
		 * The meta object literal for the '<em><b>Name at composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE = eINSTANCE.getAttribute_Composite_Name_at_composite();

		/**
		 * The meta object literal for the '<em><b>Identifier at composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE = eINSTANCE.getAttribute_Composite_Identifier_at_composite();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_COMPOSITE__ATTRIBUTES = eINSTANCE.getAttribute_Composite_Attributes();

		/**
		 * The meta object literal for the '<em><b>In Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE = eINSTANCE.getAttribute_Composite_InAttribute();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Relationships_RestrictionImpl <em>Relationships Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Relationships_RestrictionImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getRelationships_Restriction()
		 * @generated
		 */
		EClass RELATIONSHIPS_RESTRICTION = eINSTANCE.getRelationships_Restriction();

		/**
		 * The meta object literal for the '<em><b>Type restriction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION = eINSTANCE.getRelationships_Restriction_Type_restriction();

		/**
		 * The meta object literal for the '<em><b>Source relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP = eINSTANCE.getRelationships_Restriction_Source_relationship();

		/**
		 * The meta object literal for the '<em><b>Target relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP = eINSTANCE.getRelationships_Restriction_Target_relationship();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getRelationships_Restriction_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_E_R_RestrictionImpl <em>Connection ERRestriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_E_R_RestrictionImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_E_R_Restriction()
		 * @generated
		 */
		EClass CONNECTION_ERRESTRICTION = eINSTANCE.getConnection_E_R_Restriction();

		/**
		 * The meta object literal for the '<em><b>Connection source entity relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP = eINSTANCE.getConnection_E_R_Restriction_Connection_source_entity_relationship();

		/**
		 * The meta object literal for the '<em><b>Type restriction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_ERRESTRICTION__TYPE_RESTRICTION = eINSTANCE.getConnection_E_R_Restriction_Type_restriction();

		/**
		 * The meta object literal for the '<em><b>Connection target entity relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP = eINSTANCE.getConnection_E_R_Restriction_Connection_target_entity_relationship();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getConnection_E_R_Restriction_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.GeneralizationImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Restriction inheritance 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__RESTRICTION_INHERITANCE_1 = eINSTANCE.getGeneralization_Restriction_inheritance_1();

		/**
		 * The meta object literal for the '<em><b>Restriction inheritance 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__RESTRICTION_INHERITANCE_2 = eINSTANCE.getGeneralization_Restriction_inheritance_2();

		/**
		 * The meta object literal for the '<em><b>Subclasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SUBCLASSES = eINSTANCE.getGeneralization_Subclasses();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SUPERCLASS = eINSTANCE.getGeneralization_Superclass();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getGeneralization_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_With_AttributeImpl <em>Connection With Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_With_AttributeImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_With_Attribute()
		 * @generated
		 */
		EClass CONNECTION_WITH_ATTRIBUTE = eINSTANCE.getConnection_With_Attribute();

		/**
		 * The meta object literal for the '<em><b>Type attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE = eINSTANCE.getConnection_With_Attribute_Type_attribute();

		/**
		 * The meta object literal for the '<em><b>Connection attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE = eINSTANCE.getConnection_With_Attribute_Connection_attribute();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_WITH_ATTRIBUTE__ELEMENT = eINSTANCE.getConnection_With_Attribute_Element();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getConnection_With_Attribute_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_Generalization_EntityImpl <em>Connection Generalization Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_Generalization_EntityImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_Generalization_Entity()
		 * @generated
		 */
		EClass CONNECTION_GENERALIZATION_ENTITY = eINSTANCE.getConnection_Generalization_Entity();

		/**
		 * The meta object literal for the '<em><b>Minimum cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY = eINSTANCE.getConnection_Generalization_Entity_Minimum_cardinality();

		/**
		 * The meta object literal for the '<em><b>Maximum cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY = eINSTANCE.getConnection_Generalization_Entity_Maximum_cardinality();

		/**
		 * The meta object literal for the '<em><b>Connection Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION = eINSTANCE.getConnection_Generalization_Entity_Connection_Generalization();

		/**
		 * The meta object literal for the '<em><b>Connection Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY = eINSTANCE.getConnection_Generalization_Entity_Connection_Entity();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getConnection_Generalization_Entity_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_EntityRelationshipImpl <em>Connection Entity Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_EntityRelationshipImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_EntityRelationship()
		 * @generated
		 */
		EClass CONNECTION_ENTITY_RELATIONSHIP = eINSTANCE.getConnection_EntityRelationship();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_ENTITY_RELATIONSHIP__ROLE = eINSTANCE.getConnection_EntityRelationship_Role();

		/**
		 * The meta object literal for the '<em><b>Minimum cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY = eINSTANCE.getConnection_EntityRelationship_Minimum_cardinality();

		/**
		 * The meta object literal for the '<em><b>Maximum cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY = eINSTANCE.getConnection_EntityRelationship_Maximum_cardinality();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_Entity2RelationshipImpl <em>Connection Entity2 Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_Entity2RelationshipImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_Entity2Relationship()
		 * @generated
		 */
		EClass CONNECTION_ENTITY2_RELATIONSHIP = eINSTANCE.getConnection_Entity2Relationship();

		/**
		 * The meta object literal for the '<em><b>Source entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY = eINSTANCE.getConnection_Entity2Relationship_Source_entity();

		/**
		 * The meta object literal for the '<em><b>Target relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP = eINSTANCE.getConnection_Entity2Relationship_Target_relationship();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getConnection_Entity2Relationship_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_Relationship2EntityImpl <em>Connection Relationship2 Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_Relationship2EntityImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_Relationship2Entity()
		 * @generated
		 */
		EClass CONNECTION_RELATIONSHIP2_ENTITY = eINSTANCE.getConnection_Relationship2Entity();

		/**
		 * The meta object literal for the '<em><b>Source relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP = eINSTANCE.getConnection_Relationship2Entity_Source_relationship();

		/**
		 * The meta object literal for the '<em><b>Target entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY = eINSTANCE.getConnection_Relationship2Entity_Target_entity();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getConnection_Relationship2Entity_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl <em>Connection Connection Entity Relationship2 Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getConnection_ConnectionEntityRelationship2Attribute()
		 * @generated
		 */
		EClass CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE = eINSTANCE.getConnection_ConnectionEntityRelationship2Attribute();

		/**
		 * The meta object literal for the '<em><b>Source connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION = eINSTANCE.getConnection_ConnectionEntityRelationship2Attribute_Source_connection();

		/**
		 * The meta object literal for the '<em><b>Target attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE = eINSTANCE.getConnection_ConnectionEntityRelationship2Attribute_Target_attribute();

		/**
		 * The meta object literal for the '<em><b>In Entity Relationship Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL = eINSTANCE.getConnection_ConnectionEntityRelationship2Attribute_InEntityRelationshipModel();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeEntity <em>Type Entity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeEntity
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeEntity()
		 * @generated
		 */
		EEnum TYPE_ENTITY = eINSTANCE.getTypeEntity();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeAttribute <em>Type Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeAttribute
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeAttribute()
		 * @generated
		 */
		EEnum TYPE_ATTRIBUTE = eINSTANCE.getTypeAttribute();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeIdentifier <em>Type Identifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeIdentifier
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeIdentifier()
		 * @generated
		 */
		EEnum TYPE_IDENTIFIER = eINSTANCE.getTypeIdentifier();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeRelationship <em>Type Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeRelationship
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRelationship()
		 * @generated
		 */
		EEnum TYPE_RELATIONSHIP = eINSTANCE.getTypeRelationship();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeRestriction <em>Type Restriction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeRestriction
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestriction()
		 * @generated
		 */
		EEnum TYPE_RESTRICTION = eINSTANCE.getTypeRestriction();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeRestriction2 <em>Type Restriction2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeRestriction2
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestriction2()
		 * @generated
		 */
		EEnum TYPE_RESTRICTION2 = eINSTANCE.getTypeRestriction2();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeRestrictionInheritance1 <em>Type Restriction Inheritance1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeRestrictionInheritance1
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestrictionInheritance1()
		 * @generated
		 */
		EEnum TYPE_RESTRICTION_INHERITANCE1 = eINSTANCE.getTypeRestrictionInheritance1();

		/**
		 * The meta object literal for the '{@link entityrelationship.TypeRestrictionInheritance2 <em>Type Restriction Inheritance2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see entityrelationship.TypeRestrictionInheritance2
		 * @see entityrelationship.impl.EntityrelationshipPackageImpl#getTypeRestrictionInheritance2()
		 * @generated
		 */
		EEnum TYPE_RESTRICTION_INHERITANCE2 = eINSTANCE.getTypeRestrictionInheritance2();

	}

} //EntityrelationshipPackage
