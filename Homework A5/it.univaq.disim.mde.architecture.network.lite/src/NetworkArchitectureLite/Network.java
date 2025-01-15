/**
 */
package NetworkArchitectureLite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.Network#getPublicIpAddres <em>Public Ip Addres</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Network#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Network#getGateway <em>Gateway</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Network#getWifis <em>Wifis</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Public Ip Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Ip Addres</em>' attribute.
	 * @see #setPublicIpAddres(String)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetwork_PublicIpAddres()
	 * @model required="true"
	 * @generated
	 */
	String getPublicIpAddres();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Network#getPublicIpAddres <em>Public Ip Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Ip Addres</em>' attribute.
	 * @see #getPublicIpAddres()
	 * @generated
	 */
	void setPublicIpAddres(String value);

	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.VLAN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' containment reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetwork_Vlans()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VLAN> getVlans();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' containment reference.
	 * @see #setGateway(Gateway)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetwork_Gateway()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Gateway getGateway();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Network#getGateway <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' containment reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(Gateway value);

	/**
	 * Returns the value of the '<em><b>Wifis</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitectureLite.Wifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wifis</em>' containment reference list.
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getNetwork_Wifis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wifi> getWifis();

} // Network
