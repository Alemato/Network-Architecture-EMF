/**
 */
package NetworkArchitecture.util;

import NetworkArchitecture.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see NetworkArchitecture.NetworkArchitecturePackage
 * @generated
 */
public class NetworkArchitectureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NetworkArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkArchitectureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NetworkArchitecturePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkArchitectureSwitch<Adapter> modelSwitch =
		new NetworkArchitectureSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePortNumberElement(PortNumberElement object) {
				return createPortNumberElementAdapter();
			}
			@Override
			public Adapter caseInternalIpAddressElement(InternalIpAddressElement object) {
				return createInternalIpAddressElementAdapter();
			}
			@Override
			public Adapter caseFirmwareElement(FirmwareElement object) {
				return createFirmwareElementAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseRouter(Router object) {
				return createRouterAdapter();
			}
			@Override
			public Adapter caseSwitchL3(SwitchL3 object) {
				return createSwitchL3Adapter();
			}
			@Override
			public Adapter caseAcccessPoint(AcccessPoint object) {
				return createAcccessPointAdapter();
			}
			@Override
			public Adapter caseWifi(Wifi object) {
				return createWifiAdapter();
			}
			@Override
			public Adapter caseSwitchL2(SwitchL2 object) {
				return createSwitchL2Adapter();
			}
			@Override
			public Adapter caseVLAN(VLAN object) {
				return createVLANAdapter();
			}
			@Override
			public Adapter caseStaticRoute(StaticRoute object) {
				return createStaticRouteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.PortNumberElement <em>Port Number Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.PortNumberElement
	 * @generated
	 */
	public Adapter createPortNumberElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.InternalIpAddressElement <em>Internal Ip Address Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.InternalIpAddressElement
	 * @generated
	 */
	public Adapter createInternalIpAddressElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.FirmwareElement <em>Firmware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.FirmwareElement
	 * @generated
	 */
	public Adapter createFirmwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.Router
	 * @generated
	 */
	public Adapter createRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.SwitchL3 <em>Switch L3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.SwitchL3
	 * @generated
	 */
	public Adapter createSwitchL3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.AcccessPoint <em>Acccess Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.AcccessPoint
	 * @generated
	 */
	public Adapter createAcccessPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.Wifi <em>Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.Wifi
	 * @generated
	 */
	public Adapter createWifiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.SwitchL2 <em>Switch L2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.SwitchL2
	 * @generated
	 */
	public Adapter createSwitchL2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.VLAN <em>VLAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.VLAN
	 * @generated
	 */
	public Adapter createVLANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NetworkArchitecture.StaticRoute <em>Static Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NetworkArchitecture.StaticRoute
	 * @generated
	 */
	public Adapter createStaticRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NetworkArchitectureAdapterFactory
