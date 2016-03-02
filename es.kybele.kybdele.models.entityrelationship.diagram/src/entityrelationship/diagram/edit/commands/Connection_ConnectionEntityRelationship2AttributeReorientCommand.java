package entityrelationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entityrelationship.Attribute;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.diagram.edit.policies.EntityRelationshipBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Connection_ConnectionEntityRelationship2AttributeReorientCommand
		extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public Connection_ConnectionEntityRelationship2AttributeReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Connection_ConnectionEntityRelationship2Attribute) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Connection_EntityRelationship && newEnd instanceof Connection_EntityRelationship)) {
			return false;
		}
		Attribute target = getLink().getTarget_attribute();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnection_ConnectionEntityRelationship2Attribute_4022(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Attribute && newEnd instanceof Attribute)) {
			return false;
		}
		Connection_EntityRelationship source = getLink().getSource_connection();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnection_ConnectionEntityRelationship2Attribute_4022(
						container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource_connection(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget_attribute(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Connection_ConnectionEntityRelationship2Attribute getLink() {
		return (Connection_ConnectionEntityRelationship2Attribute) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Connection_EntityRelationship getOldSource() {
		return (Connection_EntityRelationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Connection_EntityRelationship getNewSource() {
		return (Connection_EntityRelationship) newEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute getOldTarget() {
		return (Attribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute getNewTarget() {
		return (Attribute) newEnd;
	}
}
