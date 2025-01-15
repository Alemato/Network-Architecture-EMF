/**
 */
package NetworkArchitectureLite;

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
 *   <li>{@link NetworkArchitectureLite.SwitchL3#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitectureLite.SwitchL3#getSwitchL2 <em>Switch L2</em>}</li>
 *   <li>{@link NetworkArchitectureLite.SwitchL3#getAccessPoints <em>Access Points</em>}</li>
 *   <li>{@link NetworkArchitectureLite.SwitchL3#getVlans <em>Vlans</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getSwitchL3()
 * @model
 * @generated
 */
public interface SwitchL3 extends NetworkDevice {
	/**
	 * Returns the value of the '<em><b>Routing Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.RoutingProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitectureLite.RoutingProtocol
	 * @see #setRoutingProtocol(RoutingProtocol)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getSwitchL3_RoutingProtocol()
	 * @model required="true"
	 * @generated
	 */
	RoutingProtocol getRoutingProtocol();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.SwitchL3#getRoutingProtocol <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitectureLite.RoutingProtocol
	 * @see #getRoutingProtocol()
	 * @generated
	 */
	void setRoutingProtocol(RoutingProtocol value);

	/**
	 * Returns the value of the '<em><b>Switch L2</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.SwitchL2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch L2</em>' containment reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getSwitchL3_SwitchL2()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchL2> getSwitchL2();

	/**
	 * Returns the value of the '<em><b>Access Points</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.AccessPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Points</em>' containment reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getSwitchL3_AccessPoints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AccessPoint> getAccessPoints();

	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.VLAN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getSwitchL3_Vlans()
	 * @model required="true"
	 * @generated
	 */
	EList<VLAN> getVlans();

} // SwitchL3
