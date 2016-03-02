package entityrelationship.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entityrelationship.diagram.edit.parts.AttributeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeEditPart;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;
import entityrelationship.diagram.providers.EntityRelationshipModelingAssistantProvider;

/**
 * @generated
 */
public class EntityRelationshipModelingAssistantProviderOfAttributeEditPart
		extends EntityRelationshipModelingAssistantProvider {

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AttributeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(AttributeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EntityRelationshipElementTypes.AttributeAttributes_composites_4009);
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
				(AttributeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			AttributeEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Attribute_CompositeEditPart) {
			types.add(EntityRelationshipElementTypes.AttributeAttributes_composites_4009);
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
		return doGetTypesForTarget((AttributeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(AttributeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.AttributeAttributes_composites_4009) {
			types.add(EntityRelationshipElementTypes.Attribute_Composite_2013);
		}
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AttributeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(AttributeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4002);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4003);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4004);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4005);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4006);
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((AttributeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(AttributeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4002) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4003) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4004) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4005) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4006) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		}
		return types;
	}

}
