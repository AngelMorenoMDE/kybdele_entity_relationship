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
import entityrelationship.diagram.edit.parts.Entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityEditPart;
import entityrelationship.diagram.edit.parts.Relationship2EditPart;
import entityrelationship.diagram.edit.parts.Relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipEditPart;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;
import entityrelationship.diagram.providers.EntityRelationshipModelingAssistantProvider;

/**
 * @generated
 */
public class EntityRelationshipModelingAssistantProviderOfRelationship3EditPart
		extends EntityRelationshipModelingAssistantProvider {

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Relationship3EditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(Relationship3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(EntityRelationshipElementTypes.Connection_Relationship2Entity_4021);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4002);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4003);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4004);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4005);
		types.add(EntityRelationshipElementTypes.Connection_With_Attribute_4006);
		types.add(EntityRelationshipElementTypes.Relationships_Restriction_4007);
		types.add(EntityRelationshipElementTypes.Relationships_Restriction_4008);
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
				(Relationship3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Relationship3EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntityEditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Relationship2Entity_4021);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(EntityRelationshipElementTypes.Connection_Relationship2Entity_4021);
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
		if (targetEditPart instanceof RelationshipEditPart) {
			types.add(EntityRelationshipElementTypes.Relationships_Restriction_4007);
		}
		if (targetEditPart instanceof Relationship2EditPart) {
			types.add(EntityRelationshipElementTypes.Relationships_Restriction_4007);
		}
		if (targetEditPart instanceof Relationship3EditPart) {
			types.add(EntityRelationshipElementTypes.Relationships_Restriction_4007);
		}
		if (targetEditPart instanceof RelationshipEditPart) {
			types.add(EntityRelationshipElementTypes.Relationships_Restriction_4008);
		}
		if (targetEditPart instanceof Relationship2EditPart) {
			types.add(EntityRelationshipElementTypes.Relationships_Restriction_4008);
		}
		if (targetEditPart instanceof Relationship3EditPart) {
			types.add(EntityRelationshipElementTypes.Relationships_Restriction_4008);
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
		return doGetTypesForTarget((Relationship3EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(Relationship3EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.Connection_Relationship2Entity_4021) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
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
		} else if (relationshipType == EntityRelationshipElementTypes.Relationships_Restriction_4007) {
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Relationships_Restriction_4008) {
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Relationship3EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(Relationship3EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
		types.add(EntityRelationshipElementTypes.Relationships_Restriction_4007);
		types.add(EntityRelationshipElementTypes.Relationships_Restriction_4008);
		return types;
	}

	/**
	 * @generated
	 */
	
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Relationship3EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(Relationship3EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EntityRelationshipElementTypes.Connection_Entity2Relationship_4020) {
			types.add(EntityRelationshipElementTypes.Entity_2001);
			types.add(EntityRelationshipElementTypes.Entity_2002);
		} else if (relationshipType == EntityRelationshipElementTypes.Relationships_Restriction_4007) {
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		} else if (relationshipType == EntityRelationshipElementTypes.Relationships_Restriction_4008) {
			types.add(EntityRelationshipElementTypes.Relationship_2009);
			types.add(EntityRelationshipElementTypes.Relationship_2010);
			types.add(EntityRelationshipElementTypes.Relationship_2011);
		}
		return types;
	}

}
