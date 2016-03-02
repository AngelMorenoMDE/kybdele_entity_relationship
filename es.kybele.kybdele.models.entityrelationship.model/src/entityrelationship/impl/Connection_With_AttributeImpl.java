/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Elements_with_Attributes;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.TypeAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection With Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_With_AttributeImpl#getType_attribute <em>Type attribute</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_With_AttributeImpl#getConnection_attribute <em>Connection attribute</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_With_AttributeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_With_AttributeImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Connection_With_AttributeImpl extends MinimalEObjectImpl.Container implements Connection_With_Attribute {
	/**
	 * The default value of the '{@link #getType_attribute() <em>Type attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_attribute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAttribute TYPE_ATTRIBUTE_EDEFAULT = TypeAttribute.NORMAL;

	/**
	 * The cached value of the '{@link #getType_attribute() <em>Type attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_attribute()
	 * @generated
	 * @ordered
	 */
	protected TypeAttribute type_attribute = TYPE_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection_attribute() <em>Connection attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_attribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute connection_attribute;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Elements_with_Attributes element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_With_AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_WITH_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttribute getType_attribute() {
		return type_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_attribute(TypeAttribute newType_attribute) {
		TypeAttribute oldType_attribute = type_attribute;
		type_attribute = newType_attribute == null ? TYPE_ATTRIBUTE_EDEFAULT : newType_attribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE, oldType_attribute, type_attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getConnection_attribute() {
		if (connection_attribute != null && connection_attribute.eIsProxy()) {
			InternalEObject oldConnection_attribute = (InternalEObject)connection_attribute;
			connection_attribute = (Attribute)eResolveProxy(oldConnection_attribute);
			if (connection_attribute != oldConnection_attribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE, oldConnection_attribute, connection_attribute));
			}
		}
		return connection_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetConnection_attribute() {
		return connection_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection_attribute(Attribute newConnection_attribute, NotificationChain msgs) {
		Attribute oldConnection_attribute = connection_attribute;
		connection_attribute = newConnection_attribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE, oldConnection_attribute, newConnection_attribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection_attribute(Attribute newConnection_attribute) {
		if (newConnection_attribute != connection_attribute) {
			NotificationChain msgs = null;
			if (connection_attribute != null)
				msgs = ((InternalEObject)connection_attribute).eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__CONNECTED, Attribute.class, msgs);
			if (newConnection_attribute != null)
				msgs = ((InternalEObject)newConnection_attribute).eInverseAdd(this, EntityrelationshipPackage.ATTRIBUTE__CONNECTED, Attribute.class, msgs);
			msgs = basicSetConnection_attribute(newConnection_attribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE, newConnection_attribute, newConnection_attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements_with_Attributes getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Elements_with_Attributes)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements_with_Attributes basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Elements_with_Attributes newElement, NotificationChain msgs) {
		Elements_with_Attributes oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Elements_with_Attributes newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EntityrelationshipPackage.ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE, Elements_with_Attributes.class, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EntityrelationshipPackage.ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE, Elements_with_Attributes.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE:
				if (connection_attribute != null)
					msgs = ((InternalEObject)connection_attribute).eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__CONNECTED, Attribute.class, msgs);
				return basicSetConnection_attribute((Attribute)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT:
				if (element != null)
					msgs = ((InternalEObject)element).eInverseRemove(this, EntityrelationshipPackage.ELEMENTS_WITH_ATTRIBUTES__CONNECTED_WITH_ATTRIBUTE, Elements_with_Attributes.class, msgs);
				return basicSetElement((Elements_with_Attributes)otherEnd, msgs);
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE:
				return basicSetConnection_attribute(null, msgs);
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT:
				return basicSetElement(null, msgs);
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE:
				return getType_attribute();
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE:
				if (resolve) return getConnection_attribute();
				return basicGetConnection_attribute();
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE:
				setType_attribute((TypeAttribute)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE:
				setConnection_attribute((Attribute)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT:
				setElement((Elements_with_Attributes)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE:
				setType_attribute(TYPE_ATTRIBUTE_EDEFAULT);
				return;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE:
				setConnection_attribute((Attribute)null);
				return;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT:
				setElement((Elements_with_Attributes)null);
				return;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__TYPE_ATTRIBUTE:
				return type_attribute != TYPE_ATTRIBUTE_EDEFAULT;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE:
				return connection_attribute != null;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__ELEMENT:
				return element != null;
			case EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
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
		result.append(" (type_attribute: ");
		result.append(type_attribute);
		result.append(')');
		return result.toString();
	}

} //Connection_With_AttributeImpl
