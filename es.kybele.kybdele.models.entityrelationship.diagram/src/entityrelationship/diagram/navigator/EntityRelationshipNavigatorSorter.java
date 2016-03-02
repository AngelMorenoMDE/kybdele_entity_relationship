package entityrelationship.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;

/**
 * @generated
 */
public class EntityRelationshipNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4024;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EntityRelationshipNavigatorItem) {
			EntityRelationshipNavigatorItem item = (EntityRelationshipNavigatorItem) element;
			return EntityRelationshipVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
