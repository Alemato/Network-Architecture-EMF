/**
 */
package NetworkArchitecture.util;

import NetworkArchitecture.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see NetworkArchitecture.NetworkArchitecturePackage
 * @generated
 */
public class NetworkArchitectureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NetworkArchitectureValidator INSTANCE = new NetworkArchitectureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "NetworkArchitecture";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Lan Port Number' of 'Port Number Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PORT_NUMBER_ELEMENT__VALID_LAN_PORT_NUMBER = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Internal Ip Address' of 'Internal Ip Address Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_IP_ADDRESS_ELEMENT__VALID_INTERNAL_IP_ADDRESS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Public Ip Addres' of 'Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK__VALID_PUBLIC_IP_ADDRES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Channel For Frequency' of 'Wifi'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIFI__VALID_CHANNEL_FOR_FREQUENCY = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Upper Ip' of 'VLAN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VLAN__VALID_UPPER_IP = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Lower Ip' of 'VLAN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VLAN__VALID_LOWER_IP = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Subnet' of 'VLAN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VLAN__VALID_SUBNET = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Ip Gateway' of 'VLAN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VLAN__VALID_IP_GATEWAY = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Network Interface' of 'Static Route'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATIC_ROUTE__VALID_NETWORK_INTERFACE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Network Destination' of 'Static Route'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATIC_ROUTE__VALID_NETWORK_DESTINATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Metric Positive' of 'Static Route'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATIC_ROUTE__METRIC_POSITIVE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Gateway' of 'Static Route'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATIC_ROUTE__VALID_GATEWAY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Netmask' of 'Static Route'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATIC_ROUTE__VALID_NETMASK = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkArchitectureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return NetworkArchitecturePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case NetworkArchitecturePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT:
				return validatePortNumberElement((PortNumberElement)value, diagnostics, context);
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT:
				return validateInternalIpAddressElement((InternalIpAddressElement)value, diagnostics, context);
			case NetworkArchitecturePackage.FIRMWARE_ELEMENT:
				return validateFirmwareElement((FirmwareElement)value, diagnostics, context);
			case NetworkArchitecturePackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case NetworkArchitecturePackage.GATEWAY:
				return validateGateway((Gateway)value, diagnostics, context);
			case NetworkArchitecturePackage.ROUTER:
				return validateRouter((Router)value, diagnostics, context);
			case NetworkArchitecturePackage.SWITCH_L3:
				return validateSwitchL3((SwitchL3)value, diagnostics, context);
			case NetworkArchitecturePackage.ACCESS_POINT:
				return validateAccessPoint((AccessPoint)value, diagnostics, context);
			case NetworkArchitecturePackage.WIFI:
				return validateWifi((Wifi)value, diagnostics, context);
			case NetworkArchitecturePackage.SWITCH_L2:
				return validateSwitchL2((SwitchL2)value, diagnostics, context);
			case NetworkArchitecturePackage.VLAN:
				return validateVLAN((VLAN)value, diagnostics, context);
			case NetworkArchitecturePackage.STATIC_ROUTE:
				return validateStaticRoute((StaticRoute)value, diagnostics, context);
			case NetworkArchitecturePackage.GATEWAY_TECHNOLOGY:
				return validateGatewayTechnology((GatewayTechnology)value, diagnostics, context);
			case NetworkArchitecturePackage.NAT_TECHNOLOGY:
				return validateNATTechnology((NATTechnology)value, diagnostics, context);
			case NetworkArchitecturePackage.ROUTING_PROTOCOL:
				return validateRoutingProtocol((RoutingProtocol)value, diagnostics, context);
			case NetworkArchitecturePackage.AUTHENTICATION_WIFI:
				return validateAuthenticationWifi((AuthenticationWifi)value, diagnostics, context);
			case NetworkArchitecturePackage.ENCRYPTION_MODE_WIFI:
				return validateEncryptionModeWifi((EncryptionModeWifi)value, diagnostics, context);
			case NetworkArchitecturePackage.OPERATING_FREQUENCY:
				return validateOperatingFrequency((OperatingFrequency)value, diagnostics, context);
			case NetworkArchitecturePackage.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortNumberElement(PortNumberElement portNumberElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portNumberElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portNumberElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortNumberElement_ValidLanPortNumber(portNumberElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidLanPortNumber constraint of '<em>Port Number Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortNumberElement_ValidLanPortNumber(PortNumberElement portNumberElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return portNumberElement.ValidLanPortNumber(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalIpAddressElement(InternalIpAddressElement internalIpAddressElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalIpAddressElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalIpAddressElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(internalIpAddressElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidInternalIpAddress constraint of '<em>Internal Ip Address Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalIpAddressElement_ValidInternalIpAddress(InternalIpAddressElement internalIpAddressElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalIpAddressElement.ValidInternalIpAddress(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirmwareElement(FirmwareElement firmwareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firmwareElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_ValidPublicIpAddres(network, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidPublicIpAddres constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_ValidPublicIpAddres(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return network.ValidPublicIpAddres(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(gateway, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRouter(Router router, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(router, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(router, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(router, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(router, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortNumberElement_ValidLanPortNumber(router, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitchL3(SwitchL3 switchL3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(switchL3, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(switchL3, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortNumberElement_ValidLanPortNumber(switchL3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortNumberElement_ValidLanPortNumber(accessPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWifi(Wifi wifi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wifi, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(wifi, diagnostics, context);
		if (result || diagnostics != null) result &= validateWifi_ValidChannelForFrequency(wifi, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidChannelForFrequency constraint of '<em>Wifi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWifi_ValidChannelForFrequency(Wifi wifi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wifi.ValidChannelForFrequency(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitchL2(SwitchL2 switchL2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(switchL2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalIpAddressElement_ValidInternalIpAddress(switchL2, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortNumberElement_ValidLanPortNumber(switchL2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLAN(VLAN vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vlan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateVLAN_ValidIpGateway(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateVLAN_ValidUpperIp(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateVLAN_ValidLowerIp(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateVLAN_ValidSubnet(vlan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidIpGateway constraint of '<em>VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLAN_ValidIpGateway(VLAN vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vlan.ValidIpGateway(diagnostics, context);
	}

	/**
	 * Validates the ValidUpperIp constraint of '<em>VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLAN_ValidUpperIp(VLAN vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vlan.ValidUpperIp(diagnostics, context);
	}

	/**
	 * Validates the ValidLowerIp constraint of '<em>VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLAN_ValidLowerIp(VLAN vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vlan.ValidLowerIp(diagnostics, context);
	}

	/**
	 * Validates the ValidSubnet constraint of '<em>VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLAN_ValidSubnet(VLAN vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vlan.ValidSubnet(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRoute(StaticRoute staticRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticRoute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticRoute_ValidNetmask(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticRoute_ValidNetworkInterface(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticRoute_ValidNetworkDestination(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticRoute_MetricPositive(staticRoute, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticRoute_ValidGateway(staticRoute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidNetmask constraint of '<em>Static Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRoute_ValidNetmask(StaticRoute staticRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticRoute.ValidNetmask(diagnostics, context);
	}

	/**
	 * Validates the ValidNetworkInterface constraint of '<em>Static Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRoute_ValidNetworkInterface(StaticRoute staticRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticRoute.ValidNetworkInterface(diagnostics, context);
	}

	/**
	 * Validates the ValidNetworkDestination constraint of '<em>Static Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRoute_ValidNetworkDestination(StaticRoute staticRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticRoute.ValidNetworkDestination(diagnostics, context);
	}

	/**
	 * Validates the MetricPositive constraint of '<em>Static Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRoute_MetricPositive(StaticRoute staticRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticRoute.MetricPositive(diagnostics, context);
	}

	/**
	 * Validates the ValidGateway constraint of '<em>Static Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRoute_ValidGateway(StaticRoute staticRoute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticRoute.ValidGateway(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatewayTechnology(GatewayTechnology gatewayTechnology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNATTechnology(NATTechnology natTechnology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoutingProtocol(RoutingProtocol routingProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticationWifi(AuthenticationWifi authenticationWifi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncryptionModeWifi(EncryptionModeWifi encryptionModeWifi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatingFrequency(OperatingFrequency operatingFrequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //NetworkArchitectureValidator
