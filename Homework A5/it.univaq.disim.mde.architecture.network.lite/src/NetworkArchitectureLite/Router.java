/**
 */
package NetworkArchitectureLite;

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
 *   <li>{@link NetworkArchitectureLite.Router#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Router#getSwitchL3 <em>Switch L3</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Router#getVlans <em>Vlans</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends NetworkDevice {
	/**
	 * Returns the value of the '<em><b>Routing Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.RoutingProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitectureLite.RoutingProtocol
	 * @see #setRoutingProtocol(RoutingProtocol)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getRouter_RoutingProtocol()
	 * @model required="true"
	 * @generated
	 */
	RoutingProtocol getRoutingProtocol();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Router#getRoutingProtocol <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Protocol</em>' attribute.
	 * @see NetworkArchitectureLite.RoutingProtocol
	 * @see #getRoutingProtocol()
	 * @generated
	 */
	void setRoutingProtocol(RoutingProtocol value);

	/**
	 * Returns the value of the '<em><b>Switch L3</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.SwitchL3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch L3</em>' containment reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getRouter_SwitchL3()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchL3> getSwitchL3();

	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.VLAN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getRouter_Vlans()
	 * @model required="true"
	 * @generated
	 */
	EList<VLAN> getVlans();

} // Router
