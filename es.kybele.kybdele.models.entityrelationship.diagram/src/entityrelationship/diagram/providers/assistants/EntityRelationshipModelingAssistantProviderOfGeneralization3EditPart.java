package entityrelationship.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entityrelationship.diagram.edit.parts.Entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityEditPart;
import entityrelationship.diagram.edit.parts.Generalization3EditPart;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;
import entityrelationship.diagram.providers.EntityRelationshipModelingAssistantProvider;

/**
 * @generated
 */
public class EntityRelationshipModelingAssistantProviderOfGeneralization3EditPart
		extends EntityRelationshipModelingAssistantProvider {

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Generalization3EditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Generalization3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EntityRelationshipElementTypes.Connection_Generalization_Entity_4019);
		types.add(EntityRelationshipElementTypes.GeneralizationSuperclass_4017);
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(Generalization3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Generalization3EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntityEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Generalization_Entity_4019);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Generalization_Entity_4019);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(EntityRelationshipElementTypes.GeneralizationSuperclass_4017);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(EntityRelationshipElementTypes.GeneralizationSuperclass_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Generalization3EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Generalization3EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.Connection_Generalization_Entity_4019) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
		} else if (relationshipType == EntityRelationshipElementTypes.GeneralizationSuperclass_4017) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
		}
		return types;
	}

}
