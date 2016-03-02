/**
 */
package entityrelationship.provider;


import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipFactory;
import entityrelationship.EntityrelationshipPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link entityrelationship.Entity_Relationship_Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Entity_Relationship_ModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_Relationship_Model_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_Relationship_Model_name_feature", "_UI_Entity_Relationship_Model_type"),
				 EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT);
			childrenFeatures.add(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Entity_Relationship_Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entity_Relationship_Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public String getText(Object object) {
		String label = ((Entity_Relationship_Model)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_Relationship_Model_type") :
			getString("_UI_Entity_Relationship_Model_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Entity_Relationship_Model.class)) {
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT:
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E,
				 EntityrelationshipFactory.eINSTANCE.createElements_with_Attributes()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E,
				 EntityrelationshipFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E,
				 EntityrelationshipFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT,
				 EntityrelationshipFactory.eINSTANCE.createRelationships_Restriction()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP,
				 EntityrelationshipFactory.eINSTANCE.createConnection_Entity2Relationship()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY,
				 EntityrelationshipFactory.eINSTANCE.createConnection_Relationship2Entity()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE,
				 EntityrelationshipFactory.eINSTANCE.createConnection_ConnectionEntityRelationship2Attribute()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN,
				 EntityrelationshipFactory.eINSTANCE.createConnection_Generalization_Entity()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2,
				 EntityrelationshipFactory.eINSTANCE.createConnection_E_R_Restriction()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA,
				 EntityrelationshipFactory.eINSTANCE.createConnection_With_Attribute()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT,
				 EntityrelationshipFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G,
				 EntityrelationshipFactory.eINSTANCE.createGeneralization()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public ResourceLocator getResourceLocator() {
		return EntityRelationshipEditPlugin.INSTANCE;
	}

}
