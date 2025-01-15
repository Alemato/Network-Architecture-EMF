/**
 */
package NetworkArchitectureLite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see NetworkArchitectureLite.NetworkArchitectureLiteFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkArchitectureLitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NetworkArchitectureLite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.univaq.disim.mde/NALITE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NALITE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkArchitectureLitePackage eINSTANCE = NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl.init();

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.NamedElementImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.NetworkDeviceImpl <em>Network Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.NetworkDeviceImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNetworkDevice()
	 * @generated
	 */
	int NETWORK_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__INTERNAL_IP_ADDRESS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__OS_VERSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__OPERATING_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE__PORT_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Network Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Network Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_DEVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.NetworkImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Ip Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PUBLIC_IP_ADDRES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__VLANS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__GATEWAY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wifis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__WIFIS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.GatewayImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = NETWORK_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INTERNAL_IP_ADDRESS = NETWORK_DEVICE__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OS_VERSION = NETWORK_DEVICE__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OPERATING_SYSTEM = NETWORK_DEVICE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__PORT_NUMBER = NETWORK_DEVICE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Tecnology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TECNOLOGY = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAT = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ROUTER = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__VLAN = NETWORK_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.RouterImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = NETWORK_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__INTERNAL_IP_ADDRESS = NETWORK_DEVICE__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__OS_VERSION = NETWORK_DEVICE__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__OPERATING_SYSTEM = NETWORK_DEVICE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__PORT_NUMBER = NETWORK_DEVICE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ROUTING_PROTOCOL = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch L3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__SWITCH_L3 = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__VLANS = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.SwitchL3Impl <em>Switch L3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.SwitchL3Impl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getSwitchL3()
	 * @generated
	 */
	int SWITCH_L3 = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__NAME = NETWORK_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__INTERNAL_IP_ADDRESS = NETWORK_DEVICE__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__OS_VERSION = NETWORK_DEVICE__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__OPERATING_SYSTEM = NETWORK_DEVICE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__PORT_NUMBER = NETWORK_DEVICE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__ROUTING_PROTOCOL = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch L2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__SWITCH_L2 = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__ACCESS_POINTS = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__VLANS = NETWORK_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Switch L3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Switch L3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.AccessPointImpl <em>Access Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.AccessPointImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getAccessPoint()
	 * @generated
	 */
	int ACCESS_POINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__NAME = NETWORK_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__INTERNAL_IP_ADDRESS = NETWORK_DEVICE__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__OS_VERSION = NETWORK_DEVICE__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__OPERATING_SYSTEM = NETWORK_DEVICE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__PORT_NUMBER = NETWORK_DEVICE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Max Client Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__MAX_CLIENT_SUPPORT = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wifis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__WIFIS = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__VLAN = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Access Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Access Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.WifiImpl <em>Wifi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.WifiImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getWifi()
	 * @generated
	 */
	int WIFI = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__SSID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__FREQUENCY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__CHANNEL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__AUTHENTICATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__ENCRYPTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__INTERNAL_IP_ADDRESS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__VLAN = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Wifi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Wifi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.SwitchL2Impl <em>Switch L2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.SwitchL2Impl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getSwitchL2()
	 * @generated
	 */
	int SWITCH_L2 = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__NAME = NETWORK_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__INTERNAL_IP_ADDRESS = NETWORK_DEVICE__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__MODEL = NETWORK_DEVICE__MODEL;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__OS_VERSION = NETWORK_DEVICE__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__OPERATING_SYSTEM = NETWORK_DEVICE__OPERATING_SYSTEM;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__PORT_NUMBER = NETWORK_DEVICE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__PORT_TYPE = NETWORK_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__VLANS = NETWORK_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch L2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2_FEATURE_COUNT = NETWORK_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch L2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2_OPERATION_COUNT = NETWORK_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.impl.VLANImpl <em>VLAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.impl.VLANImpl
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getVLAN()
	 * @generated
	 */
	int VLAN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id VLan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__ID_VLAN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mtu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__MTU = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__SUBNET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ip Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__IP_GATEWAY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__LOWER_IP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN__UPPER_IP = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VLAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>VLAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.GatewayTechnology <em>Gateway Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.GatewayTechnology
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getGatewayTechnology()
	 * @generated
	 */
	int GATEWAY_TECHNOLOGY = 10;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.NATTechnology <em>NAT Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.NATTechnology
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNATTechnology()
	 * @generated
	 */
	int NAT_TECHNOLOGY = 11;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.RoutingProtocol <em>Routing Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.RoutingProtocol
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getRoutingProtocol()
	 * @generated
	 */
	int ROUTING_PROTOCOL = 12;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.AuthenticationWifi <em>Authentication Wifi</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.AuthenticationWifi
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getAuthenticationWifi()
	 * @generated
	 */
	int AUTHENTICATION_WIFI = 13;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.EncryptionModeWifi <em>Encryption Mode Wifi</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.EncryptionModeWifi
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getEncryptionModeWifi()
	 * @generated
	 */
	int ENCRYPTION_MODE_WIFI = 14;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.OperatingFrequency <em>Operating Frequency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.OperatingFrequency
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getOperatingFrequency()
	 * @generated
	 */
	int OPERATING_FREQUENCY = 15;

	/**
	 * The meta object id for the '{@link NetworkArchitectureLite.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitectureLite.PortType
	 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see NetworkArchitectureLite.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see NetworkArchitectureLite.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.NetworkDevice <em>Network Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Device</em>'.
	 * @see NetworkArchitectureLite.NetworkDevice
	 * @generated
	 */
	EClass getNetworkDevice();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.NetworkDevice#getInternalIpAddress <em>Internal Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Ip Address</em>'.
	 * @see NetworkArchitectureLite.NetworkDevice#getInternalIpAddress()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_InternalIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.NetworkDevice#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see NetworkArchitectureLite.NetworkDevice#getModel()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_Model();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.NetworkDevice#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see NetworkArchitectureLite.NetworkDevice#getOsVersion()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_OsVersion();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.NetworkDevice#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see NetworkArchitectureLite.NetworkDevice#getOperatingSystem()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_OperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.NetworkDevice#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see NetworkArchitectureLite.NetworkDevice#getPortNumber()
	 * @see #getNetworkDevice()
	 * @generated
	 */
	EAttribute getNetworkDevice_PortNumber();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see NetworkArchitectureLite.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Network#getPublicIpAddres <em>Public Ip Addres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Ip Addres</em>'.
	 * @see NetworkArchitectureLite.Network#getPublicIpAddres()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_PublicIpAddres();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitectureLite.Network#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vlans</em>'.
	 * @see NetworkArchitectureLite.Network#getVlans()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Vlans();

	/**
	 * Returns the meta object for the containment reference '{@link NetworkArchitectureLite.Network#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gateway</em>'.
	 * @see NetworkArchitectureLite.Network#getGateway()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Gateway();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitectureLite.Network#getWifis <em>Wifis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wifis</em>'.
	 * @see NetworkArchitectureLite.Network#getWifis()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Wifis();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see NetworkArchitectureLite.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Gateway#getTecnology <em>Tecnology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tecnology</em>'.
	 * @see NetworkArchitectureLite.Gateway#getTecnology()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Tecnology();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Gateway#getNat <em>Nat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat</em>'.
	 * @see NetworkArchitectureLite.Gateway#getNat()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Nat();

	/**
	 * Returns the meta object for the containment reference '{@link NetworkArchitectureLite.Gateway#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Router</em>'.
	 * @see NetworkArchitectureLite.Gateway#getRouter()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Router();

	/**
	 * Returns the meta object for the reference '{@link NetworkArchitectureLite.Gateway#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlan</em>'.
	 * @see NetworkArchitectureLite.Gateway#getVlan()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Vlan();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see NetworkArchitectureLite.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Router#getRoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Protocol</em>'.
	 * @see NetworkArchitectureLite.Router#getRoutingProtocol()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_RoutingProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitectureLite.Router#getSwitchL3 <em>Switch L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch L3</em>'.
	 * @see NetworkArchitectureLite.Router#getSwitchL3()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_SwitchL3();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitectureLite.Router#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see NetworkArchitectureLite.Router#getVlans()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_Vlans();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.SwitchL3 <em>Switch L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch L3</em>'.
	 * @see NetworkArchitectureLite.SwitchL3
	 * @generated
	 */
	EClass getSwitchL3();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.SwitchL3#getRoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Protocol</em>'.
	 * @see NetworkArchitectureLite.SwitchL3#getRoutingProtocol()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EAttribute getSwitchL3_RoutingProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitectureLite.SwitchL3#getSwitchL2 <em>Switch L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch L2</em>'.
	 * @see NetworkArchitectureLite.SwitchL3#getSwitchL2()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_SwitchL2();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitectureLite.SwitchL3#getAccessPoints <em>Access Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Points</em>'.
	 * @see NetworkArchitectureLite.SwitchL3#getAccessPoints()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_AccessPoints();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitectureLite.SwitchL3#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see NetworkArchitectureLite.SwitchL3#getVlans()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_Vlans();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.AccessPoint <em>Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Point</em>'.
	 * @see NetworkArchitectureLite.AccessPoint
	 * @generated
	 */
	EClass getAccessPoint();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.AccessPoint#getMaxClientSupport <em>Max Client Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Client Support</em>'.
	 * @see NetworkArchitectureLite.AccessPoint#getMaxClientSupport()
	 * @see #getAccessPoint()
	 * @generated
	 */
	EAttribute getAccessPoint_MaxClientSupport();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitectureLite.AccessPoint#getWifis <em>Wifis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wifis</em>'.
	 * @see NetworkArchitectureLite.AccessPoint#getWifis()
	 * @see #getAccessPoint()
	 * @generated
	 */
	EReference getAccessPoint_Wifis();

	/**
	 * Returns the meta object for the reference '{@link NetworkArchitectureLite.AccessPoint#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlan</em>'.
	 * @see NetworkArchitectureLite.AccessPoint#getVlan()
	 * @see #getAccessPoint()
	 * @generated
	 */
	EReference getAccessPoint_Vlan();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.Wifi <em>Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wifi</em>'.
	 * @see NetworkArchitectureLite.Wifi
	 * @generated
	 */
	EClass getWifi();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Wifi#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see NetworkArchitectureLite.Wifi#getSsid()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Ssid();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Wifi#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see NetworkArchitectureLite.Wifi#getFrequency()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Wifi#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see NetworkArchitectureLite.Wifi#getChannel()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Channel();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Wifi#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication</em>'.
	 * @see NetworkArchitectureLite.Wifi#getAuthentication()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Wifi#getEncryption <em>Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption</em>'.
	 * @see NetworkArchitectureLite.Wifi#getEncryption()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Encryption();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.Wifi#getInternalIpAddress <em>Internal Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Ip Address</em>'.
	 * @see NetworkArchitectureLite.Wifi#getInternalIpAddress()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_InternalIpAddress();

	/**
	 * Returns the meta object for the reference '{@link NetworkArchitectureLite.Wifi#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlan</em>'.
	 * @see NetworkArchitectureLite.Wifi#getVlan()
	 * @see #getWifi()
	 * @generated
	 */
	EReference getWifi_Vlan();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.SwitchL2 <em>Switch L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch L2</em>'.
	 * @see NetworkArchitectureLite.SwitchL2
	 * @generated
	 */
	EClass getSwitchL2();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.SwitchL2#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see NetworkArchitectureLite.SwitchL2#getPortType()
	 * @see #getSwitchL2()
	 * @generated
	 */
	EAttribute getSwitchL2_PortType();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitectureLite.SwitchL2#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see NetworkArchitectureLite.SwitchL2#getVlans()
	 * @see #getSwitchL2()
	 * @generated
	 */
	EReference getSwitchL2_Vlans();

	/**
	 * Returns the meta object for class '{@link NetworkArchitectureLite.VLAN <em>VLAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLAN</em>'.
	 * @see NetworkArchitectureLite.VLAN
	 * @generated
	 */
	EClass getVLAN();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.VLAN#getIdVLan <em>Id VLan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id VLan</em>'.
	 * @see NetworkArchitectureLite.VLAN#getIdVLan()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_IdVLan();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.VLAN#getMtu <em>Mtu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtu</em>'.
	 * @see NetworkArchitectureLite.VLAN#getMtu()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_Mtu();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.VLAN#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see NetworkArchitectureLite.VLAN#getSubnet()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_Subnet();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.VLAN#getIpGateway <em>Ip Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Gateway</em>'.
	 * @see NetworkArchitectureLite.VLAN#getIpGateway()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_IpGateway();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.VLAN#getLowerIp <em>Lower Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Ip</em>'.
	 * @see NetworkArchitectureLite.VLAN#getLowerIp()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_LowerIp();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitectureLite.VLAN#getUpperIp <em>Upper Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Ip</em>'.
	 * @see NetworkArchitectureLite.VLAN#getUpperIp()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_UpperIp();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.GatewayTechnology <em>Gateway Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Technology</em>'.
	 * @see NetworkArchitectureLite.GatewayTechnology
	 * @generated
	 */
	EEnum getGatewayTechnology();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.NATTechnology <em>NAT Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NAT Technology</em>'.
	 * @see NetworkArchitectureLite.NATTechnology
	 * @generated
	 */
	EEnum getNATTechnology();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.RoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing Protocol</em>'.
	 * @see NetworkArchitectureLite.RoutingProtocol
	 * @generated
	 */
	EEnum getRoutingProtocol();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.AuthenticationWifi <em>Authentication Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Wifi</em>'.
	 * @see NetworkArchitectureLite.AuthenticationWifi
	 * @generated
	 */
	EEnum getAuthenticationWifi();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.EncryptionModeWifi <em>Encryption Mode Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encryption Mode Wifi</em>'.
	 * @see NetworkArchitectureLite.EncryptionModeWifi
	 * @generated
	 */
	EEnum getEncryptionModeWifi();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.OperatingFrequency <em>Operating Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating Frequency</em>'.
	 * @see NetworkArchitectureLite.OperatingFrequency
	 * @generated
	 */
	EEnum getOperatingFrequency();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitectureLite.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see NetworkArchitectureLite.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkArchitectureLiteFactory getNetworkArchitectureLiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.NamedElementImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.NetworkDeviceImpl <em>Network Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.NetworkDeviceImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNetworkDevice()
		 * @generated
		 */
		EClass NETWORK_DEVICE = eINSTANCE.getNetworkDevice();

		/**
		 * The meta object literal for the '<em><b>Internal Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__INTERNAL_IP_ADDRESS = eINSTANCE.getNetworkDevice_InternalIpAddress();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__MODEL = eINSTANCE.getNetworkDevice_Model();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__OS_VERSION = eINSTANCE.getNetworkDevice_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__OPERATING_SYSTEM = eINSTANCE.getNetworkDevice_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_DEVICE__PORT_NUMBER = eINSTANCE.getNetworkDevice_PortNumber();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.NetworkImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Public Ip Addres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PUBLIC_IP_ADDRES = eINSTANCE.getNetwork_PublicIpAddres();

		/**
		 * The meta object literal for the '<em><b>Vlans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__VLANS = eINSTANCE.getNetwork_Vlans();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__GATEWAY = eINSTANCE.getNetwork_Gateway();

		/**
		 * The meta object literal for the '<em><b>Wifis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__WIFIS = eINSTANCE.getNetwork_Wifis();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.GatewayImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Tecnology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__TECNOLOGY = eINSTANCE.getGateway_Tecnology();

		/**
		 * The meta object literal for the '<em><b>Nat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__NAT = eINSTANCE.getGateway_Nat();

		/**
		 * The meta object literal for the '<em><b>Router</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__ROUTER = eINSTANCE.getGateway_Router();

		/**
		 * The meta object literal for the '<em><b>Vlan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__VLAN = eINSTANCE.getGateway_Vlan();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.RouterImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Routing Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__ROUTING_PROTOCOL = eINSTANCE.getRouter_RoutingProtocol();

		/**
		 * The meta object literal for the '<em><b>Switch L3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__SWITCH_L3 = eINSTANCE.getRouter_SwitchL3();

		/**
		 * The meta object literal for the '<em><b>Vlans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__VLANS = eINSTANCE.getRouter_Vlans();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.SwitchL3Impl <em>Switch L3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.SwitchL3Impl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getSwitchL3()
		 * @generated
		 */
		EClass SWITCH_L3 = eINSTANCE.getSwitchL3();

		/**
		 * The meta object literal for the '<em><b>Routing Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_L3__ROUTING_PROTOCOL = eINSTANCE.getSwitchL3_RoutingProtocol();

		/**
		 * The meta object literal for the '<em><b>Switch L2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__SWITCH_L2 = eINSTANCE.getSwitchL3_SwitchL2();

		/**
		 * The meta object literal for the '<em><b>Access Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__ACCESS_POINTS = eINSTANCE.getSwitchL3_AccessPoints();

		/**
		 * The meta object literal for the '<em><b>Vlans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__VLANS = eINSTANCE.getSwitchL3_Vlans();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.AccessPointImpl <em>Access Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.AccessPointImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getAccessPoint()
		 * @generated
		 */
		EClass ACCESS_POINT = eINSTANCE.getAccessPoint();

		/**
		 * The meta object literal for the '<em><b>Max Client Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POINT__MAX_CLIENT_SUPPORT = eINSTANCE.getAccessPoint_MaxClientSupport();

		/**
		 * The meta object literal for the '<em><b>Wifis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POINT__WIFIS = eINSTANCE.getAccessPoint_Wifis();

		/**
		 * The meta object literal for the '<em><b>Vlan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POINT__VLAN = eINSTANCE.getAccessPoint_Vlan();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.WifiImpl <em>Wifi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.WifiImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getWifi()
		 * @generated
		 */
		EClass WIFI = eINSTANCE.getWifi();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI__SSID = eINSTANCE.getWifi_Ssid();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI__FREQUENCY = eINSTANCE.getWifi_Frequency();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI__CHANNEL = eINSTANCE.getWifi_Channel();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI__AUTHENTICATION = eINSTANCE.getWifi_Authentication();

		/**
		 * The meta object literal for the '<em><b>Encryption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI__ENCRYPTION = eINSTANCE.getWifi_Encryption();

		/**
		 * The meta object literal for the '<em><b>Internal Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI__INTERNAL_IP_ADDRESS = eINSTANCE.getWifi_InternalIpAddress();

		/**
		 * The meta object literal for the '<em><b>Vlan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIFI__VLAN = eINSTANCE.getWifi_Vlan();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.SwitchL2Impl <em>Switch L2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.SwitchL2Impl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getSwitchL2()
		 * @generated
		 */
		EClass SWITCH_L2 = eINSTANCE.getSwitchL2();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_L2__PORT_TYPE = eINSTANCE.getSwitchL2_PortType();

		/**
		 * The meta object literal for the '<em><b>Vlans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L2__VLANS = eINSTANCE.getSwitchL2_Vlans();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.impl.VLANImpl <em>VLAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.impl.VLANImpl
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getVLAN()
		 * @generated
		 */
		EClass VLAN = eINSTANCE.getVLAN();

		/**
		 * The meta object literal for the '<em><b>Id VLan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLAN__ID_VLAN = eINSTANCE.getVLAN_IdVLan();

		/**
		 * The meta object literal for the '<em><b>Mtu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLAN__MTU = eINSTANCE.getVLAN_Mtu();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLAN__SUBNET = eINSTANCE.getVLAN_Subnet();

		/**
		 * The meta object literal for the '<em><b>Ip Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLAN__IP_GATEWAY = eINSTANCE.getVLAN_IpGateway();

		/**
		 * The meta object literal for the '<em><b>Lower Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLAN__LOWER_IP = eINSTANCE.getVLAN_LowerIp();

		/**
		 * The meta object literal for the '<em><b>Upper Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VLAN__UPPER_IP = eINSTANCE.getVLAN_UpperIp();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.GatewayTechnology <em>Gateway Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.GatewayTechnology
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getGatewayTechnology()
		 * @generated
		 */
		EEnum GATEWAY_TECHNOLOGY = eINSTANCE.getGatewayTechnology();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.NATTechnology <em>NAT Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.NATTechnology
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getNATTechnology()
		 * @generated
		 */
		EEnum NAT_TECHNOLOGY = eINSTANCE.getNATTechnology();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.RoutingProtocol <em>Routing Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.RoutingProtocol
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getRoutingProtocol()
		 * @generated
		 */
		EEnum ROUTING_PROTOCOL = eINSTANCE.getRoutingProtocol();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.AuthenticationWifi <em>Authentication Wifi</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.AuthenticationWifi
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getAuthenticationWifi()
		 * @generated
		 */
		EEnum AUTHENTICATION_WIFI = eINSTANCE.getAuthenticationWifi();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.EncryptionModeWifi <em>Encryption Mode Wifi</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.EncryptionModeWifi
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getEncryptionModeWifi()
		 * @generated
		 */
		EEnum ENCRYPTION_MODE_WIFI = eINSTANCE.getEncryptionModeWifi();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.OperatingFrequency <em>Operating Frequency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.OperatingFrequency
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getOperatingFrequency()
		 * @generated
		 */
		EEnum OPERATING_FREQUENCY = eINSTANCE.getOperatingFrequency();

		/**
		 * The meta object literal for the '{@link NetworkArchitectureLite.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitectureLite.PortType
		 * @see NetworkArchitectureLite.impl.NetworkArchitectureLitePackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

	}

} //NetworkArchitectureLitePackage
