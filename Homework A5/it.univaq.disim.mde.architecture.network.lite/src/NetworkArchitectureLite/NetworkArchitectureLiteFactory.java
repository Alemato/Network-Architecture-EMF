/**
 */
package NetworkArchitectureLite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage
 * @generated
 */
public interface NetworkArchitectureLiteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkArchitectureLiteFactory eINSTANCE = NetworkArchitectureLite.impl.NetworkArchitectureLiteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway</em>'.
	 * @generated
	 */
	Gateway createGateway();

	/**
	 * Returns a new object of class '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router</em>'.
	 * @generated
	 */
	Router createRouter();

	/**
	 * Returns a new object of class '<em>Switch L3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch L3</em>'.
	 * @generated
	 */
	SwitchL3 createSwitchL3();

	/**
	 * Returns a new object of class '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Point</em>'.
	 * @generated
	 */
	AccessPoint createAccessPoint();

	/**
	 * Returns a new object of class '<em>Wifi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wifi</em>'.
	 * @generated
	 */
	Wifi createWifi();

	/**
	 * Returns a new object of class '<em>Switch L2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch L2</em>'.
	 * @generated
	 */
	SwitchL2 createSwitchL2();

	/**
	 * Returns a new object of class '<em>VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VLAN</em>'.
	 * @generated
	 */
	VLAN createVLAN();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetworkArchitectureLitePackage getNetworkArchitectureLitePackage();

} //NetworkArchitectureLiteFactory
