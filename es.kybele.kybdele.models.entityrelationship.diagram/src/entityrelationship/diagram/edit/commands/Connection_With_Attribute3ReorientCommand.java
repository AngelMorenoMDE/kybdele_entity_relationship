package entityrelationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entityrelationship.Attribute;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Elements_with_Attributes;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.diagram.edit.policies.EntityRelationshipBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Connection_With_Attribute3ReorientCommand extends
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
	public Connection_With_Attribute3ReorientCommand(
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
		if (false == getElementToEdit() instanceof Connection_With_Attribute) {
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
		if (!(oldEnd instanceof Elements_with_Attributes && newEnd instanceof Elements_with_Attributes)) {
			return false;
		}
		Attribute target = getLink().getConnection_attribute();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_With_Attribute_4004(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Attribute && newEnd instanceof Attribute)) {
			return false;
		}
		Elements_with_Attributes source = getLink().getElement();
		if (!(getLink().eContainer() instanceof Entity_Relationship_Model)) {
			return false;
		}
		Entity_Relationship_Model container = (Entity_Relationship_Model) getLink()
				.eContainer();
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_With_Attribute_4004(
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
		getLink().setElement(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setConnection_attribute(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Connection_With_Attribute getLink() {
		return (Connection_With_Attribute) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Elements_with_Attributes getOldSource() {
		return (Elements_with_Attributes) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Elements_with_Attributes getNewSource() {
		return (Elements_with_Attributes) newEnd;
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
