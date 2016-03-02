/**
 */
package entityrelationship.impl;

import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.TypeRestrictionInheritance1;
import entityrelationship.TypeRestrictionInheritance2;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.GeneralizationImpl#getRestriction_inheritance_1 <em>Restriction inheritance 1</em>}</li>
 *   <li>{@link entityrelationship.impl.GeneralizationImpl#getRestriction_inheritance_2 <em>Restriction inheritance 2</em>}</li>
 *   <li>{@link entityrelationship.impl.GeneralizationImpl#getSubclasses <em>Subclasses</em>}</li>
 *   <li>{@link entityrelationship.impl.GeneralizationImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link entityrelationship.impl.GeneralizationImpl#getInEntityRelationshipModel <em>In Entity Relationship Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends MinimalEObjectImpl.Container implements Generalization {
	/**
	 * The default value of the '{@link #getRestriction_inheritance_1() <em>Restriction inheritance 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction_inheritance_1()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRestrictionInheritance1 RESTRICTION_INHERITANCE_1_EDEFAULT = TypeRestrictionInheritance1.TOTAL;

	/**
	 * The cached value of the '{@link #getRestriction_inheritance_1() <em>Restriction inheritance 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction_inheritance_1()
	 * @generated
	 * @ordered
	 */
	protected TypeRestrictionInheritance1 restriction_inheritance_1 = RESTRICTION_INHERITANCE_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestriction_inheritance_2() <em>Restriction inheritance 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction_inheritance_2()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRestrictionInheritance2 RESTRICTION_INHERITANCE_2_EDEFAULT = TypeRestrictionInheritance2.EXCLUSIVE;

	/**
	 * The cached value of the '{@link #getRestriction_inheritance_2() <em>Restriction inheritance 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction_inheritance_2()
	 * @generated
	 * @ordered
	 */
	protected TypeRestrictionInheritance2 restriction_inheritance_2 = RESTRICTION_INHERITANCE_2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubclasses() <em>Subclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> subclasses;

	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected Entity superclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestrictionInheritance1 getRestriction_inheritance_1() {
		return restriction_inheritance_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction_inheritance_1(TypeRestrictionInheritance1 newRestriction_inheritance_1) {
		TypeRestrictionInheritance1 oldRestriction_inheritance_1 = restriction_inheritance_1;
		restriction_inheritance_1 = newRestriction_inheritance_1 == null ? RESTRICTION_INHERITANCE_1_EDEFAULT : newRestriction_inheritance_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_1, oldRestriction_inheritance_1, restriction_inheritance_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestrictionInheritance2 getRestriction_inheritance_2() {
		return restriction_inheritance_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction_inheritance_2(TypeRestrictionInheritance2 newRestriction_inheritance_2) {
		TypeRestrictionInheritance2 oldRestriction_inheritance_2 = restriction_inheritance_2;
		restriction_inheritance_2 = newRestriction_inheritance_2 == null ? RESTRICTION_INHERITANCE_2_EDEFAULT : newRestriction_inheritance_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_2, oldRestriction_inheritance_2, restriction_inheritance_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getSubclasses() {
		if (subclasses == null) {
			subclasses = new EObjectWithInverseResolvingEList.ManyInverse<Entity>(Entity.class, this, EntityrelationshipPackage.GENERALIZATION__SUBCLASSES, EntityrelationshipPackage.ENTITY__SUBCLASS_GENERALIZATIONS);
		}
		return subclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (Entity)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.GENERALIZATION__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(Entity newSuperclass) {
		Entity oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.GENERALIZATION__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_Model getInEntityRelationshipModel() {
		if (eContainerFeatureID() != EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL) return null;
		return (Entity_Relationship_Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInEntityRelationshipModel, EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEntityRelationshipModel(Entity_Relationship_Model newInEntityRelationshipModel) {
		if (newInEntityRelationshipModel != eInternalContainer() || (eContainerFeatureID() != EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL && newInEntityRelationshipModel != null)) {
			if (EcoreUtil.isAncestor(this, newInEntityRelationshipModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInEntityRelationshipModel != null)
				msgs = ((InternalEObject)newInEntityRelationshipModel).eInverseAdd(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G, Entity_Relationship_Model.class, msgs);
			msgs = basicSetInEntityRelationshipModel(newInEntityRelationshipModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL, newInEntityRelationshipModel, newInEntityRelationshipModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.GENERALIZATION__SUBCLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubclasses()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.GENERALIZATION__SUBCLASSES:
				return ((InternalEList<?>)getSubclasses()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
				return eInternalContainer().eInverseRemove(this, EntityrelationshipPackage.ENTITY_RELATIONSHIP_MODEL__ERM_HAS_G, Entity_Relationship_Model.class, msgs);
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
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_1:
				return getRestriction_inheritance_1();
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_2:
				return getRestriction_inheritance_2();
			case EntityrelationshipPackage.GENERALIZATION__SUBCLASSES:
				return getSubclasses();
			case EntityrelationshipPackage.GENERALIZATION__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
				return getInEntityRelationshipModel();
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
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_1:
				setRestriction_inheritance_1((TypeRestrictionInheritance1)newValue);
				return;
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_2:
				setRestriction_inheritance_2((TypeRestrictionInheritance2)newValue);
				return;
			case EntityrelationshipPackage.GENERALIZATION__SUBCLASSES:
				getSubclasses().clear();
				getSubclasses().addAll((Collection<? extends Entity>)newValue);
				return;
			case EntityrelationshipPackage.GENERALIZATION__SUPERCLASS:
				setSuperclass((Entity)newValue);
				return;
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_1:
				setRestriction_inheritance_1(RESTRICTION_INHERITANCE_1_EDEFAULT);
				return;
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_2:
				setRestriction_inheritance_2(RESTRICTION_INHERITANCE_2_EDEFAULT);
				return;
			case EntityrelationshipPackage.GENERALIZATION__SUBCLASSES:
				getSubclasses().clear();
				return;
			case EntityrelationshipPackage.GENERALIZATION__SUPERCLASS:
				setSuperclass((Entity)null);
				return;
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
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
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_1:
				return restriction_inheritance_1 != RESTRICTION_INHERITANCE_1_EDEFAULT;
			case EntityrelationshipPackage.GENERALIZATION__RESTRICTION_INHERITANCE_2:
				return restriction_inheritance_2 != RESTRICTION_INHERITANCE_2_EDEFAULT;
			case EntityrelationshipPackage.GENERALIZATION__SUBCLASSES:
				return subclasses != null && !subclasses.isEmpty();
			case EntityrelationshipPackage.GENERALIZATION__SUPERCLASS:
				return superclass != null;
			case EntityrelationshipPackage.GENERALIZATION__IN_ENTITY_RELATIONSHIP_MODEL:
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
		result.append(" (restriction_inheritance_1: ");
		result.append(restriction_inheritance_1);
		result.append(", restriction_inheritance_2: ");
		result.append(restriction_inheritance_2);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
