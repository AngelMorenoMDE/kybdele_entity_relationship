/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.TypeRestriction2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection ERRestriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_E_R_RestrictionImpl#getConnection_source_entity_relationship <em>Connection source entity relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_E_R_RestrictionImpl#getType_restriction <em>Type restriction</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_E_R_RestrictionImpl#getConnection_target_entity_relationship <em>Connection target entity relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_E_R_RestrictionImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Connection_E_R_RestrictionImpl extends MinimalEObjectImpl.Container implements Connection_E_R_Restriction {
	/**
	 * The cached value of the '{@link #getConnection_source_entity_relationship() <em>Connection source entity relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_source_entity_relationship()
	 * @generated
	 * @ordered
	 */
	protected Connection_EntityRelationship connection_source_entity_relationship;

	/**
	 * The default value of the '{@link #getType_restriction() <em>Type restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_restriction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRestriction2 TYPE_RESTRICTION_EDEFAULT = TypeRestriction2.EXCLUSIVENESS;

	/**
	 * The cached value of the '{@link #getType_restriction() <em>Type restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_restriction()
	 * @generated
	 * @ordered
	 */
	protected TypeRestriction2 type_restriction = TYPE_RESTRICTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection_target_entity_relationship() <em>Connection target entity relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_target_entity_relationship()
	 * @generated
	 * @ordered
	 */
	protected Connection_EntityRelationship connection_target_entity_relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_E_R_RestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_ERRESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_EntityRelationship getConnection_source_entity_relationship() {
		if (connection_source_entity_relationship != null && connection_source_entity_relationship.eIsProxy()) {
			InternalEObject oldConnection_source_entity_relationship = (InternalEObject)connection_source_entity_relationship;
			connection_source_entity_relationship = (Connection_EntityRelationship)eResolveProxy(oldConnection_source_entity_relationship);
			if (connection_source_entity_relationship != oldConnection_source_entity_relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP, oldConnection_source_entity_relationship, connection_source_entity_relationship));
			}
		}
		return connection_source_entity_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_EntityRelationship basicGetConnection_source_entity_relationship() {
		return connection_source_entity_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection_source_entity_relationship(Connection_EntityRelationship newConnection_source_entity_relationship) {
		Connection_EntityRelationship oldConnection_source_entity_relationship = connection_source_entity_relationship;
		connection_source_entity_relationship = newConnection_source_entity_relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP, oldConnection_source_entity_relationship, connection_source_entity_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestriction2 getType_restriction() {
		return type_restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_restriction(TypeRestriction2 newType_restriction) {
		TypeRestriction2 oldType_restriction = type_restriction;
		type_restriction = newType_restriction == null ? TYPE_RESTRICTION_EDEFAULT : newType_restriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__TYPE_RESTRICTION, oldType_restriction, type_restriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_EntityRelationship getConnection_target_entity_relationship() {
		if (connection_target_entity_relationship != null && connection_target_entity_relationship.eIsProxy()) {
			InternalEObject oldConnection_target_entity_relationship = (InternalEObject)connection_target_entity_relationship;
			connection_target_entity_relationship = (Connection_EntityRelationship)eResolveProxy(oldConnection_target_entity_relationship);
			if (connection_target_entity_relationship != oldConnection_target_entity_relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP, oldConnection_target_entity_relationship, connection_target_entity_relationship));
			}
		}
		return connection_target_entity_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_EntityRelationship basicGetConnection_target_entity_relationship() {
		return connection_target_entity_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection_target_entity_relationship(Connection_EntityRelationship newConnection_target_entity_relationship) {
		Connection_EntityRelationship oldConnection_target_entity_relationship = connection_target_entity_relationship;
		connection_target_entity_relationship = newConnection_target_entity_relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP, oldConnection_target_entity_relationship, connection_target_entity_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP:
				if (resolve) return getConnection_source_entity_relationship();
				return basicGetConnection_source_entity_relationship();
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__TYPE_RESTRICTION:
				return getType_restriction();
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP:
				if (resolve) return getConnection_target_entity_relationship();
				return basicGetConnection_target_entity_relationship();
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP:
				setConnection_source_entity_relationship((Connection_EntityRelationship)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__TYPE_RESTRICTION:
				setType_restriction((TypeRestriction2)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP:
				setConnection_target_entity_relationship((Connection_EntityRelationship)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP:
				setConnection_source_entity_relationship((Connection_EntityRelationship)null);
				return;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__TYPE_RESTRICTION:
				setType_restriction(TYPE_RESTRICTION_EDEFAULT);
				return;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP:
				setConnection_target_entity_relationship((Connection_EntityRelationship)null);
				return;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_SOURCE_ENTITY_RELATIONSHIP:
				return connection_source_entity_relationship != null;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__TYPE_RESTRICTION:
				return type_restriction != TYPE_RESTRICTION_EDEFAULT;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__CONNECTION_TARGET_ENTITY_RELATIONSHIP:
				return connection_target_entity_relationship != null;
			case EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
				return getInEntityRelationshipModel() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type_restriction: ");
		result.append(type_restriction);
		result.append(')');
		return result.toString();
	}

} //Connection_E_R_RestrictionImpl
