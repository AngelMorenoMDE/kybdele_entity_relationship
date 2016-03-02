package entityrelationship.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Connection_With_Attribute3ItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Connection_With_Attribute3ItemSemanticEditPolicy() {
		super(EntityRelationshipElementTypes.Connection_With_Attribute_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
