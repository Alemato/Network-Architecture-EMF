/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.Router;
import NetworkArchitectureLite.RoutingProtocol;
import NetworkArchitectureLite.SwitchL3;
import NetworkArchitectureLite.VLAN;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.impl.RouterImpl#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.RouterImpl#getSwitchL3 <em>Switch L3</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.RouterImpl#getVlans <em>Vlans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends NetworkDeviceImpl implements Router {
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
	 * The cached value of the '{@link #getSwitchL3() <em>Switch L3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchL3()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchL3> switchL3;

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
		return NetworkArchitectureLitePackage.Literals.ROUTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.ROUTER__ROUTING_PROTOCOL, oldRoutingProtocol, routingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchL3> getSwitchL3() {
		if (switchL3 == null) {
			switchL3 = new EObjectContainmentEList<SwitchL3>(SwitchL3.class, this, NetworkArchitectureLitePackage.ROUTER__SWITCH_L3);
		}
		return switchL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VLAN> getVlans() {
		if (vlans == null) {
			vlans = new EObjectResolvingEList<VLAN>(VLAN.class, this, NetworkArchitectureLitePackage.ROUTER__VLANS);
		}
		return vlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitectureLitePackage.ROUTER__SWITCH_L3:
				return ((InternalEList<?>)getSwitchL3()).basicRemove(otherEnd, msgs);
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
			case NetworkArchitectureLitePackage.ROUTER__ROUTING_PROTOCOL:
				return getRoutingProtocol();
			case NetworkArchitectureLitePackage.ROUTER__SWITCH_L3:
				return getSwitchL3();
			case NetworkArchitectureLitePackage.ROUTER__VLANS:
				return getVlans();
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
			case NetworkArchitectureLitePackage.ROUTER__ROUTING_PROTOCOL:
				setRoutingProtocol((RoutingProtocol)newValue);
				return;
			case NetworkArchitectureLitePackage.ROUTER__SWITCH_L3:
				getSwitchL3().clear();
				getSwitchL3().addAll((Collection<? extends SwitchL3>)newValue);
				return;
			case NetworkArchitectureLitePackage.ROUTER__VLANS:
				getVlans().clear();
				getVlans().addAll((Collection<? extends VLAN>)newValue);
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
			case NetworkArchitectureLitePackage.ROUTER__ROUTING_PROTOCOL:
				setRoutingProtocol(ROUTING_PROTOCOL_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.ROUTER__SWITCH_L3:
				getSwitchL3().clear();
				return;
			case NetworkArchitectureLitePackage.ROUTER__VLANS:
				getVlans().clear();
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
			case NetworkArchitectureLitePackage.ROUTER__ROUTING_PROTOCOL:
				return routingProtocol != ROUTING_PROTOCOL_EDEFAULT;
			case NetworkArchitectureLitePackage.ROUTER__SWITCH_L3:
				return switchL3 != null && !switchL3.isEmpty();
			case NetworkArchitectureLitePackage.ROUTER__VLANS:
				return vlans != null && !vlans.isEmpty();
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
		result.append(" (routingProtocol: ");
		result.append(routingProtocol);
		result.append(')');
		return result.toString();
	}

} //RouterImpl
