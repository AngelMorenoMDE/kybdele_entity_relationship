package entityrelationship.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import entityrelationship.EntityrelationshipPackage;
import entityrelationship.diagram.edit.parts.Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeAttributes_compositesEditPart;
import entityrelationship.diagram.edit.parts.AttributeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeEditPart;
import entityrelationship.diagram.edit.parts.Connection_ConnectionEntityRelationship2AttributeEditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_RestrictionEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipEditPart;
import entityrelationship.diagram.edit.parts.Connection_Generalization_EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute3EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute4EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute5EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_AttributeEditPart;
import entityrelationship.diagram.edit.parts.Entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityEditPart;
import entityrelationship.diagram.edit.parts.Entity_Relationship_ModelEditPart;
import entityrelationship.diagram.edit.parts.Generalization2EditPart;
import entityrelationship.diagram.edit.parts.Generalization3EditPart;
import entityrelationship.diagram.edit.parts.Generalization4EditPart;
import entityrelationship.diagram.edit.parts.GeneralizationEditPart;
import entityrelationship.diagram.edit.parts.GeneralizationSuperclassEditPart;
import entityrelationship.diagram.edit.parts.Relationship2EditPart;
import entityrelationship.diagram.edit.parts.Relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipEditPart;
import entityrelationship.diagram.edit.parts.Relationships_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Relationships_RestrictionEditPart;
import entityrelationship.diagram.part.EntityRelationshipDiagramEditorPlugin;

/**
 * @generated
 */
public class EntityRelationshipElementTypes {

