package entityrelationship.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import entityrelationship.diagram.edit.commands.Connection_Entity2RelationshipCreateCommand;
import entityrelationship.diagram.edit.commands.Connection_Entity2RelationshipReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_Relationship2EntityCreateCommand;
import entityrelationship.diagram.edit.commands.Connection_Relationship2EntityReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute2CreateCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute2ReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute3CreateCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute3ReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute4CreateCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute4ReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute5CreateCommand;
import entityrelationship.diagram.edit.commands.Connection_With_Attribute5ReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_With_AttributeCreateCommand;
import entityrelationship.diagram.edit.commands.Connection_With_AttributeReorientCommand;
import entityrelationship.diagram.edit.commands.Relationships_Restriction2CreateCommand;
import entityrelationship.diagram.edit.commands.Relationships_Restriction2ReorientCommand;
import entityrelationship.diagram.edit.commands.Relationships_RestrictionCreateCommand;
import entityrelationship.diagram.edit.commands.Relationships_RestrictionReorientCommand;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute3EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute4EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute5EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_AttributeEditPart;
import entityrelationship.diagram.edit.parts.Relationships_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Relationships_RestrictionEditPart;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Relationship3ItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Relationship3ItemSemanticEditPolicy() {
		super(EntityRelationshipElementTypes.Relationship_2011);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_Entity2RelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Relationships_RestrictionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Relationships_Restriction2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Connection_Relationship2EntityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Connection_With_AttributeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Connection_With_Attribute2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Connection_With_Attribute3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Connection_With_Attribute4EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Connection_With_Attribute5EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Relationships_RestrictionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == Relationships_Restriction2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
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
		if (EntityRelationshipElementTypes.Connection_Relationship2Entity_4021 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_Relationship2EntityCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_Entity2Relationship_4020 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4002 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_With_AttributeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4003 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_With_Attribute2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4004 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_With_Attribute3CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4005 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_With_Attribute4CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4006 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_With_Attribute5CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Relationships_Restriction_4007 == req
				.getElementType()) {
			return getGEFWrapper(new Relationships_RestrictionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Relationships_Restriction_4008 == req
				.getElementType()) {
			return getGEFWrapper(new Relationships_Restriction2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EntityRelationshipElementTypes.Connection_Relationship2Entity_4021 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_Entity2Relationship_4020 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_Entity2RelationshipCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4002 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4003 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4004 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4005 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_With_Attribute_4006 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Relationships_Restriction_4007 == req
				.getElementType()) {
			return getGEFWrapper(new Relationships_RestrictionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Relationships_Restriction_4008 == req
				.getElementType()) {
			return getGEFWrapper(new Relationships_Restriction2CreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_Relationship2EntityReorientCommand(
					req));
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_Entity2RelationshipReorientCommand(
					req));
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_With_AttributeReorientCommand(
					req));
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_With_Attribute2ReorientCommand(
					req));
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_With_Attribute3ReorientCommand(
					req));
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_With_Attribute4ReorientCommand(
					req));
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_With_Attribute5ReorientCommand(
					req));
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return getGEFWrapper(new Relationships_RestrictionReorientCommand(
					req));
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return getGEFWrapper(new Relationships_Restriction2ReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
