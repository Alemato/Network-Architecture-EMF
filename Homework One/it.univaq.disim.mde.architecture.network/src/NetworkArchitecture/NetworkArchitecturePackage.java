/**
 */
package NetworkArchitecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see NetworkArchitecture.NetworkArchitectureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface NetworkArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NetworkArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.univaq.disim.mde/NA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkArchitecturePackage eINSTANCE = NetworkArchitecture.impl.NetworkArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.NamedElementImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link NetworkArchitecture.impl.PortNumberElementImpl <em>Port Number Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.PortNumberElementImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getPortNumberElement()
	 * @generated
	 */
	int PORT_NUMBER_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_NUMBER_ELEMENT__PORT_NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Port Number Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_NUMBER_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Valid Lan Port Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_NUMBER_ELEMENT___IS_VALID_LAN_PORT_NUMBER = 0;

	/**
	 * The number of operations of the '<em>Port Number Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_NUMBER_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.InternalIpAddressElementImpl <em>Internal Ip Address Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.InternalIpAddressElementImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getInternalIpAddressElement()
	 * @generated
	 */
	int INTERNAL_IP_ADDRESS_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Internal Ip Address Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Internal Ip Address Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.FirmwareElementImpl <em>Firmware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.FirmwareElementImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getFirmwareElement()
	 * @generated
	 */
	int FIRMWARE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ELEMENT__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ELEMENT__OS_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ELEMENT__OPERATING_SYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Firmware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Firmware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMWARE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.NetworkImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 4;

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
	 * The feature id for the '<em><b>Network Devices Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_DEVICES_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Valid Public Ip Addres</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___VALID_PUBLIC_IP_ADDRES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.GatewayImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INTERNAL_IP_ADDRESS = INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MODEL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OS_VERSION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OPERATING_SYSTEM = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tecnology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TECNOLOGY = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ROUTER = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__VLAN = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.RouterImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 6;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__INTERNAL_IP_ADDRESS = INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MODEL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__OS_VERSION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__OPERATING_SYSTEM = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ROUTING_PROTOCOL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__VLANS = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Switch L3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__SWITCH_L3 = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Static Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__STATIC_ROUTE = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid Lan Port Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER___IS_VALID_LAN_PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.SwitchL3Impl <em>Switch L3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.SwitchL3Impl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getSwitchL3()
	 * @generated
	 */
	int SWITCH_L3 = 7;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__INTERNAL_IP_ADDRESS = INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__NAME = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__MODEL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__OS_VERSION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__OPERATING_SYSTEM = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__ROUTING_PROTOCOL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__VLANS = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Switch L2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__SWITCH_L2 = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Static Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__STATIC_ROUTE = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Access Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__ACCESS_POINTS = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Total Connected Devices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3__TOTAL_CONNECTED_DEVICES = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Switch L3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3_FEATURE_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid Lan Port Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3___IS_VALID_LAN_PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch L3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L3_OPERATION_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.AcccessPointImpl <em>Acccess Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.AcccessPointImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getAcccessPoint()
	 * @generated
	 */
	int ACCCESS_POINT = 8;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__INTERNAL_IP_ADDRESS = INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__NAME = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__MODEL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__OS_VERSION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__OPERATING_SYSTEM = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Client Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__MAX_CLIENT_SUPPORT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wifis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__WIFIS = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT__VLAN = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Acccess Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT_FEATURE_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid Lan Port Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT___IS_VALID_LAN_PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Acccess Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCCESS_POINT_OPERATION_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.WifiImpl <em>Wifi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.WifiImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getWifi()
	 * @generated
	 */
	int WIFI = 9;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__INTERNAL_IP_ADDRESS = INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__NAME = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__SSID = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__FREQUENCY = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__CHANNEL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__AUTHENTICATION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__ENCRYPTION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__VLAN = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Wifi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_FEATURE_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid Channel For Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI___IS_VALID_CHANNEL_FOR_FREQUENCY = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Channel For Frequency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI___VALID_CHANNEL_FOR_FREQUENCY__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wifi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_OPERATION_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.SwitchL2Impl <em>Switch L2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.SwitchL2Impl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getSwitchL2()
	 * @generated
	 */
	int SWITCH_L2 = 10;

	/**
	 * The feature id for the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__INTERNAL_IP_ADDRESS = INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__NAME = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__MODEL = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__OS_VERSION = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__OPERATING_SYSTEM = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__PORT_TYPE = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vlans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2__VLANS = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Switch L2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2_FEATURE_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Valid Internal Ip Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Valid Lan Port Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2___IS_VALID_LAN_PORT_NUMBER = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch L2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_L2_OPERATION_COUNT = INTERNAL_IP_ADDRESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.VLANImpl <em>VLAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.VLANImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getVLAN()
	 * @generated
	 */
	int VLAN = 11;

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
	 * The operation id for the '<em>Valid Upper Ip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN___VALID_UPPER_IP__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Lower Ip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN___VALID_LOWER_IP__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Valid Subnet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN___VALID_SUBNET__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Valid Ip Gateway</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN___VALID_IP_GATEWAY__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>VLAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLAN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.impl.StaticRouteImpl <em>Static Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.impl.StaticRouteImpl
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getStaticRoute()
	 * @generated
	 */
	int STATIC_ROUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Network Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE__NETWORK_DESTINATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Netmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE__NETMASK = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE__GATEWAY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Net Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE__NET_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE__METRIC = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Static Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Valid Network Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE___VALID_NETWORK_INTERFACE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Network Destination</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE___VALID_NETWORK_DESTINATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Metric Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE___METRIC_POSITIVE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Valid Gateway</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE___VALID_GATEWAY__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Valid Netmask</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE___VALID_NETMASK__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Static Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ROUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.GatewayTechnology <em>Gateway Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.GatewayTechnology
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getGatewayTechnology()
	 * @generated
	 */
	int GATEWAY_TECHNOLOGY = 13;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.NATTechnology <em>NAT Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.NATTechnology
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getNATTechnology()
	 * @generated
	 */
	int NAT_TECHNOLOGY = 14;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.RoutingProtocol <em>Routing Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.RoutingProtocol
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getRoutingProtocol()
	 * @generated
	 */
	int ROUTING_PROTOCOL = 15;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.AuthenticationWifi <em>Authentication Wifi</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.AuthenticationWifi
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getAuthenticationWifi()
	 * @generated
	 */
	int AUTHENTICATION_WIFI = 16;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.EncryptionModeWifi <em>Encryption Mode Wifi</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.EncryptionModeWifi
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getEncryptionModeWifi()
	 * @generated
	 */
	int ENCRYPTION_MODE_WIFI = 17;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.OperatingFrequency <em>Operating Frequency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.OperatingFrequency
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getOperatingFrequency()
	 * @generated
	 */
	int OPERATING_FREQUENCY = 18;

	/**
	 * The meta object id for the '{@link NetworkArchitecture.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.PortType
	 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 19;

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see NetworkArchitecture.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see NetworkArchitecture.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.PortNumberElement <em>Port Number Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Number Element</em>'.
	 * @see NetworkArchitecture.PortNumberElement
	 * @generated
	 */
	EClass getPortNumberElement();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.PortNumberElement#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see NetworkArchitecture.PortNumberElement#getPortNumber()
	 * @see #getPortNumberElement()
	 * @generated
	 */
	EAttribute getPortNumberElement_PortNumber();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.PortNumberElement#isValidLanPortNumber() <em>Is Valid Lan Port Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Lan Port Number</em>' operation.
	 * @see NetworkArchitecture.PortNumberElement#isValidLanPortNumber()
	 * @generated
	 */
	EOperation getPortNumberElement__IsValidLanPortNumber();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.InternalIpAddressElement <em>Internal Ip Address Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Ip Address Element</em>'.
	 * @see NetworkArchitecture.InternalIpAddressElement
	 * @generated
	 */
	EClass getInternalIpAddressElement();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.InternalIpAddressElement#getInternalIpAddress <em>Internal Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Ip Address</em>'.
	 * @see NetworkArchitecture.InternalIpAddressElement#getInternalIpAddress()
	 * @see #getInternalIpAddressElement()
	 * @generated
	 */
	EAttribute getInternalIpAddressElement_InternalIpAddress();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.InternalIpAddressElement#ValidInternalIpAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Internal Ip Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Internal Ip Address</em>' operation.
	 * @see NetworkArchitecture.InternalIpAddressElement#ValidInternalIpAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInternalIpAddressElement__ValidInternalIpAddress__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.FirmwareElement <em>Firmware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmware Element</em>'.
	 * @see NetworkArchitecture.FirmwareElement
	 * @generated
	 */
	EClass getFirmwareElement();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.FirmwareElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see NetworkArchitecture.FirmwareElement#getModel()
	 * @see #getFirmwareElement()
	 * @generated
	 */
	EAttribute getFirmwareElement_Model();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.FirmwareElement#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see NetworkArchitecture.FirmwareElement#getOsVersion()
	 * @see #getFirmwareElement()
	 * @generated
	 */
	EAttribute getFirmwareElement_OsVersion();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.FirmwareElement#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating System</em>'.
	 * @see NetworkArchitecture.FirmwareElement#getOperatingSystem()
	 * @see #getFirmwareElement()
	 * @generated
	 */
	EAttribute getFirmwareElement_OperatingSystem();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see NetworkArchitecture.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Network#getPublicIpAddres <em>Public Ip Addres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Ip Addres</em>'.
	 * @see NetworkArchitecture.Network#getPublicIpAddres()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_PublicIpAddres();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.Network#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vlans</em>'.
	 * @see NetworkArchitecture.Network#getVlans()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Vlans();

	/**
	 * Returns the meta object for the containment reference '{@link NetworkArchitecture.Network#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gateway</em>'.
	 * @see NetworkArchitecture.Network#getGateway()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Gateway();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.Network#getWifis <em>Wifis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wifis</em>'.
	 * @see NetworkArchitecture.Network#getWifis()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Wifis();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Network#getNetworkDevicesCount <em>Network Devices Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Devices Count</em>'.
	 * @see NetworkArchitecture.Network#getNetworkDevicesCount()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_NetworkDevicesCount();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.Network#ValidPublicIpAddres(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Public Ip Addres</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Public Ip Addres</em>' operation.
	 * @see NetworkArchitecture.Network#ValidPublicIpAddres(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNetwork__ValidPublicIpAddres__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see NetworkArchitecture.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Gateway#getTecnology <em>Tecnology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tecnology</em>'.
	 * @see NetworkArchitecture.Gateway#getTecnology()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Tecnology();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Gateway#getNat <em>Nat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat</em>'.
	 * @see NetworkArchitecture.Gateway#getNat()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Nat();

	/**
	 * Returns the meta object for the containment reference '{@link NetworkArchitecture.Gateway#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Router</em>'.
	 * @see NetworkArchitecture.Gateway#getRouter()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Router();

	/**
	 * Returns the meta object for the reference '{@link NetworkArchitecture.Gateway#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlan</em>'.
	 * @see NetworkArchitecture.Gateway#getVlan()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Vlan();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see NetworkArchitecture.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Router#getRoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Protocol</em>'.
	 * @see NetworkArchitecture.Router#getRoutingProtocol()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_RoutingProtocol();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitecture.Router#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see NetworkArchitecture.Router#getVlans()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_Vlans();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.Router#getSwitchL3 <em>Switch L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch L3</em>'.
	 * @see NetworkArchitecture.Router#getSwitchL3()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_SwitchL3();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.Router#getStaticRoute <em>Static Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Route</em>'.
	 * @see NetworkArchitecture.Router#getStaticRoute()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_StaticRoute();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.SwitchL3 <em>Switch L3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch L3</em>'.
	 * @see NetworkArchitecture.SwitchL3
	 * @generated
	 */
	EClass getSwitchL3();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.SwitchL3#getRoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Protocol</em>'.
	 * @see NetworkArchitecture.SwitchL3#getRoutingProtocol()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EAttribute getSwitchL3_RoutingProtocol();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitecture.SwitchL3#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see NetworkArchitecture.SwitchL3#getVlans()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_Vlans();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.SwitchL3#getSwitchL2 <em>Switch L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switch L2</em>'.
	 * @see NetworkArchitecture.SwitchL3#getSwitchL2()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_SwitchL2();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.SwitchL3#getStaticRoute <em>Static Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Route</em>'.
	 * @see NetworkArchitecture.SwitchL3#getStaticRoute()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_StaticRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link NetworkArchitecture.SwitchL3#getAccessPoints <em>Access Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Points</em>'.
	 * @see NetworkArchitecture.SwitchL3#getAccessPoints()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EReference getSwitchL3_AccessPoints();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.SwitchL3#getTotalConnectedDevices <em>Total Connected Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Connected Devices</em>'.
	 * @see NetworkArchitecture.SwitchL3#getTotalConnectedDevices()
	 * @see #getSwitchL3()
	 * @generated
	 */
	EAttribute getSwitchL3_TotalConnectedDevices();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.AcccessPoint <em>Acccess Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acccess Point</em>'.
	 * @see NetworkArchitecture.AcccessPoint
	 * @generated
	 */
	EClass getAcccessPoint();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.AcccessPoint#getMaxClientSupport <em>Max Client Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Client Support</em>'.
	 * @see NetworkArchitecture.AcccessPoint#getMaxClientSupport()
	 * @see #getAcccessPoint()
	 * @generated
	 */
	EAttribute getAcccessPoint_MaxClientSupport();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitecture.AcccessPoint#getWifis <em>Wifis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wifis</em>'.
	 * @see NetworkArchitecture.AcccessPoint#getWifis()
	 * @see #getAcccessPoint()
	 * @generated
	 */
	EReference getAcccessPoint_Wifis();

	/**
	 * Returns the meta object for the reference '{@link NetworkArchitecture.AcccessPoint#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlan</em>'.
	 * @see NetworkArchitecture.AcccessPoint#getVlan()
	 * @see #getAcccessPoint()
	 * @generated
	 */
	EReference getAcccessPoint_Vlan();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.Wifi <em>Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wifi</em>'.
	 * @see NetworkArchitecture.Wifi
	 * @generated
	 */
	EClass getWifi();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Wifi#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see NetworkArchitecture.Wifi#getSsid()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Ssid();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Wifi#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see NetworkArchitecture.Wifi#getFrequency()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Wifi#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see NetworkArchitecture.Wifi#getChannel()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Channel();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Wifi#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication</em>'.
	 * @see NetworkArchitecture.Wifi#getAuthentication()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.Wifi#getEncryption <em>Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption</em>'.
	 * @see NetworkArchitecture.Wifi#getEncryption()
	 * @see #getWifi()
	 * @generated
	 */
	EAttribute getWifi_Encryption();

	/**
	 * Returns the meta object for the reference '{@link NetworkArchitecture.Wifi#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vlan</em>'.
	 * @see NetworkArchitecture.Wifi#getVlan()
	 * @see #getWifi()
	 * @generated
	 */
	EReference getWifi_Vlan();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.Wifi#isValidChannelForFrequency() <em>Is Valid Channel For Frequency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Channel For Frequency</em>' operation.
	 * @see NetworkArchitecture.Wifi#isValidChannelForFrequency()
	 * @generated
	 */
	EOperation getWifi__IsValidChannelForFrequency();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.Wifi#ValidChannelForFrequency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Channel For Frequency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Channel For Frequency</em>' operation.
	 * @see NetworkArchitecture.Wifi#ValidChannelForFrequency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWifi__ValidChannelForFrequency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.SwitchL2 <em>Switch L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch L2</em>'.
	 * @see NetworkArchitecture.SwitchL2
	 * @generated
	 */
	EClass getSwitchL2();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.SwitchL2#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see NetworkArchitecture.SwitchL2#getPortType()
	 * @see #getSwitchL2()
	 * @generated
	 */
	EAttribute getSwitchL2_PortType();

	/**
	 * Returns the meta object for the reference list '{@link NetworkArchitecture.SwitchL2#getVlans <em>Vlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vlans</em>'.
	 * @see NetworkArchitecture.SwitchL2#getVlans()
	 * @see #getSwitchL2()
	 * @generated
	 */
	EReference getSwitchL2_Vlans();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.VLAN <em>VLAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLAN</em>'.
	 * @see NetworkArchitecture.VLAN
	 * @generated
	 */
	EClass getVLAN();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.VLAN#getIdVLan <em>Id VLan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id VLan</em>'.
	 * @see NetworkArchitecture.VLAN#getIdVLan()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_IdVLan();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.VLAN#getMtu <em>Mtu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtu</em>'.
	 * @see NetworkArchitecture.VLAN#getMtu()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_Mtu();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.VLAN#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see NetworkArchitecture.VLAN#getSubnet()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_Subnet();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.VLAN#getIpGateway <em>Ip Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Gateway</em>'.
	 * @see NetworkArchitecture.VLAN#getIpGateway()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_IpGateway();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.VLAN#getLowerIp <em>Lower Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Ip</em>'.
	 * @see NetworkArchitecture.VLAN#getLowerIp()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_LowerIp();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.VLAN#getUpperIp <em>Upper Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Ip</em>'.
	 * @see NetworkArchitecture.VLAN#getUpperIp()
	 * @see #getVLAN()
	 * @generated
	 */
	EAttribute getVLAN_UpperIp();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.VLAN#ValidSubnet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Subnet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Subnet</em>' operation.
	 * @see NetworkArchitecture.VLAN#ValidSubnet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVLAN__ValidSubnet__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.VLAN#ValidIpGateway(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Ip Gateway</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Ip Gateway</em>' operation.
	 * @see NetworkArchitecture.VLAN#ValidIpGateway(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVLAN__ValidIpGateway__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.VLAN#ValidUpperIp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Upper Ip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Upper Ip</em>' operation.
	 * @see NetworkArchitecture.VLAN#ValidUpperIp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVLAN__ValidUpperIp__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.VLAN#ValidLowerIp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Lower Ip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Lower Ip</em>' operation.
	 * @see NetworkArchitecture.VLAN#ValidLowerIp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVLAN__ValidLowerIp__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link NetworkArchitecture.StaticRoute <em>Static Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Route</em>'.
	 * @see NetworkArchitecture.StaticRoute
	 * @generated
	 */
	EClass getStaticRoute();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.StaticRoute#getNetworkDestination <em>Network Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Destination</em>'.
	 * @see NetworkArchitecture.StaticRoute#getNetworkDestination()
	 * @see #getStaticRoute()
	 * @generated
	 */
	EAttribute getStaticRoute_NetworkDestination();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.StaticRoute#getNetmask <em>Netmask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Netmask</em>'.
	 * @see NetworkArchitecture.StaticRoute#getNetmask()
	 * @see #getStaticRoute()
	 * @generated
	 */
	EAttribute getStaticRoute_Netmask();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.StaticRoute#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see NetworkArchitecture.StaticRoute#getGateway()
	 * @see #getStaticRoute()
	 * @generated
	 */
	EAttribute getStaticRoute_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.StaticRoute#getNetInterface <em>Net Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Interface</em>'.
	 * @see NetworkArchitecture.StaticRoute#getNetInterface()
	 * @see #getStaticRoute()
	 * @generated
	 */
	EAttribute getStaticRoute_NetInterface();

	/**
	 * Returns the meta object for the attribute '{@link NetworkArchitecture.StaticRoute#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see NetworkArchitecture.StaticRoute#getMetric()
	 * @see #getStaticRoute()
	 * @generated
	 */
	EAttribute getStaticRoute_Metric();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.StaticRoute#ValidNetworkInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Network Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Network Interface</em>' operation.
	 * @see NetworkArchitecture.StaticRoute#ValidNetworkInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStaticRoute__ValidNetworkInterface__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.StaticRoute#ValidNetworkDestination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Network Destination</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Network Destination</em>' operation.
	 * @see NetworkArchitecture.StaticRoute#ValidNetworkDestination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStaticRoute__ValidNetworkDestination__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.StaticRoute#MetricPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Metric Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Metric Positive</em>' operation.
	 * @see NetworkArchitecture.StaticRoute#MetricPositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStaticRoute__MetricPositive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.StaticRoute#ValidGateway(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Gateway</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Gateway</em>' operation.
	 * @see NetworkArchitecture.StaticRoute#ValidGateway(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStaticRoute__ValidGateway__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link NetworkArchitecture.StaticRoute#ValidNetmask(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Netmask</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Netmask</em>' operation.
	 * @see NetworkArchitecture.StaticRoute#ValidNetmask(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStaticRoute__ValidNetmask__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.GatewayTechnology <em>Gateway Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Technology</em>'.
	 * @see NetworkArchitecture.GatewayTechnology
	 * @generated
	 */
	EEnum getGatewayTechnology();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.NATTechnology <em>NAT Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NAT Technology</em>'.
	 * @see NetworkArchitecture.NATTechnology
	 * @generated
	 */
	EEnum getNATTechnology();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.RoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing Protocol</em>'.
	 * @see NetworkArchitecture.RoutingProtocol
	 * @generated
	 */
	EEnum getRoutingProtocol();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.AuthenticationWifi <em>Authentication Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Wifi</em>'.
	 * @see NetworkArchitecture.AuthenticationWifi
	 * @generated
	 */
	EEnum getAuthenticationWifi();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.EncryptionModeWifi <em>Encryption Mode Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encryption Mode Wifi</em>'.
	 * @see NetworkArchitecture.EncryptionModeWifi
	 * @generated
	 */
	EEnum getEncryptionModeWifi();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.OperatingFrequency <em>Operating Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating Frequency</em>'.
	 * @see NetworkArchitecture.OperatingFrequency
	 * @generated
	 */
	EEnum getOperatingFrequency();

	/**
	 * Returns the meta object for enum '{@link NetworkArchitecture.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see NetworkArchitecture.PortType
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
	NetworkArchitectureFactory getNetworkArchitectureFactory();

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
		 * The meta object literal for the '{@link NetworkArchitecture.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.NamedElementImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link NetworkArchitecture.impl.PortNumberElementImpl <em>Port Number Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.PortNumberElementImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getPortNumberElement()
		 * @generated
		 */
		EClass PORT_NUMBER_ELEMENT = eINSTANCE.getPortNumberElement();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_NUMBER_ELEMENT__PORT_NUMBER = eINSTANCE.getPortNumberElement_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Is Valid Lan Port Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORT_NUMBER_ELEMENT___IS_VALID_LAN_PORT_NUMBER = eINSTANCE.getPortNumberElement__IsValidLanPortNumber();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.InternalIpAddressElementImpl <em>Internal Ip Address Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.InternalIpAddressElementImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getInternalIpAddressElement()
		 * @generated
		 */
		EClass INTERNAL_IP_ADDRESS_ELEMENT = eINSTANCE.getInternalIpAddressElement();

		/**
		 * The meta object literal for the '<em><b>Internal Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS = eINSTANCE.getInternalIpAddressElement_InternalIpAddress();

		/**
		 * The meta object literal for the '<em><b>Valid Internal Ip Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInternalIpAddressElement__ValidInternalIpAddress__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.FirmwareElementImpl <em>Firmware Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.FirmwareElementImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getFirmwareElement()
		 * @generated
		 */
		EClass FIRMWARE_ELEMENT = eINSTANCE.getFirmwareElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMWARE_ELEMENT__MODEL = eINSTANCE.getFirmwareElement_Model();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMWARE_ELEMENT__OS_VERSION = eINSTANCE.getFirmwareElement_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Operating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMWARE_ELEMENT__OPERATING_SYSTEM = eINSTANCE.getFirmwareElement_OperatingSystem();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.NetworkImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getNetwork()
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
		 * The meta object literal for the '<em><b>Network Devices Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NETWORK_DEVICES_COUNT = eINSTANCE.getNetwork_NetworkDevicesCount();

		/**
		 * The meta object literal for the '<em><b>Valid Public Ip Addres</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORK___VALID_PUBLIC_IP_ADDRES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNetwork__ValidPublicIpAddres__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.GatewayImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getGateway()
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
		 * The meta object literal for the '{@link NetworkArchitecture.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.RouterImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getRouter()
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
		 * The meta object literal for the '<em><b>Vlans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__VLANS = eINSTANCE.getRouter_Vlans();

		/**
		 * The meta object literal for the '<em><b>Switch L3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__SWITCH_L3 = eINSTANCE.getRouter_SwitchL3();

		/**
		 * The meta object literal for the '<em><b>Static Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__STATIC_ROUTE = eINSTANCE.getRouter_StaticRoute();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.SwitchL3Impl <em>Switch L3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.SwitchL3Impl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getSwitchL3()
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
		 * The meta object literal for the '<em><b>Vlans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__VLANS = eINSTANCE.getSwitchL3_Vlans();

		/**
		 * The meta object literal for the '<em><b>Switch L2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__SWITCH_L2 = eINSTANCE.getSwitchL3_SwitchL2();

		/**
		 * The meta object literal for the '<em><b>Static Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__STATIC_ROUTE = eINSTANCE.getSwitchL3_StaticRoute();

		/**
		 * The meta object literal for the '<em><b>Access Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_L3__ACCESS_POINTS = eINSTANCE.getSwitchL3_AccessPoints();

		/**
		 * The meta object literal for the '<em><b>Total Connected Devices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_L3__TOTAL_CONNECTED_DEVICES = eINSTANCE.getSwitchL3_TotalConnectedDevices();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.AcccessPointImpl <em>Acccess Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.AcccessPointImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getAcccessPoint()
		 * @generated
		 */
		EClass ACCCESS_POINT = eINSTANCE.getAcccessPoint();

		/**
		 * The meta object literal for the '<em><b>Max Client Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCCESS_POINT__MAX_CLIENT_SUPPORT = eINSTANCE.getAcccessPoint_MaxClientSupport();

		/**
		 * The meta object literal for the '<em><b>Wifis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCCESS_POINT__WIFIS = eINSTANCE.getAcccessPoint_Wifis();

		/**
		 * The meta object literal for the '<em><b>Vlan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCCESS_POINT__VLAN = eINSTANCE.getAcccessPoint_Vlan();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.WifiImpl <em>Wifi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.WifiImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getWifi()
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
		 * The meta object literal for the '<em><b>Vlan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIFI__VLAN = eINSTANCE.getWifi_Vlan();

		/**
		 * The meta object literal for the '<em><b>Is Valid Channel For Frequency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIFI___IS_VALID_CHANNEL_FOR_FREQUENCY = eINSTANCE.getWifi__IsValidChannelForFrequency();

		/**
		 * The meta object literal for the '<em><b>Valid Channel For Frequency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIFI___VALID_CHANNEL_FOR_FREQUENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWifi__ValidChannelForFrequency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.SwitchL2Impl <em>Switch L2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.SwitchL2Impl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getSwitchL2()
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
		 * The meta object literal for the '{@link NetworkArchitecture.impl.VLANImpl <em>VLAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.VLANImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getVLAN()
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
		 * The meta object literal for the '<em><b>Valid Subnet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VLAN___VALID_SUBNET__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVLAN__ValidSubnet__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Ip Gateway</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VLAN___VALID_IP_GATEWAY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVLAN__ValidIpGateway__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Upper Ip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VLAN___VALID_UPPER_IP__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVLAN__ValidUpperIp__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Lower Ip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VLAN___VALID_LOWER_IP__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVLAN__ValidLowerIp__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.impl.StaticRouteImpl <em>Static Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.impl.StaticRouteImpl
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getStaticRoute()
		 * @generated
		 */
		EClass STATIC_ROUTE = eINSTANCE.getStaticRoute();

		/**
		 * The meta object literal for the '<em><b>Network Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ROUTE__NETWORK_DESTINATION = eINSTANCE.getStaticRoute_NetworkDestination();

		/**
		 * The meta object literal for the '<em><b>Netmask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ROUTE__NETMASK = eINSTANCE.getStaticRoute_Netmask();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ROUTE__GATEWAY = eINSTANCE.getStaticRoute_Gateway();

		/**
		 * The meta object literal for the '<em><b>Net Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ROUTE__NET_INTERFACE = eINSTANCE.getStaticRoute_NetInterface();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ROUTE__METRIC = eINSTANCE.getStaticRoute_Metric();

		/**
		 * The meta object literal for the '<em><b>Valid Network Interface</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIC_ROUTE___VALID_NETWORK_INTERFACE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStaticRoute__ValidNetworkInterface__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Network Destination</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIC_ROUTE___VALID_NETWORK_DESTINATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStaticRoute__ValidNetworkDestination__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Metric Positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIC_ROUTE___METRIC_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStaticRoute__MetricPositive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Gateway</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIC_ROUTE___VALID_GATEWAY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStaticRoute__ValidGateway__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Netmask</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIC_ROUTE___VALID_NETMASK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStaticRoute__ValidNetmask__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.GatewayTechnology <em>Gateway Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.GatewayTechnology
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getGatewayTechnology()
		 * @generated
		 */
		EEnum GATEWAY_TECHNOLOGY = eINSTANCE.getGatewayTechnology();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.NATTechnology <em>NAT Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.NATTechnology
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getNATTechnology()
		 * @generated
		 */
		EEnum NAT_TECHNOLOGY = eINSTANCE.getNATTechnology();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.RoutingProtocol <em>Routing Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.RoutingProtocol
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getRoutingProtocol()
		 * @generated
		 */
		EEnum ROUTING_PROTOCOL = eINSTANCE.getRoutingProtocol();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.AuthenticationWifi <em>Authentication Wifi</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.AuthenticationWifi
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getAuthenticationWifi()
		 * @generated
		 */
		EEnum AUTHENTICATION_WIFI = eINSTANCE.getAuthenticationWifi();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.EncryptionModeWifi <em>Encryption Mode Wifi</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.EncryptionModeWifi
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getEncryptionModeWifi()
		 * @generated
		 */
		EEnum ENCRYPTION_MODE_WIFI = eINSTANCE.getEncryptionModeWifi();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.OperatingFrequency <em>Operating Frequency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.OperatingFrequency
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getOperatingFrequency()
		 * @generated
		 */
		EEnum OPERATING_FREQUENCY = eINSTANCE.getOperatingFrequency();

		/**
		 * The meta object literal for the '{@link NetworkArchitecture.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NetworkArchitecture.PortType
		 * @see NetworkArchitecture.impl.NetworkArchitecturePackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

	}

} //NetworkArchitecturePackage
