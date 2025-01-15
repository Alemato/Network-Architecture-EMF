/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.AccessPoint;
import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.RoutingProtocol;
import NetworkArchitectureLite.SwitchL2;
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
 * An implementation of the model object '<em><b>Switch L3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.impl.SwitchL3Impl#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.SwitchL3Impl#getSwitchL2 <em>Switch L2</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.SwitchL3Impl#getAccessPoints <em>Access Points</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.SwitchL3Impl#getVlans <em>Vlans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchL3Impl extends NetworkDeviceImpl implements SwitchL3 {
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
	 * The cached value of the '{@link #getSwitchL2() <em>Switch L2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchL2()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchL2> switchL2;

	/**
	 * The cached value of the '{@link #getAccessPoints() <em>Access Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessPoint> accessPoints;

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
		return NetworkArchitectureLitePackage.Literals.SWITCH_L3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.SWITCH_L3__ROUTING_PROTOCOL, oldRoutingProtocol, routingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchL2> getSwitchL2() {
		if (switchL2 == null) {
			switchL2 = new EObjectContainmentEList<SwitchL2>(SwitchL2.class, this, NetworkArchitectureLitePackage.SWITCH_L3__SWITCH_L2);
		}
		return switchL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessPoint> getAccessPoints() {
		if (accessPoints == null) {
			accessPoints = new EObjectContainmentEList<AccessPoint>(AccessPoint.class, this, NetworkArchitectureLitePackage.SWITCH_L3__ACCESS_POINTS);
		}
		return accessPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VLAN> getVlans() {
		if (vlans == null) {
			vlans = new EObjectResolvingEList<VLAN>(VLAN.class, this, NetworkArchitectureLitePackage.SWITCH_L3__VLANS);
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
			case NetworkArchitectureLitePackage.SWITCH_L3__SWITCH_L2:
				return ((InternalEList<?>)getSwitchL2()).basicRemove(otherEnd, msgs);
			case NetworkArchitectureLitePackage.SWITCH_L3__ACCESS_POINTS:
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
			case NetworkArchitectureLitePackage.SWITCH_L3__ROUTING_PROTOCOL:
				return getRoutingProtocol();
			case NetworkArchitectureLitePackage.SWITCH_L3__SWITCH_L2:
				return getSwitchL2();
			case NetworkArchitectureLitePackage.SWITCH_L3__ACCESS_POINTS:
				return getAccessPoints();
			case NetworkArchitectureLitePackage.SWITCH_L3__VLANS:
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
			case NetworkArchitectureLitePackage.SWITCH_L3__ROUTING_PROTOCOL:
				setRoutingProtocol((RoutingProtocol)newValue);
				return;
			case NetworkArchitectureLitePackage.SWITCH_L3__SWITCH_L2:
				getSwitchL2().clear();
				getSwitchL2().addAll((Collection<? extends SwitchL2>)newValue);
				return;
			case NetworkArchitectureLitePackage.SWITCH_L3__ACCESS_POINTS:
				getAccessPoints().clear();
				getAccessPoints().addAll((Collection<? extends AccessPoint>)newValue);
				return;
			case NetworkArchitectureLitePackage.SWITCH_L3__VLANS:
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
			case NetworkArchitectureLitePackage.SWITCH_L3__ROUTING_PROTOCOL:
				setRoutingProtocol(ROUTING_PROTOCOL_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.SWITCH_L3__SWITCH_L2:
				getSwitchL2().clear();
				return;
			case NetworkArchitectureLitePackage.SWITCH_L3__ACCESS_POINTS:
				getAccessPoints().clear();
				return;
			case NetworkArchitectureLitePackage.SWITCH_L3__VLANS:
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
			case NetworkArchitectureLitePackage.SWITCH_L3__ROUTING_PROTOCOL:
				return routingProtocol != ROUTING_PROTOCOL_EDEFAULT;
			case NetworkArchitectureLitePackage.SWITCH_L3__SWITCH_L2:
				return switchL2 != null && !switchL2.isEmpty();
			case NetworkArchitectureLitePackage.SWITCH_L3__ACCESS_POINTS:
				return accessPoints != null && !accessPoints.isEmpty();
			case NetworkArchitectureLitePackage.SWITCH_L3__VLANS:
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

} //SwitchL3Impl
