/**
 */
package NetworkArchitectureLite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wifi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.Wifi#getSsid <em>Ssid</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Wifi#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Wifi#getChannel <em>Channel</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Wifi#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Wifi#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Wifi#getInternalIpAddress <em>Internal Ip Address</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Wifi#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi()
 * @model
 * @generated
 */
public interface Wifi extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssid</em>' attribute.
	 * @see #setSsid(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_Ssid()
	 * @model required="true"
	 * @generated
	 */
	String getSsid();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getSsid <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssid</em>' attribute.
	 * @see #getSsid()
	 * @generated
	 */
	void setSsid(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.OperatingFrequency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see NetworkArchitectureLite.OperatingFrequency
	 * @see #setFrequency(OperatingFrequency)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_Frequency()
	 * @model required="true"
	 * @generated
	 */
	OperatingFrequency getFrequency();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see NetworkArchitectureLite.OperatingFrequency
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
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_Channel()
	 * @model required="true"
	 * @generated
	 */
	int getChannel();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(int value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.AuthenticationWifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' attribute.
	 * @see NetworkArchitectureLite.AuthenticationWifi
	 * @see #setAuthentication(AuthenticationWifi)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_Authentication()
	 * @model required="true"
	 * @generated
	 */
	AuthenticationWifi getAuthentication();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getAuthentication <em>Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' attribute.
	 * @see NetworkArchitectureLite.AuthenticationWifi
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(AuthenticationWifi value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.EncryptionModeWifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see NetworkArchitectureLite.EncryptionModeWifi
	 * @see #setEncryption(EncryptionModeWifi)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_Encryption()
	 * @model required="true"
	 * @generated
	 */
	EncryptionModeWifi getEncryption();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see NetworkArchitectureLite.EncryptionModeWifi
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(EncryptionModeWifi value);

	/**
	 * Returns the value of the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Ip Address</em>' attribute.
	 * @see #setInternalIpAddress(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_InternalIpAddress()
	 * @model required="true"
	 * @generated
	 */
	String getInternalIpAddress();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getInternalIpAddress <em>Internal Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Ip Address</em>' attribute.
	 * @see #getInternalIpAddress()
	 * @generated
	 */
	void setInternalIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan</em>' reference.
	 * @see #setVlan(VLAN)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getWifi_Vlan()
	 * @model required="true"
	 * @generated
	 */
	VLAN getVlan();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Wifi#getVlan <em>Vlan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan</em>' reference.
	 * @see #getVlan()
	 * @generated
	 */
	void setVlan(VLAN value);

} // Wifi
