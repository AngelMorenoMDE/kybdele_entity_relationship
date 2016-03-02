/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.TypeIdentifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getName_attribute <em>Name attribute</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getAttributes_composites <em>Attributes composites</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getAttributes_identification <em>Attributes identification</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getConnected <em>Connected</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getInAttribute <em>In Attribute</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 *   <li>{@link entityrelationship.impl.AttributeImpl#getAttribute_connected_to_conection_entityrelationship_to_attribute <em>Attribute connected to conection entityrelationship to attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getName_attribute() <em>Name attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_attribute()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_attribute() <em>Name attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_attribute()
	 * @generated
	 * @ordered
	 */
	protected String name_attribute = NAME_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final TypeIdentifier IDENTIFIER_EDEFAULT = TypeIdentifier.NO_IDENTIFIER;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected TypeIdentifier identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes_composites() <em>Attributes composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes_composites()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_Composite> attributes_composites;

	/**
	 * The cached value of the '{@link #getAttributes_identification() <em>Attributes identification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes_identification()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes_identification;

	/**
	 * The cached value of the '{@link #getConnected() <em>Connected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected Connection_With_Attribute connected;

	/**
	 * The cached value of the '{@link #getInAttribute() <em>In Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute inAttribute;

	/**
	 * The cached value of the '{@link #getInEntityRelationshipModel() <em>In Entity Relationship Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEntityRelationshipModel()
	 * @generated
	 * @ordered
	 */
	protected Entity_Relationship_Model inEntityRelationshipModel;

	/**
	 * The cached value of the '{@link #getAttribute_connected_to_conection_entityrelationship_to_attribute() <em>Attribute connected to conection entityrelationship to attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_connected_to_conection_entityrelationship_to_attribute()
	 * @generated
	 * @ordered
	 */
	protected Connection_ConnectionEntityRelationship2Attribute attribute_connected_to_conection_entityrelationship_to_attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_attribute() {
		return name_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_attribute(String newName_attribute) {
		String oldName_attribute = name_attribute;
		name_attribute = newName_attribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__NAME_ATTRIBUTE, oldName_attribute, name_attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeIdentifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(TypeIdentifier newIdentifier) {
		TypeIdentifier oldIdentifier = identifier;
		identifier = newIdentifier == null ? IDENTIFIER_EDEFAULT : newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Composite> getAttributes_composites() {
		if (attributes_composites == null) {
			attributes_composites = new EObjectContainmentWithInverseEList<Attribute_Composite>(Attribute_Composite.class, this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE);
		}
		return attributes_composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes_identification() {
		if (attributes_identification == null) {
			attributes_identification = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION, EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE);
		}
		return attributes_identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_With_Attribute getConnected() {
		if (connected != null && connected.eIsProxy()) {
			InternalEObject oldConnected = (InternalEObject)connected;
			connected = (Connection_With_Attribute)eResolveProxy(oldConnected);
			if (connected != oldConnected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.ATTRIBUTE__CONNECTED, oldConnected, connected));
			}
		}
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_With_Attribute basicGetConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnected(Connection_With_Attribute newConnected, NotificationChain msgs) {
		Connection_With_Attribute oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__CONNECTED, oldConnected, newConnected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(Connection_With_Attribute newConnected) {
		if (newConnected != connected) {
			NotificationChain msgs = null;
			if (connected != null)
				msgs = ((InternalEObject)connected).eInverseRemove(this, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE, Connection_With_Attribute.class, msgs);
			if (newConnected != null)
				msgs = ((InternalEObject)newConnected).eInverseAdd(this, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE, Connection_With_Attribute.class, msgs);
			msgs = basicSetConnected(newConnected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__CONNECTED, newConnected, newConnected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getInAttribute() {
		if (inAttribute != null && inAttribute.eIsProxy()) {
			InternalEObject oldInAttribute = (InternalEObject)inAttribute;
			inAttribute = (Attribute)eResolveProxy(oldInAttribute);
			if (inAttribute != oldInAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE, oldInAttribute, inAttribute));
			}
		}
		return inAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetInAttribute() {
		return inAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInAttribute(Attribute newInAttribute, NotificationChain msgs) {
		Attribute oldInAttribute = inAttribute;
		inAttribute = newInAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE, oldInAttribute, newInAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInAttribute(Attribute newInAttribute) {
		if (newInAttribute != inAttribute) {
			NotificationChain msgs = null;
			if (inAttribute != null)
				msgs = ((InternalEObject)inAttribute).eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION, Attribute.class, msgs);
			if (newInAttribute != null)
				msgs = ((InternalEObject)newInAttribute).eInverseAdd(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION, Attribute.class, msgs);
			msgs = basicSetInAttribute(newInAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE, newInAttribute, newInAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (inEntityRelationshipModel != null && inEntityRelationshipModel.eIsProxy()) {
			InternalEObject oldInEntityRelationshipModel = (InternalEObject)inEntityRelationshipModel;
			inEntityRelationshipModel = (Entity_Relationship_Model)eResolveProxy(oldInEntityRelationshipModel);
			if (inEntityRelationshipModel != oldInEntityRelationshipModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL, oldInEntityRelationshipModel, inEntityRelationshipModel));
			}
		}
		return inEntityRelationshipModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model basicGetInEntityRelationshipModel() {
		return inEntityRelationshipModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		Entity_Relationship_Model oldInEntityRelationshipModel = inEntityRelationshipModel;
		inEntityRelationshipModel = newInEntityRelationshipModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL, oldInEntityRelationshipModel, inEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_ConnectionEntityRelationship2Attribute getAttribute_connected_to_conection_entityrelationship_to_attribute() {
		if (attribute_connected_to_conection_entityrelationship_to_attribute != null && attribute_connected_to_conection_entityrelationship_to_attribute.eIsProxy()) {
			InternalEObject oldAttribute_connected_to_conection_entityrelationship_to_attribute = (InternalEObject)attribute_connected_to_conection_entityrelationship_to_attribute;
			attribute_connected_to_conection_entityrelationship_to_attribute = (Connection_ConnectionEntityRelationship2Attribute)eResolveProxy(oldAttribute_connected_to_conection_entityrelationship_to_attribute);
			if (attribute_connected_to_conection_entityrelationship_to_attribute != oldAttribute_connected_to_conection_entityrelationship_to_attribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE, oldAttribute_connected_to_conection_entityrelationship_to_attribute, attribute_connected_to_conection_entityrelationship_to_attribute));
			}
		}
		return attribute_connected_to_conection_entityrelationship_to_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_ConnectionEntityRelationship2Attribute basicGetAttribute_connected_to_conection_entityrelationship_to_attribute() {
		return attribute_connected_to_conection_entityrelationship_to_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute_connected_to_conection_entityrelationship_to_attribute(Connection_ConnectionEntityRelationship2Attribute newAttribute_connected_to_conection_entityrelationship_to_attribute, NotificationChain msgs) {
		Connection_ConnectionEntityRelationship2Attribute oldAttribute_connected_to_conection_entityrelationship_to_attribute = attribute_connected_to_conection_entityrelationship_to_attribute;
		attribute_connected_to_conection_entityrelationship_to_attribute = newAttribute_connected_to_conection_entityrelationship_to_attribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE, oldAttribute_connected_to_conection_entityrelationship_to_attribute, newAttribute_connected_to_conection_entityrelationship_to_attribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_connected_to_conection_entityrelationship_to_attribute(Connection_ConnectionEntityRelationship2Attribute newAttribute_connected_to_conection_entityrelationship_to_attribute) {
		if (newAttribute_connected_to_conection_entityrelationship_to_attribute != attribute_connected_to_conection_entityrelationship_to_attribute) {
			NotificationChain msgs = null;
			if (attribute_connected_to_conection_entityrelationship_to_attribute != null)
				msgs = ((InternalEObject)attribute_connected_to_conection_entityrelationship_to_attribute).eInverseRemove(this, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE, Connection_ConnectionEntityRelationship2Attribute.class, msgs);
			if (newAttribute_connected_to_conection_entityrelationship_to_attribute != null)
				msgs = ((InternalEObject)newAttribute_connected_to_conection_entityrelationship_to_attribute).eInverseAdd(this, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE, Connection_ConnectionEntityRelationship2Attribute.class, msgs);
			msgs = basicSetAttribute_connected_to_conection_entityrelationship_to_attribute(newAttribute_connected_to_conection_entityrelationship_to_attribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE, newAttribute_connected_to_conection_entityrelationship_to_attribute, newAttribute_connected_to_conection_entityrelationship_to_attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes_composites()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes_identification()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__CONNECTED:
				if (connected != null)
					msgs = ((InternalEObject)connected).eInverseRemove(this, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__CONNECTION_ATTRIBUTE, Connection_With_Attribute.class, msgs);
				return basicSetConnected((Connection_With_Attribute)otherEnd, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE:
				if (inAttribute != null)
					msgs = ((InternalEObject)inAttribute).eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION, Attribute.class, msgs);
				return basicSetInAttribute((Attribute)otherEnd, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE:
				if (attribute_connected_to_conection_entityrelationship_to_attribute != null)
					msgs = ((InternalEObject)attribute_connected_to_conection_entityrelationship_to_attribute).eInverseRemove(this, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__TARGET_ATTRIBUTE, Connection_ConnectionEntityRelationship2Attribute.class, msgs);
				return basicSetAttribute_connected_to_conection_entityrelationship_to_attribute((Connection_ConnectionEntityRelationship2Attribute)otherEnd, msgs);
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
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES:
				return ((InternalEList<?>)getAttributes_composites()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION:
				return ((InternalEList<?>)getAttributes_identification()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__CONNECTED:
				return basicSetConnected(null, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE:
				return basicSetInAttribute(null, msgs);
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE:
				return basicSetAttribute_connected_to_conection_entityrelationship_to_attribute(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityrelationshipPackage.ATTRIBUTE__NAME_ATTRIBUTE:
				return getName_attribute();
			case EntityrelationshipPackage.ATTRIBUTE__IDENTIFIER:
				return getIdentifier();
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES:
				return getAttributes_composites();
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION:
				return getAttributes_identification();
			case EntityrelationshipPackage.ATTRIBUTE__CONNECTED:
				if (resolve) return getConnected();
				return basicGetConnected();
			case EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE:
				if (resolve) return getInAttribute();
				return basicGetInAttribute();
			case EntityrelationshipPackage.ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				if (resolve) return getInEntityRelationshipModel();
				return basicGetInEntityRelationshipModel();
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE:
				if (resolve) return getAttribute_connected_to_conection_entityrelationship_to_attribute();
				return basicGetAttribute_connected_to_conection_entityrelationship_to_attribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityrelationshipPackage.ATTRIBUTE__NAME_ATTRIBUTE:
				setName_attribute((String)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__IDENTIFIER:
				setIdentifier((TypeIdentifier)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES:
				getAttributes_composites().clear();
				getAttributes_composites().addAll((Collection<? extends Attribute_Composite>)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION:
				getAttributes_identification().clear();
				getAttributes_identification().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__CONNECTED:
				setConnected((Connection_With_Attribute)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE:
				setInAttribute((Attribute)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				setInEntityRelationshipModel((Entity_Relationship_Model)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE:
				setAttribute_connected_to_conection_entityrelationship_to_attribute((Connection_ConnectionEntityRelationship2Attribute)newValue);
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
			case EntityrelationshipPackage.ATTRIBUTE__NAME_ATTRIBUTE:
				setName_attribute(NAME_ATTRIBUTE_EDEFAULT);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES:
				getAttributes_composites().clear();
				return;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION:
				getAttributes_identification().clear();
				return;
			case EntityrelationshipPackage.ATTRIBUTE__CONNECTED:
				setConnected((Connection_With_Attribute)null);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE:
				setInAttribute((Attribute)null);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				setInEntityRelationshipModel((Entity_Relationship_Model)null);
				return;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE:
				setAttribute_connected_to_conection_entityrelationship_to_attribute((Connection_ConnectionEntityRelationship2Attribute)null);
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
			case EntityrelationshipPackage.ATTRIBUTE__NAME_ATTRIBUTE:
				return NAME_ATTRIBUTE_EDEFAULT == null ? name_attribute != null : !NAME_ATTRIBUTE_EDEFAULT.equals(name_attribute);
			case EntityrelationshipPackage.ATTRIBUTE__IDENTIFIER:
				return identifier != IDENTIFIER_EDEFAULT;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES:
				return attributes_composites != null && !attributes_composites.isEmpty();
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_IDENTIFICATION:
				return attributes_identification != null && !attributes_identification.isEmpty();
			case EntityrelationshipPackage.ATTRIBUTE__CONNECTED:
				return connected != null;
			case EntityrelationshipPackage.ATTRIBUTE__IN_ATTRIBUTE:
				return inAttribute != null;
			case EntityrelationshipPackage.ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL:
				return inEntityRelationshipModel != null;
			case EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTE_CONNECTED_TO_CONECTION_ENTITYRELATIONSHIP_TO_ATTRIBUTE:
				return attribute_connected_to_conection_entityrelationship_to_attribute != null;
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
		result.append(" (name_attribute: ");
		result.append(name_attribute);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
