package entityrelationship.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

import entityrelationship.diagram.part.EntityRelationshipDiagramEditorPlugin;

/**
 * @generated
 */
public class EntityRelationshipOCLFactory {

	/**
	 * @generated
	 */
	private final EntityRelationshipAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected EntityRelationshipOCLFactory() {
		this.expressions = new EntityRelationshipAbstractExpression[86];
		this.expressionBodies = new String[] {
				"self.type_entity = TypeEntity::Regular", //$NON-NLS-1$
				"TypeEntity::Regular", //$NON-NLS-1$
				"self.type_entity = TypeEntity::Weak", //$NON-NLS-1$
				"TypeEntity::Weak", //$NON-NLS-1$
				"self.type_relationship = TypeRelationship::Regular", //$NON-NLS-1$
				"TypeRelationship::Regular", //$NON-NLS-1$
				"self.type_relationship = TypeRelationship::Weak_dependence_in_existence", //$NON-NLS-1$
				"TypeRelationship::Weak_dependence_in_existence", //$NON-NLS-1$
				"self.type_relationship = TypeRelationship::Weak_dependence_in_identification", //$NON-NLS-1$
				"TypeRelationship::Weak_dependence_in_identification", //$NON-NLS-1$
				"self.identifier = TypeIdentifier::NoIdentifier", //$NON-NLS-1$
				"TypeIdentifier::NoIdentifier", //$NON-NLS-1$
				"self.identifier = TypeIdentifier::AlternativeIdentifier", //$NON-NLS-1$
				"TypeIdentifier::AlternativeIdentifier", //$NON-NLS-1$
				"self.identifier = TypeIdentifier::PrimaryIdentifier", //$NON-NLS-1$
				"TypeIdentifier::PrimaryIdentifier", //$NON-NLS-1$
				"self.identifier_at_composite = TypeIdentifier::NoIdentifier", //$NON-NLS-1$
				"TypeIdentifier::NoIdentifier", //$NON-NLS-1$
				"self.restriction_inheritance_1 = TypeRestrictionInheritance1::Partial and\r\nself.restriction_inheritance_2 = TypeRestrictionInheritance2::Overlapped", //$NON-NLS-1$
				"TypeRestrictionInheritance1::Partial", //$NON-NLS-1$
				"TypeRestrictionInheritance2::Overlapped", //$NON-NLS-1$
				"self.restriction_inheritance_1 = TypeRestrictionInheritance1::Total and\r\nself.restriction_inheritance_2 = TypeRestrictionInheritance2::Overlapped", //$NON-NLS-1$
				"TypeRestrictionInheritance1::Total", //$NON-NLS-1$
				"TypeRestrictionInheritance2::Overlapped", //$NON-NLS-1$
				"self.restriction_inheritance_1 = TypeRestrictionInheritance1::Partial and\r\nself.restriction_inheritance_2 = TypeRestrictionInheritance2::Exclusive", //$NON-NLS-1$
				"TypeRestrictionInheritance1::Partial", //$NON-NLS-1$
				"TypeRestrictionInheritance2::Exclusive", //$NON-NLS-1$
				"self.restriction_inheritance_1 = TypeRestrictionInheritance1::Total and\r\nself.restriction_inheritance_2 = TypeRestrictionInheritance2::Exclusive", //$NON-NLS-1$
				"TypeRestrictionInheritance1::Total", //$NON-NLS-1$
				"TypeRestrictionInheritance2::Exclusive", //$NON-NLS-1$
				"if (\r\n\t\t(\r\n\t\t\t(\r\n\t\t\t\tConnection_Relationship2Entity.allInstances()->select(c:Connection_Relationship2Entity|c.source_relationship = self and c.target_entity = oppositeEnd)->size()\r\n\t\t\t\t+\r\n\t\t\t\tConnection_Entity2Relationship.allInstances()->select(c:Connection_Entity2Relationship|c.source_entity = oppositeEnd and c.target_relationship = self)->size()\r\n\t\t\t)\r\n\t\t\t>\r\n\t\t\t1\r\n\t\t) \r\n\t)\r\n\tthen\r\n\t(\r\n\t\tnot oclIsKindOf(Relationship)\r\n\t)\r\n\telse\r\n\t(\r\n\t\toclIsKindOf(Relationship)\r\n\t)\r\nendif", //$NON-NLS-1$
				"if (\r\n\t\t(\r\n\t\t\t(\r\n\t\t\t\tConnection_Relationship2Entity.allInstances()->select(c:Connection_Relationship2Entity|c.source_relationship = oppositeEnd and c.target_entity = self)->size()\r\n\t\t\t\t+\r\n\t\t\t\tConnection_Entity2Relationship.allInstances()->select(c:Connection_Entity2Relationship|c.source_entity = self and c.target_relationship = oppositeEnd)->size()\r\n\t\t\t)\r\n\t\t\t>\r\n\t\t\t1\r\n\t\t)\r\n\t)\r\n\tthen\r\n\t(\r\n\t\tnot oclIsKindOf(Entity)\r\n\t)\r\n\telse\r\n\t(\r\n\t\toclIsKindOf(Entity)\r\n\t)\r\nendif", //$NON-NLS-1$
				"if (\r\n\t\t(\r\n\t\t\t(\r\n\t\t\t\tConnection_Relationship2Entity.allInstances()->select(c:Connection_Relationship2Entity|c.source_relationship = oppositeEnd and c.target_entity = self)->size()\r\n\t\t\t\t+\r\n\t\t\t\tConnection_Entity2Relationship.allInstances()->select(c:Connection_Entity2Relationship|c.source_entity = self and c.target_relationship = oppositeEnd)->size()\r\n\t\t\t)\r\n\t\t\t>\r\n\t\t\t1\r\n\t\t)\r\n\t)\r\n\tthen\r\n\t(\r\n\t\tnot oclIsKindOf(Entity)\r\n\t)\r\n\telse\r\n\t(\r\n\t\toclIsKindOf(Entity)\r\n\t)\r\nendif", //$NON-NLS-1$
				"if (\r\n\t\t(\r\n\t\t\t(\r\n\t\t\t\tConnection_Relationship2Entity.allInstances()->select(c:Connection_Relationship2Entity|c.source_relationship = self and c.target_entity = oppositeEnd)->size()\r\n\t\t\t\t+\r\n\t\t\t\tConnection_Entity2Relationship.allInstances()->select(c:Connection_Entity2Relationship|c.source_entity = oppositeEnd and c.target_relationship = self)->size()\r\n\t\t\t)\r\n\t\t\t>\r\n\t\t\t1\r\n\t\t)\r\n\t)\r\n\tthen\r\n\t(\r\n\t\tnot oclIsKindOf(Relationship)\r\n\t)\r\n\telse\r\n\t(\r\n\t\toclIsKindOf(Relationship)\r\n\t)\r\nendif", //$NON-NLS-1$
				"self.type_attribute = TypeAttribute::Normal", //$NON-NLS-1$
				"TypeAttribute::Normal", //$NON-NLS-1$
				"if (self.connected->size() < 1) then (oclIsKindOf(Attribute)) else (not oclIsKindOf(Attribute)) endif and if (oppositeEnd.oclIsKindOf(Relationship) or oppositeEnd.oclIsKindOf(Generalization)) then (self.identifier <> TypeIdentifier::PrimaryIdentifier and self.identifier <> TypeIdentifier::AlternativeIdentifier) else (self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier or self.identifier = TypeIdentifier::NoIdentifier) endif", //$NON-NLS-1$
				"self.type_attribute = TypeAttribute::Optional", //$NON-NLS-1$
				"TypeAttribute::Optional", //$NON-NLS-1$
				"if (self.connected->size() < 1) then (oclIsKindOf(Attribute)) else (not oclIsKindOf(Attribute)) endif and if (oppositeEnd.oclIsKindOf(Relationship) or oppositeEnd.oclIsKindOf(Generalization)) then (self.identifier <> TypeIdentifier::PrimaryIdentifier and self.identifier <> TypeIdentifier::AlternativeIdentifier) else (self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier or self.identifier = TypeIdentifier::NoIdentifier) endif and if(self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier) then (not oclIsKindOf(Attribute)) else (oclIsKindOf(Attribute)) endif", //$NON-NLS-1$
				"self.type_attribute = TypeAttribute::Composite", //$NON-NLS-1$
				"TypeAttribute::Composite", //$NON-NLS-1$
				"if (self.connected->size() < 1) then (oclIsKindOf(Attribute)) else (not oclIsKindOf(Attribute)) endif and if (oppositeEnd.oclIsKindOf(Relationship) or oppositeEnd.oclIsKindOf(Generalization)) then (self.identifier <> TypeIdentifier::PrimaryIdentifier and self.identifier <> TypeIdentifier::AlternativeIdentifier) else (self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier or self.identifier = TypeIdentifier::NoIdentifier) endif", //$NON-NLS-1$
				"self.type_attribute = TypeAttribute::Derived", //$NON-NLS-1$
				"TypeAttribute::Derived", //$NON-NLS-1$
				"if (self.connected->size() < 1) then (oclIsKindOf(Attribute)) else (not oclIsKindOf(Attribute)) endif and if (oppositeEnd.oclIsKindOf(Relationship) or oppositeEnd.oclIsKindOf(Generalization)) then (self.identifier <> TypeIdentifier::PrimaryIdentifier and self.identifier <> TypeIdentifier::AlternativeIdentifier) else (self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier or self.identifier = TypeIdentifier::NoIdentifier) endif and if(self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier) then (not oclIsKindOf(Attribute)) else (oclIsKindOf(Attribute)) endif", //$NON-NLS-1$
				"self.type_attribute = TypeAttribute::Multivalued", //$NON-NLS-1$
				"TypeAttribute::Multivalued", //$NON-NLS-1$
				"if (self.connected->size() < 1) then (oclIsKindOf(Attribute)) else (not oclIsKindOf(Attribute)) endif and if (oppositeEnd.oclIsKindOf(Relationship) or oppositeEnd.oclIsKindOf(Generalization)) then (self.identifier <> TypeIdentifier::PrimaryIdentifier and self.identifier <> TypeIdentifier::AlternativeIdentifier) else (self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier or self.identifier = TypeIdentifier::NoIdentifier) endif and if(self.identifier = TypeIdentifier::PrimaryIdentifier or self.identifier = TypeIdentifier::AlternativeIdentifier) then (not oclIsKindOf(Attribute)) else (oclIsKindOf(Attribute)) endif", //$NON-NLS-1$
				"self.type_restriction = TypeRestriction::Inclusion", //$NON-NLS-1$
				"TypeRestriction::Inclusion", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"if\r\n\t(\r\n\t\tRelationships_Restriction.allInstances()->exists(c | \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.source_relationship = oppositeEnd \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.target_relationship = self\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t) \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tor \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.source_relationship = self \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.target_relationship = oppositeEnd\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t)\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t)\r\n\t)\r\n\tthen\r\n\t(\r\n\t\tnot oclIsKindOf(Relationship)\r\n\t)\r\n\telse\r\n\t(\r\n\t\toclIsKindOf(Relationship)\r\n\t)\r\nendif", //$NON-NLS-1$
				"self.type_restriction = TypeRestriction::Exclusion", //$NON-NLS-1$
				"TypeRestriction::Exclusion", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"if\r\n\t(\r\n\t\tRelationships_Restriction.allInstances()->exists(c | \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.source_relationship = oppositeEnd \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.target_relationship = self\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t) \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tor \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.source_relationship = self \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tc.target_relationship = oppositeEnd\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t)\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t)\r\n\t)\r\n\tthen\r\n\t(\r\n\t\tnot oclIsKindOf(Relationship)\r\n\t)\r\n\telse\r\n\t(\r\n\t\toclIsKindOf(Relationship)\r\n\t)\r\nendif", //$NON-NLS-1$
				"if(self.connected.type_attribute = TypeAttribute::Composite)then(oclIsKindOf(Attribute))else(not oclIsKindOf(Attribute))endif", //$NON-NLS-1$
				"if(self.attributes->size() = 0)then(oclIsKindOf(Attribute_Composite))else(not oclIsKindOf(Attribute_Composite))endif", //$NON-NLS-1$
				"self.type_restriction = TypeRestriction2::Inclusiveness", //$NON-NLS-1$
				"TypeRestriction2::Inclusiveness", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"if \r\n(\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t)\r\n\t)\r\n\tor\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t)\r\n\t)\r\n\tor\t\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t)\r\n\t)\r\n\tor\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t)\r\n\t)\r\n)\r\nthen\r\n\t(\r\n\t\toclIsKindOf(Connection_EntityRelationship)\r\n\t)\r\nelse\r\n\t(\r\n\t\tnot oclIsKindOf(Connection_EntityRelationship)\r\n\t)\r\nendif\r\nand\r\nif\r\n(\r\n\tConnection_E_R_Restriction.allInstances()\r\n\t->select\r\n\t\t\t(\r\n\t\t\t\tc:Connection_E_R_Restriction\r\n\t\t\t\t|\r\n\t\t\t\t(\r\n\t\t\t\t\tc.connection_source_entity_relationship = self \r\n\t\t\t\t\tand \r\n\t\t\t\t\tc.connection_target_entity_relationship = oppositeEnd\r\n\t\t\t\t) \r\n\t\t\t\tor \r\n\t\t\t\t(\r\n\t\t\t\t\tc.connection_source_entity_relationship = oppositeEnd \r\n\t\t\t\t\tand \r\n\t\t\t\t\tc.connection_target_entity_relationship = self\r\n\t\t\t\t)\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t)->size() > 0\r\n)\r\nthen\r\n\t( \r\n\t\tnot oclIsKindOf(Connection_EntityRelationship)\r\n\t) \r\nelse \r\n\t(\r\n\t\toclIsKindOf(Connection_EntityRelationship)\r\n\t) \r\nendif", //$NON-NLS-1$
				"self.type_restriction = TypeRestriction2::Exclusiveness", //$NON-NLS-1$
				"TypeRestriction2::Exclusiveness", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"if \r\n(\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t)\r\n\t)\r\n\tor\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t)\r\n\t)\r\n\tor\t\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Entity2Relationship)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Entity2Relationship).source_entity\r\n\t\t)\r\n\t)\r\n\tor\r\n\t(\r\n\t\t(\r\n\t\t\tself.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t\tand\r\n\t\t\toppositeEnd.oclIsKindOf(Connection_Relationship2Entity)\r\n\t\t)\r\n\t\tand\r\n\t\t(\r\n\t\t\tself.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t\t=\r\n\t\t\toppositeEnd.oclAsType(Connection_Relationship2Entity).target_entity\r\n\t\t)\r\n\t)\r\n)\r\nthen\r\n\t(\r\n\t\toclIsKindOf(Connection_EntityRelationship)\r\n\t)\r\nelse\r\n\t(\r\n\t\tnot oclIsKindOf(Connection_EntityRelationship)\r\n\t)\r\nendif\r\nand\r\nif\r\n(\r\n\tConnection_E_R_Restriction.allInstances()\r\n\t->select\r\n\t\t\t(\r\n\t\t\t\tc:Connection_E_R_Restriction\r\n\t\t\t\t|\r\n\t\t\t\t(\r\n\t\t\t\t\tc.connection_source_entity_relationship = self \r\n\t\t\t\t\tand \r\n\t\t\t\t\tc.connection_target_entity_relationship = oppositeEnd\r\n\t\t\t\t) \r\n\t\t\t\tor \r\n\t\t\t\t(\r\n\t\t\t\t\tc.connection_source_entity_relationship = oppositeEnd \r\n\t\t\t\t\tand \r\n\t\t\t\t\tc.connection_target_entity_relationship = self\r\n\t\t\t\t)\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t)->size() > 0\r\n)\r\nthen\r\n\t( \r\n\t\tnot oclIsKindOf(Connection_EntityRelationship)\r\n\t) \r\nelse \r\n\t(\r\n\t\toclIsKindOf(Connection_EntityRelationship)\r\n\t) \r\nendif", //$NON-NLS-1$
				"if\r\n(\r\n\tself.oclIsTypeOf(Connection_Entity2Relationship) or\r\n\tself.oclIsTypeOf(Connection_Relationship2Entity)\r\n)\r\nthen\r\n\t(\r\n\t\toclIsKindOf(Connection_EntityRelationship)\r\n\t)\r\nelse\r\n\t(\r\n\t\tnot oclIsKindOf(Connection_EntityRelationship)\r\n\t)\r\nendif", //$NON-NLS-1$
				"if \t\r\n( \r\n\toppositeEnd.oclIsTypeOf(Connection_Entity2Relationship) and \r\n       oppositeEnd.oclAsType(Connection_Entity2Relationship).target_relationship.type_relationship = TypeRelationship::Weak_dependence_in_identification and\r\n\tself.identifier = TypeIdentifier::PrimaryIdentifier\r\n) \r\nthen \r\n\t( \r\n\t\toclIsKindOf(Attribute)\r\n\t) \r\n\telse \r\n\t(\r\n\t\tnot oclIsKindOf(Attribute) \r\n\t) \r\nendif\r\nor\r\nif \t\r\n( \r\n\toppositeEnd.oclIsTypeOf(Connection_Relationship2Entity) and \r\n       oppositeEnd.oclAsType(Connection_Relationship2Entity).source_relationship.type_relationship = TypeRelationship::Weak_dependence_in_identification and\r\n\tself.identifier = TypeIdentifier::PrimaryIdentifier\r\n) \r\nthen \r\n\t( \r\n\t\toclIsKindOf(Attribute)\r\n\t) \r\n\telse \r\n\t(\r\n\t\tnot oclIsKindOf(Attribute) \r\n\t) \r\nendif", //$NON-NLS-1$
				"self.connected->size() <> 0 or self.attributes_composites.attributes->size() <> 0", //$NON-NLS-1$
				"(self.entity_connected_to_entity2relationship->size() <> 0) or self.subclass_generalizations->size() <> 0", //$NON-NLS-1$
				"self.attributes->notEmpty()", //$NON-NLS-1$
				"self.connected_with_attribute.connection_attribute.oclAsType(Attribute)->exists (a | a.identifier = TypeIdentifier::PrimaryIdentifier)", //$NON-NLS-1$
				"self.connected_with_attribute.connection_attribute.oclAsType(Attribute)->select (a | a.identifier = TypeIdentifier::PrimaryIdentifier) ->size() < 2", //$NON-NLS-1$
				"self ->forAll(e | not e.name_entity.oclIsUndefined() and e.name_entity <> \'\')", //$NON-NLS-1$
				"self ->forAll(e | not e.name_attribute.oclIsUndefined() and e.name_attribute <> \'\')", //$NON-NLS-1$
				"self ->forAll(e | not e.name_relationship.oclIsUndefined() and e.name_relationship <> \'\')", //$NON-NLS-1$
				"self ->forAll(e | not e.role.oclIsUndefined() and e.role <> \'\')", //$NON-NLS-1$
				"self ->forAll(e | not e.name_at_composite.oclIsUndefined() and e.name_at_composite <> \'\')", //$NON-NLS-1$
				"if(self.type_relationship =TypeRelationship::Weak_dependence_in_identification)then(self.connected_with_attribute.oclAsType(Connection_With_Attribute)->exists (c | c.type_attribute = TypeAttribute::Dependence_in_identification))else(self.connected_with_attribute.oclAsType(Connection_With_Attribute)->size() = 0 or self.connected_with_attribute.oclAsType(Connection_With_Attribute)->size() <> 0)endif", //$NON-NLS-1$
				"if(self.connected.oclAsType(Connection_With_Attribute)->exists (c | c.type_attribute = TypeAttribute::Dependence_in_identification))then(self.attributes_identification->size() <> 0)else(self.attributes_identification->size() = 0)endif", //$NON-NLS-1$
				"Entity.allInstances()->forAll(p1, p2:Entity | p1 <> p2 implies p1.name_entity.toUpper() <> p2.name_entity.toUpper())", //$NON-NLS-1$
				"Relationship.allInstances()->forAll(p1, p2:Relationship | p1 <> p2 implies p1.name_relationship.toUpper() <> p2.name_relationship.toUpper())", //$NON-NLS-1$
				"Connection_EntityRelationship.allInstances()->forAll(p1, p2:Connection_EntityRelationship | p1 <> p2 implies p1.role.toUpper() <> p2.role.toUpper())", //$NON-NLS-1$
				"Attribute.allInstances()->forAll(p1, p2:Attribute | p1 <> p2 and p1.connected.element = p2.connected.element implies p1.name_attribute.toUpper() <> p2.name_attribute.toUpper())", //$NON-NLS-1$
				"Attribute_Composite.allInstances()->forAll(p1, p2:Attribute_Composite | p1 <> p2 and p1.attributes = p2.attributes implies p1.name_at_composite.toUpper() <> p2.name_at_composite.toUpper())", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static EntityRelationshipOCLFactory getInstance() {
		EntityRelationshipOCLFactory instance = EntityRelationshipDiagramEditorPlugin
				.getInstance().getEntityRelationshipOCLFactory();
		if (instance == null) {
			EntityRelationshipDiagramEditorPlugin.getInstance()
					.setEntityRelationshipOCLFactory(
							instance = new EntityRelationshipOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static EntityRelationshipAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		EntityRelationshipOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static EntityRelationshipAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static EntityRelationshipAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends
			EntityRelationshipAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
