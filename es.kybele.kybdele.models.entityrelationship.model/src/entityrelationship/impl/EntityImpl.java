/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Entity;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.TypeEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.EntityImpl#getName_entity <em>Name entity</em>}</li>
 *   <li>{@link entityrelationship.impl.EntityImpl#getType_entity <em>Type entity</em>}</li>
 *   <li>{@link entityrelationship.impl.EntityImpl#getEntity_connected_to_entity2relationship <em>Entity connected to entity2relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.EntityImpl#getEntity_connected_to_relationship2entity <em>Entity connected to relationship2entity</em>}</li>
 *   <li>{@link entityrelationship.impl.EntityImpl#getSubclass_generalizations <em>Subclass generalizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends Elements_with_AttributesImpl implements Entity {
	/**
	 * The default value of the '{@link #getName_entity() <em>Name entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_entity()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_entity() <em>Name entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_entity()
	 * @generated
	 * @ordered
	 */
	protected String name_entity = NAME_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_entity() <em>Type entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_entity()
	 * @generated
	 * @ordered
	 */
	protected static final TypeEntity TYPE_ENTITY_EDEFAULT = TypeEntity.WEAK;

	/**
	 * The cached value of the '{@link #getType_entity() <em>Type entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_entity()
	 * @generated
	 * @ordered
	 */
	protected TypeEntity type_entity = TYPE_ENTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity_connected_to_entity2relationship() <em>Entity connected to entity2relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_connected_to_entity2relationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Entity2Relationship> entity_connected_to_entity2relationship;

	/**
	 * The cached value of the '{@link #getEntity_connected_to_relationship2entity() <em>Entity connected to relationship2entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_connected_to_relationship2entity()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Relationship2Entity> entity_connected_to_relationship2entity;

	/**
	 * The cached value of the '{@link #getSubclass_generalizations() <em>Subclass generalizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclass_generalizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> subclass_generalizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_entity() {
		return name_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_entity(String newName_entity) {
		String oldName_entity = name_entity;
		name_entity = newName_entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ENTITY__NAME_ENTITY, oldName_entity, name_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEntity getType_entity() {
		return type_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_entity(TypeEntity newType_entity) {
		TypeEntity oldType_entity = type_entity;
		type_entity = newType_entity == null ? TYPE_ENTITY_EDEFAULT : newType_entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ENTITY__TYPE_ENTITY, oldType_entity, type_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Entity2Relationship> getEntity_connected_to_entity2relationship() {
		if (entity_connected_to_entity2relationship == null) {
			entity_connected_to_entity2relationship = new EObjectWithInverseEList<Connection_Entity2Relationship>(Connection_Entity2Relationship.class, this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__SOURCE_ENTITY);
		}
		return entity_connected_to_entity2relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Relationship2Entity> getEntity_connected_to_relationship2entity() {
		if (entity_connected_to_relationship2entity == null) {
			entity_connected_to_relationship2entity = new EObjectWithInverseEList<Connection_Relationship2Entity>(Connection_Relationship2Entity.class, this, EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__TARGET_ENTITY);
		}
		return entity_connected_to_relationship2entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getSubclass_generalizations() {
		if (subclass_generalizations == null) {
			subclass_generalizations = new EObjectWithInverseResolvingEList.ManyInverse<Generalization>(Generalization.class, this, EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS, EntityrelationshipPackage.GENERALIZATION__SUBCLASSES);
		}
		return subclass_generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntity_connected_to_entity2relationship()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntity_connected_to_relationship2entity()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubclass_generalizations()).basicAdd(otherEnd, msgs);
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
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return ((InternalEList<?>)getEntity_connected_to_entity2relationship()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return ((InternalEList<?>)getEntity_connected_to_relationship2entity()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS:
				return ((InternalEList<?>)getSubclass_generalizations()).basicRemove(otherEnd, msgs);
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
			case EntityrelationshipPackage.ENTITY__NAME_ENTITY:
				return getName_entity();
			case EntityrelationshipPackage.ENTITY__TYPE_ENTITY:
				return getType_entity();
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return getEntity_connected_to_entity2relationship();
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return getEntity_connected_to_relationship2entity();
			case EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS:
				return getSubclass_generalizations();
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
			case EntityrelationshipPackage.ENTITY__NAME_ENTITY:
				setName_entity((String)newValue);
				return;
			case EntityrelationshipPackage.ENTITY__TYPE_ENTITY:
				setType_entity((TypeEntity)newValue);
				return;
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP:
				getEntity_connected_to_entity2relationship().clear();
				getEntity_connected_to_entity2relationship().addAll((Collection<? extends Connection_Entity2Relationship>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY:
				getEntity_connected_to_relationship2entity().clear();
				getEntity_connected_to_relationship2entity().addAll((Collection<? extends Connection_Relationship2Entity>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS:
				getSubclass_generalizations().clear();
				getSubclass_generalizations().addAll((Collection<? extends Generalization>)newValue);
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
			case EntityrelationshipPackage.ENTITY__NAME_ENTITY:
				setName_entity(NAME_ENTITY_EDEFAULT);
				return;
			case EntityrelationshipPackage.ENTITY__TYPE_ENTITY:
				setType_entity(TYPE_ENTITY_EDEFAULT);
				return;
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP:
				getEntity_connected_to_entity2relationship().clear();
				return;
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY:
				getEntity_connected_to_relationship2entity().clear();
				return;
			case EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS:
				getSubclass_generalizations().clear();
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
			case EntityrelationshipPackage.ENTITY__NAME_ENTITY:
				return NAME_ENTITY_EDEFAULT == null ? name_entity != null : !NAME_ENTITY_EDEFAULT.equals(name_entity);
			case EntityrelationshipPackage.ENTITY__TYPE_ENTITY:
				return type_entity != TYPE_ENTITY_EDEFAULT;
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return entity_connected_to_entity2relationship != null && !entity_connected_to_entity2relationship.isEmpty();
			case EntityrelationshipPackage.ENTITY__ENTITY_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return entity_connected_to_relationship2entity != null && !entity_connected_to_relationship2entity.isEmpty();
			case EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS:
				return subclass_generalizations != null && !subclass_generalizations.isEmpty();
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
		result.append(" (name_entity: ");
		result.append(name_entity);
		result.append(", type_entity: ");
		result.append(type_entity);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
