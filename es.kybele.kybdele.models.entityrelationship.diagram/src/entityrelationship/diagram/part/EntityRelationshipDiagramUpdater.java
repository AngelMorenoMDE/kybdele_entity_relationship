package entityrelationship.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Elements_with_Attributes;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
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
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class EntityRelationshipDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EntityRelationshipNodeDescriptor> getSemanticChildren(
			View view) {
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			return getEntity_Relationship_Model_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipNodeDescriptor> getEntity_Relationship_Model_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Entity_Relationship_Model modelElement = (Entity_Relationship_Model) view
				.getElement();
		LinkedList<EntityRelationshipNodeDescriptor> result = new LinkedList<EntityRelationshipNodeDescriptor>();
		for (Iterator<?> it = modelElement.getERM_Has_E().iterator(); it
				.hasNext();) {
			Elements_with_Attributes childElement = (Elements_with_Attributes) it
					.next();
			int visualID = EntityRelationshipVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Entity2EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RelationshipEditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Relationship2EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Relationship3EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getERM_Has_At().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = EntityRelationshipVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Attribute2EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Attribute3EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getERM_Has_G().iterator(); it
				.hasNext();) {
			Generalization childElement = (Generalization) it.next();
			int visualID = EntityRelationshipVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == GeneralizationEditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Generalization2EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Generalization3EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Generalization4EditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (EntityRelationshipVisualIDRegistry.getNodeVisualID(view,
					childElement) == Attribute_CompositeEditPart.VISUAL_ID) {
				result.add(new EntityRelationshipNodeDescriptor(childElement,
						Attribute_CompositeEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getContainedLinks(
			View view) {
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			return getEntity_Relationship_Model_1000ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001ContainedLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_2002ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2009ContainedLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_2010ContainedLinks(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_2011ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2006ContainedLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2007ContainedLinks(view);
		case Attribute3EditPart.VISUAL_ID:
			return getAttribute_2008ContainedLinks(view);
		case Attribute_CompositeEditPart.VISUAL_ID:
			return getAttribute_Composite_2013ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2019ContainedLinks(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_2020ContainedLinks(view);
		case Generalization3EditPart.VISUAL_ID:
			return getGeneralization_2021ContainedLinks(view);
		case Generalization4EditPart.VISUAL_ID:
			return getGeneralization_2022ContainedLinks(view);
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			return getConnection_Generalization_Entity_4019ContainedLinks(view);
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return getConnection_Relationship2Entity_4021ContainedLinks(view);
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return getConnection_Entity2Relationship_4020ContainedLinks(view);
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return getConnection_With_Attribute_4002ContainedLinks(view);
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4003ContainedLinks(view);
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4004ContainedLinks(view);
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4005ContainedLinks(view);
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4006ContainedLinks(view);
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return getRelationships_Restriction_4007ContainedLinks(view);
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return getRelationships_Restriction_4008ContainedLinks(view);
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4012ContainedLinks(view);
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4013ContainedLinks(view);
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getConnection_ConnectionEntityRelationship2Attribute_4022ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getIncomingLinks(
			View view) {
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001IncomingLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_2002IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2009IncomingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_2010IncomingLinks(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_2011IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2006IncomingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2007IncomingLinks(view);
		case Attribute3EditPart.VISUAL_ID:
			return getAttribute_2008IncomingLinks(view);
		case Attribute_CompositeEditPart.VISUAL_ID:
			return getAttribute_Composite_2013IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2019IncomingLinks(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_2020IncomingLinks(view);
		case Generalization3EditPart.VISUAL_ID:
			return getGeneralization_2021IncomingLinks(view);
		case Generalization4EditPart.VISUAL_ID:
			return getGeneralization_2022IncomingLinks(view);
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			return getConnection_Generalization_Entity_4019IncomingLinks(view);
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return getConnection_Relationship2Entity_4021IncomingLinks(view);
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return getConnection_Entity2Relationship_4020IncomingLinks(view);
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return getConnection_With_Attribute_4002IncomingLinks(view);
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4003IncomingLinks(view);
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4004IncomingLinks(view);
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4005IncomingLinks(view);
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4006IncomingLinks(view);
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return getRelationships_Restriction_4007IncomingLinks(view);
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return getRelationships_Restriction_4008IncomingLinks(view);
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4012IncomingLinks(view);
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4013IncomingLinks(view);
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getConnection_ConnectionEntityRelationship2Attribute_4022IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001OutgoingLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_2002OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2009OutgoingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_2010OutgoingLinks(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_2011OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2006OutgoingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2007OutgoingLinks(view);
		case Attribute3EditPart.VISUAL_ID:
			return getAttribute_2008OutgoingLinks(view);
		case Attribute_CompositeEditPart.VISUAL_ID:
			return getAttribute_Composite_2013OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2019OutgoingLinks(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_2020OutgoingLinks(view);
		case Generalization3EditPart.VISUAL_ID:
			return getGeneralization_2021OutgoingLinks(view);
		case Generalization4EditPart.VISUAL_ID:
			return getGeneralization_2022OutgoingLinks(view);
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			return getConnection_Generalization_Entity_4019OutgoingLinks(view);
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return getConnection_Relationship2Entity_4021OutgoingLinks(view);
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return getConnection_Entity2Relationship_4020OutgoingLinks(view);
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return getConnection_With_Attribute_4002OutgoingLinks(view);
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4003OutgoingLinks(view);
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4004OutgoingLinks(view);
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4005OutgoingLinks(view);
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4006OutgoingLinks(view);
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return getRelationships_Restriction_4007OutgoingLinks(view);
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return getRelationships_Restriction_4008OutgoingLinks(view);
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4012OutgoingLinks(view);
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4013OutgoingLinks(view);
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getConnection_ConnectionEntityRelationship2Attribute_4022OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_Relationship_Model_1000ContainedLinks(
			View view) {
		Entity_Relationship_Model modelElement = (Entity_Relationship_Model) view
				.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_Generalization_Entity_4019(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_Relationship2Entity_4021(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_Entity2Relationship_4020(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_With_Attribute_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_With_Attribute_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_With_Attribute_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_With_Attribute_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_With_Attribute_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relationships_Restriction_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relationships_Restriction_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_E_R_Restriction_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_E_R_Restriction_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2006ContainedLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2007ContainedLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2008ContainedLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_Composite_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2019ContainedLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2020ContainedLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2021ContainedLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2022ContainedLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Generalization_Entity_4019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Relationship2Entity_4021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Entity2Relationship_4020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationships_Restriction_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationships_Restriction_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_E_R_Restriction_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_E_R_Restriction_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_ConnectionEntityRelationship2Attribute_4022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_2001IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Generalization_Entity_4019(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Relationship2Entity_4021(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_Superclass_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_2002IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Generalization_Entity_4019(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Relationship2Entity_4021(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_Superclass_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2009IncomingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Entity2Relationship_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationships_Restriction_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationships_Restriction_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2010IncomingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Entity2Relationship_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationships_Restriction_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationships_Restriction_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2011IncomingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_Entity2Relationship_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationships_Restriction_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationships_Restriction_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2006IncomingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2007IncomingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2008IncomingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_With_Attribute_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_Composite_2013IncomingLinks(
			View view) {
		Attribute_Composite modelElement = (Attribute_Composite) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Generalization_Entity_4019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Relationship2Entity_4021IncomingLinks(
			View view) {
		Connection_Relationship2Entity modelElement = (Connection_Relationship2Entity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_E_R_Restriction_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_E_R_Restriction_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Entity2Relationship_4020IncomingLinks(
			View view) {
		Connection_Entity2Relationship modelElement = (Connection_Entity2Relationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_E_R_Restriction_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Connection_E_R_Restriction_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationships_Restriction_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationships_Restriction_4008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_E_R_Restriction_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_E_R_Restriction_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_ConnectionEntityRelationship2Attribute_4022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_2001OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Entity2Relationship_4020(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getEntity_2002OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Entity2Relationship_4020(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2009OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Relationship2Entity_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationships_Restriction_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationships_Restriction_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2010OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Relationship2Entity_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationships_Restriction_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationships_Restriction_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationship_2011OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Relationship2Entity_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationships_Restriction_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationships_Restriction_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2006OutgoingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2007OutgoingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_2008OutgoingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getAttribute_Composite_2013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2019OutgoingLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Generalization_Entity_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2020OutgoingLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Generalization_Entity_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2021OutgoingLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Generalization_Entity_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getGeneralization_2022OutgoingLinks(
			View view) {
		Generalization modelElement = (Generalization) view.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_Generalization_Entity_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Generalization_Entity_4019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Relationship2Entity_4021OutgoingLinks(
			View view) {
		Connection_Relationship2Entity modelElement = (Connection_Relationship2Entity) view
				.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_E_R_Restriction_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_E_R_Restriction_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_Entity2Relationship_4020OutgoingLinks(
			View view) {
		Connection_Entity2Relationship modelElement = (Connection_Entity2Relationship) view
				.getElement();
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_E_R_Restriction_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_E_R_Restriction_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_With_Attribute_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationships_Restriction_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getRelationships_Restriction_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_E_R_Restriction_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_E_R_Restriction_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EntityRelationshipLinkDescriptor> getConnection_ConnectionEntityRelationship2Attribute_4022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_Generalization_Entity_4019(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Gen().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_Generalization_Entity) {
				continue;
			}
			Connection_Generalization_Entity link = (Connection_Generalization_Entity) linkObject;
			if (Connection_Generalization_EntityEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getConnection_Entity();
			Generalization src = link.getConnection_Generalization();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_Generalization_Entity_4019,
					Connection_Generalization_EntityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_Relationship2Entity_4021(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container
				.getERM_Has_ConnectionRelationship2Entity().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_Relationship2Entity) {
				continue;
			}
			Connection_Relationship2Entity link = (Connection_Relationship2Entity) linkObject;
			if (Connection_Relationship2EntityEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTarget_entity();
			Relationship src = link.getSource_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_Relationship2Entity_4021,
					Connection_Relationship2EntityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_Entity2Relationship_4020(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container
				.getERM_Has_ConnectionEntity2Relationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_Entity2Relationship) {
				continue;
			}
			Connection_Entity2Relationship link = (Connection_Entity2Relationship) linkObject;
			if (Connection_Entity2RelationshipEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget_relationship();
			Entity src = link.getSource_entity();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_Entity2Relationship_4020,
					Connection_Entity2RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_With_Attribute_4002(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_AttributeEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4002,
					Connection_With_AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_With_Attribute_4003(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4003,
					Connection_With_Attribute2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_With_Attribute_4004(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute3EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4004,
					Connection_With_Attribute3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_With_Attribute_4005(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute4EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4005,
					Connection_With_Attribute4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_With_Attribute_4006(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute5EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4006,
					Connection_With_Attribute5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Relationships_Restriction_4007(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationships_Restriction) {
				continue;
			}
			Relationships_Restriction link = (Relationships_Restriction) linkObject;
			if (Relationships_RestrictionEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget_relationship();
			Relationship src = link.getSource_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Relationships_Restriction_4007,
					Relationships_RestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Relationships_Restriction_4008(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationships_Restriction) {
				continue;
			}
			Relationships_Restriction link = (Relationships_Restriction) linkObject;
			if (Relationships_Restriction2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget_relationship();
			Relationship src = link.getSource_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Relationships_Restriction_4008,
					Relationships_Restriction2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_E_R_Restriction_4012(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt2().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_E_R_Restriction) {
				continue;
			}
			Connection_E_R_Restriction link = (Connection_E_R_Restriction) linkObject;
			if (Connection_E_R_RestrictionEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship dst = link
					.getConnection_target_entity_relationship();
			Connection_EntityRelationship src = link
					.getConnection_source_entity_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_E_R_Restriction_4012,
					Connection_E_R_RestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_E_R_Restriction_4013(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt2().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_E_R_Restriction) {
				continue;
			}
			Connection_E_R_Restriction link = (Connection_E_R_Restriction) linkObject;
			if (Connection_E_R_Restriction2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship dst = link
					.getConnection_target_entity_relationship();
			Connection_EntityRelationship src = link
					.getConnection_source_entity_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_E_R_Restriction_4013,
					Connection_E_R_Restriction2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getContainedTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(
			Entity_Relationship_Model container) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container
				.getERM_HasConnectionEntityRelationship2Attribute().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_ConnectionEntityRelationship2Attribute) {
				continue;
			}
			Connection_ConnectionEntityRelationship2Attribute link = (Connection_ConnectionEntityRelationship2Attribute) linkObject;
			if (Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getTarget_attribute();
			Connection_EntityRelationship src = link.getSource_connection();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022,
					Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_Generalization_Entity_4019(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_Generalization_Entity_Connection_Entity()
					|| false == setting.getEObject() instanceof Connection_Generalization_Entity) {
				continue;
			}
			Connection_Generalization_Entity link = (Connection_Generalization_Entity) setting
					.getEObject();
			if (Connection_Generalization_EntityEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Generalization src = link.getConnection_Generalization();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_Generalization_Entity_4019,
					Connection_Generalization_EntityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_Relationship2Entity_4021(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_Relationship2Entity_Target_entity()
					|| false == setting.getEObject() instanceof Connection_Relationship2Entity) {
				continue;
			}
			Connection_Relationship2Entity link = (Connection_Relationship2Entity) setting
					.getEObject();
			if (Connection_Relationship2EntityEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship src = link.getSource_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_Relationship2Entity_4021,
					Connection_Relationship2EntityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_Entity2Relationship_4020(
			Relationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_Entity2Relationship_Target_relationship()
					|| false == setting.getEObject() instanceof Connection_Entity2Relationship) {
				continue;
			}
			Connection_Entity2Relationship link = (Connection_Entity2Relationship) setting
					.getEObject();
			if (Connection_Entity2RelationshipEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity src = link.getSource_entity();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_Entity2Relationship_4020,
					Connection_Entity2RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_With_Attribute_4002(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_With_Attribute_Connection_attribute()
					|| false == setting.getEObject() instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) setting
					.getEObject();
			if (Connection_With_AttributeEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4002,
					Connection_With_AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_With_Attribute_4003(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_With_Attribute_Connection_attribute()
					|| false == setting.getEObject() instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) setting
					.getEObject();
			if (Connection_With_Attribute2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4003,
					Connection_With_Attribute2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_With_Attribute_4004(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_With_Attribute_Connection_attribute()
					|| false == setting.getEObject() instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) setting
					.getEObject();
			if (Connection_With_Attribute3EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4004,
					Connection_With_Attribute3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_With_Attribute_4005(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_With_Attribute_Connection_attribute()
					|| false == setting.getEObject() instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) setting
					.getEObject();
			if (Connection_With_Attribute4EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4005,
					Connection_With_Attribute4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_With_Attribute_4006(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_With_Attribute_Connection_attribute()
					|| false == setting.getEObject() instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) setting
					.getEObject();
			if (Connection_With_Attribute5EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements_with_Attributes src = link.getElement();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4006,
					Connection_With_Attribute5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Relationships_Restriction_4007(
			Relationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getRelationships_Restriction_Target_relationship()
					|| false == setting.getEObject() instanceof Relationships_Restriction) {
				continue;
			}
			Relationships_Restriction link = (Relationships_Restriction) setting
					.getEObject();
			if (Relationships_RestrictionEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship src = link.getSource_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Relationships_Restriction_4007,
					Relationships_RestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Relationships_Restriction_4008(
			Relationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getRelationships_Restriction_Target_relationship()
					|| false == setting.getEObject() instanceof Relationships_Restriction) {
				continue;
			}
			Relationships_Restriction link = (Relationships_Restriction) setting
					.getEObject();
			if (Relationships_Restriction2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship src = link.getSource_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Relationships_Restriction_4008,
					Relationships_Restriction2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(
			Attribute_Composite target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EntityrelationshipPackage.eINSTANCE
					.getAttribute_Attributes_composites()) {
				result.add(new EntityRelationshipLinkDescriptor(
						setting.getEObject(),
						target,
						EntityRelationshipElementTypes.AttributeAttributes_composites_4009,
						AttributeAttributes_compositesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_E_R_Restriction_4012(
			Connection_EntityRelationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_E_R_Restriction_Connection_target_entity_relationship()
					|| false == setting.getEObject() instanceof Connection_E_R_Restriction) {
				continue;
			}
			Connection_E_R_Restriction link = (Connection_E_R_Restriction) setting
					.getEObject();
			if (Connection_E_R_RestrictionEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship src = link
					.getConnection_source_entity_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_E_R_Restriction_4012,
					Connection_E_R_RestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_E_R_Restriction_4013(
			Connection_EntityRelationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_E_R_Restriction_Connection_target_entity_relationship()
					|| false == setting.getEObject() instanceof Connection_E_R_Restriction) {
				continue;
			}
			Connection_E_R_Restriction link = (Connection_E_R_Restriction) setting
					.getEObject();
			if (Connection_E_R_Restriction2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship src = link
					.getConnection_source_entity_relationship();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_E_R_Restriction_4013,
					Connection_E_R_Restriction2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingFeatureModelFacetLinks_Generalization_Superclass_4017(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EntityrelationshipPackage.eINSTANCE
					.getGeneralization_Superclass()) {
				result.add(new EntityRelationshipLinkDescriptor(
						setting.getEObject(),
						target,
						EntityRelationshipElementTypes.GeneralizationSuperclass_4017,
						GeneralizationSuperclassEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(
			Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EntityrelationshipPackage.eINSTANCE
					.getConnection_ConnectionEntityRelationship2Attribute_Target_attribute()
					|| false == setting.getEObject() instanceof Connection_ConnectionEntityRelationship2Attribute) {
				continue;
			}
			Connection_ConnectionEntityRelationship2Attribute link = (Connection_ConnectionEntityRelationship2Attribute) setting
					.getEObject();
			if (Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship src = link.getSource_connection();
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					target,
					link,
					EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022,
					Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_Generalization_Entity_4019(
			Generalization source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Gen().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_Generalization_Entity) {
				continue;
			}
			Connection_Generalization_Entity link = (Connection_Generalization_Entity) linkObject;
			if (Connection_Generalization_EntityEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getConnection_Entity();
			Generalization src = link.getConnection_Generalization();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_Generalization_Entity_4019,
					Connection_Generalization_EntityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_Relationship2Entity_4021(
			Relationship source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container
				.getERM_Has_ConnectionRelationship2Entity().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_Relationship2Entity) {
				continue;
			}
			Connection_Relationship2Entity link = (Connection_Relationship2Entity) linkObject;
			if (Connection_Relationship2EntityEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTarget_entity();
			Relationship src = link.getSource_relationship();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_Relationship2Entity_4021,
					Connection_Relationship2EntityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_Entity2Relationship_4020(
			Entity source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container
				.getERM_Has_ConnectionEntity2Relationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_Entity2Relationship) {
				continue;
			}
			Connection_Entity2Relationship link = (Connection_Entity2Relationship) linkObject;
			if (Connection_Entity2RelationshipEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget_relationship();
			Entity src = link.getSource_entity();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_Entity2Relationship_4020,
					Connection_Entity2RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4002(
			Elements_with_Attributes source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_AttributeEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4002,
					Connection_With_AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4003(
			Elements_with_Attributes source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4003,
					Connection_With_Attribute2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4004(
			Elements_with_Attributes source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute3EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4004,
					Connection_With_Attribute3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4005(
			Elements_with_Attributes source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute4EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4005,
					Connection_With_Attribute4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_With_Attribute_4006(
			Elements_with_Attributes source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_CEA().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_With_Attribute) {
				continue;
			}
			Connection_With_Attribute link = (Connection_With_Attribute) linkObject;
			if (Connection_With_Attribute5EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getConnection_attribute();
			Elements_with_Attributes src = link.getElement();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_With_Attribute_4006,
					Connection_With_Attribute5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Relationships_Restriction_4007(
			Relationship source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationships_Restriction) {
				continue;
			}
			Relationships_Restriction link = (Relationships_Restriction) linkObject;
			if (Relationships_RestrictionEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget_relationship();
			Relationship src = link.getSource_relationship();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Relationships_Restriction_4007,
					Relationships_RestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Relationships_Restriction_4008(
			Relationship source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationships_Restriction) {
				continue;
			}
			Relationships_Restriction link = (Relationships_Restriction) linkObject;
			if (Relationships_Restriction2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Relationship dst = link.getTarget_relationship();
			Relationship src = link.getSource_relationship();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Relationships_Restriction_4008,
					Relationships_Restriction2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingFeatureModelFacetLinks_Attribute_Attributes_composites_4009(
			Attribute source) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> destinations = source.getAttributes_composites()
				.iterator(); destinations.hasNext();) {
			Attribute_Composite destination = (Attribute_Composite) destinations
					.next();
			result.add(new EntityRelationshipLinkDescriptor(
					source,
					destination,
					EntityRelationshipElementTypes.AttributeAttributes_composites_4009,
					AttributeAttributes_compositesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_E_R_Restriction_4012(
			Connection_EntityRelationship source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt2().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_E_R_Restriction) {
				continue;
			}
			Connection_E_R_Restriction link = (Connection_E_R_Restriction) linkObject;
			if (Connection_E_R_RestrictionEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship dst = link
					.getConnection_target_entity_relationship();
			Connection_EntityRelationship src = link
					.getConnection_source_entity_relationship();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_E_R_Restriction_4012,
					Connection_E_R_RestrictionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_E_R_Restriction_4013(
			Connection_EntityRelationship source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container.getERM_Has_Rt2().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_E_R_Restriction) {
				continue;
			}
			Connection_E_R_Restriction link = (Connection_E_R_Restriction) linkObject;
			if (Connection_E_R_Restriction2EditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connection_EntityRelationship dst = link
					.getConnection_target_entity_relationship();
			Connection_EntityRelationship src = link
					.getConnection_source_entity_relationship();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_E_R_Restriction_4013,
					Connection_E_R_Restriction2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingFeatureModelFacetLinks_Generalization_Superclass_4017(
			Generalization source) {
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		Entity destination = source.getSuperclass();
		if (destination == null) {
			return result;
		}
		result.add(new EntityRelationshipLinkDescriptor(source, destination,
				EntityRelationshipElementTypes.GeneralizationSuperclass_4017,
				GeneralizationSuperclassEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EntityRelationshipLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_ConnectionEntityRelationship2Attribute_4022(
			Connection_EntityRelationship source) {
		Entity_Relationship_Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Entity_Relationship_Model) {
				container = (Entity_Relationship_Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EntityRelationshipLinkDescriptor> result = new LinkedList<EntityRelationshipLinkDescriptor>();
		for (Iterator<?> links = container
				.getERM_HasConnectionEntityRelationship2Attribute().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection_ConnectionEntityRelationship2Attribute) {
				continue;
			}
			Connection_ConnectionEntityRelationship2Attribute link = (Connection_ConnectionEntityRelationship2Attribute) linkObject;
			if (Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID != EntityRelationshipVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Attribute dst = link.getTarget_attribute();
			Connection_EntityRelationship src = link.getSource_connection();
			if (src != source) {
				continue;
			}
			result.add(new EntityRelationshipLinkDescriptor(
					src,
					dst,
					link,
					EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022,
					Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		
		public List<EntityRelationshipNodeDescriptor> getSemanticChildren(
				View view) {
			return EntityRelationshipDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		
		public List<EntityRelationshipLinkDescriptor> getContainedLinks(
				View view) {
			return EntityRelationshipDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		
		public List<EntityRelationshipLinkDescriptor> getIncomingLinks(View view) {
			return EntityRelationshipDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		
		public List<EntityRelationshipLinkDescriptor> getOutgoingLinks(View view) {
			return EntityRelationshipDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
