package entityrelationship.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;
import entityrelationship.diagram.part.Messages;

/**
 * @generated
 */
public class EntityRelationshipNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public EntityRelationshipNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<EntityRelationshipNavigatorItem> result = new ArrayList<EntityRelationshipNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							Entity_Relationship_ModelEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof EntityRelationshipNavigatorGroup) {
			EntityRelationshipNavigatorGroup group = (EntityRelationshipNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EntityRelationshipNavigatorItem) {
			EntityRelationshipNavigatorItem navigatorItem = (EntityRelationshipNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (EntityRelationshipVisualIDRegistry.getVisualID(view)) {

		case Entity_Relationship_ModelEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			EntityRelationshipNavigatorGroup links = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Entity_Relationship_Model_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute_CompositeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Relationship2EntityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Entity2RelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeAttributes_compositesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_E_R_RestrictionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_E_R_Restriction2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case EntityEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Relationship2EntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Entity2RelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Entity2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Relationship2EntityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Entity2RelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AttributeEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeAttributes_compositesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Attribute2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeAttributes_compositesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Attribute3EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeAttributes_compositesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RelationshipEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Relationship2EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Entity2RelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Relationship2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Relationship2EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Entity2RelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Relationship3EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationship_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Relationship2EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Entity2RelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_AttributeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute4EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_With_Attribute5EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_RestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationships_Restriction2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Attribute_CompositeEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Attribute_Composite_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeAttributes_compositesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GeneralizationEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Generalization_2019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Generalization2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Generalization_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Generalization3EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Generalization_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Generalization4EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Node sv = (Node) view;
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Generalization_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Connection_Generalization_EntityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationSuperclassEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Connection_With_AttributeEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_With_Attribute2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_With_Attribute3EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_With_Attribute4EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_With_Attribute5EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_With_Attribute_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Relationships_RestrictionEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationships_Restriction_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationships_Restriction_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Relationships_Restriction2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationships_Restriction_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Relationships_Restriction_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeAttributes_compositesEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_AttributeAttributes_composites_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_AttributeAttributes_composites_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute_CompositeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_E_R_RestrictionEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_E_R_Restriction_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_E_R_Restriction_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_E_R_Restriction2EditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_E_R_Restriction_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_E_R_Restriction_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GeneralizationSuperclassEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationSuperclass_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_GeneralizationSuperclass_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_Generalization_EntityEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Generalization_Entity_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Generalization_Entity_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(GeneralizationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Generalization4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Connection_Entity2RelationshipEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Entity2Relationship_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Entity2Relationship_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Entity2Relationship_4020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Entity2Relationship_4020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Connection_Relationship2EntityEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Relationship2Entity_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Relationship2Entity_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup incominglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Relationship2Entity_4021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup outgoinglinks = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_Relationship2Entity_4021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(RelationshipEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Relationship3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Connection_ConnectionEntityRelationship2AttributeEditPart.VISUAL_ID: {
			LinkedList<EntityRelationshipAbstractNavigatorItem> result = new LinkedList<EntityRelationshipAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EntityRelationshipNavigatorGroup target = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_ConnectionEntityRelationship2Attribute_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EntityRelationshipNavigatorGroup source = new EntityRelationshipNavigatorGroup(
					Messages.NavigatorGroupName_Connection_ConnectionEntityRelationship2Attribute_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EntityRelationshipVisualIDRegistry
							.getType(Attribute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Entity_Relationship_ModelEditPart.MODEL_ID
				.equals(EntityRelationshipVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EntityRelationshipNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<EntityRelationshipNavigatorItem> result = new ArrayList<EntityRelationshipNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new EntityRelationshipNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof EntityRelationshipAbstractNavigatorItem) {
			EntityRelationshipAbstractNavigatorItem abstractNavigatorItem = (EntityRelationshipAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
