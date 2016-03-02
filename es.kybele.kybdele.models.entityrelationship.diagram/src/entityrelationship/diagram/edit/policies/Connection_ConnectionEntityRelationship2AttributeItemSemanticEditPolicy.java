package entityrelationship.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Connection_ConnectionEntityRelationship2AttributeItemSemanticEditPolicy
		extends EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Connection_ConnectionEntityRelationship2AttributeItemSemanticEditPolicy() {
		super(
				EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
