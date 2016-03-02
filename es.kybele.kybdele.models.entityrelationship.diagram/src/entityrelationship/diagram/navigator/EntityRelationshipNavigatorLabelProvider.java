package entityrelationship.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.Generalization;
import entityrelationship.diagram.edit.parts.Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeAttributes_compositesEditPart;
import entityrelationship.diagram.edit.parts.AttributeEditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attribute2EditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attribute3EditPart;
import entityrelationship.diagram.edit.parts.AttributeName_attributeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeEditPart;
import entityrelationship.diagram.edit.parts.Attribute_CompositeName_at_compositeEditPart;
import entityrelationship.diagram.edit.parts.Connection_ConnectionEntityRelationship2AttributeEditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Connection_E_R_RestrictionEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipEditPart;
import entityrelationship.diagram.edit.parts.Connection_Entity2RelationshipRoleEditPart;
import entityrelationship.diagram.edit.parts.Connection_Generalization_EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityEditPart;
import entityrelationship.diagram.edit.parts.Connection_Relationship2EntityRoleEditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute2EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute3EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute4EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_Attribute5EditPart;
import entityrelationship.diagram.edit.parts.Connection_With_AttributeEditPart;
import entityrelationship.diagram.edit.parts.Entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityEditPart;
import entityrelationship.diagram.edit.parts.EntityName_entity2EditPart;
import entityrelationship.diagram.edit.parts.EntityName_entityEditPart;
import entityrelationship.diagram.edit.parts.Entity_Relationship_ModelEditPart;
import entityrelationship.diagram.edit.parts.Generalization2EditPart;
import entityrelationship.diagram.edit.parts.Generalization3EditPart;
import entityrelationship.diagram.edit.parts.Generalization4EditPart;
import entityrelationship.diagram.edit.parts.GeneralizationEditPart;
import entityrelationship.diagram.edit.parts.GeneralizationSuperclassEditPart;
import entityrelationship.diagram.edit.parts.Relationship2EditPart;
import entityrelationship.diagram.edit.parts.Relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipEditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationship2EditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationship3EditPart;
import entityrelationship.diagram.edit.parts.RelationshipName_relationshipEditPart;
import entityrelationship.diagram.edit.parts.Relationships_Restriction2EditPart;
import entityrelationship.diagram.edit.parts.Relationships_RestrictionEditPart;
import entityrelationship.diagram.edit.parts.WrappingLabel2EditPart;
import entityrelationship.diagram.edit.parts.WrappingLabel3EditPart;
import entityrelationship.diagram.edit.parts.WrappingLabelEditPart;
import entityrelationship.diagram.part.EntityRelationshipDiagramEditorPlugin;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;
import entityrelationship.diagram.providers.EntityRelationshipParserProvider;

/**
 * @generated
 */
