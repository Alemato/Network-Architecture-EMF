/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.AcccessPoint;
import NetworkArchitecture.AuthenticationWifi;
import NetworkArchitecture.EncryptionModeWifi;
import NetworkArchitecture.FirmwareElement;
import NetworkArchitecture.Gateway;
import NetworkArchitecture.GatewayTechnology;
import NetworkArchitecture.InternalIpAddressElement;
import NetworkArchitecture.NATTechnology;
import NetworkArchitecture.NamedElement;
import NetworkArchitecture.Network;
import NetworkArchitecture.NetworkArchitectureFactory;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.OperatingFrequency;
import NetworkArchitecture.PortNumberElement;
import NetworkArchitecture.PortType;
import NetworkArchitecture.Router;
import NetworkArchitecture.RoutingProtocol;
import NetworkArchitecture.StaticRoute;
import NetworkArchitecture.SwitchL2;
import NetworkArchitecture.SwitchL3;
import NetworkArchitecture.Wifi;

import NetworkArchitecture.util.NetworkArchitectureValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkArchitecturePackageImpl extends EPackageImpl implements NetworkArchitecturePackage {
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
	private EClass portNumberElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalIpAddressElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmwareElementEClass = null;

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
	private EClass acccessPointEClass = null;

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
	private EClass staticRouteEClass = null;

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
	 * @see NetworkArchitecture.NetworkArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkArchitecturePackageImpl() {
		super(eNS_URI, NetworkArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NetworkArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkArchitecturePackage init() {
		if (isInited) return (NetworkArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(NetworkArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetworkArchitecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NetworkArchitecturePackageImpl theNetworkArchitecturePackage = registeredNetworkArchitecturePackage instanceof NetworkArchitecturePackageImpl ? (NetworkArchitecturePackageImpl)registeredNetworkArchitecturePackage : new NetworkArchitecturePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNetworkArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theNetworkArchitecturePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theNetworkArchitecturePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return NetworkArchitectureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theNetworkArchitecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkArchitecturePackage.eNS_URI, theNetworkArchitecturePackage);
		return theNetworkArchitecturePackage;
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
	public EClass getPortNumberElement() {
		return portNumberElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortNumberElement_PortNumber() {
		return (EAttribute)portNumberElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPortNumberElement__IsValidLanPortNumber() {
		return portNumberElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalIpAddressElement() {
		return internalIpAddressElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalIpAddressElement_InternalIpAddress() {
		return (EAttribute)internalIpAddressElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalIpAddressElement__ValidInternalIpAddress__DiagnosticChain_Map() {
		return internalIpAddressElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirmwareElement() {
		return firmwareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirmwareElement_Model() {
		return (EAttribute)firmwareElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirmwareElement_OsVersion() {
		return (EAttribute)firmwareElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirmwareElement_OperatingSystem() {
		return (EAttribute)firmwareElementEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getNetwork_NetworkDevicesCount() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNetwork__ValidPublicIpAddres__DiagnosticChain_Map() {
		return networkEClass.getEOperations().get(0);
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
	public EReference getRouter_Vlans() {
		return (EReference)routerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouter_SwitchL3() {
		return (EReference)routerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouter_StaticRoute() {
		return (EReference)routerEClass.getEStructuralFeatures().get(3);
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
	public EReference getSwitchL3_Vlans() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL3_SwitchL2() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL3_StaticRoute() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchL3_AccessPoints() {
		return (EReference)switchL3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwitchL3_TotalConnectedDevices() {
		return (EAttribute)switchL3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcccessPoint() {
		return acccessPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcccessPoint_MaxClientSupport() {
		return (EAttribute)acccessPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcccessPoint_Wifis() {
		return (EReference)acccessPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcccessPoint_Vlan() {
		return (EReference)acccessPointEClass.getEStructuralFeatures().get(2);
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
	public EReference getWifi_Vlan() {
		return (EReference)wifiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWifi__IsValidChannelForFrequency() {
		return wifiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWifi__ValidChannelForFrequency__DiagnosticChain_Map() {
		return wifiEClass.getEOperations().get(1);
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
	public EOperation getVLAN__ValidSubnet__DiagnosticChain_Map() {
		return vlanEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVLAN__ValidIpGateway__DiagnosticChain_Map() {
		return vlanEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVLAN__ValidUpperIp__DiagnosticChain_Map() {
		return vlanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVLAN__ValidLowerIp__DiagnosticChain_Map() {
		return vlanEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticRoute() {
		return staticRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticRoute_NetworkDestination() {
		return (EAttribute)staticRouteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticRoute_Netmask() {
		return (EAttribute)staticRouteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticRoute_Gateway() {
		return (EAttribute)staticRouteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticRoute_NetInterface() {
		return (EAttribute)staticRouteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticRoute_Metric() {
		return (EAttribute)staticRouteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaticRoute__ValidNetworkInterface__DiagnosticChain_Map() {
		return staticRouteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaticRoute__ValidNetworkDestination__DiagnosticChain_Map() {
		return staticRouteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaticRoute__MetricPositive__DiagnosticChain_Map() {
		return staticRouteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaticRoute__ValidGateway__DiagnosticChain_Map() {
		return staticRouteEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaticRoute__ValidNetmask__DiagnosticChain_Map() {
		return staticRouteEClass.getEOperations().get(4);
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
	public NetworkArchitectureFactory getNetworkArchitectureFactory() {
		return (NetworkArchitectureFactory)getEFactoryInstance();
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

		portNumberElementEClass = createEClass(PORT_NUMBER_ELEMENT);
		createEAttribute(portNumberElementEClass, PORT_NUMBER_ELEMENT__PORT_NUMBER);
		createEOperation(portNumberElementEClass, PORT_NUMBER_ELEMENT___IS_VALID_LAN_PORT_NUMBER);

		internalIpAddressElementEClass = createEClass(INTERNAL_IP_ADDRESS_ELEMENT);
		createEAttribute(internalIpAddressElementEClass, INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS);
		createEOperation(internalIpAddressElementEClass, INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP);

		firmwareElementEClass = createEClass(FIRMWARE_ELEMENT);
		createEAttribute(firmwareElementEClass, FIRMWARE_ELEMENT__MODEL);
		createEAttribute(firmwareElementEClass, FIRMWARE_ELEMENT__OS_VERSION);
		createEAttribute(firmwareElementEClass, FIRMWARE_ELEMENT__OPERATING_SYSTEM);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__PUBLIC_IP_ADDRES);
		createEReference(networkEClass, NETWORK__VLANS);
		createEReference(networkEClass, NETWORK__GATEWAY);
		createEReference(networkEClass, NETWORK__WIFIS);
		createEAttribute(networkEClass, NETWORK__NETWORK_DEVICES_COUNT);
		createEOperation(networkEClass, NETWORK___VALID_PUBLIC_IP_ADDRES__DIAGNOSTICCHAIN_MAP);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__TECNOLOGY);
		createEAttribute(gatewayEClass, GATEWAY__NAT);
		createEReference(gatewayEClass, GATEWAY__ROUTER);
		createEReference(gatewayEClass, GATEWAY__VLAN);

		routerEClass = createEClass(ROUTER);
		createEAttribute(routerEClass, ROUTER__ROUTING_PROTOCOL);
		createEReference(routerEClass, ROUTER__VLANS);
		createEReference(routerEClass, ROUTER__SWITCH_L3);
		createEReference(routerEClass, ROUTER__STATIC_ROUTE);

		switchL3EClass = createEClass(SWITCH_L3);
		createEAttribute(switchL3EClass, SWITCH_L3__ROUTING_PROTOCOL);
		createEReference(switchL3EClass, SWITCH_L3__VLANS);
		createEReference(switchL3EClass, SWITCH_L3__SWITCH_L2);
		createEReference(switchL3EClass, SWITCH_L3__STATIC_ROUTE);
		createEReference(switchL3EClass, SWITCH_L3__ACCESS_POINTS);
		createEAttribute(switchL3EClass, SWITCH_L3__TOTAL_CONNECTED_DEVICES);

		acccessPointEClass = createEClass(ACCCESS_POINT);
		createEAttribute(acccessPointEClass, ACCCESS_POINT__MAX_CLIENT_SUPPORT);
		createEReference(acccessPointEClass, ACCCESS_POINT__WIFIS);
		createEReference(acccessPointEClass, ACCCESS_POINT__VLAN);

		wifiEClass = createEClass(WIFI);
		createEAttribute(wifiEClass, WIFI__SSID);
		createEAttribute(wifiEClass, WIFI__FREQUENCY);
		createEAttribute(wifiEClass, WIFI__CHANNEL);
		createEAttribute(wifiEClass, WIFI__AUTHENTICATION);
		createEAttribute(wifiEClass, WIFI__ENCRYPTION);
		createEReference(wifiEClass, WIFI__VLAN);
		createEOperation(wifiEClass, WIFI___IS_VALID_CHANNEL_FOR_FREQUENCY);
		createEOperation(wifiEClass, WIFI___VALID_CHANNEL_FOR_FREQUENCY__DIAGNOSTICCHAIN_MAP);

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
		createEOperation(vlanEClass, VLAN___VALID_UPPER_IP__DIAGNOSTICCHAIN_MAP);
		createEOperation(vlanEClass, VLAN___VALID_LOWER_IP__DIAGNOSTICCHAIN_MAP);
		createEOperation(vlanEClass, VLAN___VALID_SUBNET__DIAGNOSTICCHAIN_MAP);
		createEOperation(vlanEClass, VLAN___VALID_IP_GATEWAY__DIAGNOSTICCHAIN_MAP);

		staticRouteEClass = createEClass(STATIC_ROUTE);
		createEAttribute(staticRouteEClass, STATIC_ROUTE__NETWORK_DESTINATION);
		createEAttribute(staticRouteEClass, STATIC_ROUTE__NETMASK);
		createEAttribute(staticRouteEClass, STATIC_ROUTE__GATEWAY);
		createEAttribute(staticRouteEClass, STATIC_ROUTE__NET_INTERFACE);
		createEAttribute(staticRouteEClass, STATIC_ROUTE__METRIC);
		createEOperation(staticRouteEClass, STATIC_ROUTE___VALID_NETWORK_INTERFACE__DIAGNOSTICCHAIN_MAP);
		createEOperation(staticRouteEClass, STATIC_ROUTE___VALID_NETWORK_DESTINATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(staticRouteEClass, STATIC_ROUTE___METRIC_POSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(staticRouteEClass, STATIC_ROUTE___VALID_GATEWAY__DIAGNOSTICCHAIN_MAP);
		createEOperation(staticRouteEClass, STATIC_ROUTE___VALID_NETMASK__DIAGNOSTICCHAIN_MAP);

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
		networkEClass.getESuperTypes().add(this.getNamedElement());
		gatewayEClass.getESuperTypes().add(this.getInternalIpAddressElement());
		gatewayEClass.getESuperTypes().add(this.getNamedElement());
		gatewayEClass.getESuperTypes().add(this.getFirmwareElement());
		routerEClass.getESuperTypes().add(this.getInternalIpAddressElement());
		routerEClass.getESuperTypes().add(this.getNamedElement());
		routerEClass.getESuperTypes().add(this.getFirmwareElement());
		routerEClass.getESuperTypes().add(this.getPortNumberElement());
		switchL3EClass.getESuperTypes().add(this.getInternalIpAddressElement());
		switchL3EClass.getESuperTypes().add(this.getNamedElement());
		switchL3EClass.getESuperTypes().add(this.getFirmwareElement());
		switchL3EClass.getESuperTypes().add(this.getPortNumberElement());
		acccessPointEClass.getESuperTypes().add(this.getInternalIpAddressElement());
		acccessPointEClass.getESuperTypes().add(this.getNamedElement());
		acccessPointEClass.getESuperTypes().add(this.getFirmwareElement());
		acccessPointEClass.getESuperTypes().add(this.getPortNumberElement());
		wifiEClass.getESuperTypes().add(this.getInternalIpAddressElement());
		wifiEClass.getESuperTypes().add(this.getNamedElement());
		switchL2EClass.getESuperTypes().add(this.getInternalIpAddressElement());
		switchL2EClass.getESuperTypes().add(this.getNamedElement());
		switchL2EClass.getESuperTypes().add(this.getFirmwareElement());
		switchL2EClass.getESuperTypes().add(this.getPortNumberElement());
		vlanEClass.getESuperTypes().add(this.getNamedElement());
		staticRouteEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portNumberElementEClass, PortNumberElement.class, "PortNumberElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortNumberElement_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 1, 1, PortNumberElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPortNumberElement__IsValidLanPortNumber(), ecorePackage.getEBoolean(), "isValidLanPortNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(internalIpAddressElementEClass, InternalIpAddressElement.class, "InternalIpAddressElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalIpAddressElement_InternalIpAddress(), ecorePackage.getEString(), "internalIpAddress", null, 1, 1, InternalIpAddressElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getInternalIpAddressElement__ValidInternalIpAddress__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidInternalIpAddress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(firmwareElementEClass, FirmwareElement.class, "FirmwareElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirmwareElement_Model(), ecorePackage.getEString(), "model", null, 1, 1, FirmwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirmwareElement_OsVersion(), ecorePackage.getEString(), "osVersion", null, 1, 1, FirmwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirmwareElement_OperatingSystem(), ecorePackage.getEString(), "operatingSystem", null, 1, 1, FirmwareElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_PublicIpAddres(), ecorePackage.getEString(), "publicIpAddres", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Gateway(), this.getGateway(), null, "gateway", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Wifis(), this.getWifi(), null, "wifis", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_NetworkDevicesCount(), ecorePackage.getEInt(), "networkDevicesCount", null, 1, 1, Network.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNetwork__ValidPublicIpAddres__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidPublicIpAddres", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_Tecnology(), this.getGatewayTechnology(), "tecnology", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGateway_Nat(), this.getNATTechnology(), "nat", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Router(), this.getRouter(), null, "router", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Vlan(), this.getVLAN(), null, "vlan", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouter_RoutingProtocol(), this.getRoutingProtocol(), "routingProtocol", null, 1, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouter_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouter_SwitchL3(), this.getSwitchL3(), null, "switchL3", null, 0, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouter_StaticRoute(), this.getStaticRoute(), null, "staticRoute", null, 0, -1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchL3EClass, SwitchL3.class, "SwitchL3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchL3_RoutingProtocol(), this.getRoutingProtocol(), "routingProtocol", null, 1, 1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL3_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL3_SwitchL2(), this.getSwitchL2(), null, "switchL2", null, 0, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL3_StaticRoute(), this.getStaticRoute(), null, "staticRoute", null, 0, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL3_AccessPoints(), this.getAcccessPoint(), null, "accessPoints", null, 0, -1, SwitchL3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwitchL3_TotalConnectedDevices(), ecorePackage.getEInt(), "totalConnectedDevices", null, 1, 1, SwitchL3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(acccessPointEClass, AcccessPoint.class, "AcccessPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcccessPoint_MaxClientSupport(), ecorePackage.getEInt(), "maxClientSupport", null, 1, 1, AcccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcccessPoint_Wifis(), this.getWifi(), null, "wifis", null, 1, -1, AcccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcccessPoint_Vlan(), this.getVLAN(), null, "vlan", null, 1, 1, AcccessPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wifiEClass, Wifi.class, "Wifi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWifi_Ssid(), ecorePackage.getEString(), "ssid", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Frequency(), this.getOperatingFrequency(), "frequency", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Channel(), ecorePackage.getEInt(), "channel", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Authentication(), this.getAuthenticationWifi(), "authentication", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifi_Encryption(), this.getEncryptionModeWifi(), "encryption", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWifi_Vlan(), this.getVLAN(), null, "vlan", null, 1, 1, Wifi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWifi__IsValidChannelForFrequency(), ecorePackage.getEBooleanObject(), "isValidChannelForFrequency", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWifi__ValidChannelForFrequency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidChannelForFrequency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(switchL2EClass, SwitchL2.class, "SwitchL2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchL2_PortType(), this.getPortType(), "portType", null, 1, 1, SwitchL2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchL2_Vlans(), this.getVLAN(), null, "vlans", null, 1, -1, SwitchL2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vlanEClass, NetworkArchitecture.VLAN.class, "VLAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVLAN_IdVLan(), ecorePackage.getEInt(), "idVLan", null, 1, 1, NetworkArchitecture.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_Mtu(), ecorePackage.getEInt(), "mtu", null, 1, 1, NetworkArchitecture.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_Subnet(), ecorePackage.getEString(), "subnet", null, 1, 1, NetworkArchitecture.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_IpGateway(), ecorePackage.getEString(), "ipGateway", null, 1, 1, NetworkArchitecture.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_LowerIp(), ecorePackage.getEString(), "lowerIp", null, 1, 1, NetworkArchitecture.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLAN_UpperIp(), ecorePackage.getEString(), "upperIp", null, 1, 1, NetworkArchitecture.VLAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVLAN__ValidUpperIp__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidUpperIp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVLAN__ValidLowerIp__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidLowerIp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVLAN__ValidSubnet__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidSubnet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVLAN__ValidIpGateway__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidIpGateway", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(staticRouteEClass, StaticRoute.class, "StaticRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticRoute_NetworkDestination(), ecorePackage.getEString(), "networkDestination", null, 1, 1, StaticRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticRoute_Netmask(), ecorePackage.getEString(), "netmask", null, 1, 1, StaticRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticRoute_Gateway(), ecorePackage.getEString(), "gateway", null, 1, 1, StaticRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticRoute_NetInterface(), ecorePackage.getEString(), "netInterface", null, 1, 1, StaticRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticRoute_Metric(), ecorePackage.getEInt(), "metric", null, 1, 1, StaticRoute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStaticRoute__ValidNetworkInterface__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidNetworkInterface", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStaticRoute__ValidNetworkDestination__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidNetworkDestination", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStaticRoute__MetricPositive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MetricPositive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStaticRoute__ValidGateway__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidGateway", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStaticRoute__ValidNetmask__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidNetmask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (internalIpAddressElementEClass,
		   source,
		   new String[] {
			   "constraints", "ValidInternalIpAddress"
		   });
		addAnnotation
		  (networkEClass,
		   source,
		   new String[] {
			   "constraints", "ValidPublicIpAddres"
		   });
		addAnnotation
		  (wifiEClass,
		   source,
		   new String[] {
			   "constraints", "ValidChannelForFrequency"
		   });
		addAnnotation
		  (vlanEClass,
		   source,
		   new String[] {
			   "constraints", "ValidIpGateway"
		   });
		addAnnotation
		  (staticRouteEClass,
		   source,
		   new String[] {
			   "constraints", "ValidNetmask"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getPortNumberElement__IsValidLanPortNumber(),
		   source,
		   new String[] {
			   "body", "\n\t            portNumber >= 1 and portNumber <= 48"
		   });
		addAnnotation
		  (getInternalIpAddressElement__ValidInternalIpAddress__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t    internalIpAddress.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getNetwork__ValidPublicIpAddres__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t        publicIpAddres.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                       \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                       \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                       \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getWifi__IsValidChannelForFrequency(),
		   source,
		   new String[] {
			   "body", "\n\t\t        if frequency = OperatingFrequency::Ghz_2_4 then\n\t\t            channel >= 1 and channel <= 14\n\t\t        elseif frequency = OperatingFrequency::Ghz_5 then\n\t\t            channel = 36 or channel = 40 or channel = 44 or channel = 48 or\n\t\t            channel = 52 or channel = 56 or channel = 60 or channel = 64 or\n\t\t            channel = 100 or channel = 104 or channel = 108 or channel = 112 or\n\t\t            channel = 116 or channel = 120 or channel = 124 or channel = 128 or\n\t\t            channel = 132 or channel = 136 or channel = 140 or channel = 144 or\n\t\t            channel = 149 or channel = 153 or channel = 157 or channel = 161 or\n\t\t            channel = 165\n\t\t        else\n\t\t            true -- Per altre frequenze, non ci sono restrizioni definite.\n\t\t        endif"
		   });
		addAnnotation
		  (getWifi__ValidChannelForFrequency__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n        \tself.isValidChannelForFrequency()"
		   });
		addAnnotation
		  (getVLAN__ValidUpperIp__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "upperIp.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                            \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                            \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                            \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getVLAN__ValidLowerIp__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "lowerIp.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                            \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                            \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                            \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getVLAN__ValidSubnet__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "subnet.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getVLAN__ValidIpGateway__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "ipGateway.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                                \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                                \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                                \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getStaticRoute__ValidNetworkInterface__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t        netInterface.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getStaticRoute__ValidNetworkDestination__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t        networkDestination.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getStaticRoute__MetricPositive__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t        metric > 0"
		   });
		addAnnotation
		  (getStaticRoute__ValidGateway__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t        gateway.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
		addAnnotation
		  (getStaticRoute__ValidNetmask__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t        netmask.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')"
		   });
	}

} //NetworkArchitecturePackageImpl
