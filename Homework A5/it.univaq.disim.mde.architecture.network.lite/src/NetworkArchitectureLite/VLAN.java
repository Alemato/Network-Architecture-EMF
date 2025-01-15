/**
 */
package NetworkArchitectureLite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VLAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.VLAN#getIdVLan <em>Id VLan</em>}</li>
 *   <li>{@link NetworkArchitectureLite.VLAN#getMtu <em>Mtu</em>}</li>
 *   <li>{@link NetworkArchitectureLite.VLAN#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link NetworkArchitectureLite.VLAN#getIpGateway <em>Ip Gateway</em>}</li>
 *   <li>{@link NetworkArchitectureLite.VLAN#getLowerIp <em>Lower Ip</em>}</li>
 *   <li>{@link NetworkArchitectureLite.VLAN#getUpperIp <em>Upper Ip</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN()
 * @model
 * @generated
 */
public interface VLAN extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id VLan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id VLan</em>' attribute.
	 * @see #setIdVLan(int)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN_IdVLan()
	 * @model required="true"
	 * @generated
	 */
	int getIdVLan();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.VLAN#getIdVLan <em>Id VLan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id VLan</em>' attribute.
	 * @see #getIdVLan()
	 * @generated
	 */
	void setIdVLan(int value);

	/**
	 * Returns the value of the '<em><b>Mtu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtu</em>' attribute.
	 * @see #setMtu(int)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN_Mtu()
	 * @model required="true"
	 * @generated
	 */
	int getMtu();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.VLAN#getMtu <em>Mtu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtu</em>' attribute.
	 * @see #getMtu()
	 * @generated
	 */
	void setMtu(int value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' attribute.
	 * @see #setSubnet(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN_Subnet()
	 * @model required="true"
	 * @generated
	 */
	String getSubnet();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.VLAN#getSubnet <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' attribute.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(String value);

	/**
	 * Returns the value of the '<em><b>Ip Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Gateway</em>' attribute.
	 * @see #setIpGateway(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN_IpGateway()
	 * @model required="true"
	 * @generated
	 */
	String getIpGateway();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.VLAN#getIpGateway <em>Ip Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Gateway</em>' attribute.
	 * @see #getIpGateway()
	 * @generated
	 */
	void setIpGateway(String value);

	/**
	 * Returns the value of the '<em><b>Lower Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Ip</em>' attribute.
	 * @see #setLowerIp(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN_LowerIp()
	 * @model required="true"
	 * @generated
	 */
	String getLowerIp();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.VLAN#getLowerIp <em>Lower Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Ip</em>' attribute.
	 * @see #getLowerIp()
	 * @generated
	 */
	void setLowerIp(String value);

	/**
	 * Returns the value of the '<em><b>Upper Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Ip</em>' attribute.
	 * @see #setUpperIp(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getVLAN_UpperIp()
	 * @model required="true"
	 * @generated
	 */
	String getUpperIp();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.VLAN#getUpperIp <em>Upper Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Ip</em>' attribute.
	 * @see #getUpperIp()
	 * @generated
	 */
	void setUpperIp(String value);

} // VLAN
