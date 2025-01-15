/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.Gateway;
import NetworkArchitectureLite.Network;
import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.VLAN;
import NetworkArchitectureLite.Wifi;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.impl.NetworkImpl#getPublicIpAddres <em>Public Ip Addres</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.NetworkImpl#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.NetworkImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.NetworkImpl#getWifis <em>Wifis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends NamedElementImpl implements Network {
	/**
	 * The default value of the '{@link #getPublicIpAddres() <em>Public Ip Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIpAddres()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IP_ADDRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicIpAddres() <em>Public Ip Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIpAddres()
	 * @generated
	 * @ordered
	 */
	protected String publicIpAddres = PUBLIC_IP_ADDRES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVlans() <em>Vlans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlans()
	 * @generated
	 * @ordered
	 */
	protected EList<VLAN> vlans;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected Gateway gateway;

	/**
	 * The cached value of the '{@link #getWifis() <em>Wifis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWifis()
	 * @generated
	 * @ordered
	 */
	protected EList<Wifi> wifis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitectureLitePackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicIpAddres() {
		return publicIpAddres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicIpAddres(String newPublicIpAddres) {
		String oldPublicIpAddres = publicIpAddres;
		publicIpAddres = newPublicIpAddres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.NETWORK__PUBLIC_IP_ADDRES, oldPublicIpAddres, publicIpAddres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VLAN> getVlans() {
		if (vlans == null) {
			vlans = new EObjectContainmentEList<VLAN>(VLAN.class, this, NetworkArchitectureLitePackage.NETWORK__VLANS);
		}
		return vlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gateway getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(Gateway newGateway, NotificationChain msgs) {
		Gateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.NETWORK__GATEWAY, oldGateway, newGateway);
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
	public void setGateway(Gateway newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkArchitectureLitePackage.NETWORK__GATEWAY, null, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkArchitectureLitePackage.NETWORK__GATEWAY, null, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.NETWORK__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wifi> getWifis() {
		if (wifis == null) {
			wifis = new EObjectContainmentEList<Wifi>(Wifi.class, this, NetworkArchitectureLitePackage.NETWORK__WIFIS);
		}
		return wifis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitectureLitePackage.NETWORK__VLANS:
				return ((InternalEList<?>)getVlans()).basicRemove(otherEnd, msgs);
			case NetworkArchitectureLitePackage.NETWORK__GATEWAY:
				return basicSetGateway(null, msgs);
			case NetworkArchitectureLitePackage.NETWORK__WIFIS:
				return ((InternalEList<?>)getWifis()).basicRemove(otherEnd, msgs);
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
			case NetworkArchitectureLitePackage.NETWORK__PUBLIC_IP_ADDRES:
				return getPublicIpAddres();
			case NetworkArchitectureLitePackage.NETWORK__VLANS:
				return getVlans();
			case NetworkArchitectureLitePackage.NETWORK__GATEWAY:
				return getGateway();
			case NetworkArchitectureLitePackage.NETWORK__WIFIS:
				return getWifis();
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
			case NetworkArchitectureLitePackage.NETWORK__PUBLIC_IP_ADDRES:
				setPublicIpAddres((String)newValue);
				return;
			case NetworkArchitectureLitePackage.NETWORK__VLANS:
				getVlans().clear();
				getVlans().addAll((Collection<? extends VLAN>)newValue);
				return;
			case NetworkArchitectureLitePackage.NETWORK__GATEWAY:
				setGateway((Gateway)newValue);
				return;
			case NetworkArchitectureLitePackage.NETWORK__WIFIS:
				getWifis().clear();
				getWifis().addAll((Collection<? extends Wifi>)newValue);
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
			case NetworkArchitectureLitePackage.NETWORK__PUBLIC_IP_ADDRES:
				setPublicIpAddres(PUBLIC_IP_ADDRES_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.NETWORK__VLANS:
				getVlans().clear();
				return;
			case NetworkArchitectureLitePackage.NETWORK__GATEWAY:
				setGateway((Gateway)null);
				return;
			case NetworkArchitectureLitePackage.NETWORK__WIFIS:
				getWifis().clear();
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
			case NetworkArchitectureLitePackage.NETWORK__PUBLIC_IP_ADDRES:
				return PUBLIC_IP_ADDRES_EDEFAULT == null ? publicIpAddres != null : !PUBLIC_IP_ADDRES_EDEFAULT.equals(publicIpAddres);
			case NetworkArchitectureLitePackage.NETWORK__VLANS:
				return vlans != null && !vlans.isEmpty();
			case NetworkArchitectureLitePackage.NETWORK__GATEWAY:
				return gateway != null;
			case NetworkArchitectureLitePackage.NETWORK__WIFIS:
				return wifis != null && !wifis.isEmpty();
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
		result.append(" (publicIpAddres: ");
		result.append(publicIpAddres);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
