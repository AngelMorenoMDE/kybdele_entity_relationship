/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.TypeIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Attribute_CompositeImpl#getName_at_composite <em>Name at composite</em>}</li>
 *   <li>{@link entityrelationship.impl.Attribute_CompositeImpl#getIdentifier_at_composite <em>Identifier at composite</em>}</li>
 *   <li>{@link entityrelationship.impl.Attribute_CompositeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link entityrelationship.impl.Attribute_CompositeImpl#getInAttribute <em>In Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Attribute_CompositeImpl extends MinimalEObjectImpl.Container implements Attribute_Composite {
	/**
	 * The default value of the '{@link #getName_at_composite() <em>Name at composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_at_composite()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_AT_COMPOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_at_composite() <em>Name at composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_at_composite()
	 * @generated
	 * @ordered
	 */
	protected String name_at_composite = NAME_AT_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier_at_composite() <em>Identifier at composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier_at_composite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeIdentifier IDENTIFIER_AT_COMPOSITE_EDEFAULT = TypeIdentifier.NO_IDENTIFIER;

	/**
	 * The cached value of the '{@link #getIdentifier_at_composite() <em>Identifier at composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier_at_composite()
	 * @generated
	 * @ordered
	 */
	protected TypeIdentifier identifier_at_composite = IDENTIFIER_AT_COMPOSITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attribute_CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.ATTRIBUTE_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_at_composite() {
		return name_at_composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_at_composite(String newName_at_composite) {
		String oldName_at_composite = name_at_composite;
		name_at_composite = newName_at_composite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE, oldName_at_composite, name_at_composite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeIdentifier getIdentifier_at_composite() {
		return identifier_at_composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier_at_composite(TypeIdentifier newIdentifier_at_composite) {
		TypeIdentifier oldIdentifier_at_composite = identifier_at_composite;
		identifier_at_composite = newIdentifier_at_composite == null ? IDENTIFIER_AT_COMPOSITE_EDEFAULT : newIdentifier_at_composite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE, oldIdentifier_at_composite, identifier_at_composite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributes() {
		if (attributes != null && attributes.eIsProxy()) {
			InternalEObject oldAttributes = (InternalEObject)attributes;
			attributes = (Attribute)eResolveProxy(oldAttributes);
			if (attributes != oldAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__ATTRIBUTES, oldAttributes, attributes));
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		Attribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getInAttribute() {
		if (eContainerFeatureID() != EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE) return null;
		return (Attribute)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInAttribute(Attribute newInAttribute, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInAttribute, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInAttribute(Attribute newInAttribute) {
		if (newInAttribute != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE && newInAttribute != null)) {
			if (EcoreUtil.isAncestor(this, newInAttribute))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInAttribute != null)
				msgs = ((InternalEObject)newInAttribute).eInverseAdd(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES, Attribute.class, msgs);
			msgs = basicSetInAttribute(newInAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE, newInAttribute, newInAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInAttribute((Attribute)otherEnd, msgs);
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
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				return basicSetInAttribute(null, msgs);
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
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ATTRIBUTE__ATTRIBUTES_COMPOSITES, Attribute.class, msgs);
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
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE:
				return getName_at_composite();
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE:
				return getIdentifier_at_composite();
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__ATTRIBUTES:
				if (resolve) return getAttributes();
				return basicGetAttributes();
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				return getInAttribute();
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
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE:
				setName_at_composite((String)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE:
				setIdentifier_at_composite((TypeIdentifier)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__ATTRIBUTES:
				setAttributes((Attribute)newValue);
				return;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				setInAttribute((Attribute)newValue);
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
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE:
				setName_at_composite(NAME_AT_COMPOSITE_EDEFAULT);
				return;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE:
				setIdentifier_at_composite(IDENTIFIER_AT_COMPOSITE_EDEFAULT);
				return;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__ATTRIBUTES:
				setAttributes((Attribute)null);
				return;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				setInAttribute((Attribute)null);
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
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__NAME_AT_COMPOSITE:
				return NAME_AT_COMPOSITE_EDEFAULT == null ? name_at_composite != null : !NAME_AT_COMPOSITE_EDEFAULT.equals(name_at_composite);
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IDENTIFIER_AT_COMPOSITE:
				return identifier_at_composite != IDENTIFIER_AT_COMPOSITE_EDEFAULT;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__ATTRIBUTES:
				return attributes != null;
			case EntityrelationshipPackage.ATTRIBUTE_COMPOSITE__IN_ATTRIBUTE:
				return getInAttribute() != null;
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
		result.append(" (name_at_composite: ");
		result.append(name_at_composite);
		result.append(", identifier_at_composite: ");
		result.append(identifier_at_composite);
		result.append(')');
		return result.toString();
	}

} //Attribute_CompositeImpl
