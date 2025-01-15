/**
 */
package NetworkArchitecture.util;

import NetworkArchitecture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see NetworkArchitecture.NetworkArchitecturePackage
 * @generated
 */
public class NetworkArchitectureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NetworkArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkArchitectureSwitch() {
		if (modelPackage == null) {
			modelPackage = NetworkArchitecturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NetworkArchitecturePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT: {
				PortNumberElement portNumberElement = (PortNumberElement)theEObject;
				T result = casePortNumberElement(portNumberElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT: {
				InternalIpAddressElement internalIpAddressElement = (InternalIpAddressElement)theEObject;
				T result = caseInternalIpAddressElement(internalIpAddressElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.FIRMWARE_ELEMENT: {
				FirmwareElement firmwareElement = (FirmwareElement)theEObject;
				T result = caseFirmwareElement(firmwareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseNamedElement(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseInternalIpAddressElement(gateway);
				if (result == null) result = caseNamedElement(gateway);
				if (result == null) result = caseFirmwareElement(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.ROUTER: {
				Router router = (Router)theEObject;
				T result = caseRouter(router);
				if (result == null) result = caseInternalIpAddressElement(router);
				if (result == null) result = caseNamedElement(router);
				if (result == null) result = caseFirmwareElement(router);
				if (result == null) result = casePortNumberElement(router);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.SWITCH_L3: {
				SwitchL3 switchL3 = (SwitchL3)theEObject;
				T result = caseSwitchL3(switchL3);
				if (result == null) result = caseInternalIpAddressElement(switchL3);
				if (result == null) result = caseNamedElement(switchL3);
				if (result == null) result = caseFirmwareElement(switchL3);
				if (result == null) result = casePortNumberElement(switchL3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.ACCESS_POINT: {
				AccessPoint accessPoint = (AccessPoint)theEObject;
				T result = caseAccessPoint(accessPoint);
				if (result == null) result = caseInternalIpAddressElement(accessPoint);
				if (result == null) result = caseNamedElement(accessPoint);
				if (result == null) result = caseFirmwareElement(accessPoint);
				if (result == null) result = casePortNumberElement(accessPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.WIFI: {
				Wifi wifi = (Wifi)theEObject;
				T result = caseWifi(wifi);
				if (result == null) result = caseInternalIpAddressElement(wifi);
				if (result == null) result = caseNamedElement(wifi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.SWITCH_L2: {
				SwitchL2 switchL2 = (SwitchL2)theEObject;
				T result = caseSwitchL2(switchL2);
				if (result == null) result = caseInternalIpAddressElement(switchL2);
				if (result == null) result = caseNamedElement(switchL2);
				if (result == null) result = caseFirmwareElement(switchL2);
				if (result == null) result = casePortNumberElement(switchL2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.VLAN: {
				VLAN vlan = (VLAN)theEObject;
				T result = caseVLAN(vlan);
				if (result == null) result = caseNamedElement(vlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NetworkArchitecturePackage.STATIC_ROUTE: {
				StaticRoute staticRoute = (StaticRoute)theEObject;
				T result = caseStaticRoute(staticRoute);
				if (result == null) result = caseNamedElement(staticRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Number Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Number Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortNumberElement(PortNumberElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Ip Address Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Ip Address Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalIpAddressElement(InternalIpAddressElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmware Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmware Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmwareElement(FirmwareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouter(Router object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch L3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch L3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchL3(SwitchL3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessPoint(AccessPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wifi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wifi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWifi(Wifi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch L2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch L2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchL2(SwitchL2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLAN(VLAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticRoute(StaticRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NetworkArchitectureSwitch
