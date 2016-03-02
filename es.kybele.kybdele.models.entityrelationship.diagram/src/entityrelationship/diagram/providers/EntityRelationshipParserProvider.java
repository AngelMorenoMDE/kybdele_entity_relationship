package entityrelationship.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import entityrelationship.EntityrelationshipPackage;
import entityrelationship.diagram.edit.parts.AttributeName_attribute2EditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attributeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeName_at_compositeEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipRoleEditPart;
import entityrelationship.diagram.edit.parts.Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityRoleEditPart;
import entityrelationship.diagram.edit.parts.EntityName_entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityName_entityEditPart;
import entityrelationship.diagram.edit.parts.RelationshipCardinality2EditPart;
import entityrelationship.diagram.edit.parts.RelationshipCardinality3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipCardinalityEditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationship2EditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationshipEditPart;
import entityrelationship.diagram.parsers.MessageFormatParser;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;

/**
 * @generated
 */
public class EntityRelationshipParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser entityName_entity_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_entity_5001Parser() {
		if (entityName_entity_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getEntity_Name_entity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_entity_5001Parser = parser;
		}
		return entityName_entity_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_entity_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_entity_5002Parser() {
		if (entityName_entity_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getEntity_Name_entity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_entity_5002Parser = parser;
		}
		return entityName_entity_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_relationship_5012Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_relationship_5012Parser() {
		if (relationshipName_relationship_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getRelationship_Name_relationship() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_relationship_5012Parser = parser;
		}
		return relationshipName_relationship_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipCardinality_5013Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipCardinality_5013Parser() {
		if (relationshipCardinality_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getRelationship_Cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipCardinality_5013Parser = parser;
		}
		return relationshipCardinality_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_relationship_5014Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_relationship_5014Parser() {
		if (relationshipName_relationship_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getRelationship_Name_relationship() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_relationship_5014Parser = parser;
		}
		return relationshipName_relationship_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipCardinality_5015Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipCardinality_5015Parser() {
		if (relationshipCardinality_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getRelationship_Cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipCardinality_5015Parser = parser;
		}
		return relationshipCardinality_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_relationship_5016Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_relationship_5016Parser() {
		if (relationshipName_relationship_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getRelationship_Name_relationship() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_relationship_5016Parser = parser;
		}
		return relationshipName_relationship_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipCardinality_5017Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipCardinality_5017Parser() {
		if (relationshipCardinality_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getRelationship_Cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipCardinality_5017Parser = parser;
		}
		return relationshipCardinality_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_attribute_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_attribute_5009Parser() {
		if (attributeName_attribute_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getAttribute_Name_attribute() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_attribute_5009Parser = parser;
		}
		return attributeName_attribute_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_attribute_5010Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_attribute_5010Parser() {
		if (attributeName_attribute_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getAttribute_Name_attribute() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_attribute_5010Parser = parser;
		}
		return attributeName_attribute_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_attribute_5011Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_attribute_5011Parser() {
		if (attributeName_attribute_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getAttribute_Name_attribute() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_attribute_5011Parser = parser;
		}
		return attributeName_attribute_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_CompositeName_at_composite_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_CompositeName_at_composite_5019Parser() {
		if (attribute_CompositeName_at_composite_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getAttribute_Composite_Name_at_composite() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attribute_CompositeName_at_composite_5019Parser = parser;
		}
		return attribute_CompositeName_at_composite_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser connection_Generalization_EntityMinimum_cardinalityMaximum_cardinality_6009Parser;

	/**
	 * @generated
	 */
	private IParser getConnection_Generalization_EntityMinimum_cardinalityMaximum_cardinality_6009Parser() {
		if (connection_Generalization_EntityMinimum_cardinalityMaximum_cardinality_6009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EntityrelationshipPackage.eINSTANCE
							.getConnection_Generalization_Entity_Minimum_cardinality(),
					EntityrelationshipPackage.eINSTANCE
							.getConnection_Generalization_Entity_Maximum_cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			connection_Generalization_EntityMinimum_cardinalityMaximum_cardinality_6009Parser = parser;
		}
		return connection_Generalization_EntityMinimum_cardinalityMaximum_cardinality_6009Parser;
	}

	/**
	 * @generated
	 */
	private IParser connection_Relationship2EntityRole_6012Parser;

	/**
	 * @generated
	 */
	private IParser getConnection_Relationship2EntityRole_6012Parser() {
		if (connection_Relationship2EntityRole_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getConnection_EntityRelationship_Role() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connection_Relationship2EntityRole_6012Parser = parser;
		}
		return connection_Relationship2EntityRole_6012Parser;
	}

	/**
	 * @generated
	 */
	private IParser connection_Relationship2EntityMinimum_cardinalityMaximum_cardinality_6013Parser;

	/**
	 * @generated
	 */
	private IParser getConnection_Relationship2EntityMinimum_cardinalityMaximum_cardinality_6013Parser() {
		if (connection_Relationship2EntityMinimum_cardinalityMaximum_cardinality_6013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EntityrelationshipPackage.eINSTANCE
							.getConnection_EntityRelationship_Minimum_cardinality(),
					EntityrelationshipPackage.eINSTANCE
							.getConnection_EntityRelationship_Maximum_cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			connection_Relationship2EntityMinimum_cardinalityMaximum_cardinality_6013Parser = parser;
		}
		return connection_Relationship2EntityMinimum_cardinalityMaximum_cardinality_6013Parser;
	}

	/**
	 * @generated
	 */
	private IParser connection_Entity2RelationshipRole_6010Parser;

	/**
	 * @generated
	 */
	private IParser getConnection_Entity2RelationshipRole_6010Parser() {
		if (connection_Entity2RelationshipRole_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityrelationshipPackage.eINSTANCE
					.getConnection_EntityRelationship_Role() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connection_Entity2RelationshipRole_6010Parser = parser;
		}
		return connection_Entity2RelationshipRole_6010Parser;
	}

	/**
	 * @generated
	 */
	private IParser connection_Entity2RelationshipMinimum_cardinalityMaximum_cardinality_6011Parser;

	/**
	 * @generated
	 */
	private IParser getConnection_Entity2RelationshipMinimum_cardinalityMaximum_cardinality_6011Parser() {
		if (connection_Entity2RelationshipMinimum_cardinalityMaximum_cardinality_6011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					EntityrelationshipPackage.eINSTANCE
							.getConnection_EntityRelationship_Minimum_cardinality(),
					EntityrelationshipPackage.eINSTANCE
							.getConnection_EntityRelationship_Maximum_cardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			connection_Entity2RelationshipMinimum_cardinalityMaximum_cardinality_6011Parser = parser;
		}
		return connection_Entity2RelationshipMinimum_cardinalityMaximum_cardinality_6011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EntityName_entityEditPart.VISUAL_ID:
			return getEntityName_entity_5001Parser();
		case EntityName_entity2EditPart.VISUAL_ID:
			return getEntityName_entity_5002Parser();
		case RelationshipName_relationshipEditPart.VISUAL_ID:
			return getRelationshipName_relationship_5012Parser();
		case RelationshipCardinalityEditPart.VISUAL_ID:
			return getRelationshipCardinality_5013Parser();
		case RelationshipName_relationship2EditPart.VISUAL_ID:
			return getRelationshipName_relationship_5014Parser();
		case RelationshipCardinality2EditPart.VISUAL_ID:
			return getRelationshipCardinality_5015Parser();
		case RelationshipName_relationship3EditPart.VISUAL_ID:
			return getRelationshipName_relationship_5016Parser();
		case RelationshipCardinality3EditPart.VISUAL_ID:
			return getRelationshipCardinality_5017Parser();
		case AttributeName_attributeEditPart.VISUAL_ID:
			return getAttributeName_attribute_5009Parser();
		case AttributeName_attribute2EditPart.VISUAL_ID:
			return getAttributeName_attribute_5010Parser();
		case AttributeName_attribute3EditPart.VISUAL_ID:
			return getAttributeName_attribute_5011Parser();
		case Attribute_CompositeName_at_compositeEditPart.VISUAL_ID:
			return getAttribute_CompositeName_at_composite_5019Parser();
		case Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID:
			return getConnection_Generalization_EntityMinimum_cardinalityMaximum_cardinality_6009Parser();
		case Connection_Relationship2EntityRoleEditPart.VISUAL_ID:
			return getConnection_Relationship2EntityRole_6012Parser();
		case Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID:
			return getConnection_Relationship2EntityMinimum_cardinalityMaximum_cardinality_6013Parser();
		case Connection_Entity2RelationshipRoleEditPart.VISUAL_ID:
			return getConnection_Entity2RelationshipRole_6010Parser();
		case Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart.VISUAL_ID:
			return getConnection_Entity2RelationshipMinimum_cardinalityMaximum_cardinality_6011Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EntityRelationshipVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EntityRelationshipVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EntityRelationshipElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
