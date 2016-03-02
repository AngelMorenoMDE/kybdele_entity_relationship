package entityrelationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.Generalization;
import entityrelationship.diagram.edit.policies.EntityRelationshipBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Connection_Generalization_EntityReorientCommand extends
		EditElementCommand {

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
	public Connection_Generalization_EntityReorientCommand(
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
		if (false == getElementToEdit() instanceof Connection_Generalization_Entity) {
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
		if (!(oldEnd instanceof Generalization && newEnd instanceof Generalization)) {
			return false;
		}
		Entity target = getLink().getConnection_Entity();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnection_Generalization_Entity_4019(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		Generalization source = getLink().getConnection_Generalization();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnection_Generalization_Entity_4019(container,
						getLink(), source, getNewTarget());
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
		getLink().setConnection_Generalization(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setConnection_Entity(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Connection_Generalization_Entity getLink() {
		return (Connection_Generalization_Entity) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Generalization getOldSource() {
		return (Generalization) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Generalization getNewSource() {
		return (Generalization) newEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getOldTarget() {
		return (Entity) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Entity getNewTarget() {
		return (Entity) newEnd;
	}
}
