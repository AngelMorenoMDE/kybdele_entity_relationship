/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Connection Entity Relationship2 Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl#getSource_connection <em>Source connection</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl#getTarget_attribute <em>Target attribute</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_ConnectionEntityRelationship2AttributeImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Connection_ConnectionEntityRelationship2AttributeImpl extends MinimalEObjectImpl.Container implements Connection_ConnectionEntityRelationship2Attribute {
	/**
	 * The cached value of the '{@link #getSource_connection() <em>Source connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_connection()
	 * @generated
	 * @ordered
	 */
	protected Connection_EntityRelationship source_connection;

	/**
	 * The cached value of the '{@link #getTarget_attribute() <em>Target attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_attribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute target_attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_ConnectionEntityRelationship2AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_EntityRelationship getSource_connection() {
		if (source_connection != null && source_connection.eIsProxy()) {
			InternalEObject oldSource_connection = (InternalEObject)source_connection;
			source_connection = (Connection_EntityRelationship)eResolveProxy(oldSource_connection);
			if (source_connection != oldSource_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION, oldSource_connection, source_connection));
			}
		}
		return source_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_EntityRelationship basicGetSource_connection() {
		return source_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_connection(Connection_EntityRelationship newSource_connection) {
		Connection_EntityRelationship oldSource_connection = source_connection;
		source_connection = newSource_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION, oldSource_connection, source_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTarget_attribute() {
		if (target_attribute != null && target_attribute.eIsProxy()) {
			InternalEObject oldTarget_attribute = (InternalEObject)target_attribute;
			target_attribute = (Attribute)eResolveProxy(oldTarget_attribute);
			if (target_attribute != oldTarget_attribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE, oldTarget_attribute, target_attribute));
			}
		}
		return target_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTarget_attribute() {
		return target_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget_attribute(Attribute newTarget_attribute, NotificationChain msgs) {
		Attribute oldTarget_attribute = target_attribute;
		target_attribute = newTarget_attribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE, oldTarget_attribute, newTarget_attribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_attribute(Attribute newTarget_attribute) {
		if (newTarget_attribute != target_attribute) {
			NotificationChain msgs = null;
			if (target_attribute != null)
				msgs = ((InternalEObject)target_attribute).eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE, Attribute.class, msgs);
			if (newTarget_attribute != null)
				msgs = ((InternalEObject)newTarget_attribute).eInverseAdd(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE, Attribute.class, msgs);
			msgs = basicSetTarget_attribute(newTarget_attribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE, newTarget_attribute, newTarget_attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE:
				if (target_attribute != null)
					msgs = ((InternalEObject)target_attribute).eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE, Attribute.class, msgs);
				return basicSetTarget_attribute((Attribute)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE:
				return basicSetTarget_attribute(null, msgs);
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION:
				if (resolve) return getSource_connection();
				return basicGetSource_connection();
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE:
				if (resolve) return getTarget_attribute();
				return basicGetTarget_attribute();
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION:
				setSource_connection((Connection_EntityRelationship)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE:
				setTarget_attribute((Attribute)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION:
				setSource_connection((Connection_EntityRelationship)null);
				return;
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE:
				setTarget_attribute((Attribute)null);
				return;
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__SOURCE_CONNECTION:
				return source_connection != null;
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE:
				return target_attribute != null;
			case EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				return getInEntityRelationshipModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //Connection_ConnectionEntityRelationship2AttributeImpl
