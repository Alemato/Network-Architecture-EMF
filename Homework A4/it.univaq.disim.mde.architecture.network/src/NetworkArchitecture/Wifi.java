/**
 */
package NetworkArchitecture;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wifi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.Wifi#getSsid <em>Ssid</em>}</li>
 *   <li>{@link NetworkArchitecture.Wifi#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link NetworkArchitecture.Wifi#getChannel <em>Channel</em>}</li>
 *   <li>{@link NetworkArchitecture.Wifi#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link NetworkArchitecture.Wifi#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link NetworkArchitecture.Wifi#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidChannelForFrequency'"
 * @generated
 */
public interface Wifi extends InternalIpAddressElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi_Ssid()
	 * @model required="true"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Wifi#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitecture.OperatingFrequency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see NetworkArchitecture.OperatingFrequency
	 * @see #setFrequency(OperatingFrequency)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi_Frequency()
	 * @model required="true"
	 * @generated
	 */
	OperatingFrequency getFrequency();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Wifi#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see NetworkArchitecture.OperatingFrequency
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(OperatingFrequency value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(int)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi_Channel()
	 * @model required="true"
	 * @generated
	 */
	int getChannel();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Wifi#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(int value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitecture.AuthenticationWifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' attribute.
	 * @see NetworkArchitecture.AuthenticationWifi
	 * @see #setAuthentication(AuthenticationWifi)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi_Authentication()
	 * @model required="true"
	 * @generated
	 */
	AuthenticationWifi getAuthentication();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Wifi#getAuthentication <em>Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' attribute.
	 * @see NetworkArchitecture.AuthenticationWifi
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(AuthenticationWifi value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitecture.EncryptionModeWifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see NetworkArchitecture.EncryptionModeWifi
	 * @see #setEncryption(EncryptionModeWifi)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi_Encryption()
	 * @model required="true"
	 * @generated
	 */
	EncryptionModeWifi getEncryption();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Wifi#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see NetworkArchitecture.EncryptionModeWifi
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(EncryptionModeWifi value);

	/**
	 * Returns the value of the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan</em>' reference.
	 * @see #setVlan(VLAN)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getWifi_Vlan()
	 * @model required="true"
	 * @generated
	 */
	VLAN getVlan();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Wifi#getVlan <em>Vlan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan</em>' reference.
	 * @see #getVlan()
	 * @generated
	 */
	void setVlan(VLAN value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t        if frequency = OperatingFrequency::Ghz_2_4 then\n\t\t            channel &gt;= 1 and channel &lt;= 14\n\t\t        elseif frequency = OperatingFrequency::Ghz_5 then\n\t\t            channel = 36 or channel = 40 or channel = 44 or channel = 48 or\n\t\t            channel = 52 or channel = 56 or channel = 60 or channel = 64 or\n\t\t            channel = 100 or channel = 104 or channel = 108 or channel = 112 or\n\t\t            channel = 116 or channel = 120 or channel = 124 or channel = 128 or\n\t\t            channel = 132 or channel = 136 or channel = 140 or channel = 144 or\n\t\t            channel = 149 or channel = 153 or channel = 157 or channel = 161 or\n\t\t            channel = 165\n\t\t        else\n\t\t            true -- Per altre frequenze, non ci sono restrizioni definite.\n\t\t        endif'"
	 * @generated
	 */
	Boolean isValidChannelForFrequency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.isValidChannelForFrequency()'"
	 * @generated
	 */
	boolean ValidChannelForFrequency(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Wifi
