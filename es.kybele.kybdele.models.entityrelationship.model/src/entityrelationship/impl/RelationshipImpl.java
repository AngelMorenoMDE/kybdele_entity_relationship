/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.TypeRelationship;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

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
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getName_relationship <em>Name relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getType_relationship <em>Type relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getSource_restrictions <em>Source restrictions</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getTarget_restrictions <em>Target restrictions</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getRelationship_connected_to_entity2relationship <em>Relationship connected to entity2relationship</em>}</li>
 *   <li>{@link entityrelationship.impl.RelationshipImpl#getRelationship_connected_to_relationship2entity <em>Relationship connected to relationship2entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends Elements_with_AttributesImpl implements Relationship {
	/**
	 * The default value of the '{@link #getName_relationship() <em>Name relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_relationship()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_RELATIONSHIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_relationship() <em>Name relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_relationship()
	 * @generated
	 * @ordered
	 */
	protected String name_relationship = NAME_RELATIONSHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_relationship() <em>Type relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_relationship()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRelationship TYPE_RELATIONSHIP_EDEFAULT = TypeRelationship.REGULAR;

	/**
	 * The cached value of the '{@link #getType_relationship() <em>Type relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_relationship()
	 * @generated
	 * @ordered
	 */
	protected TypeRelationship type_relationship = TYPE_RELATIONSHIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource_restrictions() <em>Source restrictions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_restrictions()
	 * @generated
	 * @ordered
	 */
	protected Relationships_Restriction source_restrictions;

	/**
	 * The cached value of the '{@link #getTarget_restrictions() <em>Target restrictions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_restrictions()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationships_Restriction> target_restrictions;

	/**
	 * The cached value of the '{@link #getRelationship_connected_to_entity2relationship() <em>Relationship connected to entity2relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_connected_to_entity2relationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Entity2Relationship> relationship_connected_to_entity2relationship;

	/**
	 * The cached value of the '{@link #getRelationship_connected_to_relationship2entity() <em>Relationship connected to relationship2entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship_connected_to_relationship2entity()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_Relationship2Entity> relationship_connected_to_relationship2entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_relationship() {
		return name_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_relationship(String newName_relationship) {
		String oldName_relationship = name_relationship;
		name_relationship = newName_relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIP__NAME_RELATIONSHIP, oldName_relationship, name_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIP__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIP__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelationship getType_relationship() {
		return type_relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_relationship(TypeRelationship newType_relationship) {
		TypeRelationship oldType_relationship = type_relationship;
		type_relationship = newType_relationship == null ? TYPE_RELATIONSHIP_EDEFAULT : newType_relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIP__TYPE_RELATIONSHIP, oldType_relationship, type_relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationships_Restriction getSource_restrictions() {
		if (source_restrictions != null && source_restrictions.eIsProxy()) {
			InternalEObject oldSource_restrictions = (InternalEObject)source_restrictions;
			source_restrictions = (Relationships_Restriction)eResolveProxy(oldSource_restrictions);
			if (source_restrictions != oldSource_restrictions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityrelationshipPackage.RELATIONSHIP__SOURCE_RESTRICTIONS, oldSource_restrictions, source_restrictions));
			}
		}
		return source_restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationships_Restriction basicGetSource_restrictions() {
		return source_restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_restrictions(Relationships_Restriction newSource_restrictions) {
		Relationships_Restriction oldSource_restrictions = source_restrictions;
		source_restrictions = newSource_restrictions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.RELATIONSHIP__SOURCE_RESTRICTIONS, oldSource_restrictions, source_restrictions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationships_Restriction> getTarget_restrictions() {
		if (target_restrictions == null) {
			target_restrictions = new EObjectWithInverseResolvingEList<Relationships_Restriction>(Relationships_Restriction.class, this, EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS, EntityrelationshipPackage.RELATIONSHIPS_RESTRICTION__TARGET_RELATIONSHIP);
		}
		return target_restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Entity2Relationship> getRelationship_connected_to_entity2relationship() {
		if (relationship_connected_to_entity2relationship == null) {
			relationship_connected_to_entity2relationship = new EObjectWithInverseEList<Connection_Entity2Relationship>(Connection_Entity2Relationship.class, this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP, EntityrelationshipPackage.CONNECTION_ENTITY2_RELATIONSHIP__TARGET_RELATIONSHIP);
		}
		
		LinkedList<String> maxCardinalitiesList = new LinkedList<>();
		
		if (relationship_connected_to_entity2relationship != null)
		{
			for (Connection_Entity2Relationship _cer : relationship_connected_to_entity2relationship) 
			{
				maxCardinalitiesList.add(_cer.getMaximum_cardinality());
			}
			
		}

		if (relationship_connected_to_relationship2entity != null)
		{
			for (Connection_Relationship2Entity _cre : relationship_connected_to_relationship2entity) 
			{
				maxCardinalitiesList.add(_cre.getMaximum_cardinality());
			}			
		}		

		Collections.sort(maxCardinalitiesList);

		int n_conex = 0;
		for(String _cardinality : maxCardinalitiesList)
		{
			if(_cardinality.equals("n"))
			{
				n_conex++;
			}
			else
			{
				try 
				{
					int _cardinalityNumeric = Integer.valueOf(_cardinality);
					
					if (_cardinalityNumeric > 1) n_conex++;
				} 
				catch (NumberFormatException e) 
				{
					
				}
			}
		}
		
		if (n_conex > 1)
		{
			cardinality = "N:M";
		}
		else if (n_conex == 1)
		{
			cardinality = "1:N";
		}
		else
		{
			cardinality = "1:1";
		}
		int _order = 0;
		
		if (relationship_connected_to_relationship2entity != null)
		{
			_order = relationship_connected_to_relationship2entity.size();
		}
		order = _order + relationship_connected_to_entity2relationship.size();
		return relationship_connected_to_entity2relationship;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection_Relationship2Entity> getRelationship_connected_to_relationship2entity() {
		if (relationship_connected_to_relationship2entity == null) {
			relationship_connected_to_relationship2entity = new EObjectWithInverseEList<Connection_Relationship2Entity>(Connection_Relationship2Entity.class, this, EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY, EntityrelationshipPackage.CONNECTION_RELATIONSHIP2_ENTITY__SOURCE_RELATIONSHIP);
		}
		
		LinkedList<String> maxCardinalitiesList = new LinkedList<>();
		
		if (relationship_connected_to_entity2relationship != null)
		{
			for (Connection_Entity2Relationship _cer : relationship_connected_to_entity2relationship) 
			{
				maxCardinalitiesList.add(_cer.getMaximum_cardinality());
			}
			
		}

		if (relationship_connected_to_relationship2entity != null)
		{
			for (Connection_Relationship2Entity _cre : relationship_connected_to_relationship2entity) 
			{
				maxCardinalitiesList.add(_cre.getMaximum_cardinality());
			}			
		}		

		Collections.sort(maxCardinalitiesList);

		int n_conex = 0;
		for(String _cardinality : maxCardinalitiesList)
		{
			if(_cardinality.equals("n"))
			{
				n_conex++;
			}
			else
			{
				try 
				{
					int _cardinalityNumeric = Integer.valueOf(_cardinality);
					
					if (_cardinalityNumeric > 1) n_conex++;
				} 
				catch (NumberFormatException e) 
				{
					
				}
			}
		}
		
		if (n_conex > 1)
		{
			cardinality = "N:M";
		}
		else if (n_conex == 1)
		{
			cardinality = "1:N";
		}
		else
		{
			cardinality = "1:1";
		}
		int _order = 0;
		
		if (relationship_connected_to_entity2relationship != null)
		{
			_order = relationship_connected_to_entity2relationship.size();
		}
		order = _order + relationship_connected_to_relationship2entity.size();		
		return relationship_connected_to_relationship2entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTarget_restrictions()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationship_connected_to_entity2relationship()).basicAdd(otherEnd, msgs);
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationship_connected_to_relationship2entity()).basicAdd(otherEnd, msgs);
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
			case EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS:
				return ((InternalEList<?>)getTarget_restrictions()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return ((InternalEList<?>)getRelationship_connected_to_entity2relationship()).basicRemove(otherEnd, msgs);
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return ((InternalEList<?>)getRelationship_connected_to_relationship2entity()).basicRemove(otherEnd, msgs);
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
			case EntityrelationshipPackage.RELATIONSHIP__NAME_RELATIONSHIP:
				return getName_relationship();
			case EntityrelationshipPackage.RELATIONSHIP__ORDER:
				return getOrder();
			case EntityrelationshipPackage.RELATIONSHIP__CARDINALITY:
				return getCardinality();
			case EntityrelationshipPackage.RELATIONSHIP__TYPE_RELATIONSHIP:
				return getType_relationship();
			case EntityrelationshipPackage.RELATIONSHIP__SOURCE_RESTRICTIONS:
				if (resolve) return getSource_restrictions();
				return basicGetSource_restrictions();
			case EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS:
				return getTarget_restrictions();
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return getRelationship_connected_to_entity2relationship();
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return getRelationship_connected_to_relationship2entity();
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
			case EntityrelationshipPackage.RELATIONSHIP__NAME_RELATIONSHIP:
				setName_relationship((String)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__ORDER:
				setOrder((Integer)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__TYPE_RELATIONSHIP:
				setType_relationship((TypeRelationship)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__SOURCE_RESTRICTIONS:
				setSource_restrictions((Relationships_Restriction)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS:
				getTarget_restrictions().clear();
				getTarget_restrictions().addAll((Collection<? extends Relationships_Restriction>)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP:
				getRelationship_connected_to_entity2relationship().clear();
				getRelationship_connected_to_entity2relationship().addAll((Collection<? extends Connection_Entity2Relationship>)newValue);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY:
				getRelationship_connected_to_relationship2entity().clear();
				getRelationship_connected_to_relationship2entity().addAll((Collection<? extends Connection_Relationship2Entity>)newValue);
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
			case EntityrelationshipPackage.RELATIONSHIP__NAME_RELATIONSHIP:
				setName_relationship(NAME_RELATIONSHIP_EDEFAULT);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__TYPE_RELATIONSHIP:
				setType_relationship(TYPE_RELATIONSHIP_EDEFAULT);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__SOURCE_RESTRICTIONS:
				setSource_restrictions((Relationships_Restriction)null);
				return;
			case EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS:
				getTarget_restrictions().clear();
				return;
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP:
				getRelationship_connected_to_entity2relationship().clear();
				return;
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY:
				getRelationship_connected_to_relationship2entity().clear();
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
			case EntityrelationshipPackage.RELATIONSHIP__NAME_RELATIONSHIP:
				return NAME_RELATIONSHIP_EDEFAULT == null ? name_relationship != null : !NAME_RELATIONSHIP_EDEFAULT.equals(name_relationship);
			case EntityrelationshipPackage.RELATIONSHIP__ORDER:
				return order != ORDER_EDEFAULT;
			case EntityrelationshipPackage.RELATIONSHIP__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case EntityrelationshipPackage.RELATIONSHIP__TYPE_RELATIONSHIP:
				return type_relationship != TYPE_RELATIONSHIP_EDEFAULT;
			case EntityrelationshipPackage.RELATIONSHIP__SOURCE_RESTRICTIONS:
				return source_restrictions != null;
			case EntityrelationshipPackage.RELATIONSHIP__TARGET_RESTRICTIONS:
				return target_restrictions != null && !target_restrictions.isEmpty();
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_ENTITY2RELATIONSHIP:
				return relationship_connected_to_entity2relationship != null && !relationship_connected_to_entity2relationship.isEmpty();
			case EntityrelationshipPackage.RELATIONSHIP__RELATIONSHIP_CONNECTED_TO_RELATIONSHIP2ENTITY:
				return relationship_connected_to_relationship2entity != null && !relationship_connected_to_relationship2entity.isEmpty();
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
		result.append(" (name_relationship: ");
		result.append(name_relationship);
		result.append(", order: ");
		result.append(order);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", type_relationship: ");
		result.append(type_relationship);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
