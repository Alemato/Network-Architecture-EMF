/**
 */
package NetworkArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.Router#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitecture.Router#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitecture.Router#getSwitchL3 <em>Switch L3</em>}</li>
 *   <li>{@link NetworkArchitecture.Router#getStaticRoute <em>Static Route</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends InternalIpAddressElement, NamedElement, FirmwareElement, PortNumberElement {
	/**
	 * Returns the value of the '<em><b>Routing Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitecture.RoutingProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitecture.RoutingProtocol
	 * @see #setRoutingProtocol(RoutingProtocol)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getRouter_RoutingProtocol()
	 * @model required="true"
	 * @generated
	 */
	RoutingProtocol getRoutingProtocol();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Router#getRoutingProtocol <em>Routing Protocol</em>}' attribute.
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
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getRouter_Vlans()
	 * @model required="true"
	 * @generated
	 */
	EList<VLAN> getVlans();

	/**
	 * Returns the value of the '<em><b>Switch L3</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.SwitchL3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch L3</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getRouter_SwitchL3()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchL3> getSwitchL3();

	/**
	 * Returns the value of the '<em><b>Static Route</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.StaticRoute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Route</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getRouter_StaticRoute()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaticRoute> getStaticRoute();

} // Router
