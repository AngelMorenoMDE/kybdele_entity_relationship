package entityrelationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entityrelationship.Entity_Relationship_Model;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.diagram.edit.policies.EntityRelationshipBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Relationships_RestrictionReorientCommand extends
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
	public Relationships_RestrictionReorientCommand(
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
		if (false == getElementToEdit() instanceof Relationships_Restriction) {
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
		if (!(oldEnd instanceof Relationship && newEnd instanceof Relationship)) {
			return false;
		}
		Relationship target = getLink().getTarget_relationship();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationships_Restriction_4007(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Relationship && newEnd instanceof Relationship)) {
			return false;
		}
		Relationship source = getLink().getSource_relationship();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationships_Restriction_4007(
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
		getLink().setSource_relationship(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget_relationship(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Relationships_Restriction getLink() {
		return (Relationships_Restriction) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Relationship getOldSource() {
		return (Relationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Relationship getNewSource() {
		return (Relationship) newEnd;
	}

	/**
	 * @generated
	 */
	protected Relationship getOldTarget() {
		return (Relationship) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Relationship getNewTarget() {
		return (Relationship) newEnd;
	}
}
