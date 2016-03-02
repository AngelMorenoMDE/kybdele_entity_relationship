package entityrelationship.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import entityrelationship.diagram.edit.commands.Attribute2CreateCommand;
import entityrelationship.diagram.edit.commands.Attribute3CreateCommand;
import entityrelationship.diagram.edit.commands.AttributeCreateCommand;
import entityrelationship.diagram.edit.commands.Attribute_CompositeCreateCommand;
import entityrelationship.diagram.edit.commands.Entity2CreateCommand;
import entityrelationship.diagram.edit.commands.EntityCreateCommand;
import entityrelationship.diagram.edit.commands.Generalization2CreateCommand;
import entityrelationship.diagram.edit.commands.Generalization3CreateCommand;
import entityrelationship.diagram.edit.commands.Generalization4CreateCommand;
import entityrelationship.diagram.edit.commands.GeneralizationCreateCommand;
import entityrelationship.diagram.edit.commands.Relationship2CreateCommand;
import entityrelationship.diagram.edit.commands.Relationship3CreateCommand;
import entityrelationship.diagram.edit.commands.RelationshipCreateCommand;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class Entity_Relationship_ModelItemSemanticEditPolicy extends
		EntityRelationshipBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Entity_Relationship_ModelItemSemanticEditPolicy() {
		super(EntityRelationshipElementTypes.Entity_Relationship_Model_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EntityRelationshipElementTypes.Entity_2001 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Entity_2002 == req.getElementType()) {
			return getGEFWrapper(new Entity2CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Relationship_2009 == req
				.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Relationship_2010 == req
				.getElementType()) {
			return getGEFWrapper(new Relationship2CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Relationship_2011 == req
				.getElementType()) {
			return getGEFWrapper(new Relationship3CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Attribute_2006 == req
				.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Attribute_2007 == req
				.getElementType()) {
			return getGEFWrapper(new Attribute2CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Attribute_2008 == req
				.getElementType()) {
			return getGEFWrapper(new Attribute3CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Attribute_Composite_2013 == req
				.getElementType()) {
			return getGEFWrapper(new Attribute_CompositeCreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Generalization_2019 == req
				.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Generalization_2020 == req
				.getElementType()) {
			return getGEFWrapper(new Generalization2CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Generalization_2021 == req
				.getElementType()) {
			return getGEFWrapper(new Generalization3CreateCommand(req));
		}
		if (EntityRelationshipElementTypes.Generalization_2022 == req
				.getElementType()) {
			return getGEFWrapper(new Generalization4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
