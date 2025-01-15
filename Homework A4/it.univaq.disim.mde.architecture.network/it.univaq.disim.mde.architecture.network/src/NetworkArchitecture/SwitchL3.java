/**
 */
package NetworkArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch L3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.SwitchL3#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitecture.SwitchL3#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitecture.SwitchL3#getSwitchL2 <em>Switch L2</em>}</li>
 *   <li>{@link NetworkArchitecture.SwitchL3#getStaticRoute <em>Static Route</em>}</li>
 *   <li>{@link NetworkArchitecture.SwitchL3#getAccessPoints <em>Access Points</em>}</li>
 *   <li>{@link NetworkArchitecture.SwitchL3#getTotalConnectedDevices <em>Total Connected Devices</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3()
 * @model
 * @generated
 */
public interface SwitchL3 extends InternalIpAddressElement, NamedElement, FirmwareElement, PortNumberElement {
	/**
	 * Returns the value of the '<em><b>Routing Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitecture.RoutingProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitecture.RoutingProtocol
	 * @see #setRoutingProtocol(RoutingProtocol)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3_RoutingProtocol()
	 * @model required="true"
	 * @generated
	 */
	RoutingProtocol getRoutingProtocol();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.SwitchL3#getRoutingProtocol <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitecture.RoutingProtocol
	 * @see #getRoutingProtocol()
	 * @generated
	 */
	void setRoutingProtocol(RoutingProtocol value);

	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' reference list.
	 * The list contents are of type {@link NetworkArchitecture.VLAN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3_Vlans()
	 * @model required="true"
	 * @generated
	 */
	EList<VLAN> getVlans();

	/**
	 * Returns the value of the '<em><b>Switch L2</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.SwitchL2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch L2</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3_SwitchL2()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchL2> getSwitchL2();

	/**
	 * Returns the value of the '<em><b>Static Route</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.StaticRoute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Route</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3_StaticRoute()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaticRoute> getStaticRoute();

	/**
	 * Returns the value of the '<em><b>Access Points</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.AccessPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Points</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3_AccessPoints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AccessPoint> getAccessPoints();

	/**
	 * Returns the value of the '<em><b>Total Connected Devices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Connected Devices</em>' attribute.
	 * @see #setTotalConnectedDevices(int)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL3_TotalConnectedDevices()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalConnectedDevices();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.SwitchL3#getTotalConnectedDevices <em>Total Connected Devices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Connected Devices</em>' attribute.
	 * @see #getTotalConnectedDevices()
	 * @generated
	 */
	void setTotalConnectedDevices(int value);

} // SwitchL3
