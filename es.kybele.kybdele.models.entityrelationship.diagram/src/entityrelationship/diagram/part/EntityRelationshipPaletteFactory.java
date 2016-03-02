package entityrelationship.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class EntityRelationshipPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEntities1Group());
		paletteRoot.add(createRelationships2Group());
		paletteRoot.add(createGeneralizations3Group());
		paletteRoot.add(createAttributes4Group());
		paletteRoot.add(createRelationshipRestrictions5Group());
		paletteRoot.add(createConnectionEntityRelationshipRestrictions6Group());
	}

	/**
	 * Creates "Entities" palette tool group
	 * @generated
	 */
	private PaletteContainer createEntities1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Entities1Group_title);
		paletteContainer.setId("createEntities1Group"); //$NON-NLS-1$
		paletteContainer.add(createRegularEntity1CreationTool());
		paletteContainer.add(createWeakEntity2CreationTool());
		paletteContainer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * Creates "Relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationships2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Relationships2Group_title);
		paletteContainer.setId("createRelationships2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Relationships2Group_desc);
		paletteContainer.add(createRegularRelationship1CreationTool());
		paletteContainer
				.add(createWeakRelationshipdependenceinexistence2CreationTool());
		paletteContainer
				.add(createWeakRelationshipdependenceinidentification3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConnectionEntityRelationship5CreationTool());
		paletteContainer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * Creates "Generalizations" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeneralizations3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Generalizations3Group_title);
		paletteContainer.setId("createGeneralizations3Group"); //$NON-NLS-1$
		paletteContainer
				.add(createGeneralizationPartialandOverlapped1CreationTool());
		paletteContainer
				.add(createGeneralizationTotalandOverlapped2CreationTool());
		paletteContainer
				.add(createGeneralizationPartialandExclusive3CreationTool());
		paletteContainer
				.add(createGeneralizationTotalandExclusive4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer
				.add(createConnectionSuperclassGeneralization6CreationTool());
		paletteContainer
				.add(createConnectionSubclassGeneralization7CreationTool());
		paletteContainer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * Creates "Attributes" palette tool group
	 * @generated
	 */
	private PaletteContainer createAttributes4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Attributes4Group_title);
		paletteContainer.setId("createAttributes4Group"); //$NON-NLS-1$
		paletteContainer.add(createPrimaryAttribute1CreationTool());
		paletteContainer.add(createAlternativeAttribute2CreationTool());
		paletteContainer.add(createNoIdentifierAttribute3CreationTool());
		paletteContainer.add(createCompositeAttribute4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConnectionNormalAttribute6CreationTool());
		paletteContainer.add(createConnectionOptionalAttribute7CreationTool());
		paletteContainer.add(createConnectionCompositeAttribute8CreationTool());
		paletteContainer.add(createConnectionDerivedAttribute9CreationTool());
		paletteContainer
				.add(createConnectionMultivaluedAttribute10CreationTool());
		paletteContainer
				.add(createConnectionDependenceinIdentificationAttribute11CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer
				.add(createSubconnectionCompositeAttribute13CreationTool());
		paletteContainer
				.add(createSubconnectionDependenceinidentification14CreationTool());
		paletteContainer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * Creates "Relationship Restrictions" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationshipRestrictions5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.RelationshipRestrictions5Group_title);
		paletteContainer.setId("createRelationshipRestrictions5Group"); //$NON-NLS-1$
		paletteContainer.add(createExclusion1CreationTool());
		paletteContainer.add(createInclusion2CreationTool());
		paletteContainer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * Creates "Connection Entity-Relationship Restrictions" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnectionEntityRelationshipRestrictions6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ConnectionEntityRelationshipRestrictions6Group_title);
		paletteContainer
				.setId("createConnectionEntityRelationshipRestrictions6Group"); //$NON-NLS-1$
		paletteContainer.add(createExclusiveness1CreationTool());
		paletteContainer.add(createInclusiveness2CreationTool());
		paletteContainer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegularEntity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RegularEntity1CreationTool_title,
				Messages.RegularEntity1CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Entity_2001));
		entry.setId("createRegularEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Entity1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Entity1.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeakEntity2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WeakEntity2CreationTool_title,
				Messages.WeakEntity2CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Entity_2002));
		entry.setId("createWeakEntity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Entity2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Entity2.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegularRelationship1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RegularRelationship1CreationTool_title,
				Messages.RegularRelationship1CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Relationship_2009));
		entry.setId("createRegularRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Relationship1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Relationship1.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeakRelationshipdependenceinexistence2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WeakRelationshipdependenceinexistence2CreationTool_title,
				Messages.WeakRelationshipdependenceinexistence2CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Relationship_2010));
		entry.setId("createWeakRelationshipdependenceinexistence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Relationship3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Relationship3.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeakRelationshipdependenceinidentification3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WeakRelationshipdependenceinidentification3CreationTool_title,
				Messages.WeakRelationshipdependenceinidentification3CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Relationship_2011));
		entry.setId("createWeakRelationshipdependenceinidentification3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Relationship2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Relationship2.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionEntityRelationship5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EntityRelationshipElementTypes.Connection_Relationship2Entity_4021);
		types.add(EntityRelationshipElementTypes.Connection_Entity2Relationship_4020);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionEntityRelationship5CreationTool_title,
				Messages.ConnectionEntityRelationship5CreationTool_desc, types);
		entry.setId("createConnectionEntityRelationship5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationPartialandOverlapped1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GeneralizationPartialandOverlapped1CreationTool_title,
				Messages.GeneralizationPartialandOverlapped1CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Generalization_2019));
		entry.setId("createGeneralizationPartialandOverlapped1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization1.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationTotalandOverlapped2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GeneralizationTotalandOverlapped2CreationTool_title,
				Messages.GeneralizationTotalandOverlapped2CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Generalization_2020));
		entry.setId("createGeneralizationTotalandOverlapped2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization2.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationPartialandExclusive3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GeneralizationPartialandExclusive3CreationTool_title,
				Messages.GeneralizationPartialandExclusive3CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Generalization_2021));
		entry.setId("createGeneralizationPartialandExclusive3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization3.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralizationTotalandExclusive4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GeneralizationTotalandExclusive4CreationTool_title,
				Messages.GeneralizationTotalandExclusive4CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Generalization_2022));
		entry.setId("createGeneralizationTotalandExclusive4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Generalization4.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionSuperclassGeneralization6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionSuperclassGeneralization6CreationTool_title,
				Messages.ConnectionSuperclassGeneralization6CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.GeneralizationSuperclass_4017));
		entry.setId("createConnectionSuperclassGeneralization6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionSubclassGeneralization7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionSubclassGeneralization7CreationTool_title,
				Messages.ConnectionSubclassGeneralization7CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_Generalization_Entity_4019));
		entry.setId("createConnectionSubclassGeneralization7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimaryAttribute1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PrimaryAttribute1CreationTool_title,
				Messages.PrimaryAttribute1CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Attribute_2008));
		entry.setId("createPrimaryAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute1.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute1.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAlternativeAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AlternativeAttribute2CreationTool_title,
				Messages.AlternativeAttribute2CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Attribute_2007));
		entry.setId("createAlternativeAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute2.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute2.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNoIdentifierAttribute3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NoIdentifierAttribute3CreationTool_title,
				Messages.NoIdentifierAttribute3CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Attribute_2006));
		entry.setId("createNoIdentifierAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute3.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute3.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeAttribute4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeAttribute4CreationTool_title,
				Messages.CompositeAttribute4CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Attribute_Composite_2013));
		entry.setId("createCompositeAttribute4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute4.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Attribute4.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionNormalAttribute6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionNormalAttribute6CreationTool_title,
				Messages.ConnectionNormalAttribute6CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_With_Attribute_4002));
		entry.setId("createConnectionNormalAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionOptionalAttribute7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionOptionalAttribute7CreationTool_title,
				Messages.ConnectionOptionalAttribute7CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_With_Attribute_4003));
		entry.setId("createConnectionOptionalAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Dash.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Dash.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionCompositeAttribute8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionCompositeAttribute8CreationTool_title,
				Messages.ConnectionCompositeAttribute8CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_With_Attribute_4004));
		entry.setId("createConnectionCompositeAttribute8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionDerivedAttribute9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionDerivedAttribute9CreationTool_title,
				Messages.ConnectionDerivedAttribute9CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_With_Attribute_4005));
		entry.setId("createConnectionDerivedAttribute9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Derived.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Derived.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionMultivaluedAttribute10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionMultivaluedAttribute10CreationTool_title,
				Messages.ConnectionMultivaluedAttribute10CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_With_Attribute_4006));
		entry.setId("createConnectionMultivaluedAttribute10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Arrow.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Arrow.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionDependenceinIdentificationAttribute11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectionDependenceinIdentificationAttribute11CreationTool_title,
				Messages.ConnectionDependenceinIdentificationAttribute11CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022));
		entry.setId("createConnectionDependenceinIdentificationAttribute11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Identification.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Identification.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubconnectionCompositeAttribute13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SubconnectionCompositeAttribute13CreationTool_title,
				Messages.SubconnectionCompositeAttribute13CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.AttributeAttributes_composites_4009));
		entry.setId("createSubconnectionCompositeAttribute13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubconnectionDependenceinidentification14CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SubconnectionDependenceinidentification14CreationTool_title,
				Messages.SubconnectionDependenceinidentification14CreationTool_desc,
				null, null) {
		};
		entry.setId("createSubconnectionDependenceinidentification14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Identification.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Identification.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExclusion1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Exclusion1CreationTool_title,
				Messages.Exclusion1CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Relationships_Restriction_4008));
		entry.setId("createExclusion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Exclusion.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Exclusion.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusion2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Inclusion2CreationTool_title,
				Messages.Inclusion2CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Relationships_Restriction_4007));
		entry.setId("createInclusion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Inclusion.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Inclusion.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExclusiveness1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Exclusiveness1CreationTool_title,
				Messages.Exclusiveness1CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_E_R_Restriction_4013));
		entry.setId("createExclusiveness1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Line_Solid.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusiveness2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Inclusiveness2CreationTool_title,
				Messages.Inclusiveness2CreationTool_desc,
				Collections
						.singletonList(EntityRelationshipElementTypes.Connection_E_R_Restriction_4012));
		entry.setId("createInclusiveness2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Arrow.gif")); //$NON-NLS-1$
		entry.setLargeIcon(EntityRelationshipDiagramEditorPlugin
				.findImageDescriptor("/gmf_entity_relationship_model.edit/icons/full/obj16/Arrow.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
