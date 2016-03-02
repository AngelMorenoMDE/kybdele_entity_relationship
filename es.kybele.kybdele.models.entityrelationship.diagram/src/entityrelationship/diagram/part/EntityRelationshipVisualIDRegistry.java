package entityrelationship.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.diagram.edit.parts.Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeEditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attribute2EditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attributeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeName_at_compositeEditPart;
import entityrelationship.diagram.edit.parts.Connection_ConnectionEntityRelationship2AttributeEditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_RestrictionEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipRoleEditPart;
import entityrelationship.diagram.edit.parts.Connection_Generalization_EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityRoleEditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute3EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute4EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute5EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_AttributeEditPart;
import entityrelationship.diagram.edit.parts.Entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityEditPart;
import entityrelationship.diagram.edit.parts.EntityName_entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityName_entityEditPart;
import entityrelationship.diagram.edit.parts.Entity_Relationship_ModelEditPart;
import entityrelationship.diagram.edit.parts.Generalization2EditPart;
import entityrelationship.diagram.edit.parts.Generalization3EditPart;
import entityrelationship.diagram.edit.parts.Generalization4EditPart;
import entityrelationship.diagram.edit.parts.GeneralizationEditPart;
import entityrelationship.diagram.edit.parts.Relationship2EditPart;
import entityrelationship.diagram.edit.parts.Relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipCardinality2EditPart;
import entityrelationship.diagram.edit.parts.RelationshipCardinality3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipCardinalityEditPart;
import entityrelationship.diagram.edit.parts.RelationshipEditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationship2EditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationshipEditPart;
import entityrelationship.diagram.edit.parts.Relationships_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Relationships_RestrictionEditPart;
import entityrelationship.diagram.edit.parts.WrappingLabel2EditPart;
import entityrelationship.diagram.edit.parts.WrappingLabel3EditPart;
import entityrelationship.diagram.edit.parts.WrappingLabelEditPart;
import entityrelationship.diagram.expressions.EntityRelationshipOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EntityRelationshipVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "gmf_entity_relationship_model.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Entity_Relationship_ModelEditPart.MODEL_ID.equals(view
					.getType())) {
				return Entity_Relationship_ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EntityrelationshipPackage.eINSTANCE.getEntity_Relationship_Model()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Entity_Relationship_Model) domainElement)) {
			return Entity_Relationship_ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
				.getModelID(containerView);
		if (!Entity_Relationship_ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Entity_Relationship_ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Entity_Relationship_ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			if (EntityrelationshipPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())
					&& isEntity_2001((Entity) domainElement)) {
				return EntityEditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())
					&& isEntity_2002((Entity) domainElement)) {
				return Entity2EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getRelationship()
					.isSuperTypeOf(domainElement.eClass())
					&& isRelationship_2009((Relationship) domainElement)) {
				return RelationshipEditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getRelationship()
					.isSuperTypeOf(domainElement.eClass())
					&& isRelationship_2010((Relationship) domainElement)) {
				return Relationship2EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getRelationship()
					.isSuperTypeOf(domainElement.eClass())
					&& isRelationship_2011((Relationship) domainElement)) {
				return Relationship3EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getAttribute()
					.isSuperTypeOf(domainElement.eClass())
					&& isAttribute_2006((Attribute) domainElement)) {
				return AttributeEditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getAttribute()
					.isSuperTypeOf(domainElement.eClass())
					&& isAttribute_2007((Attribute) domainElement)) {
				return Attribute2EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getAttribute()
					.isSuperTypeOf(domainElement.eClass())
					&& isAttribute_2008((Attribute) domainElement)) {
				return Attribute3EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getAttribute_Composite()
					.isSuperTypeOf(domainElement.eClass())
					&& isAttribute_Composite_2013((Attribute_Composite) domainElement)) {
				return Attribute_CompositeEditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getGeneralization()
					.isSuperTypeOf(domainElement.eClass())
					&& isGeneralization_2019((Generalization) domainElement)) {
				return GeneralizationEditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getGeneralization()
					.isSuperTypeOf(domainElement.eClass())
					&& isGeneralization_2020((Generalization) domainElement)) {
				return Generalization2EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getGeneralization()
					.isSuperTypeOf(domainElement.eClass())
					&& isGeneralization_2021((Generalization) domainElement)) {
				return Generalization3EditPart.VISUAL_ID;
			}
			if (EntityrelationshipPackage.eINSTANCE.getGeneralization()
					.isSuperTypeOf(domainElement.eClass())
					&& isGeneralization_2022((Generalization) domainElement)) {
				return Generalization4EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
				.getModelID(containerView);
		if (!Entity_Relationship_ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Entity_Relationship_ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Entity_Relationship_ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Relationship2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Relationship3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Attribute3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Attribute_CompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeneralizationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Generalization2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Generalization3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Generalization4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityName_entityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Entity2EditPart.VISUAL_ID:
			if (EntityName_entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipName_relationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipCardinalityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationship2EditPart.VISUAL_ID:
			if (RelationshipName_relationship2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipCardinality2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationship3EditPart.VISUAL_ID:
			if (RelationshipName_relationship3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipCardinality3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeName_attributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attribute2EditPart.VISUAL_ID:
			if (AttributeName_attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attribute3EditPart.VISUAL_ID:
			if (AttributeName_attribute3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attribute_CompositeEditPart.VISUAL_ID:
			if (Attribute_CompositeName_at_compositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			if (Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			if (Connection_Relationship2EntityRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			if (Connection_Entity2RelationshipRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationships_RestrictionEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationships_Restriction2EditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EntityrelationshipPackage.eINSTANCE
				.getConnection_Generalization_Entity().isSuperTypeOf(
						domainElement.eClass())) {
			return Connection_Generalization_EntityEditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE
				.getConnection_Relationship2Entity().isSuperTypeOf(
						domainElement.eClass())) {
			return Connection_Relationship2EntityEditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE
				.getConnection_Entity2Relationship().isSuperTypeOf(
						domainElement.eClass())) {
			return Connection_Entity2RelationshipEditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_With_Attribute()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_With_Attribute_4002((Connection_With_Attribute) domainElement)) {
			return Connection_With_AttributeEditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_With_Attribute()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_With_Attribute_4003((Connection_With_Attribute) domainElement)) {
			return Connection_With_Attribute2EditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_With_Attribute()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_With_Attribute_4004((Connection_With_Attribute) domainElement)) {
			return Connection_With_Attribute3EditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_With_Attribute()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_With_Attribute_4005((Connection_With_Attribute) domainElement)) {
			return Connection_With_Attribute4EditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_With_Attribute()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_With_Attribute_4006((Connection_With_Attribute) domainElement)) {
			return Connection_With_Attribute5EditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getRelationships_Restriction()
				.isSuperTypeOf(domainElement.eClass())
				&& isRelationships_Restriction_4007((Relationships_Restriction) domainElement)) {
			return Relationships_RestrictionEditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getRelationships_Restriction()
				.isSuperTypeOf(domainElement.eClass())
				&& isRelationships_Restriction_4008((Relationships_Restriction) domainElement)) {
			return Relationships_Restriction2EditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_E_R_Restriction()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_E_R_Restriction_4012((Connection_E_R_Restriction) domainElement)) {
			return Connection_E_R_RestrictionEditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE.getConnection_E_R_Restriction()
				.isSuperTypeOf(domainElement.eClass())
				&& isConnection_E_R_Restriction_4013((Connection_E_R_Restriction) domainElement)) {
			return Connection_E_R_Restriction2EditPart.VISUAL_ID;
		}
		if (EntityrelationshipPackage.eINSTANCE
				.getConnection_ConnectionEntityRelationship2Attribute()
				.isSuperTypeOf(domainElement.eClass())) {
			return Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Entity_Relationship_Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isEntity_2001(Entity domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(0,
				EntityrelationshipPackage.eINSTANCE.getEntity(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEntity_2002(Entity domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(2,
				EntityrelationshipPackage.eINSTANCE.getEntity(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationship_2009(Relationship domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(4,
				EntityrelationshipPackage.eINSTANCE.getRelationship(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationship_2010(Relationship domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(6,
				EntityrelationshipPackage.eINSTANCE.getRelationship(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationship_2011(Relationship domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(8,
				EntityrelationshipPackage.eINSTANCE.getRelationship(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAttribute_2006(Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(10,
				EntityrelationshipPackage.eINSTANCE.getAttribute(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAttribute_2007(Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(12,
				EntityrelationshipPackage.eINSTANCE.getAttribute(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAttribute_2008(Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(14,
				EntityrelationshipPackage.eINSTANCE.getAttribute(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAttribute_Composite_2013(
			Attribute_Composite domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(16,
				EntityrelationshipPackage.eINSTANCE.getAttribute_Composite(),
				null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGeneralization_2019(Generalization domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(18,
				EntityrelationshipPackage.eINSTANCE.getGeneralization(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGeneralization_2020(Generalization domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(21,
				EntityrelationshipPackage.eINSTANCE.getGeneralization(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGeneralization_2021(Generalization domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(24,
				EntityrelationshipPackage.eINSTANCE.getGeneralization(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGeneralization_2022(Generalization domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(27,
				EntityrelationshipPackage.eINSTANCE.getGeneralization(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_With_Attribute_4002(
			Connection_With_Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				34,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_With_Attribute(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_With_Attribute_4003(
			Connection_With_Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				37,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_With_Attribute(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_With_Attribute_4004(
			Connection_With_Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				40,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_With_Attribute(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_With_Attribute_4005(
			Connection_With_Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				43,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_With_Attribute(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_With_Attribute_4006(
			Connection_With_Attribute domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				46,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_With_Attribute(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationships_Restriction_4007(
			Relationships_Restriction domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				49,
				EntityrelationshipPackage.eINSTANCE
						.getRelationships_Restriction(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRelationships_Restriction_4008(
			Relationships_Restriction domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				53,
				EntityrelationshipPackage.eINSTANCE
						.getRelationships_Restriction(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_E_R_Restriction_4012(
			Connection_E_R_Restriction domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				59,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_E_R_Restriction(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnection_E_R_Restriction_4013(
			Connection_E_R_Restriction domainElement) {
		Object result = EntityRelationshipOCLFactory.getExpression(
				63,
				EntityrelationshipPackage.eINSTANCE
						.getConnection_E_R_Restriction(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			return false;
		case EntityEditPart.VISUAL_ID:
		case Entity2EditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case Attribute2EditPart.VISUAL_ID:
		case Attribute3EditPart.VISUAL_ID:
		case RelationshipEditPart.VISUAL_ID:
		case Relationship2EditPart.VISUAL_ID:
		case Relationship3EditPart.VISUAL_ID:
		case Attribute_CompositeEditPart.VISUAL_ID:
		case GeneralizationEditPart.VISUAL_ID:
		case Generalization2EditPart.VISUAL_ID:
		case Generalization3EditPart.VISUAL_ID:
		case Generalization4EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		
		public int getVisualID(View view) {
			return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		
		public String getModelID(View view) {
			return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		
		public boolean isCompartmentVisualID(int visualID) {
			return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		
		public boolean isSemanticLeafVisualID(int visualID) {
			return entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
