package entityrelationship.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entityrelationship.diagram.edit.parts.Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeEditPart;
import entityrelationship.diagram.edit.parts.EntityEditPart;
import entityrelationship.diagram.edit.parts.Relationship2EditPart;
import entityrelationship.diagram.edit.parts.Relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipEditPart;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;
import entityrelationship.diagram.providers.EntityRelationshipModelingAssistantProvider;

/**
 * @generated
 */
public class EntityRelationshipModelingAssistantProviderOfEntityEditPart extends
		EntityRelationshipModelingAssistantProvider {

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EntityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(EntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
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
	
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EntityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			EntityEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RelationshipEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
		}
		if (targetEditPart instanceof Relationship2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
		}
		if (targetEditPart instanceof Relationship3EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4002);
		}
		if (targetEditPart instanceof Attribute2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4002);
		}
		if (targetEditPart instanceof Attribute3EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4002);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4003);
		}
		if (targetEditPart instanceof Attribute2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4003);
		}
		if (targetEditPart instanceof Attribute3EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4003);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4004);
		}
		if (targetEditPart instanceof Attribute2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4004);
		}
		if (targetEditPart instanceof Attribute3EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4004);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4005);
		}
		if (targetEditPart instanceof Attribute2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4005);
		}
		if (targetEditPart instanceof Attribute3EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4005);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4006);
		}
		if (targetEditPart instanceof Attribute2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4006);
		}
		if (targetEditPart instanceof Attribute3EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4006);
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
		return doGetTypesForTarget((EntityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(EntityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.Connection_Entity2Relationship_4020) {
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4002) {
			types.add(EntityRelationshipElementTypes.Attribute_2006);
			types.add(EntityRelationshipElementTypes.Attribute_2007);
			types.add(EntityRelationshipElementTypes.Attribute_2008);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4003) {
			types.add(EntityRelationshipElementTypes.Attribute_2006);
			types.add(EntityRelationshipElementTypes.Attribute_2007);
			types.add(EntityRelationshipElementTypes.Attribute_2008);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4004) {
			types.add(EntityRelationshipElementTypes.Attribute_2006);
			types.add(EntityRelationshipElementTypes.Attribute_2007);
			types.add(EntityRelationshipElementTypes.Attribute_2008);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4005) {
			types.add(EntityRelationshipElementTypes.Attribute_2006);
			types.add(EntityRelationshipElementTypes.Attribute_2007);
			types.add(EntityRelationshipElementTypes.Attribute_2008);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_With_Attribute_4006) {
			types.add(EntityRelationshipElementTypes.Attribute_2006);
			types.add(EntityRelationshipElementTypes.Attribute_2007);
			types.add(EntityRelationshipElementTypes.Attribute_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EntityEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(EntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EntityRelationshipElementTypes.Connection_Generalization_Entity_4019);
		types.add(EntityRelationshipElementTypes.Connection_Relationship2Entity_4021);
		types.add(EntityRelationshipElementTypes.GeneralizationSuperclass_4017);
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EntityEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(EntityEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.Connection_Generalization_Entity_4019) {
			types.add(EntityRelationshipElementTypes.Generalization_2019);
			types.add(EntityRelationshipElementTypes.Generalization_2020);
			types.add(EntityRelationshipElementTypes.Generalization_2021);
			types.add(EntityRelationshipElementTypes.Generalization_2022);
		} else if (relationshipType == EntityRelationshipElementTypes.Connection_Relationship2Entity_4021) {
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.GeneralizationSuperclass_4017) {
			types.add(EntityRelationshipElementTypes.Generalization_2019);
			types.add(EntityRelationshipElementTypes.Generalization_2020);
			types.add(EntityRelationshipElementTypes.Generalization_2021);
			types.add(EntityRelationshipElementTypes.Generalization_2022);
		}
		return types;
	}

}
