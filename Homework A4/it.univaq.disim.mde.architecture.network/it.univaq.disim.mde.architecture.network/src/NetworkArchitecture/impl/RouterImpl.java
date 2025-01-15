/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.FirmwareElement;
import NetworkArchitecture.NamedElement;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.PortNumberElement;
import NetworkArchitecture.Router;
import NetworkArchitecture.RoutingProtocol;
import NetworkArchitecture.StaticRoute;
import NetworkArchitecture.SwitchL3;
import NetworkArchitecture.VLAN;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getName <em>Name</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getModel <em>Model</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getSwitchL3 <em>Switch L3</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.RouterImpl#getStaticRoute <em>Static Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends InternalIpAddressElementImpl implements Router {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected String operatingSystem = OPERATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingProtocol() <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final RoutingProtocol ROUTING_PROTOCOL_EDEFAULT = RoutingProtocol.RIP;

	/**
	 * The cached value of the '{@link #getRoutingProtocol() <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocol()
	 * @generated
	 * @ordered
	 */
	protected RoutingProtocol routingProtocol = ROUTING_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVlans() <em>Vlans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlans()
	 * @generated
	 * @ordered
	 */
	protected EList<VLAN> vlans;

	/**
	 * The cached value of the '{@link #getSwitchL3() <em>Switch L3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchL3()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchL3> switchL3;

	/**
	 * The cached value of the '{@link #getStaticRoute() <em>Static Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticRoute> staticRoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitecturePackage.Literals.ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ROUTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ROUTER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsVersion(String newOsVersion) {
		String oldOsVersion = osVersion;
		osVersion = newOsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ROUTER__OS_VERSION, oldOsVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatingSystem(String newOperatingSystem) {
		String oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ROUTER__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoutingProtocol getRoutingProtocol() {
		return routingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingProtocol(RoutingProtocol newRoutingProtocol) {
		RoutingProtocol oldRoutingProtocol = routingProtocol;
		routingProtocol = newRoutingProtocol == null ? ROUTING_PROTOCOL_EDEFAULT : newRoutingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ROUTER__ROUTING_PROTOCOL, oldRoutingProtocol, routingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VLAN> getVlans() {
		if (vlans == null) {
			vlans = new EObjectResolvingEList<VLAN>(VLAN.class, this, NetworkArchitecturePackage.ROUTER__VLANS);
		}
		return vlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchL3> getSwitchL3() {
		if (switchL3 == null) {
			switchL3 = new EObjectContainmentEList<SwitchL3>(SwitchL3.class, this, NetworkArchitecturePackage.ROUTER__SWITCH_L3);
		}
		return switchL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StaticRoute> getStaticRoute() {
		if (staticRoute == null) {
			staticRoute = new EObjectContainmentEList<StaticRoute>(StaticRoute.class, this, NetworkArchitecturePackage.ROUTER__STATIC_ROUTE);
		}
		return staticRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidLanPortNumber() {
		/**
		 * portNumber >= 1 and portNumber <= 48
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ int portNumber_0 = this.getPortNumber();
		final /*@NonInvalid*/ IntegerValue BOXED_portNumber_0 = ValueUtil.integerValueOf(portNumber_0);
		final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_portNumber_0, NetworkArchitectureTables.INT_1).booleanValue();
		final /*@NonInvalid*/ Boolean and;
		if (!ge) {
			and = ValueUtil.FALSE_VALUE;
		}
		else {
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_portNumber_0, NetworkArchitectureTables.INT_48).booleanValue();
			if (!le) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				and = ValueUtil.TRUE_VALUE;
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null body for \'NetworkArchitecture::PortNumberElement::isValidLanPortNumber() : Boolean[1]\'");
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidLanPortNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PortNumberElement::ValidLanPortNumber";
		try {
			/**
			 *
			 * inv ValidLanPortNumber:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.isValidLanPortNumber()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.PORT_NUMBER_ELEMENT___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ boolean result = this.isValidLanPortNumber();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, NetworkArchitectureTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitecturePackage.ROUTER__SWITCH_L3:
				return ((InternalEList<?>)getSwitchL3()).basicRemove(otherEnd, msgs);
			case NetworkArchitecturePackage.ROUTER__STATIC_ROUTE:
				return ((InternalEList<?>)getStaticRoute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkArchitecturePackage.ROUTER__NAME:
				return getName();
			case NetworkArchitecturePackage.ROUTER__MODEL:
				return getModel();
			case NetworkArchitecturePackage.ROUTER__OS_VERSION:
				return getOsVersion();
			case NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM:
				return getOperatingSystem();
			case NetworkArchitecturePackage.ROUTER__PORT_NUMBER:
				return getPortNumber();
			case NetworkArchitecturePackage.ROUTER__ROUTING_PROTOCOL:
				return getRoutingProtocol();
			case NetworkArchitecturePackage.ROUTER__VLANS:
				return getVlans();
			case NetworkArchitecturePackage.ROUTER__SWITCH_L3:
				return getSwitchL3();
			case NetworkArchitecturePackage.ROUTER__STATIC_ROUTE:
				return getStaticRoute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkArchitecturePackage.ROUTER__NAME:
				setName((String)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__MODEL:
				setModel((String)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM:
				setOperatingSystem((String)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__PORT_NUMBER:
				setPortNumber((Integer)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__ROUTING_PROTOCOL:
				setRoutingProtocol((RoutingProtocol)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__VLANS:
				getVlans().clear();
				getVlans().addAll((Collection<? extends VLAN>)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__SWITCH_L3:
				getSwitchL3().clear();
				getSwitchL3().addAll((Collection<? extends SwitchL3>)newValue);
				return;
			case NetworkArchitecturePackage.ROUTER__STATIC_ROUTE:
				getStaticRoute().clear();
				getStaticRoute().addAll((Collection<? extends StaticRoute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NetworkArchitecturePackage.ROUTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ROUTER__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ROUTER__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ROUTER__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ROUTER__ROUTING_PROTOCOL:
				setRoutingProtocol(ROUTING_PROTOCOL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ROUTER__VLANS:
				getVlans().clear();
				return;
			case NetworkArchitecturePackage.ROUTER__SWITCH_L3:
				getSwitchL3().clear();
				return;
			case NetworkArchitecturePackage.ROUTER__STATIC_ROUTE:
				getStaticRoute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NetworkArchitecturePackage.ROUTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkArchitecturePackage.ROUTER__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case NetworkArchitecturePackage.ROUTER__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM:
				return OPERATING_SYSTEM_EDEFAULT == null ? operatingSystem != null : !OPERATING_SYSTEM_EDEFAULT.equals(operatingSystem);
			case NetworkArchitecturePackage.ROUTER__PORT_NUMBER:
				return portNumber != PORT_NUMBER_EDEFAULT;
			case NetworkArchitecturePackage.ROUTER__ROUTING_PROTOCOL:
				return routingProtocol != ROUTING_PROTOCOL_EDEFAULT;
			case NetworkArchitecturePackage.ROUTER__VLANS:
				return vlans != null && !vlans.isEmpty();
			case NetworkArchitecturePackage.ROUTER__SWITCH_L3:
				return switchL3 != null && !switchL3.isEmpty();
			case NetworkArchitecturePackage.ROUTER__STATIC_ROUTE:
				return staticRoute != null && !staticRoute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.ROUTER__NAME: return NetworkArchitecturePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.ROUTER__MODEL: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL;
				case NetworkArchitecturePackage.ROUTER__OS_VERSION: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION;
				case NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM;
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.ROUTER__PORT_NUMBER: return NetworkArchitecturePackage.PORT_NUMBER_ELEMENT__PORT_NUMBER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.NAMED_ELEMENT__NAME: return NetworkArchitecturePackage.ROUTER__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL: return NetworkArchitecturePackage.ROUTER__MODEL;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION: return NetworkArchitecturePackage.ROUTER__OS_VERSION;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM: return NetworkArchitecturePackage.ROUTER__OPERATING_SYSTEM;
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT__PORT_NUMBER: return NetworkArchitecturePackage.ROUTER__PORT_NUMBER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (baseOperationID) {
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT___IS_VALID_LAN_PORT_NUMBER: return NetworkArchitecturePackage.ROUTER___IS_VALID_LAN_PORT_NUMBER;
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP: return NetworkArchitecturePackage.ROUTER___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NetworkArchitecturePackage.ROUTER___IS_VALID_LAN_PORT_NUMBER:
				return isValidLanPortNumber();
			case NetworkArchitecturePackage.ROUTER___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP:
				return ValidLanPortNumber((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", model: ");
		result.append(model);
		result.append(", osVersion: ");
		result.append(osVersion);
		result.append(", operatingSystem: ");
		result.append(operatingSystem);
		result.append(", portNumber: ");
		result.append(portNumber);
		result.append(", routingProtocol: ");
		result.append(routingProtocol);
		result.append(')');
		return result.toString();
	}

} //RouterImpl
