/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Generalization Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_Generalization_EntityImpl#getMinimum_cardinality <em>Minimum cardinality</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Generalization_EntityImpl#getMaximum_cardinality <em>Maximum cardinality</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Generalization_EntityImpl#getConnection_Generalization <em>Connection Generalization</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Generalization_EntityImpl#getConnection_Entity <em>Connection Entity</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_Generalization_EntityImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Connection_Generalization_EntityImpl extends MinimalEObjectImpl.Container implements Connection_Generalization_Entity {
	/**
	 * The default value of the '{@link #getMinimum_cardinality() <em>Minimum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_CARDINALITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getMinimum_cardinality() <em>Minimum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected String minimum_cardinality = MINIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_cardinality() <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_CARDINALITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getMaximum_cardinality() <em>Maximum cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_cardinality()
	 * @generated
	 * @ordered
	 */
	protected String maximum_cardinality = MAXIMUM_CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection_Generalization() <em>Connection Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_Generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization connection_Generalization;

	/**
	 * The cached value of the '{@link #getConnection_Entity() <em>Connection Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_Entity()
	 * @generated
	 * @ordered
	 */
	protected Entity connection_Entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_Generalization_EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_GENERALIZATION_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimum_cardinality() {
		return minimum_cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum_cardinality(String newMinimum_cardinality) {
		String oldMinimum_cardinality = minimum_cardinality;
		minimum_cardinality = newMinimum_cardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY, oldMinimum_cardinality, minimum_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum_cardinality() {
		return maximum_cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum_cardinality(String newMaximum_cardinality) {
		String oldMaximum_cardinality = maximum_cardinality;
		maximum_cardinality = newMaximum_cardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY, oldMaximum_cardinality, maximum_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getConnection_Generalization() {
		if (connection_Generalization != null && connection_Generalization.eIsProxy()) {
			InternalEObject oldConnection_Generalization = (InternalEObject)connection_Generalization;
			connection_Generalization = (Generalization)eResolveProxy(oldConnection_Generalization);
			if (connection_Generalization != oldConnection_Generalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION, oldConnection_Generalization, connection_Generalization));
			}
		}
		return connection_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetConnection_Generalization() {
		return connection_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection_Generalization(Generalization newConnection_Generalization) {
		Generalization oldConnection_Generalization = connection_Generalization;
		connection_Generalization = newConnection_Generalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION, oldConnection_Generalization, connection_Generalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getConnection_Entity() {
		if (connection_Entity != null && connection_Entity.eIsProxy()) {
			InternalEObject oldConnection_Entity = (InternalEObject)connection_Entity;
			connection_Entity = (Entity)eResolveProxy(oldConnection_Entity);
			if (connection_Entity != oldConnection_Entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY, oldConnection_Entity, connection_Entity));
			}
		}
		return connection_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetConnection_Entity() {
		return connection_Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection_Entity(Entity newConnection_Entity) {
		Entity oldConnection_Entity = connection_Entity;
		connection_Entity = newConnection_Entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY, oldConnection_Entity, connection_Entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY:
				return getMinimum_cardinality();
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY:
				return getMaximum_cardinality();
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION:
				if (resolve) return getConnection_Generalization();
				return basicGetConnection_Generalization();
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY:
				if (resolve) return getConnection_Entity();
				return basicGetConnection_Entity();
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY:
				setMinimum_cardinality((String)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY:
				setMaximum_cardinality((String)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION:
				setConnection_Generalization((Generalization)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY:
				setConnection_Entity((Entity)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY:
				setMinimum_cardinality(MINIMUM_CARDINALITY_EDEFAULT);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY:
				setMaximum_cardinality(MAXIMUM_CARDINALITY_EDEFAULT);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION:
				setConnection_Generalization((Generalization)null);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY:
				setConnection_Entity((Entity)null);
				return;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MINIMUM_CARDINALITY:
				return MINIMUM_CARDINALITY_EDEFAULT == null ? minimum_cardinality != null : !MINIMUM_CARDINALITY_EDEFAULT.equals(minimum_cardinality);
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__MAXIMUM_CARDINALITY:
				return MAXIMUM_CARDINALITY_EDEFAULT == null ? maximum_cardinality != null : !MAXIMUM_CARDINALITY_EDEFAULT.equals(maximum_cardinality);
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_GENERALIZATION:
				return connection_Generalization != null;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__CONNECTION_ENTITY:
				return connection_Entity != null;
			case EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL:
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
		result.append(" (minimum_cardinality: ");
		result.append(minimum_cardinality);
		result.append(", maximum_cardinality: ");
		result.append(maximum_cardinality);
		result.append(')');
		return result.toString();
	}

} //Connection_Generalization_EntityImpl
