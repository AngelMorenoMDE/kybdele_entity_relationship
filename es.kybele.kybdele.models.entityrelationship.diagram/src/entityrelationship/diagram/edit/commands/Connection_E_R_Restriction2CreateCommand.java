package entityrelationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipFactory;
import entityrelationship.diagram.edit.policies.EntityRelationshipBaseItemSemanticEditPolicy;
import entityrelationship.diagram.providers.ElementInitializers;

/**
 * @generated
 */
public class Connection_E_R_Restriction2CreateCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private final Entity_Relationship_Model container;

	/**
	 * @generated
	 */
	public Connection_E_R_Restriction2CreateCommand(
			CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& false == source instanceof Connection_EntityRelationship) {
			return false;
		}
		if (target != null
				&& false == target instanceof Connection_EntityRelationship) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return EntityRelationshipBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateConnection_E_R_Restriction_4013(
						getContainer(), getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		Connection_E_R_Restriction newElement = EntityrelationshipFactory.eINSTANCE
				.createConnection_E_R_Restriction();
		getContainer().getERM_Has_Rt2().add(newElement);
		newElement.setConnection_source_entity_relationship(getSource());
		newElement.setConnection_target_entity_relationship(getTarget());
		ElementInitializers.getInstance().init_Connection_E_R_Restriction_4013(
				newElement);
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(Connection_E_R_Restriction newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE,
				getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET,
				getTarget());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Connection_EntityRelationship getSource() {
		return (Connection_EntityRelationship) source;
	}

	/**
	 * @generated
	 */
	protected Connection_EntityRelationship getTarget() {
		return (Connection_EntityRelationship) target;
	}

	/**
	 * @generated
	 */
	public Entity_Relationship_Model getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static Entity_Relationship_Model deduceContainer(EObject source,
			EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				return (Entity_Relationship_Model) element;
			}
		}
		return null;
	}

}
