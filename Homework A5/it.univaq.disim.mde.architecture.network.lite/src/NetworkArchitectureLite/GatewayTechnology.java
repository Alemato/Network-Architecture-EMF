/**
 */
package NetworkArchitectureLite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gateway Technology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getGatewayTechnology()
 * @model
 * @generated
 */
public enum GatewayTechnology implements Enumerator {
	/**
	 * The '<em><b>IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_VALUE
	 * @generated
	 * @ordered
	 */
	IP(0, "IP", "IP"),

	/**
	 * The '<em><b>LTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE_VALUE
	 * @generated
	 * @ordered
	 */
	LTE(1, "LTE", "LTE"),

	/**
	 * The '<em><b>Five G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_G_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE_G(2, "FiveG", "FiveG"),

	/**
	 * The '<em><b>Coaxial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COAXIAL_VALUE
	 * @generated
	 * @ordered
	 */
	COAXIAL(3, "Coaxial", "Coaxial"),

	/**
	 * The '<em><b>UMTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMTS_VALUE
	 * @generated
	 * @ordered
	 */
	UMTS(4, "UMTS", "UMTS"),

	/**
	 * The '<em><b>ADSL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADSL_VALUE
	 * @generated
	 * @ordered
	 */
	ADSL(5, "ADSL", "ADSL"),

	/**
	 * The '<em><b>ADSL Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADSL_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	ADSL_PLUS(6, "ADSL_Plus", "ADSL_Plus"),

	/**
	 * The '<em><b>ADSL 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADSL_2_VALUE
	 * @generated
	 * @ordered
	 */
	ADSL_2(7, "ADSL_2", "ADSL_2"),

	/**
	 * The '<em><b>FTTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTTC_VALUE
	 * @generated
	 * @ordered
	 */
	FTTC(8, "FTTC", "FTTC"),

	/**
	 * The '<em><b>FTTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTTH_VALUE
	 * @generated
	 * @ordered
	 */
	FTTH(9, "FTTH", "FTTH");

	/**
	 * The '<em><b>IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_VALUE = 0;

	/**
	 * The '<em><b>LTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTE_VALUE = 1;

	/**
	 * The '<em><b>Five G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_G
	 * @model name="FiveG"
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_G_VALUE = 2;

	/**
	 * The '<em><b>Coaxial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COAXIAL
	 * @model name="Coaxial"
	 * @generated
	 * @ordered
	 */
	public static final int COAXIAL_VALUE = 3;

	/**
	 * The '<em><b>UMTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UMTS_VALUE = 4;

	/**
	 * The '<em><b>ADSL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADSL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADSL_VALUE = 5;

	/**
	 * The '<em><b>ADSL Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADSL_PLUS
	 * @model name="ADSL_Plus"
	 * @generated
	 * @ordered
	 */
	public static final int ADSL_PLUS_VALUE = 6;

	/**
	 * The '<em><b>ADSL 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADSL_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADSL_2_VALUE = 7;

	/**
	 * The '<em><b>FTTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTTC_VALUE = 8;

	/**
	 * The '<em><b>FTTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTTH_VALUE = 9;

	/**
	 * An array of all the '<em><b>Gateway Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GatewayTechnology[] VALUES_ARRAY =
		new GatewayTechnology[] {
			IP,
			LTE,
			FIVE_G,
			COAXIAL,
			UMTS,
			ADSL,
			ADSL_PLUS,
			ADSL_2,
			FTTC,
			FTTH,
		};

	/**
	 * A public read-only list of all the '<em><b>Gateway Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GatewayTechnology> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gateway Technology</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GatewayTechnology get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GatewayTechnology result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gateway Technology</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GatewayTechnology getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GatewayTechnology result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gateway Technology</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GatewayTechnology get(int value) {
		switch (value) {
			case IP_VALUE: return IP;
			case LTE_VALUE: return LTE;
			case FIVE_G_VALUE: return FIVE_G;
			case COAXIAL_VALUE: return COAXIAL;
			case UMTS_VALUE: return UMTS;
			case ADSL_VALUE: return ADSL;
			case ADSL_PLUS_VALUE: return ADSL_PLUS;
			case ADSL_2_VALUE: return ADSL_2;
			case FTTC_VALUE: return FTTC;
			case FTTH_VALUE: return FTTH;
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
	private GatewayTechnology(int value, String name, String literal) {
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
	
} //GatewayTechnology
