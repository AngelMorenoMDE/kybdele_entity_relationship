/**
 */
package entityrelationship;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Relationship</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see entityrelationship.EntityrelationshipPackage#getTypeRelationship()
 * @model
 * @generated
 */
public enum TypeRelationship implements Enumerator {
	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(0, "Regular", "Regular"),

	/**
	 * The '<em><b>Weak dependence in existence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_DEPENDENCE_IN_EXISTENCE_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK_DEPENDENCE_IN_EXISTENCE(1, "Weak_dependence_in_existence", "Weak_dependence_in_existence"),

	/**
	 * The '<em><b>Weak dependence in identification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_DEPENDENCE_IN_IDENTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK_DEPENDENCE_IN_IDENTIFICATION(2, "Weak_dependence_in_identification", "Weak_dependence_in_identification");

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regular</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="Regular"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 0;

	/**
	 * The '<em><b>Weak dependence in existence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weak dependence in existence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAK_DEPENDENCE_IN_EXISTENCE
	 * @model name="Weak_dependence_in_existence"
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_DEPENDENCE_IN_EXISTENCE_VALUE = 1;

	/**
	 * The '<em><b>Weak dependence in identification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weak dependence in identification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAK_DEPENDENCE_IN_IDENTIFICATION
	 * @model name="Weak_dependence_in_identification"
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_DEPENDENCE_IN_IDENTIFICATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeRelationship[] VALUES_ARRAY =
		new TypeRelationship[] {
			REGULAR,
			WEAK_DEPENDENCE_IN_EXISTENCE,
			WEAK_DEPENDENCE_IN_IDENTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeRelationship> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Relationship</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeRelationship get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeRelationship result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Relationship</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeRelationship getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeRelationship result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Relationship</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeRelationship get(int value) {
		switch (value) {
			case REGULAR_VALUE: return REGULAR;
			case WEAK_DEPENDENCE_IN_EXISTENCE_VALUE: return WEAK_DEPENDENCE_IN_EXISTENCE;
			case WEAK_DEPENDENCE_IN_IDENTIFICATION_VALUE: return WEAK_DEPENDENCE_IN_IDENTIFICATION;
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
	private TypeRelationship(int value, String name, String literal) {
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
	
} //TypeRelationship
