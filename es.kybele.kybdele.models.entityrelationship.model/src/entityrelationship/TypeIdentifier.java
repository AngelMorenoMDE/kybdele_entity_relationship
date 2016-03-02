/**
 */
package entityrelationship;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Identifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipPackage#getTypeIdentifier()
 * @model
 * @generated
 */
public enum TypeIdentifier implements Enumerator {
	/**
	 * The '<em><b>No Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_IDENTIFIER(0, "NoIdentifier", "NoIdentifier"),

	/**
	 * The '<em><b>Primary Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_IDENTIFIER(1, "PrimaryIdentifier", "PrimaryIdentifier"),

	/**
	 * The '<em><b>Alternative Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATIVE_IDENTIFIER(2, "AlternativeIdentifier", "AlternativeIdentifier");

	/**
	 * The '<em><b>No Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Identifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_IDENTIFIER
	 * @model name="NoIdentifier"
	 * @generated
	 * @ordered
	 */
	public static final int NO_IDENTIFIER_VALUE = 0;

	/**
	 * The '<em><b>Primary Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Primary Identifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_IDENTIFIER
	 * @model name="PrimaryIdentifier"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_IDENTIFIER_VALUE = 1;

	/**
	 * The '<em><b>Alternative Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alternative Identifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE_IDENTIFIER
	 * @model name="AlternativeIdentifier"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATIVE_IDENTIFIER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Identifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeIdentifier[] VALUES_ARRAY =
		new TypeIdentifier[] {
			NO_IDENTIFIER,
			PRIMARY_IDENTIFIER,
			ALTERNATIVE_IDENTIFIER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Identifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeIdentifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Identifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeIdentifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeIdentifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Identifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeIdentifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeIdentifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Identifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeIdentifier get(int value) {
		switch (value) {
			case NO_IDENTIFIER_VALUE: return NO_IDENTIFIER;
			case PRIMARY_IDENTIFIER_VALUE: return PRIMARY_IDENTIFIER;
			case ALTERNATIVE_IDENTIFIER_VALUE: return ALTERNATIVE_IDENTIFIER;
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
	private TypeIdentifier(int value, String name, String literal) {
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
	
} //TypeIdentifier
