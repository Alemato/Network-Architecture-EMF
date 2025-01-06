/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.AcccessPoint;
import NetworkArchitecture.FirmwareElement;
import NetworkArchitecture.NamedElement;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.PortNumberElement;
import NetworkArchitecture.RoutingProtocol;
import NetworkArchitecture.StaticRoute;
import NetworkArchitecture.SwitchL2;
import NetworkArchitecture.SwitchL3;
import NetworkArchitecture.VLAN;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch L3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getName <em>Name</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getModel <em>Model</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getSwitchL2 <em>Switch L2</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getStaticRoute <em>Static Route</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getAccessPoints <em>Access Points</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.SwitchL3Impl#getTotalConnectedDevices <em>Total Connected Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchL3Impl extends InternalIpAddressElementImpl implements SwitchL3 {
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
	 * The cached value of the '{@link #getSwitchL2() <em>Switch L2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchL2()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchL2> switchL2;

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
	 * The cached value of the '{@link #getAccessPoints() <em>Access Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<AcccessPoint> accessPoints;

	/**
	 * The default value of the '{@link #getTotalConnectedDevices() <em>Total Connected Devices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalConnectedDevices()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CONNECTED_DEVICES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchL3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitecturePackage.Literals.SWITCH_L3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.SWITCH_L3__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.SWITCH_L3__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.SWITCH_L3__OS_VERSION, oldOsVersion, osVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER, oldPortNumber, portNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.SWITCH_L3__ROUTING_PROTOCOL, oldRoutingProtocol, routingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VLAN> getVlans() {
		if (vlans == null) {
			vlans = new EObjectResolvingEList<VLAN>(VLAN.class, this, NetworkArchitecturePackage.SWITCH_L3__VLANS);
		}
		return vlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchL2> getSwitchL2() {
		if (switchL2 == null) {
			switchL2 = new EObjectContainmentEList<SwitchL2>(SwitchL2.class, this, NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2);
		}
		return switchL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StaticRoute> getStaticRoute() {
		if (staticRoute == null) {
			staticRoute = new EObjectContainmentEList<StaticRoute>(StaticRoute.class, this, NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE);
		}
		return staticRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcccessPoint> getAccessPoints() {
		if (accessPoints == null) {
			accessPoints = new EObjectContainmentEList<AcccessPoint>(AcccessPoint.class, this, NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS);
		}
		return accessPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalConnectedDevices() {
		/**
		 * switchL2->size() + accessPoints->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<SwitchL2> switchL2 = this.getSwitchL2();
		final /*@NonInvalid*/ OrderedSetValue BOXED_switchL2 = idResolver.createOrderedSetOfAll(NetworkArchitectureTables.ORD_CLSSid_SwitchL2, switchL2);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_switchL2);
		final /*@NonInvalid*/ List<AcccessPoint> accessPoints = this.getAccessPoints();
		final /*@NonInvalid*/ SetValue BOXED_accessPoints = idResolver.createSetOfAll(NetworkArchitectureTables.SET_CLSSid_AcccessPoint, accessPoints);
		final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_accessPoints);
		final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(size, size_0);
		final /*@NonInvalid*/ int ECORE_sum = ValueUtil.intValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalConnectedDevices(int newTotalConnectedDevices) {
		// TODO: implement this method to set the 'Total Connected Devices' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2:
				return ((InternalEList<?>)getSwitchL2()).basicRemove(otherEnd, msgs);
			case NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE:
				return ((InternalEList<?>)getStaticRoute()).basicRemove(otherEnd, msgs);
			case NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS:
				return ((InternalEList<?>)getAccessPoints()).basicRemove(otherEnd, msgs);
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
			case NetworkArchitecturePackage.SWITCH_L3__NAME:
				return getName();
			case NetworkArchitecturePackage.SWITCH_L3__MODEL:
				return getModel();
			case NetworkArchitecturePackage.SWITCH_L3__OS_VERSION:
				return getOsVersion();
			case NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM:
				return getOperatingSystem();
			case NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER:
				return getPortNumber();
			case NetworkArchitecturePackage.SWITCH_L3__ROUTING_PROTOCOL:
				return getRoutingProtocol();
			case NetworkArchitecturePackage.SWITCH_L3__VLANS:
				return getVlans();
			case NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2:
				return getSwitchL2();
			case NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE:
				return getStaticRoute();
			case NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS:
				return getAccessPoints();
			case NetworkArchitecturePackage.SWITCH_L3__TOTAL_CONNECTED_DEVICES:
				return getTotalConnectedDevices();
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
			case NetworkArchitecturePackage.SWITCH_L3__NAME:
				setName((String)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__MODEL:
				setModel((String)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM:
				setOperatingSystem((String)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER:
				setPortNumber((Integer)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__ROUTING_PROTOCOL:
				setRoutingProtocol((RoutingProtocol)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__VLANS:
				getVlans().clear();
				getVlans().addAll((Collection<? extends VLAN>)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2:
				getSwitchL2().clear();
				getSwitchL2().addAll((Collection<? extends SwitchL2>)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE:
				getStaticRoute().clear();
				getStaticRoute().addAll((Collection<? extends StaticRoute>)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS:
				getAccessPoints().clear();
				getAccessPoints().addAll((Collection<? extends AcccessPoint>)newValue);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__TOTAL_CONNECTED_DEVICES:
				setTotalConnectedDevices((Integer)newValue);
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
			case NetworkArchitecturePackage.SWITCH_L3__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__ROUTING_PROTOCOL:
				setRoutingProtocol(ROUTING_PROTOCOL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.SWITCH_L3__VLANS:
				getVlans().clear();
				return;
			case NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2:
				getSwitchL2().clear();
				return;
			case NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE:
				getStaticRoute().clear();
				return;
			case NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS:
				getAccessPoints().clear();
				return;
			case NetworkArchitecturePackage.SWITCH_L3__TOTAL_CONNECTED_DEVICES:
				setTotalConnectedDevices(TOTAL_CONNECTED_DEVICES_EDEFAULT);
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
			case NetworkArchitecturePackage.SWITCH_L3__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkArchitecturePackage.SWITCH_L3__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case NetworkArchitecturePackage.SWITCH_L3__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM:
				return OPERATING_SYSTEM_EDEFAULT == null ? operatingSystem != null : !OPERATING_SYSTEM_EDEFAULT.equals(operatingSystem);
			case NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER:
				return portNumber != PORT_NUMBER_EDEFAULT;
			case NetworkArchitecturePackage.SWITCH_L3__ROUTING_PROTOCOL:
				return routingProtocol != ROUTING_PROTOCOL_EDEFAULT;
			case NetworkArchitecturePackage.SWITCH_L3__VLANS:
				return vlans != null && !vlans.isEmpty();
			case NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2:
				return switchL2 != null && !switchL2.isEmpty();
			case NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE:
				return staticRoute != null && !staticRoute.isEmpty();
			case NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS:
				return accessPoints != null && !accessPoints.isEmpty();
			case NetworkArchitecturePackage.SWITCH_L3__TOTAL_CONNECTED_DEVICES:
				return getTotalConnectedDevices() != TOTAL_CONNECTED_DEVICES_EDEFAULT;
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
				case NetworkArchitecturePackage.SWITCH_L3__NAME: return NetworkArchitecturePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.SWITCH_L3__MODEL: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL;
				case NetworkArchitecturePackage.SWITCH_L3__OS_VERSION: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION;
				case NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM;
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER: return NetworkArchitecturePackage.PORT_NUMBER_ELEMENT__PORT_NUMBER;
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
				case NetworkArchitecturePackage.NAMED_ELEMENT__NAME: return NetworkArchitecturePackage.SWITCH_L3__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL: return NetworkArchitecturePackage.SWITCH_L3__MODEL;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION: return NetworkArchitecturePackage.SWITCH_L3__OS_VERSION;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM: return NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM;
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT__PORT_NUMBER: return NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER;
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
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT___IS_VALID_LAN_PORT_NUMBER: return NetworkArchitecturePackage.SWITCH_L3___IS_VALID_LAN_PORT_NUMBER;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NetworkArchitecturePackage.SWITCH_L3___IS_VALID_LAN_PORT_NUMBER:
				return isValidLanPortNumber();
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

} //SwitchL3Impl
