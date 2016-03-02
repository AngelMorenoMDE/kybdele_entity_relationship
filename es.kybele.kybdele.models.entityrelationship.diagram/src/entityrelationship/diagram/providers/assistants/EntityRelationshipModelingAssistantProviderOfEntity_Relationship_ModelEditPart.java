package entityrelationship.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entityrelationship.diagram.providers.EntityRelationshipElementTypes;
import entityrelationship.diagram.providers.EntityRelationshipModelingAssistantProvider;

/**
 * @generated
 */
public class EntityRelationshipModelingAssistantProviderOfEntity_Relationship_ModelEditPart
		extends EntityRelationshipModelingAssistantProvider {

	/**
	 * @generated
	 */
	
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(13);
		types.add(EntityRelationshipElementTypes.Entity_2001);
		types.add(EntityRelationshipElementTypes.Entity_2002);
		types.add(EntityRelationshipElementTypes.Relationship_2009);
		types.add(EntityRelationshipElementTypes.Relationship_2010);
		types.add(EntityRelationshipElementTypes.Relationship_2011);
		types.add(EntityRelationshipElementTypes.Attribute_2006);
		types.add(EntityRelationshipElementTypes.Attribute_2007);
		types.add(EntityRelationshipElementTypes.Attribute_2008);
		types.add(EntityRelationshipElementTypes.Attribute_Composite_2013);
		types.add(EntityRelationshipElementTypes.Generalization_2019);
		types.add(EntityRelationshipElementTypes.Generalization_2020);
		types.add(EntityRelationshipElementTypes.Generalization_2021);
		types.add(EntityRelationshipElementTypes.Generalization_2022);
		return types;
	}

}
