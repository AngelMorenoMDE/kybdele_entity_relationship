package entityrelationship.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Connection_E_R_RestrictionItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Connection_E_R_RestrictionItemSemanticEditPolicy() {
		super(EntityRelationshipElementTypes.Connection_E_R_Restriction_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
