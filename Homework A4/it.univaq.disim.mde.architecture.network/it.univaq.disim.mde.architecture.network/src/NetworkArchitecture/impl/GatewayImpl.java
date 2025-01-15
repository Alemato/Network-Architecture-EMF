/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.FirmwareElement;
import NetworkArchitecture.Gateway;
import NetworkArchitecture.GatewayTechnology;
import NetworkArchitecture.NATTechnology;
import NetworkArchitecture.NamedElement;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.Router;
import NetworkArchitecture.VLAN;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getName <em>Name</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getModel <em>Model</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getTecnology <em>Tecnology</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getNat <em>Nat</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.GatewayImpl#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends InternalIpAddressElementImpl implements Gateway {
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
	 * The default value of the '{@link #getTecnology() <em>Tecnology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnology()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayTechnology TECNOLOGY_EDEFAULT = GatewayTechnology.IP;

	/**
	 * The cached value of the '{@link #getTecnology() <em>Tecnology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTecnology()
	 * @generated
	 * @ordered
	 */
	protected GatewayTechnology tecnology = TECNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNat() <em>Nat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNat()
	 * @generated
	 * @ordered
	 */
	protected static final NATTechnology NAT_EDEFAULT = NATTechnology.STATIC_NAT;

	/**
	 * The cached value of the '{@link #getNat() <em>Nat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNat()
	 * @generated
	 * @ordered
	 */
	protected NATTechnology nat = NAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouter() <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter()
	 * @generated
	 * @ordered
	 */
	protected Router router;

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
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitecturePackage.Literals.GATEWAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__OS_VERSION, oldOsVersion, osVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayTechnology getTecnology() {
		return tecnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTecnology(GatewayTechnology newTecnology) {
		GatewayTechnology oldTecnology = tecnology;
		tecnology = newTecnology == null ? TECNOLOGY_EDEFAULT : newTecnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__TECNOLOGY, oldTecnology, tecnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NATTechnology getNat() {
		return nat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNat(NATTechnology newNat) {
		NATTechnology oldNat = nat;
		nat = newNat == null ? NAT_EDEFAULT : newNat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__NAT, oldNat, nat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Router getRouter() {
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouter(Router newRouter, NotificationChain msgs) {
		Router oldRouter = router;
		router = newRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__ROUTER, oldRouter, newRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouter(Router newRouter) {
		if (newRouter != router) {
			NotificationChain msgs = null;
			if (router != null)
				msgs = ((InternalEObject)router).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkArchitecturePackage.GATEWAY__ROUTER, null, msgs);
			if (newRouter != null)
				msgs = ((InternalEObject)newRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkArchitecturePackage.GATEWAY__ROUTER, null, msgs);
			msgs = basicSetRouter(newRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__ROUTER, newRouter, newRouter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkArchitecturePackage.GATEWAY__VLAN, oldVlan, vlan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.GATEWAY__VLAN, oldVlan, vlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitecturePackage.GATEWAY__ROUTER:
				return basicSetRouter(null, msgs);
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
			case NetworkArchitecturePackage.GATEWAY__NAME:
				return getName();
			case NetworkArchitecturePackage.GATEWAY__MODEL:
				return getModel();
			case NetworkArchitecturePackage.GATEWAY__OS_VERSION:
				return getOsVersion();
			case NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM:
				return getOperatingSystem();
			case NetworkArchitecturePackage.GATEWAY__TECNOLOGY:
				return getTecnology();
			case NetworkArchitecturePackage.GATEWAY__NAT:
				return getNat();
			case NetworkArchitecturePackage.GATEWAY__ROUTER:
				return getRouter();
			case NetworkArchitecturePackage.GATEWAY__VLAN:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkArchitecturePackage.GATEWAY__NAME:
				setName((String)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__MODEL:
				setModel((String)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM:
				setOperatingSystem((String)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__TECNOLOGY:
				setTecnology((GatewayTechnology)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__NAT:
				setNat((NATTechnology)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__ROUTER:
				setRouter((Router)newValue);
				return;
			case NetworkArchitecturePackage.GATEWAY__VLAN:
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
			case NetworkArchitecturePackage.GATEWAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkArchitecturePackage.GATEWAY__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.GATEWAY__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM:
				setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
				return;
			case NetworkArchitecturePackage.GATEWAY__TECNOLOGY:
				setTecnology(TECNOLOGY_EDEFAULT);
				return;
			case NetworkArchitecturePackage.GATEWAY__NAT:
				setNat(NAT_EDEFAULT);
				return;
			case NetworkArchitecturePackage.GATEWAY__ROUTER:
				setRouter((Router)null);
				return;
			case NetworkArchitecturePackage.GATEWAY__VLAN:
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
			case NetworkArchitecturePackage.GATEWAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkArchitecturePackage.GATEWAY__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case NetworkArchitecturePackage.GATEWAY__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM:
				return OPERATING_SYSTEM_EDEFAULT == null ? operatingSystem != null : !OPERATING_SYSTEM_EDEFAULT.equals(operatingSystem);
			case NetworkArchitecturePackage.GATEWAY__TECNOLOGY:
				return tecnology != TECNOLOGY_EDEFAULT;
			case NetworkArchitecturePackage.GATEWAY__NAT:
				return nat != NAT_EDEFAULT;
			case NetworkArchitecturePackage.GATEWAY__ROUTER:
				return router != null;
			case NetworkArchitecturePackage.GATEWAY__VLAN:
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
				case NetworkArchitecturePackage.GATEWAY__NAME: return NetworkArchitecturePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (derivedFeatureID) {
				case NetworkArchitecturePackage.GATEWAY__MODEL: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL;
				case NetworkArchitecturePackage.GATEWAY__OS_VERSION: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION;
				case NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM: return NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM;
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
				case NetworkArchitecturePackage.NAMED_ELEMENT__NAME: return NetworkArchitecturePackage.GATEWAY__NAME;
				default: return -1;
			}
		}
		if (baseClass == FirmwareElement.class) {
			switch (baseFeatureID) {
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__MODEL: return NetworkArchitecturePackage.GATEWAY__MODEL;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OS_VERSION: return NetworkArchitecturePackage.GATEWAY__OS_VERSION;
				case NetworkArchitecturePackage.FIRMWARE_ELEMENT__OPERATING_SYSTEM: return NetworkArchitecturePackage.GATEWAY__OPERATING_SYSTEM;
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
		result.append(", tecnology: ");
		result.append(tecnology);
		result.append(", nat: ");
		result.append(nat);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
