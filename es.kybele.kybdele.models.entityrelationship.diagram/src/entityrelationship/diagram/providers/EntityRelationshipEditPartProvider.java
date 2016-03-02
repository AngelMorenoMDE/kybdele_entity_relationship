package entityrelationship.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import entityrelationship.diagram.edit.parts.EntityRelationshipEditPartFactory;
import entityrelationship.diagram.edit.parts.Entity_Relationship_ModelEditPart;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;

/**
 * @generated
 */
public class EntityRelationshipEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public EntityRelationshipEditPartProvider() {
		super(new EntityRelationshipEditPartFactory(),
				EntityRelationshipVisualIDRegistry.TYPED_INSTANCE,
				Entity_Relationship_ModelEditPart.MODEL_ID);
	}

}
