/**
 */
package NetworkArchitectureLite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NAT Technology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNATTechnology()
 * @model
 * @generated
 */
public enum NATTechnology implements Enumerator {
	/**
	 * The '<em><b>Static NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_NAT_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_NAT(0, "Static_NAT", "Static_NAT"),

	/**
	 * The '<em><b>Dynamic NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_NAT_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC_NAT(1, "Dynamic_NAT", "Dynamic_NAT"),

	/**
	 * The '<em><b>Port Address Translation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_ADDRESS_TRANSLATION_VALUE
	 * @generated
	 * @ordered
	 */
	PORT_ADDRESS_TRANSLATION(2, "Port_Address_Translation", "Port_Address_Translation"),

	/**
	 * The '<em><b>One To One NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE_NAT_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_ONE_NAT(3, "One_To_One_NAT", "One_To_One_NAT"),

	/**
	 * The '<em><b>Dual NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUAL_NAT_VALUE
	 * @generated
	 * @ordered
	 */
	DUAL_NAT(4, "Dual_NAT", "Dual_NAT"),

	/**
	 * The '<em><b>Twice NAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWICE_NAT_VALUE
	 * @generated
	 * @ordered
	 */
	TWICE_NAT(5, "Twice_NAT", "Twice_NAT");

	/**
	 * The '<em><b>Static NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_NAT
	 * @model name="Static_NAT"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_NAT_VALUE = 0;

	/**
	 * The '<em><b>Dynamic NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_NAT
	 * @model name="Dynamic_NAT"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_NAT_VALUE = 1;

	/**
	 * The '<em><b>Port Address Translation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_ADDRESS_TRANSLATION
	 * @model name="Port_Address_Translation"
	 * @generated
	 * @ordered
	 */
	public static final int PORT_ADDRESS_TRANSLATION_VALUE = 2;

	/**
	 * The '<em><b>One To One NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE_NAT
	 * @model name="One_To_One_NAT"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_ONE_NAT_VALUE = 3;

	/**
	 * The '<em><b>Dual NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUAL_NAT
	 * @model name="Dual_NAT"
	 * @generated
	 * @ordered
	 */
	public static final int DUAL_NAT_VALUE = 4;

	/**
	 * The '<em><b>Twice NAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWICE_NAT
	 * @model name="Twice_NAT"
	 * @generated
	 * @ordered
	 */
	public static final int TWICE_NAT_VALUE = 5;

	/**
	 * An array of all the '<em><b>NAT Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NATTechnology[] VALUES_ARRAY =
		new NATTechnology[] {
			STATIC_NAT,
			DYNAMIC_NAT,
			PORT_ADDRESS_TRANSLATION,
			ONE_TO_ONE_NAT,
			DUAL_NAT,
			TWICE_NAT,
		};

	/**
	 * A public read-only list of all the '<em><b>NAT Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NATTechnology> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>NAT Technology</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NATTechnology get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NATTechnology result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NAT Technology</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NATTechnology getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NATTechnology result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NAT Technology</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NATTechnology get(int value) {
		switch (value) {
			case STATIC_NAT_VALUE: return STATIC_NAT;
			case DYNAMIC_NAT_VALUE: return DYNAMIC_NAT;
			case PORT_ADDRESS_TRANSLATION_VALUE: return PORT_ADDRESS_TRANSLATION;
			case ONE_TO_ONE_NAT_VALUE: return ONE_TO_ONE_NAT;
			case DUAL_NAT_VALUE: return DUAL_NAT;
			case TWICE_NAT_VALUE: return TWICE_NAT;
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
	private NATTechnology(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NATTechnology
