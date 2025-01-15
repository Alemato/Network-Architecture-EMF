/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.Gateway;
import NetworkArchitectureLite.GatewayTechnology;
import NetworkArchitectureLite.NATTechnology;
import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.Router;
import NetworkArchitectureLite.VLAN;

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
 *   <li>{@link NetworkArchitectureLite.impl.GatewayImpl#getTecnology <em>Tecnology</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.GatewayImpl#getNat <em>Nat</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.GatewayImpl#getRouter <em>Router</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.GatewayImpl#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends NetworkDeviceImpl implements Gateway {
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
		return NetworkArchitectureLitePackage.Literals.GATEWAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.GATEWAY__TECNOLOGY, oldTecnology, tecnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.GATEWAY__NAT, oldNat, nat));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.GATEWAY__ROUTER, oldRouter, newRouter);
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
				msgs = ((InternalEObject)router).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkArchitectureLitePackage.GATEWAY__ROUTER, null, msgs);
			if (newRouter != null)
				msgs = ((InternalEObject)newRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkArchitectureLitePackage.GATEWAY__ROUTER, null, msgs);
			msgs = basicSetRouter(newRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.GATEWAY__ROUTER, newRouter, newRouter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkArchitectureLitePackage.GATEWAY__VLAN, oldVlan, vlan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.GATEWAY__VLAN, oldVlan, vlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitectureLitePackage.GATEWAY__ROUTER:
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
			case NetworkArchitectureLitePackage.GATEWAY__TECNOLOGY:
				return getTecnology();
			case NetworkArchitectureLitePackage.GATEWAY__NAT:
				return getNat();
			case NetworkArchitectureLitePackage.GATEWAY__ROUTER:
				return getRouter();
			case NetworkArchitectureLitePackage.GATEWAY__VLAN:
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
			case NetworkArchitectureLitePackage.GATEWAY__TECNOLOGY:
				setTecnology((GatewayTechnology)newValue);
				return;
			case NetworkArchitectureLitePackage.GATEWAY__NAT:
				setNat((NATTechnology)newValue);
				return;
			case NetworkArchitectureLitePackage.GATEWAY__ROUTER:
				setRouter((Router)newValue);
				return;
			case NetworkArchitectureLitePackage.GATEWAY__VLAN:
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
			case NetworkArchitectureLitePackage.GATEWAY__TECNOLOGY:
				setTecnology(TECNOLOGY_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.GATEWAY__NAT:
				setNat(NAT_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.GATEWAY__ROUTER:
				setRouter((Router)null);
				return;
			case NetworkArchitectureLitePackage.GATEWAY__VLAN:
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
			case NetworkArchitectureLitePackage.GATEWAY__TECNOLOGY:
				return tecnology != TECNOLOGY_EDEFAULT;
			case NetworkArchitectureLitePackage.GATEWAY__NAT:
				return nat != NAT_EDEFAULT;
			case NetworkArchitectureLitePackage.GATEWAY__ROUTER:
				return router != null;
			case NetworkArchitectureLitePackage.GATEWAY__VLAN:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tecnology: ");
		result.append(tecnology);
		result.append(", nat: ");
		result.append(nat);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
