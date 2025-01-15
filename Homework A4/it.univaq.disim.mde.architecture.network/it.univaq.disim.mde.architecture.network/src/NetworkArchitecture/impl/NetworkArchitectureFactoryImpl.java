/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.*;

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
public class NetworkArchitectureFactoryImpl extends EFactoryImpl implements NetworkArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkArchitectureFactory init() {
		try {
			NetworkArchitectureFactory theNetworkArchitectureFactory = (NetworkArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkArchitecturePackage.eNS_URI);
			if (theNetworkArchitectureFactory != null) {
				return theNetworkArchitectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkArchitectureFactoryImpl() {
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
			case NetworkArchitecturePackage.NETWORK: return createNetwork();
			case NetworkArchitecturePackage.GATEWAY: return createGateway();
			case NetworkArchitecturePackage.ROUTER: return createRouter();
			case NetworkArchitecturePackage.SWITCH_L3: return createSwitchL3();
			case NetworkArchitecturePackage.ACCESS_POINT: return createAccessPoint();
			case NetworkArchitecturePackage.WIFI: return createWifi();
			case NetworkArchitecturePackage.SWITCH_L2: return createSwitchL2();
			case NetworkArchitecturePackage.VLAN: return createVLAN();
			case NetworkArchitecturePackage.STATIC_ROUTE: return createStaticRoute();
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
			case NetworkArchitecturePackage.GATEWAY_TECHNOLOGY:
				return createGatewayTechnologyFromString(eDataType, initialValue);
			case NetworkArchitecturePackage.NAT_TECHNOLOGY:
				return createNATTechnologyFromString(eDataType, initialValue);
			case NetworkArchitecturePackage.ROUTING_PROTOCOL:
				return createRoutingProtocolFromString(eDataType, initialValue);
			case NetworkArchitecturePackage.AUTHENTICATION_WIFI:
				return createAuthenticationWifiFromString(eDataType, initialValue);
			case NetworkArchitecturePackage.ENCRYPTION_MODE_WIFI:
				return createEncryptionModeWifiFromString(eDataType, initialValue);
			case NetworkArchitecturePackage.OPERATING_FREQUENCY:
				return createOperatingFrequencyFromString(eDataType, initialValue);
			case NetworkArchitecturePackage.PORT_TYPE:
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
			case NetworkArchitecturePackage.GATEWAY_TECHNOLOGY:
				return convertGatewayTechnologyToString(eDataType, instanceValue);
			case NetworkArchitecturePackage.NAT_TECHNOLOGY:
				return convertNATTechnologyToString(eDataType, instanceValue);
			case NetworkArchitecturePackage.ROUTING_PROTOCOL:
				return convertRoutingProtocolToString(eDataType, instanceValue);
			case NetworkArchitecturePackage.AUTHENTICATION_WIFI:
				return convertAuthenticationWifiToString(eDataType, instanceValue);
			case NetworkArchitecturePackage.ENCRYPTION_MODE_WIFI:
				return convertEncryptionModeWifiToString(eDataType, instanceValue);
			case NetworkArchitecturePackage.OPERATING_FREQUENCY:
				return convertOperatingFrequencyToString(eDataType, instanceValue);
			case NetworkArchitecturePackage.PORT_TYPE:
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
	@Override
	public StaticRoute createStaticRoute() {
		StaticRouteImpl staticRoute = new StaticRouteImpl();
		return staticRoute;
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
	public NetworkArchitecturePackage getNetworkArchitecturePackage() {
		return (NetworkArchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkArchitecturePackage getPackage() {
		return NetworkArchitecturePackage.eINSTANCE;
	}

} //NetworkArchitectureFactoryImpl