	/**
	 * @generated
	 */
	private EntityRelationshipElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			EntityRelationshipDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Entity_Relationship_Model_1000 = getElementType("gmf_entity_relationship_model.diagram.Entity_Relationship_Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2001 = getElementType("gmf_entity_relationship_model.diagram.Entity_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2002 = getElementType("gmf_entity_relationship_model.diagram.Entity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2009 = getElementType("gmf_entity_relationship_model.diagram.Relationship_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2010 = getElementType("gmf_entity_relationship_model.diagram.Relationship_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2011 = getElementType("gmf_entity_relationship_model.diagram.Relationship_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2006 = getElementType("gmf_entity_relationship_model.diagram.Attribute_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2007 = getElementType("gmf_entity_relationship_model.diagram.Attribute_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2008 = getElementType("gmf_entity_relationship_model.diagram.Attribute_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_Composite_2013 = getElementType("gmf_entity_relationship_model.diagram.Attribute_Composite_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_2019 = getElementType("gmf_entity_relationship_model.diagram.Generalization_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_2020 = getElementType("gmf_entity_relationship_model.diagram.Generalization_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_2021 = getElementType("gmf_entity_relationship_model.diagram.Generalization_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_2022 = getElementType("gmf_entity_relationship_model.diagram.Generalization_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_Generalization_Entity_4019 = getElementType("gmf_entity_relationship_model.diagram.Connection_Generalization_Entity_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_Relationship2Entity_4021 = getElementType("gmf_entity_relationship_model.diagram.Connection_Relationship2Entity_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_Entity2Relationship_4020 = getElementType("gmf_entity_relationship_model.diagram.Connection_Entity2Relationship_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_With_Attribute_4002 = getElementType("gmf_entity_relationship_model.diagram.Connection_With_Attribute_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_With_Attribute_4003 = getElementType("gmf_entity_relationship_model.diagram.Connection_With_Attribute_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_With_Attribute_4004 = getElementType("gmf_entity_relationship_model.diagram.Connection_With_Attribute_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_With_Attribute_4005 = getElementType("gmf_entity_relationship_model.diagram.Connection_With_Attribute_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_With_Attribute_4006 = getElementType("gmf_entity_relationship_model.diagram.Connection_With_Attribute_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationships_Restriction_4007 = getElementType("gmf_entity_relationship_model.diagram.Relationships_Restriction_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationships_Restriction_4008 = getElementType("gmf_entity_relationship_model.diagram.Relationships_Restriction_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeAttributes_composites_4009 = getElementType("gmf_entity_relationship_model.diagram.AttributeAttributes_composites_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_E_R_Restriction_4012 = getElementType("gmf_entity_relationship_model.diagram.Connection_E_R_Restriction_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_E_R_Restriction_4013 = getElementType("gmf_entity_relationship_model.diagram.Connection_E_R_Restriction_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneralizationSuperclass_4017 = getElementType("gmf_entity_relationship_model.diagram.GeneralizationSuperclass_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_ConnectionEntityRelationship2Attribute_4022 = getElementType("gmf_entity_relationship_model.diagram.Connection_ConnectionEntityRelationship2Attribute_4022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Entity_Relationship_Model_1000,
					EntityrelationshipPackage.eINSTANCE
							.getEntity_Relationship_Model());

			elements.put(Entity_2001,
					EntityrelationshipPackage.eINSTANCE.getEntity());

			elements.put(Entity_2002,
					EntityrelationshipPackage.eINSTANCE.getEntity());

			elements.put(Relationship_2009,
					EntityrelationshipPackage.eINSTANCE.getRelationship());

			elements.put(Relationship_2010,
					EntityrelationshipPackage.eINSTANCE.getRelationship());

			elements.put(Relationship_2011,
					EntityrelationshipPackage.eINSTANCE.getRelationship());

			elements.put(Attribute_2006,
					EntityrelationshipPackage.eINSTANCE.getAttribute());

			elements.put(Attribute_2007,
					EntityrelationshipPackage.eINSTANCE.getAttribute());

			elements.put(Attribute_2008,
					EntityrelationshipPackage.eINSTANCE.getAttribute());

			elements.put(Attribute_Composite_2013,
					EntityrelationshipPackage.eINSTANCE
							.getAttribute_Composite());

			elements.put(Generalization_2019,
					EntityrelationshipPackage.eINSTANCE.getGeneralization());

			elements.put(Generalization_2020,
					EntityrelationshipPackage.eINSTANCE.getGeneralization());

			elements.put(Generalization_2021,
					EntityrelationshipPackage.eINSTANCE.getGeneralization());

			elements.put(Generalization_2022,
					EntityrelationshipPackage.eINSTANCE.getGeneralization());

			elements.put(Connection_Generalization_Entity_4019,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_Generalization_Entity());

			elements.put(Connection_Relationship2Entity_4021,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_Relationship2Entity());

			elements.put(Connection_Entity2Relationship_4020,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_Entity2Relationship());

			elements.put(Connection_With_Attribute_4002,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute());

			elements.put(Connection_With_Attribute_4003,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute());

			elements.put(Connection_With_Attribute_4004,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute());

			elements.put(Connection_With_Attribute_4005,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute());

			elements.put(Connection_With_Attribute_4006,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute());

			elements.put(Relationships_Restriction_4007,
					EntityrelationshipPackage.eINSTANCE
							.getRelationships_Restriction());

			elements.put(Relationships_Restriction_4008,
					EntityrelationshipPackage.eINSTANCE
							.getRelationships_Restriction());

			elements.put(AttributeAttributes_composites_4009,
					EntityrelationshipPackage.eINSTANCE
							.getAttribute_Attributes_composites());

			elements.put(Connection_E_R_Restriction_4012,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_E_R_Restriction());

			elements.put(Connection_E_R_Restriction_4013,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_E_R_Restriction());

			elements.put(GeneralizationSuperclass_4017,
					EntityrelationshipPackage.eINSTANCE
							.getGeneralization_Superclass());

			elements.put(
					Connection_ConnectionEntityRelationship2Attribute_4022,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_ConnectionEntityRelationship2Attribute());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Entity_Relationship_Model_1000);
			KNOWN_ELEMENT_TYPES.add(Entity_2001);
			KNOWN_ELEMENT_TYPES.add(Entity_2002);
			KNOWN_ELEMENT_TYPES.add(Relationship_2009);
			KNOWN_ELEMENT_TYPES.add(Relationship_2010);
			KNOWN_ELEMENT_TYPES.add(Relationship_2011);
			KNOWN_ELEMENT_TYPES.add(Attribute_2006);
			KNOWN_ELEMENT_TYPES.add(Attribute_2007);
			KNOWN_ELEMENT_TYPES.add(Attribute_2008);
			KNOWN_ELEMENT_TYPES.add(Attribute_Composite_2013);
			KNOWN_ELEMENT_TYPES.add(Generalization_2019);
			KNOWN_ELEMENT_TYPES.add(Generalization_2020);
			KNOWN_ELEMENT_TYPES.add(Generalization_2021);
			KNOWN_ELEMENT_TYPES.add(Generalization_2022);
			KNOWN_ELEMENT_TYPES.add(Connection_Generalization_Entity_4019);
			KNOWN_ELEMENT_TYPES.add(Connection_Relationship2Entity_4021);
			KNOWN_ELEMENT_TYPES.add(Connection_Entity2Relationship_4020);
			KNOWN_ELEMENT_TYPES.add(Connection_With_Attribute_4002);
			KNOWN_ELEMENT_TYPES.add(Connection_With_Attribute_4003);
			KNOWN_ELEMENT_TYPES.add(Connection_With_Attribute_4004);
			KNOWN_ELEMENT_TYPES.add(Connection_With_Attribute_4005);
			KNOWN_ELEMENT_TYPES.add(Connection_With_Attribute_4006);
			KNOWN_ELEMENT_TYPES.add(Relationships_Restriction_4007);
			KNOWN_ELEMENT_TYPES.add(Relationships_Restriction_4008);
			KNOWN_ELEMENT_TYPES.add(AttributeAttributes_composites_4009);
			KNOWN_ELEMENT_TYPES.add(Connection_E_R_Restriction_4012);
			KNOWN_ELEMENT_TYPES.add(Connection_E_R_Restriction_4013);
			KNOWN_ELEMENT_TYPES.add(GeneralizationSuperclass_4017);
			KNOWN_ELEMENT_TYPES
					.add(Connection_ConnectionEntityRelationship2Attribute_4022);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			return Entity_Relationship_Model_1000;
		case EntityEditPart.VISUAL_ID:
			return Entity_2001;
		case Entity2EditPart.VISUAL_ID:
			return Entity_2002;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2009;
		case Relationship2EditPart.VISUAL_ID:
			return Relationship_2010;
		case Relationship3EditPart.VISUAL_ID:
			return Relationship_2011;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_2006;
		case Attribute2EditPart.VISUAL_ID:
			return Attribute_2007;
		case Attribute3EditPart.VISUAL_ID:
			return Attribute_2008;
		case Attribute_CompositeEditPart.VISUAL_ID:
			return Attribute_Composite_2013;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_2019;
		case Generalization2EditPart.VISUAL_ID:
			return Generalization_2020;
		case Generalization3EditPart.VISUAL_ID:
			return Generalization_2021;
		case Generalization4EditPart.VISUAL_ID:
			return Generalization_2022;
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			return Connection_Generalization_Entity_4019;
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return Connection_Relationship2Entity_4021;
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return Connection_Entity2Relationship_4020;
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return Connection_With_Attribute_4002;
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return Connection_With_Attribute_4003;
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return Connection_With_Attribute_4004;
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return Connection_With_Attribute_4005;
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return Connection_With_Attribute_4006;
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return Relationships_Restriction_4007;
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return Relationships_Restriction_4008;
		case AttributeAttributes_compositesEditPart.VISUAL_ID:
			return AttributeAttributes_composites_4009;
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return Connection_E_R_Restriction_4012;
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return Connection_E_R_Restriction_4013;
		case GeneralizationSuperclassEditPart.VISUAL_ID:
			return GeneralizationSuperclass_4017;
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return Connection_ConnectionEntityRelationship2Attribute_4022;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		
		public boolean isKnownElementType(IElementType elementType) {
			return entityrelationship.diagram.providers.EntityRelationshipElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		
		public IElementType getElementTypeForVisualId(int visualID) {
			return entityrelationship.diagram.providers.EntityRelationshipElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return entityrelationship.diagram.providers.EntityRelationshipElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