public class EntityRelationshipNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EntityRelationshipDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EntityRelationshipDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EntityRelationshipNavigatorItem
				&& !isOwnView(((EntityRelationshipNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EntityRelationshipNavigatorGroup) {
			EntityRelationshipNavigatorGroup group = (EntityRelationshipNavigatorGroup) element;
			return EntityRelationshipDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof EntityRelationshipNavigatorItem) {
			EntityRelationshipNavigatorItem navigatorItem = (EntityRelationshipNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://entityrelationship/1.0?Entity_Relationship_Model", EntityRelationshipElementTypes.Entity_Relationship_Model_1000); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Entity", EntityRelationshipElementTypes.Entity_2001); //$NON-NLS-1$
		case Entity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Entity", EntityRelationshipElementTypes.Entity_2002); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Attribute", EntityRelationshipElementTypes.Attribute_2006); //$NON-NLS-1$
		case Attribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Attribute", EntityRelationshipElementTypes.Attribute_2007); //$NON-NLS-1$
		case Attribute3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Attribute", EntityRelationshipElementTypes.Attribute_2008); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Relationship", EntityRelationshipElementTypes.Relationship_2009); //$NON-NLS-1$
		case Relationship2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Relationship", EntityRelationshipElementTypes.Relationship_2010); //$NON-NLS-1$
		case Relationship3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Relationship", EntityRelationshipElementTypes.Relationship_2011); //$NON-NLS-1$
		case Attribute_CompositeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Attribute_Composite", EntityRelationshipElementTypes.Attribute_Composite_2013); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Generalization", EntityRelationshipElementTypes.Generalization_2019); //$NON-NLS-1$
		case Generalization2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Generalization", EntityRelationshipElementTypes.Generalization_2020); //$NON-NLS-1$
		case Generalization3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Generalization", EntityRelationshipElementTypes.Generalization_2021); //$NON-NLS-1$
		case Generalization4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://entityrelationship/1.0?Generalization", EntityRelationshipElementTypes.Generalization_2022); //$NON-NLS-1$
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_With_Attribute", EntityRelationshipElementTypes.Connection_With_Attribute_4002); //$NON-NLS-1$
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_With_Attribute", EntityRelationshipElementTypes.Connection_With_Attribute_4003); //$NON-NLS-1$
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_With_Attribute", EntityRelationshipElementTypes.Connection_With_Attribute_4004); //$NON-NLS-1$
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_With_Attribute", EntityRelationshipElementTypes.Connection_With_Attribute_4005); //$NON-NLS-1$
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_With_Attribute", EntityRelationshipElementTypes.Connection_With_Attribute_4006); //$NON-NLS-1$
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Relationships_Restriction", EntityRelationshipElementTypes.Relationships_Restriction_4007); //$NON-NLS-1$
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Relationships_Restriction", EntityRelationshipElementTypes.Relationships_Restriction_4008); //$NON-NLS-1$
		case AttributeAttributes_compositesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Attribute?attributes_composites", EntityRelationshipElementTypes.AttributeAttributes_composites_4009); //$NON-NLS-1$
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_E_R_Restriction", EntityRelationshipElementTypes.Connection_E_R_Restriction_4012); //$NON-NLS-1$
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_E_R_Restriction", EntityRelationshipElementTypes.Connection_E_R_Restriction_4013); //$NON-NLS-1$
		case GeneralizationSuperclassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Generalization?superclass", EntityRelationshipElementTypes.GeneralizationSuperclass_4017); //$NON-NLS-1$
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_Generalization_Entity", EntityRelationshipElementTypes.Connection_Generalization_Entity_4019); //$NON-NLS-1$
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_Entity2Relationship", EntityRelationshipElementTypes.Connection_Entity2Relationship_4020); //$NON-NLS-1$
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_Relationship2Entity", EntityRelationshipElementTypes.Connection_Relationship2Entity_4021); //$NON-NLS-1$
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://entityrelationship/1.0?Connection_ConnectionEntityRelationship2Attribute", EntityRelationshipElementTypes.Connection_ConnectionEntityRelationship2Attribute_4022); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EntityRelationshipDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& EntityRelationshipElementTypes
						.isKnownElementType(elementType)) {
			image = EntityRelationshipElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EntityRelationshipNavigatorGroup) {
			EntityRelationshipNavigatorGroup group = (EntityRelationshipNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EntityRelationshipNavigatorItem) {
			EntityRelationshipNavigatorItem navigatorItem = (EntityRelationshipNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {
		case Entity_Relationship_ModelEditPart.VISUAL_ID:
			return getEntity_Relationship_Model_1000Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001Text(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_2002Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2006Text(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2007Text(view);
		case Attribute3EditPart.VISUAL_ID:
			return getAttribute_2008Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2009Text(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_2010Text(view);
		case Relationship3EditPart.VISUAL_ID:
			return getRelationship_2011Text(view);
		case Attribute_CompositeEditPart.VISUAL_ID:
			return getAttribute_Composite_2013Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_2019Text(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_2020Text(view);
		case Generalization3EditPart.VISUAL_ID:
			return getGeneralization_2021Text(view);
		case Generalization4EditPart.VISUAL_ID:
			return getGeneralization_2022Text(view);
		case Connection_With_AttributeEditPart.VISUAL_ID:
			return getConnection_With_Attribute_4002Text(view);
		case Connection_With_Attribute2EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4003Text(view);
		case Connection_With_Attribute3EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4004Text(view);
		case Connection_With_Attribute4EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4005Text(view);
		case Connection_With_Attribute5EditPart.VISUAL_ID:
			return getConnection_With_Attribute_4006Text(view);
		case Relationships_RestrictionEditPart.VISUAL_ID:
			return getRelationships_Restriction_4007Text(view);
		case Relationships_Restriction2EditPart.VISUAL_ID:
			return getRelationships_Restriction_4008Text(view);
		case AttributeAttributes_compositesEditPart.VISUAL_ID:
			return getAttributeAttributes_composites_4009Text(view);
		case Connection_E_R_RestrictionEditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4012Text(view);
		case Connection_E_R_Restriction2EditPart.VISUAL_ID:
			return getConnection_E_R_Restriction_4013Text(view);
		case GeneralizationSuperclassEditPart.VISUAL_ID:
			return getGeneralizationSuperclass_4017Text(view);
		case Connection_Generalization_EntityEditPart.VISUAL_ID:
			return getConnection_Generalization_Entity_4019Text(view);
		case Connection_Entity2RelationshipEditPart.VISUAL_ID:
			return getConnection_Entity2Relationship_4020Text(view);
		case Connection_Relationship2EntityEditPart.VISUAL_ID:
			return getConnection_Relationship2Entity_4021Text(view);
		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID:
			return getConnection_ConnectionEntityRelationship2Attribute_4022Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEntity_Relationship_Model_1000Text(View view) {
		Entity_Relationship_Model domainModelElement = (Entity_Relationship_Model) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2001Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Entity_2001,
				view.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(EntityName_entityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2002Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Entity_2002,
				view.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(EntityName_entity2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_2006Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Attribute_2006, view
						.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(AttributeName_attributeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_2007Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Attribute_2007, view
						.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(AttributeName_attribute2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_2008Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Attribute_2008, view
						.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(AttributeName_attribute3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2009Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Relationship_2009,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(RelationshipName_relationshipEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2010Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Relationship_2010,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(RelationshipName_relationship2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2011Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Relationship_2011,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(RelationshipName_relationship3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_Composite_2013Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Attribute_Composite_2013,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(Attribute_CompositeName_at_compositeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_2019Text(View view) {
		Generalization domainModelElement = (Generalization) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement
					.getRestriction_inheritance_1());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_2020Text(View view) {
		Generalization domainModelElement = (Generalization) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement
					.getRestriction_inheritance_1());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_2021Text(View view) {
		Generalization domainModelElement = (Generalization) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement
					.getRestriction_inheritance_1());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_2022Text(View view) {
		Generalization domainModelElement = (Generalization) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement
					.getRestriction_inheritance_1());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_With_Attribute_4002Text(View view) {
		Connection_With_Attribute domainModelElement = (Connection_With_Attribute) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType_attribute());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_With_Attribute_4003Text(View view) {
		Connection_With_Attribute domainModelElement = (Connection_With_Attribute) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType_attribute());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_With_Attribute_4004Text(View view) {
		Connection_With_Attribute domainModelElement = (Connection_With_Attribute) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType_attribute());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_With_Attribute_4005Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Connection_With_Attribute_4005,
				view.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_With_Attribute_4006Text(View view) {
		Connection_With_Attribute domainModelElement = (Connection_With_Attribute) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType_attribute());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationships_Restriction_4007Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Relationships_Restriction_4007,
				view.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationships_Restriction_4008Text(View view) {
		IParser parser = EntityRelationshipParserProvider.getParser(
				EntityRelationshipElementTypes.Relationships_Restriction_4008,
				view.getElement() != null ? view.getElement() : view,
				EntityRelationshipVisualIDRegistry
						.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAttributes_composites_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnection_E_R_Restriction_4012Text(View view) {
		Connection_E_R_Restriction domainModelElement = (Connection_E_R_Restriction) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType_restriction());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_E_R_Restriction_4013Text(View view) {
		Connection_E_R_Restriction domainModelElement = (Connection_E_R_Restriction) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType_restriction());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralizationSuperclass_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnection_Generalization_Entity_4019Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Connection_Generalization_Entity_4019,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_Entity2Relationship_4020Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Connection_Entity2Relationship_4020,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(Connection_Entity2RelationshipRoleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_Relationship2Entity_4021Text(View view) {
		IParser parser = EntityRelationshipParserProvider
				.getParser(
						EntityRelationshipElementTypes.Connection_Relationship2Entity_4021,
						view.getElement() != null ? view.getElement() : view,
						EntityRelationshipVisualIDRegistry
								.getType(Connection_Relationship2EntityRoleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnection_ConnectionEntityRelationship2Attribute_4022Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Entity_Relationship_ModelEditPart.MODEL_ID
				.equals(EntityRelationshipVisualIDRegistry.getModelID(view));
	}

}
