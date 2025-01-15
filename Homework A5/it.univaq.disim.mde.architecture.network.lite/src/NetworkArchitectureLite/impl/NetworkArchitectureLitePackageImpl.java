/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.AccessPoint;
import NetworkArchitectureLite.AuthenticationWifi;
import NetworkArchitectureLite.EncryptionModeWifi;
import NetworkArchitectureLite.Gateway;
import NetworkArchitectureLite.GatewayTechnology;
import NetworkArchitectureLite.NATTechnology;
import NetworkArchitectureLite.NamedElement;
import NetworkArchitectureLite.Network;
import NetworkArchitectureLite.NetworkArchitectureLiteFactory;
import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.NetworkDevice;
import NetworkArchitectureLite.OperatingFrequency;
import NetworkArchitectureLite.PortType;
import NetworkArchitectureLite.Router;
import NetworkArchitectureLite.RoutingProtocol;
import NetworkArchitectureLite.SwitchL2;
import NetworkArchitectureLite.SwitchL3;
import NetworkArchitectureLite.Wifi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkArchitectureLitePackageImpl extends EPackageImpl implements NetworkArchitectureLitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchL3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wifiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchL2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayTechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum natTechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routingProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationWifiEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encryptionModeWifiEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatingFrequencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkArchitectureLitePackageImpl() {
		super(eNS_URI, NetworkArchitectureLiteFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NetworkArchitectureLitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkArchitectureLitePackage init() {
		if (isInited) return (NetworkArchitectureLitePackage)EPackage.Registry.INSTANCE.getEPackage(NetworkArchitectureLitePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetworkArchitectureLitePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NetworkArchitectureLitePackageImpl theNetworkArchitectureLitePackage = registeredNetworkArchitectureLitePackage instanceof NetworkArchitectureLitePackageImpl ? (NetworkArchitectureLitePackageImpl)registeredNetworkArchitectureLitePackage : new NetworkArchitectureLitePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNetworkArchitectureLitePackage.createPackageContents();

		// Initialize created meta-data
		theNetworkArchitectureLitePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetworkArchitectureLitePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkArchitectureLitePackage.eNS_URI, theNetworkArchitectureLitePackage);
		return theNetworkArchitectureLitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkDevice() {
		return networkDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDevice_InternalIpAddress() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDevice_Model() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDevice_OsVersion() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDevice_OperatingSystem() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkDevice_PortNumber() {
		return (EAttribute)networkDeviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_PublicIpAddres() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Vlans() {
		return (EReference)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Gateway() {
		return (EReference)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Wifis() {
		return (EReference)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_Tecnology() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_Nat() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateway_Router() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateway_Vlan() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRouter_RoutingProtocol() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouter_SwitchL3() {
		return (EReference)routerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouter_Vlans() {
		return (EReference)routerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchL3() {
		return switchL3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwitchL3_RoutingProtocol() {
		return (EAttribute)switchL3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL3_SwitchL2() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL3_AccessPoints() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL3_Vlans() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessPoint() {
		return accessPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessPoint_MaxClientSupport() {
		return (EAttribute)accessPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessPoint_Wifis() {
		return (EReference)accessPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessPoint_Vlan() {
		return (EReference)accessPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWifi() {
		return wifiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifi_Ssid() {
		return (EAttribute)wifiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifi_Frequency() {
		return (EAttribute)wifiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifi_Channel() {
		return (EAttribute)wifiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifi_Authentication() {
		return (EAttribute)wifiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifi_Encryption() {
		return (EAttribute)wifiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWifi_InternalIpAddress() {
		return (EAttribute)wifiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWifi_Vlan() {
		return (EReference)wifiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchL2() {
		return switchL2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwitchL2_PortType() {
		return (EAttribute)switchL2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL2_Vlans() {
		return (EReference)switchL2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVLAN() {
		return vlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLAN_IdVLan() {
		return (EAttribute)vlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLAN_Mtu() {
		return (EAttribute)vlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLAN_Subnet() {
		return (EAttribute)vlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLAN_IpGateway() {
		return (EAttribute)vlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLAN_LowerIp() {
		return (EAttribute)vlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVLAN_UpperIp() {
		return (EAttribute)vlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGatewayTechnology() {
		return gatewayTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNATTechnology() {
		return natTechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRoutingProtocol() {
		return routingProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthenticationWifi() {
		return authenticationWifiEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncryptionModeWifi() {
		return encryptionModeWifiEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperatingFrequency() {
		return operatingFrequencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkArchitectureLiteFactory getNetworkArchitectureLiteFactory() {
		return (NetworkArchitectureLiteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		networkDeviceEClass = createEClass(NETWORK_DEVICE);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__INTERNAL_IP_ADDRESS);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__MODEL);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__OS_VERSION);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__OPERATING_SYSTEM);
		createEAttribute(networkDeviceEClass, NETWORK_DEVICE__PORT_NUMBER);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__PUBLIC_IP_ADDRES);
		createEReference(networkEClass, NETWORK__VLANS);
		createEReference(networkEClass, NETWORK__GATEWAY);
		createEReference(networkEClass, NETWORK__WIFIS);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__TECNOLOGY);
		createEAttribute(gatewayEClass, GATEWAY__NAT);
		createEReference(gatewayEClass, GATEWAY__ROUTER);
		createEReference(gatewayEClass, GATEWAY__VLAN);

		routerEClass = createEClass(ROUTER);
		createEAttribute(routerEClass, ROUTER__ROUTING_PROTOCOL);
		createEReference(routerEClass, ROUTER__SWITCH_L3);
		createEReference(routerEClass, ROUTER__VLANS);

		switchL3EClass = createEClass(SWITCH_L3);
		createEAttribute(switchL3EClass, SWITCH_L3__ROUTING_PROTOCOL);
		createEReference(switchL3EClass, SWITCH_L3__SWITCH_L2);
		createEReference(switchL3EClass, SWITCH_L3__ACCESS_POINTS);
		createEReference(switchL3EClass, SWITCH_L3__VLANS);

		accessPointEClass = createEClass(ACCESS_POINT);
		createEAttribute(accessPointEClass, ACCESS_POINT__MAX_CLIENT_SUPPORT);
		createEReference(accessPointEClass, ACCESS_POINT__WIFIS);
		createEReference(accessPointEClass, ACCESS_POINT__VLAN);

		wifiEClass = createEClass(WIFI);
		createEAttribute(wifiEClass, WIFI__SSID);
		createEAttribute(wifiEClass, WIFI__FREQUENCY);
		createEAttribute(wifiEClass, WIFI__CHANNEL);
		createEAttribute(wifiEClass, WIFI__AUTHENTICATION);
		createEAttribute(wifiEClass, WIFI__ENCRYPTION);
		createEAttribute(wifiEClass, WIFI__INTERNAL_IP_ADDRESS);
		createEReference(wifiEClass, WIFI__VLAN);

		switchL2EClass = createEClass(SWITCH_L2);
		createEAttribute(switchL2EClass, SWITCH_L2__PORT_TYPE);
		createEReference(switchL2EClass, SWITCH_L2__VLANS);

		vlanEClass = createEClass(VLAN);
		createEAttribute(vlanEClass, VLAN__ID_VLAN);
		createEAttribute(vlanEClass, VLAN__MTU);
		createEAttribute(vlanEClass, VLAN__SUBNET);
		createEAttribute(vlanEClass, VLAN__IP_GATEWAY);
		createEAttribute(vlanEClass, VLAN__LOWER_IP);
		createEAttribute(vlanEClass, VLAN__UPPER_IP);

		// Create enums
		gatewayTechnologyEEnum = createEEnum(GATEWAY_TECHNOLOGY);
		natTechnologyEEnum = createEEnum(NAT_TECHNOLOGY);
		routingProtocolEEnum = createEEnum(ROUTING_PROTOCOL);
		authenticationWifiEEnum = createEEnum(AUTHENTICATION_WIFI);
		encryptionModeWifiEEnum = createEEnum(ENCRYPTION_MODE_WIFI);
		operatingFrequencyEEnum = createEEnum(OPERATING_FREQUENCY);
		portTypeEEnum = createEEnum(PORT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		networkDeviceEClass.getESuperTypes().add(this.getNamedElement());
		networkEClass.getESuperTypes().add(this.getNamedElement());
		gatewayEClass.getESuperTypes().add(this.getNetworkDevice());
		routerEClass.getESuperTypes().add(this.getNetworkDevice());
		switchL3EClass.getESuperTypes().add(this.getNetworkDevice());
		accessPointEClass.getESuperTypes().add(this.getNetworkDevice());
		wifiEClass.getESuperTypes().add(this.getNamedElement());
		switchL2EClass.getESuperTypes().add(this.getNetworkDevice());
		vlanEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkDeviceEClass, NetworkDevice.class, "NetworkDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkDevice_InternalIpAddress(), ecorePackage.getEString(), "internalIpAddress", null, 1, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDevice_Model(), ecorePackage.getEString(), "model", null, 1, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDevice_OsVersion(), ecorePackage.getEString(), "osVersion", null, 1, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDevice_OperatingSystem(), ecorePackage.getEString(), "operatingSystem", null, 1, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkDevice_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 1, 1, NetworkDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_PublicIpAddres(), ecorePackage.getEString(), "publicIpAddres", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Gateway(), this.getGateway(), null, "gateway", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Wifis(), this.getWifi(), null, "wifis", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_Tecnology(), this.getGatewayTechnology(), "tecnology", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGateway_Nat(), this.getNATTechnology(), "nat", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Router(), this.getRouter(), null, "router", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Vlan(), this.getVLAN(), null, "vlan", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouter_RoutingProtocol(), this.getRoutingProtocol(), "routingProtocol", null, 1, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouter_SwitchL3(), this.getSwitchL3(), null, "switchL3", null, 0, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouter_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchL3EClass, SwitchL3.class, "SwitchL3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchL3_RoutingProtocol(), this.getRoutingProtocol(), "routingProtocol", null, 1, 1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL3_SwitchL2(), this.getSwitchL2(), null, "switchL2", null, 0, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL3_AccessPoints(), this.getAccessPoint(), null, "accessPoints", null, 0, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSwitchL3_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessPointEClass, AccessPoint.class, "AccessPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessPoint_MaxClientSupport(), ecorePackage.getEInt(), "maxClientSupport", null, 1, 1, AccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessPoint_Wifis(), this.getWifi(), null, "wifis", null, 1, -1, AccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessPoint_Vlan(), this.getVLAN(), null, "vlan", null, 1, 1, AccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wifiEClass, Wifi.class, "Wifi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWifi_Ssid(), ecorePackage.getEString(), "ssid", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Frequency(), this.getOperatingFrequency(), "frequency", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Channel(), ecorePackage.getEInt(), "channel", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Authentication(), this.getAuthenticationWifi(), "authentication", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Encryption(), this.getEncryptionModeWifi(), "encryption", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_InternalIpAddress(), ecorePackage.getEString(), "internalIpAddress", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWifi_Vlan(), this.getVLAN(), null, "vlan", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchL2EClass, SwitchL2.class, "SwitchL2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchL2_PortType(), this.getPortType(), "portType", null, 1, 1, SwitchL2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL2_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, SwitchL2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vlanEClass, NetworkArchitectureLite.VLAN.class, "VLAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVLAN_IdVLan(), ecorePackage.getEInt(), "idVLan", null, 1, 1, NetworkArchitectureLite.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_Mtu(), ecorePackage.getEInt(), "mtu", null, 1, 1, NetworkArchitectureLite.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_Subnet(), ecorePackage.getEString(), "subnet", null, 1, 1, NetworkArchitectureLite.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_IpGateway(), ecorePackage.getEString(), "ipGateway", null, 1, 1, NetworkArchitectureLite.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_LowerIp(), ecorePackage.getEString(), "lowerIp", null, 1, 1, NetworkArchitectureLite.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_UpperIp(), ecorePackage.getEString(), "upperIp", null, 1, 1, NetworkArchitectureLite.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gatewayTechnologyEEnum, GatewayTechnology.class, "GatewayTechnology");
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.IP);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.LTE);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.FIVE_G);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.COAXIAL);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.UMTS);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.ADSL);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.ADSL_PLUS);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.ADSL_2);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.FTTC);
		addEEnumLiteral(gatewayTechnologyEEnum, GatewayTechnology.FTTH);

		initEEnum(natTechnologyEEnum, NATTechnology.class, "NATTechnology");
		addEEnumLiteral(natTechnologyEEnum, NATTechnology.STATIC_NAT);
		addEEnumLiteral(natTechnologyEEnum, NATTechnology.DYNAMIC_NAT);
		addEEnumLiteral(natTechnologyEEnum, NATTechnology.PORT_ADDRESS_TRANSLATION);
		addEEnumLiteral(natTechnologyEEnum, NATTechnology.ONE_TO_ONE_NAT);
		addEEnumLiteral(natTechnologyEEnum, NATTechnology.DUAL_NAT);
		addEEnumLiteral(natTechnologyEEnum, NATTechnology.TWICE_NAT);

		initEEnum(routingProtocolEEnum, RoutingProtocol.class, "RoutingProtocol");
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.RIP);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.OSPF);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.EIGRP);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.IS_IS);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.BGP);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.IGRP);

		initEEnum(authenticationWifiEEnum, AuthenticationWifi.class, "AuthenticationWifi");
		addEEnumLiteral(authenticationWifiEEnum, AuthenticationWifi.SHARED);
		addEEnumLiteral(authenticationWifiEEnum, AuthenticationWifi.OPEN);
		addEEnumLiteral(authenticationWifiEEnum, AuthenticationWifi.WPA_VERSION_2);
		addEEnumLiteral(authenticationWifiEEnum, AuthenticationWifi.SEA);

		initEEnum(encryptionModeWifiEEnum, EncryptionModeWifi.class, "EncryptionModeWifi");
		addEEnumLiteral(encryptionModeWifiEEnum, EncryptionModeWifi.AES_CCM);
		addEEnumLiteral(encryptionModeWifiEEnum, EncryptionModeWifi.WEP);

		initEEnum(operatingFrequencyEEnum, OperatingFrequency.class, "OperatingFrequency");
		addEEnumLiteral(operatingFrequencyEEnum, OperatingFrequency.GHZ_24);
		addEEnumLiteral(operatingFrequencyEEnum, OperatingFrequency.GHZ_5);
		addEEnumLiteral(operatingFrequencyEEnum, OperatingFrequency.GHZ_6);
		addEEnumLiteral(operatingFrequencyEEnum, OperatingFrequency.GHZ_60);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.VOIP);
		addEEnumLiteral(portTypeEEnum, PortType.ACCESS);
		addEEnumLiteral(portTypeEEnum, PortType.TRUNK);

		// Create resource
		createResource(eNS_URI);
	}

} //NetworkArchitectureLitePackageImpl
