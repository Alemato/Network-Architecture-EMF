/**
 */
package NetworkArchitecture;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link NetworkArchitecture.Network#getPublicIpAddres <em>Public Ip Addres</em>}</li>
 *   <li>{@link NetworkArchitecture.Network#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitecture.Network#getGateway <em>Gateway</em>}</li>
 *   <li>{@link NetworkArchitecture.Network#getWifis <em>Wifis</em>}</li>
 *   <li>{@link NetworkArchitecture.Network#getNetworkDevicesCount <em>Network Devices Count</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getNetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidPublicIpAddres'"
 * @generated
 */
public interface Network extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Public Ip Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Ip Addres</em>' attribute.
	 * @see #setPublicIpAddres(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getNetwork_PublicIpAddres()
	 * @model required="true"
	 * @generated
	 */
	String getPublicIpAddres();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Network#getPublicIpAddres <em>Public Ip Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Ip Addres</em>' attribute.
	 * @see #getPublicIpAddres()
	 * @generated
	 */
	void setPublicIpAddres(String value);

	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.VLAN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getNetwork_Vlans()
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
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getNetwork_Gateway()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Gateway getGateway();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Network#getGateway <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' containment reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(Gateway value);

	/**
	 * Returns the value of the '<em><b>Wifis</b></em>' containment reference list.
	 * The list contents are of type {@link NetworkArchitecture.Wifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wifis</em>' containment reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getNetwork_Wifis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wifi> getWifis();

	/**
	 * Returns the value of the '<em><b>Network Devices Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Devices Count</em>' attribute.
	 * @see #setNetworkDevicesCount(int)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getNetwork_NetworkDevicesCount()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getNetworkDevicesCount();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.Network#getNetworkDevicesCount <em>Network Devices Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Devices Count</em>' attribute.
	 * @see #getNetworkDevicesCount()
	 * @generated
	 */
	void setNetworkDevicesCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        publicIpAddres.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                       \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                       \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                       \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')'"
	 * @generated
	 */
	boolean ValidPublicIpAddres(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Network
