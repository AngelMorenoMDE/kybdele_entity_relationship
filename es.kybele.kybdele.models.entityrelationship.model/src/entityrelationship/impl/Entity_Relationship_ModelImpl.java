/**
 */
package entityrelationship.impl;

import entityrelationship.Attribute;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Elements_with_Attributes;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.Relationships_Restriction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relationship Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_E <em>ERM Has E</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_Rt <em>ERM Has Rt</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_ConnectionEntity2Relationship <em>ERM Has Connection Entity2 Relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_ConnectionRelationship2Entity <em>ERM Has Connection Relationship2 Entity</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_HasConnectionEntityRelationship2Attribute <em>ERM Has Connection Entity Relationship2 Attribute</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_Gen <em>ERM Has Gen</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_Rt2 <em>ERM Has Rt2</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_CEA <em>ERM Has CEA</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_At <em>ERM Has At</em>}</li>
 *   <li>{@link entityrelationship.impl.Entity_Relationship_ModelImpl#getERM_Has_G <em>ERM Has G</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Entity_Relationship_ModelImpl extends MinimalEObjectImpl.Container implements Entity_Relationship_Model {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getERM_Has_E() <em>ERM Has E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_E()
	 * @generated
	 * @ordered
	 */
	protected EList<Elements_with_Attributes> erM_Has_E;

	/**
	 * The cached value of the '{@link #getERM_Has_Rt() <em>ERM Has Rt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_Rt()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationships_Restriction> erM_Has_Rt;

	/**
	 * The cached value of the '{@link #getERM_Has_ConnectionEntity2Relationship() <em>ERM Has Connection Entity2 Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_ConnectionEntity2Relationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Entity2Relationship> erM_Has_ConnectionEntity2Relationship;

	/**
	 * The cached value of the '{@link #getERM_Has_ConnectionRelationship2Entity() <em>ERM Has Connection Relationship2 Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_ConnectionRelationship2Entity()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Relationship2Entity> erM_Has_ConnectionRelationship2Entity;

	/**
	 * The cached value of the '{@link #getERM_HasConnectionEntityRelationship2Attribute() <em>ERM Has Connection Entity Relationship2 Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_HasConnectionEntityRelationship2Attribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_ConnectionEntityRelationship2Attribute> erM_HasConnectionEntityRelationship2Attribute;

	/**
	 * The cached value of the '{@link #getERM_Has_Gen() <em>ERM Has Gen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_Gen()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Generalization_Entity> erM_Has_Gen;

	/**
	 * The cached value of the '{@link #getERM_Has_Rt2() <em>ERM Has Rt2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_Rt2()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_E_R_Restriction> erM_Has_Rt2;

	/**
	 * The cached value of the '{@link #getERM_Has_CEA() <em>ERM Has CEA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_CEA()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_With_Attribute> erM_Has_CEA;

	/**
	 * The cached value of the '{@link #getERM_Has_At() <em>ERM Has At</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_At()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> erM_Has_At;

	/**
	 * The cached value of the '{@link #getERM_Has_G() <em>ERM Has G</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERM_Has_G()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> erM_Has_G;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entity_Relationship_ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.ENTITY_RELATIONSHIP_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elements_with_Attributes> getERM_Has_E() {
		if (erM_Has_E == null) {
			erM_Has_E = new EObjectContainmentWithInverseEList<Elements_with_Attributes>(Elements_with_Attributes.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E, EntityrelationshipPackage.ELEMENTS_WITH_ATTRIBUTES__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_E;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationships_Restriction> getERM_Has_Rt() {
		if (erM_Has_Rt == null) {
			erM_Has_Rt = new EObjectContainmentWithInverseEList<Relationships_Restriction>(Relationships_Restriction.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_Rt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Entity2Relationship> getERM_Has_ConnectionEntity2Relationship() {
		if (erM_Has_ConnectionEntity2Relationship == null) {
			erM_Has_ConnectionEntity2Relationship = new EObjectContainmentWithInverseEList<Connection_Entity2Relationship>(Connection_Entity2Relationship.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_ConnectionEntity2Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Relationship2Entity> getERM_Has_ConnectionRelationship2Entity() {
		if (erM_Has_ConnectionRelationship2Entity == null) {
			erM_Has_ConnectionRelationship2Entity = new EObjectContainmentWithInverseEList<Connection_Relationship2Entity>(Connection_Relationship2Entity.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_ConnectionRelationship2Entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_ConnectionEntityRelationship2Attribute> getERM_HasConnectionEntityRelationship2Attribute() {
		if (erM_HasConnectionEntityRelationship2Attribute == null) {
			erM_HasConnectionEntityRelationship2Attribute = new EObjectContainmentWithInverseEList<Connection_ConnectionEntityRelationship2Attribute>(Connection_ConnectionEntityRelationship2Attribute.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE, EntityrelationshipPackage.CONNECTION_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_HasConnectionEntityRelationship2Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Generalization_Entity> getERM_Has_Gen() {
		if (erM_Has_Gen == null) {
			erM_Has_Gen = new EObjectContainmentWithInverseEList<Connection_Generalization_Entity>(Connection_Generalization_Entity.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN, EntityrelationshipPackage.CONNECTION_GENERALIZATION_ENTITY__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_Gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_E_R_Restriction> getERM_Has_Rt2() {
		if (erM_Has_Rt2 == null) {
			erM_Has_Rt2 = new EObjectContainmentWithInverseEList<Connection_E_R_Restriction>(Connection_E_R_Restriction.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2, EntityrelationshipPackage.CONNECTION_ERRESTRICTION__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_Rt2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_With_Attribute> getERM_Has_CEA() {
		if (erM_Has_CEA == null) {
			erM_Has_CEA = new EObjectContainmentWithInverseEList<Connection_With_Attribute>(Connection_With_Attribute.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA, EntityrelationshipPackage.CONNECTION_WITH_ATTRIBUTE__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_CEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getERM_Has_At() {
		if (erM_Has_At == null) {
			erM_Has_At = new EObjectContainmentEList<Attribute>(Attribute.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT);
		}
		return erM_Has_At;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getERM_Has_G() {
		if (erM_Has_G == null) {
			erM_Has_G = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G, EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL);
		}
		return erM_Has_G;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_E()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_Rt()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_ConnectionEntity2Relationship()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_ConnectionRelationship2Entity()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_HasConnectionEntityRelationship2Attribute()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_Gen()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_Rt2()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_CEA()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getERM_Has_G()).basicAdd(otherEnd, msgs);
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
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
				return ((InternalEList<?>)getERM_Has_E()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
				return ((InternalEList<?>)getERM_Has_Rt()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
				return ((InternalEList<?>)getERM_Has_ConnectionEntity2Relationship()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
				return ((InternalEList<?>)getERM_Has_ConnectionRelationship2Entity()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
				return ((InternalEList<?>)getERM_HasConnectionEntityRelationship2Attribute()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
				return ((InternalEList<?>)getERM_Has_Gen()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
				return ((InternalEList<?>)getERM_Has_Rt2()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
				return ((InternalEList<?>)getERM_Has_CEA()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT:
				return ((InternalEList<?>)getERM_Has_At()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				return ((InternalEList<?>)getERM_Has_G()).basicRemove(otherEnd, msgs);
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
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__NAME:
				return getName();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
				return getERM_Has_E();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
				return getERM_Has_Rt();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
				return getERM_Has_ConnectionEntity2Relationship();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
				return getERM_Has_ConnectionRelationship2Entity();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
				return getERM_HasConnectionEntityRelationship2Attribute();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
				return getERM_Has_Gen();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
				return getERM_Has_Rt2();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
				return getERM_Has_CEA();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT:
				return getERM_Has_At();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				return getERM_Has_G();
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
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__NAME:
				setName((String)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
				getERM_Has_E().clear();
				getERM_Has_E().addAll((Collection<? extends Elements_with_Attributes>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
				getERM_Has_Rt().clear();
				getERM_Has_Rt().addAll((Collection<? extends Relationships_Restriction>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
				getERM_Has_ConnectionEntity2Relationship().clear();
				getERM_Has_ConnectionEntity2Relationship().addAll((Collection<? extends Connection_Entity2Relationship>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
				getERM_Has_ConnectionRelationship2Entity().clear();
				getERM_Has_ConnectionRelationship2Entity().addAll((Collection<? extends Connection_Relationship2Entity>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
				getERM_HasConnectionEntityRelationship2Attribute().clear();
				getERM_HasConnectionEntityRelationship2Attribute().addAll((Collection<? extends Connection_ConnectionEntityRelationship2Attribute>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
				getERM_Has_Gen().clear();
				getERM_Has_Gen().addAll((Collection<? extends Connection_Generalization_Entity>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
				getERM_Has_Rt2().clear();
				getERM_Has_Rt2().addAll((Collection<? extends Connection_E_R_Restriction>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
				getERM_Has_CEA().clear();
				getERM_Has_CEA().addAll((Collection<? extends Connection_With_Attribute>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT:
				getERM_Has_At().clear();
				getERM_Has_At().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				getERM_Has_G().clear();
				getERM_Has_G().addAll((Collection<? extends Generalization>)newValue);
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
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
				getERM_Has_E().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
				getERM_Has_Rt().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
				getERM_Has_ConnectionEntity2Relationship().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
				getERM_Has_ConnectionRelationship2Entity().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
				getERM_HasConnectionEntityRelationship2Attribute().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
				getERM_Has_Gen().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
				getERM_Has_Rt2().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
				getERM_Has_CEA().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT:
				getERM_Has_At().clear();
				return;
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				getERM_Has_G().clear();
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
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_E:
				return erM_Has_E != null && !erM_Has_E.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT:
				return erM_Has_Rt != null && !erM_Has_Rt.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY2_RELATIONSHIP:
				return erM_Has_ConnectionEntity2Relationship != null && !erM_Has_ConnectionEntity2Relationship.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_RELATIONSHIP2_ENTITY:
				return erM_Has_ConnectionRelationship2Entity != null && !erM_Has_ConnectionRelationship2Entity.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CONNECTION_ENTITY_RELATIONSHIP2_ATTRIBUTE:
				return erM_HasConnectionEntityRelationship2Attribute != null && !erM_HasConnectionEntityRelationship2Attribute.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_GEN:
				return erM_Has_Gen != null && !erM_Has_Gen.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_RT2:
				return erM_Has_Rt2 != null && !erM_Has_Rt2.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_CEA:
				return erM_Has_CEA != null && !erM_Has_CEA.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_AT:
				return erM_Has_At != null && !erM_Has_At.isEmpty();
			case EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G:
				return erM_Has_G != null && !erM_Has_G.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Entity_Relationship_ModelImpl
