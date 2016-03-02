package entityrelationship.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import entityrelationship.diagram.edit.commands.AttributeAttributes_compositesCreateCommand;
import entityrelationship.diagram.edit.commands.AttributeAttributes_compositesReorientCommand;
import entityrelationship.diagram.edit.commands.Connection_ConnectionEntityRelationship2AttributeCreateCommand;
import entityrelationship.diagram.edit.commands.Connection_ConnectionEntityRelationship2AttributeReorientCommand;
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
import entityrelationship.diagram.edit.parts.AttributeAttributes_compositesEditPart;
import entityrelationship.diagram.edit.parts.Connection_ConnectionEntityRelationship2AttributeEditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute3EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute4EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute5EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_AttributeEditPart;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Attribute3ItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Attribute3ItemSemanticEditPolicy() {
		super(EntityRelationshipElementTypes.Attribute_2008);
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
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_With_AttributeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_With_Attribute2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_With_Attribute3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_With_Attribute4EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_With_Attribute5EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getVisualID(incomingLink) == Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (EntityRelationshipVisualIDRegistry.getVisualID(outgoingLink) == AttributeAttributes_compositesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
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
		if (EntityRelationshipElementTypes.AttributeAttributes_composites_4009 == req
				.getElementType()) {
			return getGEFWrapper(new AttributeAttributes_compositesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
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
		if (EntityRelationshipElementTypes.AttributeAttributes_composites_4009 == req
				.getElementType()) {
			return null;
		}
		if (EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022 == req
				.getElementType()) {
			return getGEFWrapper(new Connection_ConnectionEntityRelationship2AttributeCreateCommand(
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
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getGEFWrapper(new Connection_ConnectionEntityRelationship2AttributeReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AttributeAttributes_compositesEditPart.VISUAL_ID:
			return getGEFWrapper(new AttributeAttributes_compositesReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
