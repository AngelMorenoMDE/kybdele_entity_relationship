/**
 */
package entityrelationship.impl;

import entityrelationship.Connection_EntityRelationship;
import entityrelationship.EntityrelationshipPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link entityrelationship.impl.Connection_EntityRelationshipImpl#getRole <em>Role</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_EntityRelationshipImpl#getMinimum_cardinality <em>Minimum cardinality</em>}</li>
 *   <li>{@link entityrelationship.impl.Connection_EntityRelationshipImpl#getMaximum_cardinality <em>Maximum cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Connection_EntityRelationshipImpl extends MinimalEObjectImpl.Container implements Connection_EntityRelationship {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_EntityRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return EntityrelationshipPackage.Literals.CONNECTION_ENTITY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__ROLE, oldRole, role));
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
		
		String oldMinCard = minimum_cardinality;
		String newMinCard = newMinimum_cardinality.toLowerCase();
		if ((newMinCard.length() == 1) && (newMinCard.equals("n")))
		{
			minimum_cardinality = newMinCard;
		}
		else
		{
			try
			{
				Integer maxCard = Integer.valueOf(newMinCard);
				
				if (maxCard > -1)
				{
					minimum_cardinality = maxCard.toString();
				}
			}
			catch(NumberFormatException e)
			{
				minimum_cardinality = oldMinCard; 
			}
		}
		

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY, oldMinCard, minimum_cardinality));
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
		
			String oldMaxCard = maximum_cardinality;
			String newMaxCard = newMaximum_cardinality.toLowerCase();
			if ((newMaxCard.length() == 1) && (newMaxCard.equals("n")))
			{
				maximum_cardinality = newMaxCard;
			}
			else
			{
				try
				{
					Integer maxCard = Integer.valueOf(newMaxCard);
					
					if (maxCard > 0)
					{
						maximum_cardinality = maxCard.toString();
					}
				}
				catch(NumberFormatException e)
				{
					maximum_cardinality = oldMaxCard; 
				}
			}
		
		
		/*
		 * 		String oldMaximum_cardinality = maximum_cardinality.toLowerCase();
		int asciimax = (int)newMaximum_cardinality.charAt(0);
		int asciimin = (int)getMinimum_cardinality().charAt(0);
		if(asciimax >= asciimin || (newMaximum_cardinality.equals("N") && getMinimum_cardinality().equals("n"))){
		    maximum_cardinality = newMaximum_cardinality.toLowerCase();
		} 
		if ( !maximum_cardinality.equals("0") &&  !maximum_cardinality.equals("1") &&  !maximum_cardinality.equals("2") &&  !maximum_cardinality.equals("3") &&  !maximum_cardinality.equals("4") &&  !maximum_cardinality.equals("5") &&  !maximum_cardinality.equals("6") &&  !maximum_cardinality.equals("7") &&  !maximum_cardinality.equals("8") &&  !maximum_cardinality.equals("9") &&  !maximum_cardinality.equals("n") &&  !maximum_cardinality.equals("N")){
		   maximum_cardinality = oldMaximum_cardinality.toLowerCase();
		}	
		 * 
		 * 
		 * 
		 * */
		
		

		
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY, oldMaxCard, maximum_cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__ROLE:
				return getRole();
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY:
				return getMinimum_cardinality();
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY:
				return getMaximum_cardinality();
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
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__ROLE:
				setRole((String)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY:
				setMinimum_cardinality((String)newValue);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY:
				setMaximum_cardinality((String)newValue);
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
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY:
				setMinimum_cardinality(MINIMUM_CARDINALITY_EDEFAULT);
				return;
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY:
				setMaximum_cardinality(MAXIMUM_CARDINALITY_EDEFAULT);
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
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MINIMUM_CARDINALITY:
				return MINIMUM_CARDINALITY_EDEFAULT == null ? minimum_cardinality != null : !MINIMUM_CARDINALITY_EDEFAULT.equals(minimum_cardinality);
			case EntityrelationshipPackage.CONNECTION_ENTITY_RELATIONSHIP__MAXIMUM_CARDINALITY:
				return MAXIMUM_CARDINALITY_EDEFAULT == null ? maximum_cardinality != null : !MAXIMUM_CARDINALITY_EDEFAULT.equals(maximum_cardinality);
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
		result.append(" (role: ");
		result.append(role);
		result.append(", minimum_cardinality: ");
		result.append(minimum_cardinality);
		result.append(", maximum_cardinality: ");
		result.append(maximum_cardinality);
		result.append(')');
		return result.toString();
	}

} //Connection_EntityRelationshipImpl
