/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkArchitectureLiteFactoryImpl extends EFactoryImpl implements NetworkArchitectureLiteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkArchitectureLiteFactory init() {
		try {
			NetworkArchitectureLiteFactory theNetworkArchitectureLiteFactory = (NetworkArchitectureLiteFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkArchitectureLitePackage.eNS_URI);
			if (theNetworkArchitectureLiteFactory != null) {
				return theNetworkArchitectureLiteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkArchitectureLiteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkArchitectureLiteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NetworkArchitectureLitePackage.NETWORK: return createNetwork();
			case NetworkArchitectureLitePackage.GATEWAY: return createGateway();
			case NetworkArchitectureLitePackage.ROUTER: return createRouter();
			case NetworkArchitectureLitePackage.SWITCH_L3: return createSwitchL3();
			case NetworkArchitectureLitePackage.ACCESS_POINT: return createAccessPoint();
			case NetworkArchitectureLitePackage.WIFI: return createWifi();
			case NetworkArchitectureLitePackage.SWITCH_L2: return createSwitchL2();
			case NetworkArchitectureLitePackage.VLAN: return createVLAN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NetworkArchitectureLitePackage.GATEWAY_TECHNOLOGY:
				return createGatewayTechnologyFromString(eDataType, initialValue);
			case NetworkArchitectureLitePackage.NAT_TECHNOLOGY:
				return createNATTechnologyFromString(eDataType, initialValue);
			case NetworkArchitectureLitePackage.ROUTING_PROTOCOL:
				return createRoutingProtocolFromString(eDataType, initialValue);
			case NetworkArchitectureLitePackage.AUTHENTICATION_WIFI:
				return createAuthenticationWifiFromString(eDataType, initialValue);
			case NetworkArchitectureLitePackage.ENCRYPTION_MODE_WIFI:
				return createEncryptionModeWifiFromString(eDataType, initialValue);
			case NetworkArchitectureLitePackage.OPERATING_FREQUENCY:
				return createOperatingFrequencyFromString(eDataType, initialValue);
			case NetworkArchitectureLitePackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NetworkArchitectureLitePackage.GATEWAY_TECHNOLOGY:
				return convertGatewayTechnologyToString(eDataType, instanceValue);
			case NetworkArchitectureLitePackage.NAT_TECHNOLOGY:
				return convertNATTechnologyToString(eDataType, instanceValue);
			case NetworkArchitectureLitePackage.ROUTING_PROTOCOL:
				return convertRoutingProtocolToString(eDataType, instanceValue);
			case NetworkArchitectureLitePackage.AUTHENTICATION_WIFI:
				return convertAuthenticationWifiToString(eDataType, instanceValue);
			case NetworkArchitectureLitePackage.ENCRYPTION_MODE_WIFI:
				return convertEncryptionModeWifiToString(eDataType, instanceValue);
			case NetworkArchitectureLitePackage.OPERATING_FREQUENCY:
				return convertOperatingFrequencyToString(eDataType, instanceValue);
			case NetworkArchitectureLitePackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchL3 createSwitchL3() {
		SwitchL3Impl switchL3 = new SwitchL3Impl();
		return switchL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessPoint createAccessPoint() {
		AccessPointImpl accessPoint = new AccessPointImpl();
		return accessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wifi createWifi() {
		WifiImpl wifi = new WifiImpl();
		return wifi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchL2 createSwitchL2() {
		SwitchL2Impl switchL2 = new SwitchL2Impl();
		return switchL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VLAN createVLAN() {
		VLANImpl vlan = new VLANImpl();
		return vlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayTechnology createGatewayTechnologyFromString(EDataType eDataType, String initialValue) {
		GatewayTechnology result = GatewayTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NATTechnology createNATTechnologyFromString(EDataType eDataType, String initialValue) {
		NATTechnology result = NATTechnology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNATTechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingProtocol createRoutingProtocolFromString(EDataType eDataType, String initialValue) {
		RoutingProtocol result = RoutingProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoutingProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationWifi createAuthenticationWifiFromString(EDataType eDataType, String initialValue) {
		AuthenticationWifi result = AuthenticationWifi.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticationWifiToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionModeWifi createEncryptionModeWifiFromString(EDataType eDataType, String initialValue) {
		EncryptionModeWifi result = EncryptionModeWifi.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncryptionModeWifiToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingFrequency createOperatingFrequencyFromString(EDataType eDataType, String initialValue) {
		OperatingFrequency result = OperatingFrequency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingFrequencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkArchitectureLitePackage getNetworkArchitectureLitePackage() {
		return (NetworkArchitectureLitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkArchitectureLitePackage getPackage() {
		return NetworkArchitectureLitePackage.eINSTANCE;
	}

} //NetworkArchitectureLiteFactoryImpl
