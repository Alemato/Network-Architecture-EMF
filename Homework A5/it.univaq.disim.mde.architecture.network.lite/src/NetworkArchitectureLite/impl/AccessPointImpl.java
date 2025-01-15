/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.AccessPoint;
import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.VLAN;
import NetworkArchitectureLite.Wifi;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.impl.AccessPointImpl#getMaxClientSupport <em>Max Client Support</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.AccessPointImpl#getWifis <em>Wifis</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.AccessPointImpl#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessPointImpl extends NetworkDeviceImpl implements AccessPoint {
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
		return NetworkArchitectureLitePackage.Literals.ACCESS_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT, oldMaxClientSupport, maxClientSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wifi> getWifis() {
		if (wifis == null) {
			wifis = new EObjectResolvingEList<Wifi>(Wifi.class, this, NetworkArchitectureLitePackage.ACCESS_POINT__WIFIS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkArchitectureLitePackage.ACCESS_POINT__VLAN, oldVlan, vlan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.ACCESS_POINT__VLAN, oldVlan, vlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkArchitectureLitePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				return getMaxClientSupport();
			case NetworkArchitectureLitePackage.ACCESS_POINT__WIFIS:
				return getWifis();
			case NetworkArchitectureLitePackage.ACCESS_POINT__VLAN:
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
			case NetworkArchitectureLitePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				setMaxClientSupport((Integer)newValue);
				return;
			case NetworkArchitectureLitePackage.ACCESS_POINT__WIFIS:
				getWifis().clear();
				getWifis().addAll((Collection<? extends Wifi>)newValue);
				return;
			case NetworkArchitectureLitePackage.ACCESS_POINT__VLAN:
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
			case NetworkArchitectureLitePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				setMaxClientSupport(MAX_CLIENT_SUPPORT_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.ACCESS_POINT__WIFIS:
				getWifis().clear();
				return;
			case NetworkArchitectureLitePackage.ACCESS_POINT__VLAN:
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
			case NetworkArchitectureLitePackage.ACCESS_POINT__MAX_CLIENT_SUPPORT:
				return maxClientSupport != MAX_CLIENT_SUPPORT_EDEFAULT;
			case NetworkArchitectureLitePackage.ACCESS_POINT__WIFIS:
				return wifis != null && !wifis.isEmpty();
			case NetworkArchitectureLitePackage.ACCESS_POINT__VLAN:
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
		result.append(" (maxClientSupport: ");
		result.append(maxClientSupport);
		result.append(')');
		return result.toString();
	}

} //AccessPointImpl
