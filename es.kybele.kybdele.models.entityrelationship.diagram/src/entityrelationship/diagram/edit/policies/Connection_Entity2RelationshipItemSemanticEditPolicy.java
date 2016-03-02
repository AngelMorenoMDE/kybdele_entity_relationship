package entityrelationship.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entityrelationship.diagram.edit.commands.Connection_ConnectionEntityRelationship2AttributeCreateCommand;
import entityrelationship.diagram.edit.commands.Connection_ConnectionEntityRelationship2AttributeReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_E_R_Restriction2CreateCommand;
import entityrelationship.diagram.edit.commands.Connection_E_R_Restriction2ReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_E_R_RestrictionCreateCommand;
import entityrelationship.diagram.edit.commands.Connection_E_R_RestrictionReorientCommand;
import entityrelationship.diagram.edit.parts.Connection_ConnectionEntityRelationship2AttributeEditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_RestrictionEditPart;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Connection_Entity2RelationshipItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Connection_Entity2RelationshipItemSemanticEditPolicy() {
		super(
				EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EntityRelationshipElementTypes.Connection_E_R_Restriction_4012 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_E_R_RestrictionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_E_R_Restriction_4013 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_E_R_Restriction2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_ConnectionEntityRelationship2AttributeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EntityRelationshipElementTypes.Connection_E_R_Restriction_4012 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_E_R_RestrictionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_E_R_Restriction_4013 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_E_R_Restriction2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_E_R_RestrictionReorientCommand(
					req));
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_E_R_Restriction2ReorientCommand(
					req));
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_ConnectionEntityRelationship2AttributeReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
