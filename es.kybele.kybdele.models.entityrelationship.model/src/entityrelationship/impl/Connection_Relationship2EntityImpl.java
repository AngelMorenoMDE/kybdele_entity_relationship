/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Relationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Relationship2 Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_Relationship2EntityImpl#getSource_relationship <em>Source relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Relationship2EntityImpl#getTarget_entity <em>Target entity</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Relationship2EntityImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Connection_Relationship2EntityImpl extends Connection_EntityRelationshipImpl implements Connection_Relationship2Entity {
	/**
	 * The cached value of the '{@link #getSource_relationship() <em>Source relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_relationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship source_relationship;

	/**
	 * The cached value of the '{@link #getTarget_entity() <em>Target entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_entity()
	 * @generated
	 * @ordered
	 */
	protected Entity target_entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_Relationship2EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_RELATIONSHIP2_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getSource_relationship() {
		if (source_relationship != null && source_relationship.eIsProxy()) {
			InternalEObject oldSource_relationship = (InternalEObject)source_relationship;
			source_relationship = (Relationship)eResolveProxy(oldSource_relationship);
			if (source_relationship != oldSource_relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP, oldSource_relationship, source_relationship));
			}
		}
		return source_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetSource_relationship() {
		return source_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource_relationship(Relationship newSource_relationship, NotificationChain msgs) {
		Relationship oldSource_relationship = source_relationship;
		source_relationship = newSource_relationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP, oldSource_relationship, newSource_relationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_relationship(Relationship newSource_relationship) {
		if (newSource_relationship != source_relationship) {
			NotificationChain msgs = null;
			if (source_relationship != null)
				msgs = ((InternalEObject)source_relationship).eInverseRemove(this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY, Relationship.class, msgs);
			if (newSource_relationship != null)
				msgs = ((InternalEObject)newSource_relationship).eInverseAdd(this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY, Relationship.class, msgs);
			msgs = basicSetSource_relationship(newSource_relationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP, newSource_relationship, newSource_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTarget_entity() {
		if (target_entity != null && target_entity.eIsProxy()) {
			InternalEObject oldTarget_entity = (InternalEObject)target_entity;
			target_entity = (Entity)eResolveProxy(oldTarget_entity);
			if (target_entity != oldTarget_entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY, oldTarget_entity, target_entity));
			}
		}
		return target_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget_entity() {
		return target_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget_entity(Entity newTarget_entity, NotificationChain msgs) {
		Entity oldTarget_entity = target_entity;
		target_entity = newTarget_entity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY, oldTarget_entity, newTarget_entity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_entity(Entity newTarget_entity) {
		if (newTarget_entity != target_entity) {
			NotificationChain msgs = null;
			if (target_entity != null)
				msgs = ((InternalEObject)target_entity).eInverseRemove(this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY, Entity.class, msgs);
			if (newTarget_entity != null)
				msgs = ((InternalEObject)newTarget_entity).eInverseAdd(this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY, Entity.class, msgs);
			msgs = basicSetTarget_entity(newTarget_entity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY, newTarget_entity, newTarget_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP:
				if (source_relationship != null)
					msgs = ((InternalEObject)source_relationship).eInverseRemove(this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY, Relationship.class, msgs);
				return basicSetSource_relationship((Relationship)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY:
				if (target_entity != null)
					msgs = ((InternalEObject)target_entity).eInverseRemove(this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY, Entity.class, msgs);
				return basicSetTarget_entity((Entity)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInEntityRelationshipModel((Entity_Relationship_Model)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP:
				return basicSetSource_relationship(null, msgs);
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY:
				return basicSetTarget_entity(null, msgs);
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				return basicSetInEntityRelationshipModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY, Entity_Relationship_Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP:
				if (resolve) return getSource_relationship();
				return basicGetSource_relationship();
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY:
				if (resolve) return getTarget_entity();
				return basicGetTarget_entity();
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				return getInEntityRelationshipModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP:
				setSource_relationship((Relationship)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY:
				setTarget_entity((Entity)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				setInEntityRelationshipModel((Entity_Relationship_Model)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP:
				setSource_relationship((Relationship)null);
				return;
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY:
				setTarget_entity((Entity)null);
				return;
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				setInEntityRelationshipModel((Entity_Relationship_Model)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP:
				return source_relationship != null;
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY:
				return target_entity != null;
			case EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				return getInEntityRelationshipModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //Connection_Relationship2EntityImpl
