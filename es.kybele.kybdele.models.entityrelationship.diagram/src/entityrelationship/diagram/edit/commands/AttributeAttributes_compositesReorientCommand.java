package entityrelationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.diagram.edit.policies.EntityRelationshipBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AttributeAttributes_compositesReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public AttributeAttributes_compositesReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof Attribute) {
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
		if (!(oldEnd instanceof Attribute_Composite && newEnd instanceof Attribute)) {
			return false;
		}
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistAttributeAttributes_composites_4009(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Attribute_Composite && newEnd instanceof Attribute_Composite)) {
			return false;
		}
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistAttributeAttributes_composites_4009(getOldSource(),
						getNewTarget());
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
		getOldSource().getAttributes_composites().remove(getOldTarget());
		getNewSource().getAttributes_composites().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAttributes_composites().remove(getOldTarget());
		getOldSource().getAttributes_composites().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Attribute getOldSource() {
		return (Attribute) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Attribute getNewSource() {
		return (Attribute) newEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute_Composite getOldTarget() {
		return (Attribute_Composite) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Attribute_Composite getNewTarget() {
		return (Attribute_Composite) newEnd;
	}
}
