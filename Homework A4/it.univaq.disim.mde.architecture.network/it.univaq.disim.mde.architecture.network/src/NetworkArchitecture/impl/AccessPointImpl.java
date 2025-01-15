/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.AccessPoint;
import NetworkArchitecture.FirmwareElement;
import NetworkArchitecture.NamedElement;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.PortNumberElement;
import NetworkArchitecture.VLAN;
import NetworkArchitecture.Wifi;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 * An implementation of the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getModel <em>Model</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getMaxClientSupport <em>Max Client Support</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getWifis <em>Wifis</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.AccessPointImpl#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessPointImpl extends InternalIpAddressElementImpl implements AccessPoint {
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
	 * The default value of the '{@link #getMaxClientSupport() <em>Max Client Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClientSupport()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CLIENT_SUPPORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxClientSupport() <em>Max Client Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClientSupport()
	 * @generated
	 * @ordered
	 */
	protected int maxClientSupport = MAX_CLIENT_SUPPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWifis() <em>Wifis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWifis()
	 * @generated
	 * @ordered
	 */
	protected EList<Wifi> wifis;

	/**
	 * The cached value of the '{@link #getVlan() <em>Vlan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlan()
	 * @generated
	 * @ordered
	 */
	protected VLAN vlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitecturePackage.Literals.ACCESS_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION, oldOsVersion, osVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxClientSupport() {
		return maxClientSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxClientSupport(int newMaxClientSupport) {
		int oldMaxClientSupport = maxClientSupport;
		maxClientSupport = newMaxClientSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT, oldMaxClientSupport, maxClientSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wifi> getWifis() {
		if (wifis == null) {
			wifis = new EObjectResolvingEList<Wifi>(Wifi.class, this, NetworkArchitecturePackage.ACCESS_POINT__WIFIS);
		}
		return wifis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VLAN getVlan() {
		if (vlan != null && vlan.eIsProxy()) {
			InternalEObject oldVlan = (InternalEObject)vlan;
			vlan = (VLAN)eResolveProxy(oldVlan);
			if (vlan != oldVlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkArchitecturePackage.ACCESS_POINT__VLAN, oldVlan, vlan));
			}
		}
		return vlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLAN basicGetVlan() {
		return vlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVlan(VLAN newVlan) {
		VLAN oldVlan = vlan;
		vlan = newVlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.ACCESS_POINT__VLAN, oldVlan, vlan));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkArchitecturePackage.ACCESS_POINT__NAME:
				return getName();
			case NetworkArchitecturePackage.ACCESS_POINT__MODEL:
				return getModel();
			case NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION:
				return getOsVersion();
			case NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM:
				return getOperatingSystem();
			case NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER:
				return getPortNumber();
			case NetworkArchitecturePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				return getMaxClientSupport();
			case NetworkArchitecturePackage.ACCESS_POINT__WIFIS:
				return getWifis();
			case NetworkArchitecturePackage.ACCESS_POINT__VLAN:
				if (resolve) return getVlan();
				return basicGetVlan();
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
			case NetworkArchitecturePackage.ACCESS_POINT__NAME:
				setName((String)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__MODEL:
				setModel((String)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM:
				setOperatingSystem((String)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER:
				setPortNumber((Integer)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				setMaxClientSupport((Integer)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__WIFIS:
				getWifis().clear();
				getWifis().addAll((Collection<? extends Wifi>)newValue);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__VLAN:
				setVlan((VLAN)newValue);
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
			case NetworkArchitecturePackage.ACCESS_POINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				setMaxClientSupport(MAX_CLIENT_SUPPORT_EDEFAULT);
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__WIFIS:
				getWifis().clear();
				return;
			case NetworkArchitecturePackage.ACCESS_POINT__VLAN:
				setVlan((VLAN)null);
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
			case NetworkArchitecturePackage.ACCESS_POINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkArchitecturePackage.ACCESS_POINT__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM:
				return OPERATING_SYSTEM_EDEFAULT == null ? operatingSystem != null : !OPERATING_SYSTEM_EDEFAULT.equals(operatingSystem);
			case NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER:
				return portNumber != PORT_NUMBER_EDEFAULT;
			case NetworkArchitecturePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				return maxClientSupport != MAX_CLIENT_SUPPORT_EDEFAULT;
			case NetworkArchitecturePackage.ACCESS_POINT__WIFIS:
				return wifis != null && !wifis.isEmpty();
			case NetworkArchitecturePackage.ACCESS_POINT__VLAN:
				return vlan != null;
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
				case NetworkArchitecturePackage.ACCESS_POINT__NAME: return NetworkArchitecturePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.ACCESS_POINT__MODEL: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL;
				case NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION;
				case NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM;
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER: return NetworkArchitecturePackage.PORT_NUMBER_ELEMENT__PORT_NUMBER;
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
				case NetworkArchitecturePackage.NAMED_ELEMENT__NAME: return NetworkArchitecturePackage.ACCESS_POINT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL: return NetworkArchitecturePackage.ACCESS_POINT__MODEL;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION: return NetworkArchitecturePackage.ACCESS_POINT__OS_VERSION;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM: return NetworkArchitecturePackage.ACCESS_POINT__OPERATING_SYSTEM;
				default: return -1;
			}
		}
		if (baseClass == PortNumberElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT__PORT_NUMBER: return NetworkArchitecturePackage.ACCESS_POINT__PORT_NUMBER;
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
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT___IS_VALID_LAN_PORT_NUMBER: return NetworkArchitecturePackage.ACCESS_POINT___IS_VALID_LAN_PORT_NUMBER;
				case NetworkArchitecturePackage.PORT_NUMBER_ELEMENT___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP: return NetworkArchitecturePackage.ACCESS_POINT___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP;
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
			case NetworkArchitecturePackage.ACCESS_POINT___IS_VALID_LAN_PORT_NUMBER:
				return isValidLanPortNumber();
			case NetworkArchitecturePackage.ACCESS_POINT___VALID_LAN_PORT_NUMBER__DIAGNOSTICCHAIN_MAP:
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
		result.append(", maxClientSupport: ");
		result.append(maxClientSupport);
		result.append(')');
		return result.toString();
	}

} //AccessPointImpl
