package entityrelationship.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;

/**
 * @generated
 */
public class EntityRelationshipEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {

			case Entity_Relationship_ModelEditPart.VISUAL_ID:
				return new Entity_Relationship_ModelEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityName_entityEditPart.VISUAL_ID:
				return new EntityName_entityEditPart(view);

			case Entity2EditPart.VISUAL_ID:
				return new Entity2EditPart(view);

			case EntityName_entity2EditPart.VISUAL_ID:
				return new EntityName_entity2EditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipName_relationshipEditPart.VISUAL_ID:
				return new RelationshipName_relationshipEditPart(view);

			case RelationshipCardinalityEditPart.VISUAL_ID:
				return new RelationshipCardinalityEditPart(view);

			case Relationship2EditPart.VISUAL_ID:
				return new Relationship2EditPart(view);

			case RelationshipName_relationship2EditPart.VISUAL_ID:
				return new RelationshipName_relationship2EditPart(view);

			case RelationshipCardinality2EditPart.VISUAL_ID:
				return new RelationshipCardinality2EditPart(view);

			case Relationship3EditPart.VISUAL_ID:
				return new Relationship3EditPart(view);

			case RelationshipName_relationship3EditPart.VISUAL_ID:
				return new RelationshipName_relationship3EditPart(view);

			case RelationshipCardinality3EditPart.VISUAL_ID:
				return new RelationshipCardinality3EditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeName_attributeEditPart.VISUAL_ID:
				return new AttributeName_attributeEditPart(view);

			case Attribute2EditPart.VISUAL_ID:
				return new Attribute2EditPart(view);

			case AttributeName_attribute2EditPart.VISUAL_ID:
				return new AttributeName_attribute2EditPart(view);

			case Attribute3EditPart.VISUAL_ID:
				return new Attribute3EditPart(view);

			case AttributeName_attribute3EditPart.VISUAL_ID:
				return new AttributeName_attribute3EditPart(view);

			case Attribute_CompositeEditPart.VISUAL_ID:
				return new Attribute_CompositeEditPart(view);

			case Attribute_CompositeName_at_compositeEditPart.VISUAL_ID:
				return new Attribute_CompositeName_at_compositeEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case Generalization2EditPart.VISUAL_ID:
				return new Generalization2EditPart(view);

			case Generalization3EditPart.VISUAL_ID:
				return new Generalization3EditPart(view);

			case Generalization4EditPart.VISUAL_ID:
				return new Generalization4EditPart(view);

			case Connection_Generalization_EntityEditPart.VISUAL_ID:
				return new Connection_Generalization_EntityEditPart(view);

			case Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID:
				return new Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart(
						view);

			case Connection_Relationship2EntityEditPart.VISUAL_ID:
				return new Connection_Relationship2EntityEditPart(view);

			case Connection_Relationship2EntityRoleEditPart.VISUAL_ID:
				return new Connection_Relationship2EntityRoleEditPart(view);

			case Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID:
				return new Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart(
						view);

			case Connection_Entity2RelationshipEditPart.VISUAL_ID:
				return new Connection_Entity2RelationshipEditPart(view);

			case Connection_Entity2RelationshipRoleEditPart.VISUAL_ID:
				return new Connection_Entity2RelationshipRoleEditPart(view);

			case Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart.VISUAL_ID:
				return new Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart(
						view);

			case Connection_With_AttributeEditPart.VISUAL_ID:
				return new Connection_With_AttributeEditPart(view);

			case Connection_With_Attribute2EditPart.VISUAL_ID:
				return new Connection_With_Attribute2EditPart(view);

			case Connection_With_Attribute3EditPart.VISUAL_ID:
				return new Connection_With_Attribute3EditPart(view);

			case Connection_With_Attribute4EditPart.VISUAL_ID:
				return new Connection_With_Attribute4EditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case Connection_With_Attribute5EditPart.VISUAL_ID:
				return new Connection_With_Attribute5EditPart(view);

			case Relationships_RestrictionEditPart.VISUAL_ID:
				return new Relationships_RestrictionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case Relationships_Restriction2EditPart.VISUAL_ID:
				return new Relationships_Restriction2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case AttributeAttributes_compositesEditPart.VISUAL_ID:
				return new AttributeAttributes_compositesEditPart(view);

			case Connection_E_R_RestrictionEditPart.VISUAL_ID:
				return new Connection_E_R_RestrictionEditPart(view);

			case Connection_E_R_Restriction2EditPart.VISUAL_ID:
				return new Connection_E_R_Restriction2EditPart(view);

			case GeneralizationSuperclassEditPart.VISUAL_ID:
				return new GeneralizationSuperclassEditPart(view);

			case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
				return new Connection_ConnectionEntityRelationship2AttributeEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
