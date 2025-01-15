/**
 */
package NetworkArchitecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encryption Mode Wifi</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NetworkArchitecture.NetworkArchitecturePackage#getEncryptionModeWifi()
 * @model
 * @generated
 */
public enum EncryptionModeWifi implements Enumerator {
	/**
	 * The '<em><b>Aes ccm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AES_CCM_VALUE
	 * @generated
	 * @ordered
	 */
	AES_CCM(0, "aes_ccm", "aes_ccm"),

	/**
	 * The '<em><b>Wep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEP_VALUE
	 * @generated
	 * @ordered
	 */
	WEP(1, "wep", "wep");

	/**
	 * The '<em><b>Aes ccm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AES_CCM
	 * @model name="aes_ccm"
	 * @generated
	 * @ordered
	 */
	public static final int AES_CCM_VALUE = 0;

	/**
	 * The '<em><b>Wep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEP
	 * @model name="wep"
	 * @generated
	 * @ordered
	 */
	public static final int WEP_VALUE = 1;

	/**
	 * An array of all the '<em><b>Encryption Mode Wifi</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncryptionModeWifi[] VALUES_ARRAY =
		new EncryptionModeWifi[] {
			AES_CCM,
			WEP,
		};

	/**
	 * A public read-only list of all the '<em><b>Encryption Mode Wifi</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncryptionModeWifi> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encryption Mode Wifi</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncryptionModeWifi get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncryptionModeWifi result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encryption Mode Wifi</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncryptionModeWifi getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncryptionModeWifi result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encryption Mode Wifi</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncryptionModeWifi get(int value) {
		switch (value) {
			case AES_CCM_VALUE: return AES_CCM;
			case WEP_VALUE: return WEP;
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
	private EncryptionModeWifi(int value, String name, String literal) {
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
	
} //EncryptionModeWifi
