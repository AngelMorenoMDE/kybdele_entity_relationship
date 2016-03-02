/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_Entity2Relationship;
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
 * An implementation of the model object '<em><b>Connection Entity2 Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_Entity2RelationshipImpl#getSource_entity <em>Source entity</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Entity2RelationshipImpl#getTarget_relationship <em>Target relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Entity2RelationshipImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Connection_Entity2RelationshipImpl extends Connection_EntityRelationshipImpl implements Connection_Entity2Relationship {
	/**
	 * The cached value of the '{@link #getSource_entity() <em>Source entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_entity()
	 * @generated
	 * @ordered
	 */
	protected Entity source_entity;

	/**
	 * The cached value of the '{@link #getTarget_relationship() <em>Target relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_relationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship target_relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_Entity2RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_ENTITY2_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSource_entity() {
		if (source_entity != null && source_entity.eIsProxy()) {
			InternalEObject oldSource_entity = (InternalEObject)source_entity;
			source_entity = (Entity)eResolveProxy(oldSource_entity);
			if (source_entity != oldSource_entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY, oldSource_entity, source_entity));
			}
		}
		return source_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSource_entity() {
		return source_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource_entity(Entity newSource_entity, NotificationChain msgs) {
		Entity oldSource_entity = source_entity;
		source_entity = newSource_entity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY, oldSource_entity, newSource_entity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_entity(Entity newSource_entity) {
		if (newSource_entity != source_entity) {
			NotificationChain msgs = null;
			if (source_entity != null)
				msgs = ((InternalEObject)source_entity).eInverseRemove(this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP, Entity.class, msgs);
			if (newSource_entity != null)
				msgs = ((InternalEObject)newSource_entity).eInverseAdd(this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP, Entity.class, msgs);
			msgs = basicSetSource_entity(newSource_entity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY, newSource_entity, newSource_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getTarget_relationship() {
		if (target_relationship != null && target_relationship.eIsProxy()) {
			InternalEObject oldTarget_relationship = (InternalEObject)target_relationship;
			target_relationship = (Relationship)eResolveProxy(oldTarget_relationship);
			if (target_relationship != oldTarget_relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP, oldTarget_relationship, target_relationship));
			}
		}
		return target_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetTarget_relationship() {
		return target_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget_relationship(Relationship newTarget_relationship, NotificationChain msgs) {
		Relationship oldTarget_relationship = target_relationship;
		target_relationship = newTarget_relationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP, oldTarget_relationship, newTarget_relationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_relationship(Relationship newTarget_relationship) {
		if (newTarget_relationship != target_relationship) {
			NotificationChain msgs = null;
			if (target_relationship != null)
				msgs = ((InternalEObject)target_relationship).eInverseRemove(this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP, Relationship.class, msgs);
			if (newTarget_relationship != null)
				msgs = ((InternalEObject)newTarget_relationship).eInverseAdd(this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP, Relationship.class, msgs);
			msgs = basicSetTarget_relationship(newTarget_relationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP, newTarget_relationship, newTarget_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY:
				if (source_entity != null)
					msgs = ((InternalEObject)source_entity).eInverseRemove(this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP, Entity.class, msgs);
				return basicSetSource_entity((Entity)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP:
				if (target_relationship != null)
					msgs = ((InternalEObject)target_relationship).eInverseRemove(this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP, Relationship.class, msgs);
				return basicSetTarget_relationship((Relationship)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY:
				return basicSetSource_entity(null, msgs);
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP:
				return basicSetTarget_relationship(null, msgs);
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY:
				if (resolve) return getSource_entity();
				return basicGetSource_entity();
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP:
				if (resolve) return getTarget_relationship();
				return basicGetTarget_relationship();
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY:
				setSource_entity((Entity)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP:
				setTarget_relationship((Relationship)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY:
				setSource_entity((Entity)null);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP:
				setTarget_relationship((Relationship)null);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY:
				return source_entity != null;
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP:
				return target_relationship != null;
			case EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL:
				return getInEntityRelationshipModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //Connection_Entity2RelationshipImpl
