/**
 */
package entityrelationship.impl;

import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.TypeRestriction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationships Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Relationships_RestrictionImpl#getType_restriction <em>Type restriction</em>}</li>
 *   <li>{@link entityrelationship.impl.Relationships_RestrictionImpl#getSource_relationship <em>Source relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Relationships_RestrictionImpl#getTarget_relationship <em>Target relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Relationships_RestrictionImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relationships_RestrictionImpl extends MinimalEObjectImpl.Container implements Relationships_Restriction {
	/**
	 * The default value of the '{@link #getType_restriction() <em>Type restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_restriction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRestriction TYPE_RESTRICTION_EDEFAULT = TypeRestriction.EXCLUSION;

	/**
	 * The cached value of the '{@link #getType_restriction() <em>Type restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_restriction()
	 * @generated
	 * @ordered
	 */
	protected TypeRestriction type_restriction = TYPE_RESTRICTION_EDEFAULT;

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
	protected Relationships_RestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.RELATIONSHIPS_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestriction getType_restriction() {
		return type_restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_restriction(TypeRestriction newType_restriction) {
		TypeRestriction oldType_restriction = type_restriction;
		type_restriction = newType_restriction == null ? TYPE_RESTRICTION_EDEFAULT : newType_restriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION, oldType_restriction, type_restriction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP, oldSource_relationship, source_relationship));
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
	public void setSource_relationship(Relationship newSource_relationship) {
		Relationship oldSource_relationship = source_relationship;
		source_relationship = newSource_relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP, oldSource_relationship, source_relationship));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP, oldTarget_relationship, target_relationship));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP, oldTarget_relationship, newTarget_relationship);
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
				msgs = ((InternalEObject)target_relationship).eInverseRemove(this, EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS, Relationship.class, msgs);
			if (newTarget_relationship != null)
				msgs = ((InternalEObject)newTarget_relationship).eInverseAdd(this, EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS, Relationship.class, msgs);
			msgs = basicSetTarget_relationship(newTarget_relationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP, newTarget_relationship, newTarget_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP:
				if (target_relationship != null)
					msgs = ((InternalEObject)target_relationship).eInverseRemove(this, EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS, Relationship.class, msgs);
				return basicSetTarget_relationship((Relationship)otherEnd, msgs);
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP:
				return basicSetTarget_relationship(null, msgs);
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION:
				return getType_restriction();
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP:
				if (resolve) return getSource_relationship();
				return basicGetSource_relationship();
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP:
				if (resolve) return getTarget_relationship();
				return basicGetTarget_relationship();
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION:
				setType_restriction((TypeRestriction)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP:
				setSource_relationship((Relationship)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP:
				setTarget_relationship((Relationship)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION:
				setType_restriction(TYPE_RESTRICTION_EDEFAULT);
				return;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP:
				setSource_relationship((Relationship)null);
				return;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP:
				setTarget_relationship((Relationship)null);
				return;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TYPE_RESTRICTION:
				return type_restriction != TYPE_RESTRICTION_EDEFAULT;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__SOURCE_RELATIONSHIP:
				return source_relationship != null;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP:
				return target_relationship != null;
			case EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL:
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

} //Relationships_RestrictionImpl
