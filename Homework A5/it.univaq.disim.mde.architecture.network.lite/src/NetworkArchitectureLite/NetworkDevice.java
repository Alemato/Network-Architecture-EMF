/**
 */
package NetworkArchitectureLite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.NetworkDevice#getInternalIpAddress <em>Internal Ip Address</em>}</li>
 *   <li>{@link NetworkArchitectureLite.NetworkDevice#getModel <em>Model</em>}</li>
 *   <li>{@link NetworkArchitectureLite.NetworkDevice#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link NetworkArchitectureLite.NetworkDevice#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link NetworkArchitectureLite.NetworkDevice#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetworkDevice()
 * @model abstract="true"
 * @generated
 */
public interface NetworkDevice extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Ip Address</em>' attribute.
	 * @see #setInternalIpAddress(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetworkDevice_InternalIpAddress()
	 * @model required="true"
	 * @generated
	 */
	String getInternalIpAddress();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.NetworkDevice#getInternalIpAddress <em>Internal Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Ip Address</em>' attribute.
	 * @see #getInternalIpAddress()
	 * @generated
	 */
	void setInternalIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetworkDevice_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.NetworkDevice#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetworkDevice_OsVersion()
	 * @model required="true"
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.NetworkDevice#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see #setOperatingSystem(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetworkDevice_OperatingSystem()
	 * @model required="true"
	 * @generated
	 */
	String getOperatingSystem();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.NetworkDevice#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(int)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetworkDevice_PortNumber()
	 * @model required="true"
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.NetworkDevice#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

} // NetworkDevice
