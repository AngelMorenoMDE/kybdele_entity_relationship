/**
 */
package entityrelationship;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Restriction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipPackage#getTypeRestriction()
 * @model
 * @generated
 */
public enum TypeRestriction implements Enumerator {
	/**
	 * The '<em><b>Exclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUSION(2, "Exclusion", "Exclusion"),

	/**
	 * The '<em><b>Inclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUSION(3, "Inclusion", "Inclusion");

	/**
	 * The '<em><b>Exclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exclusion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUSION
	 * @model name="Exclusion"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUSION_VALUE = 2;

	/**
	 * The '<em><b>Inclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inclusion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUSION
	 * @model name="Inclusion"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUSION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Restriction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeRestriction[] VALUES_ARRAY =
		new TypeRestriction[] {
			EXCLUSION,
			INCLUSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Restriction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeRestriction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Restriction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeRestriction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeRestriction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Restriction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeRestriction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeRestriction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Restriction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeRestriction get(int value) {
		switch (value) {
			case EXCLUSION_VALUE: return EXCLUSION;
			case INCLUSION_VALUE: return INCLUSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeRestriction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public String toString() {
		return literal;
	}
	
} //TypeRestriction
