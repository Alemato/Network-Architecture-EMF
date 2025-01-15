/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.VLAN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VLAN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.impl.VLANImpl#getIdVLan <em>Id VLan</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.VLANImpl#getMtu <em>Mtu</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.VLANImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.VLANImpl#getIpGateway <em>Ip Gateway</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.VLANImpl#getLowerIp <em>Lower Ip</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.VLANImpl#getUpperIp <em>Upper Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VLANImpl extends NamedElementImpl implements VLAN {
	/**
	 * The default value of the '{@link #getIdVLan() <em>Id VLan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdVLan()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_VLAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdVLan() <em>Id VLan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdVLan()
	 * @generated
	 * @ordered
	 */
	protected int idVLan = ID_VLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMtu() <em>Mtu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtu()
	 * @generated
	 * @ordered
	 */
	protected static final int MTU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMtu() <em>Mtu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtu()
	 * @generated
	 * @ordered
	 */
	protected int mtu = MTU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected String subnet = SUBNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpGateway() <em>Ip Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpGateway() <em>Ip Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpGateway()
	 * @generated
	 * @ordered
	 */
	protected String ipGateway = IP_GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerIp() <em>Lower Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerIp()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerIp() <em>Lower Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerIp()
	 * @generated
	 * @ordered
	 */
	protected String lowerIp = LOWER_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperIp() <em>Upper Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperIp()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperIp() <em>Upper Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperIp()
	 * @generated
	 * @ordered
	 */
	protected String upperIp = UPPER_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VLANImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitectureLitePackage.Literals.VLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdVLan() {
		return idVLan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdVLan(int newIdVLan) {
		int oldIdVLan = idVLan;
		idVLan = newIdVLan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.VLAN__ID_VLAN, oldIdVLan, idVLan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMtu() {
		return mtu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMtu(int newMtu) {
		int oldMtu = mtu;
		mtu = newMtu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.VLAN__MTU, oldMtu, mtu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnet(String newSubnet) {
		String oldSubnet = subnet;
		subnet = newSubnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.VLAN__SUBNET, oldSubnet, subnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIpGateway() {
		return ipGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpGateway(String newIpGateway) {
		String oldIpGateway = ipGateway;
		ipGateway = newIpGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.VLAN__IP_GATEWAY, oldIpGateway, ipGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowerIp() {
		return lowerIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerIp(String newLowerIp) {
		String oldLowerIp = lowerIp;
		lowerIp = newLowerIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.VLAN__LOWER_IP, oldLowerIp, lowerIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpperIp() {
		return upperIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperIp(String newUpperIp) {
		String oldUpperIp = upperIp;
		upperIp = newUpperIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.VLAN__UPPER_IP, oldUpperIp, upperIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkArchitectureLitePackage.VLAN__ID_VLAN:
				return getIdVLan();
			case NetworkArchitectureLitePackage.VLAN__MTU:
				return getMtu();
			case NetworkArchitectureLitePackage.VLAN__SUBNET:
				return getSubnet();
			case NetworkArchitectureLitePackage.VLAN__IP_GATEWAY:
				return getIpGateway();
			case NetworkArchitectureLitePackage.VLAN__LOWER_IP:
				return getLowerIp();
			case NetworkArchitectureLitePackage.VLAN__UPPER_IP:
				return getUpperIp();
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
			case NetworkArchitectureLitePackage.VLAN__ID_VLAN:
				setIdVLan((Integer)newValue);
				return;
			case NetworkArchitectureLitePackage.VLAN__MTU:
				setMtu((Integer)newValue);
				return;
			case NetworkArchitectureLitePackage.VLAN__SUBNET:
				setSubnet((String)newValue);
				return;
			case NetworkArchitectureLitePackage.VLAN__IP_GATEWAY:
				setIpGateway((String)newValue);
				return;
			case NetworkArchitectureLitePackage.VLAN__LOWER_IP:
				setLowerIp((String)newValue);
				return;
			case NetworkArchitectureLitePackage.VLAN__UPPER_IP:
				setUpperIp((String)newValue);
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
			case NetworkArchitectureLitePackage.VLAN__ID_VLAN:
				setIdVLan(ID_VLAN_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.VLAN__MTU:
				setMtu(MTU_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.VLAN__SUBNET:
				setSubnet(SUBNET_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.VLAN__IP_GATEWAY:
				setIpGateway(IP_GATEWAY_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.VLAN__LOWER_IP:
				setLowerIp(LOWER_IP_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.VLAN__UPPER_IP:
				setUpperIp(UPPER_IP_EDEFAULT);
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
			case NetworkArchitectureLitePackage.VLAN__ID_VLAN:
				return idVLan != ID_VLAN_EDEFAULT;
			case NetworkArchitectureLitePackage.VLAN__MTU:
				return mtu != MTU_EDEFAULT;
			case NetworkArchitectureLitePackage.VLAN__SUBNET:
				return SUBNET_EDEFAULT == null ? subnet != null : !SUBNET_EDEFAULT.equals(subnet);
			case NetworkArchitectureLitePackage.VLAN__IP_GATEWAY:
				return IP_GATEWAY_EDEFAULT == null ? ipGateway != null : !IP_GATEWAY_EDEFAULT.equals(ipGateway);
			case NetworkArchitectureLitePackage.VLAN__LOWER_IP:
				return LOWER_IP_EDEFAULT == null ? lowerIp != null : !LOWER_IP_EDEFAULT.equals(lowerIp);
			case NetworkArchitectureLitePackage.VLAN__UPPER_IP:
				return UPPER_IP_EDEFAULT == null ? upperIp != null : !UPPER_IP_EDEFAULT.equals(upperIp);
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
		result.append(" (idVLan: ");
		result.append(idVLan);
		result.append(", mtu: ");
		result.append(mtu);
		result.append(", subnet: ");
		result.append(subnet);
		result.append(", ipGateway: ");
		result.append(ipGateway);
		result.append(", lowerIp: ");
		result.append(lowerIp);
		result.append(", upperIp: ");
		result.append(upperIp);
		result.append(')');
		return result.toString();
	}

} //VLANImpl
