package entityrelationship.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Relationships_Restriction2ItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Relationships_Restriction2ItemSemanticEditPolicy() {
		super(EntityRelationshipElementTypes.Relationships_Restriction_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
