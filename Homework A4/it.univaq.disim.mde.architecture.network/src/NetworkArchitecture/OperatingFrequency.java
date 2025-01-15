/**
 */
package NetworkArchitecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operating Frequency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NetworkArchitecture.NetworkArchitecturePackage#getOperatingFrequency()
 * @model
 * @generated
 */
public enum OperatingFrequency implements Enumerator {
	/**
	 * The '<em><b>Ghz 24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_24_VALUE
	 * @generated
	 * @ordered
	 */
	GHZ_24(0, "Ghz_2_4", "Ghz_2_4"),

	/**
	 * The '<em><b>Ghz 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_5_VALUE
	 * @generated
	 * @ordered
	 */
	GHZ_5(1, "Ghz_5", "Ghz_5"),

	/**
	 * The '<em><b>Ghz 6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_6_VALUE
	 * @generated
	 * @ordered
	 */
	GHZ_6(2, "Ghz_6", "Ghz_6"),

	/**
	 * The '<em><b>Ghz 60</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_60_VALUE
	 * @generated
	 * @ordered
	 */
	GHZ_60(3, "Ghz_60", "Ghz_60");

	/**
	 * The '<em><b>Ghz 24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_24
	 * @model name="Ghz_2_4"
	 * @generated
	 * @ordered
	 */
	public static final int GHZ_24_VALUE = 0;

	/**
	 * The '<em><b>Ghz 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_5
	 * @model name="Ghz_5"
	 * @generated
	 * @ordered
	 */
	public static final int GHZ_5_VALUE = 1;

	/**
	 * The '<em><b>Ghz 6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_6
	 * @model name="Ghz_6"
	 * @generated
	 * @ordered
	 */
	public static final int GHZ_6_VALUE = 2;

	/**
	 * The '<em><b>Ghz 60</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GHZ_60
	 * @model name="Ghz_60"
	 * @generated
	 * @ordered
	 */
	public static final int GHZ_60_VALUE = 3;

	/**
	 * An array of all the '<em><b>Operating Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperatingFrequency[] VALUES_ARRAY =
		new OperatingFrequency[] {
			GHZ_24,
			GHZ_5,
			GHZ_6,
			GHZ_60,
		};

	/**
	 * A public read-only list of all the '<em><b>Operating Frequency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperatingFrequency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operating Frequency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingFrequency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingFrequency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating Frequency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingFrequency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingFrequency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating Frequency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingFrequency get(int value) {
		switch (value) {
			case GHZ_24_VALUE: return GHZ_24;
			case GHZ_5_VALUE: return GHZ_5;
			case GHZ_6_VALUE: return GHZ_6;
			case GHZ_60_VALUE: return GHZ_60;
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
	private OperatingFrequency(int value, String name, String literal) {
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
	
} //OperatingFrequency
