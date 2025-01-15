/**
 */
package NetworkArchitectureLite.impl;

import NetworkArchitectureLite.AuthenticationWifi;
import NetworkArchitectureLite.EncryptionModeWifi;
import NetworkArchitectureLite.NetworkArchitectureLitePackage;
import NetworkArchitectureLite.OperatingFrequency;
import NetworkArchitectureLite.VLAN;
import NetworkArchitectureLite.Wifi;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wifi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getSsid <em>Ssid</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getInternalIpAddress <em>Internal Ip Address</em>}</li>
 *   <li>{@link NetworkArchitectureLite.impl.WifiImpl#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WifiImpl extends NamedElementImpl implements Wifi {
	/**
	 * The default value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final OperatingFrequency FREQUENCY_EDEFAULT = OperatingFrequency.GHZ_24;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected OperatingFrequency frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected int channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthentication() <em>Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationWifi AUTHENTICATION_EDEFAULT = AuthenticationWifi.SHARED;

	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationWifi authentication = AUTHENTICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final EncryptionModeWifi ENCRYPTION_EDEFAULT = EncryptionModeWifi.AES_CCM;

	/**
	 * The cached value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected EncryptionModeWifi encryption = ENCRYPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalIpAddress() <em>Internal Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalIpAddress() <em>Internal Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String internalIpAddress = INTERNAL_IP_ADDRESS_EDEFAULT;

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
	protected WifiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitectureLitePackage.Literals.WIFI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSsid() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsid(String newSsid) {
		String oldSsid = ssid;
		ssid = newSsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__SSID, oldSsid, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingFrequency getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(OperatingFrequency newFrequency) {
		OperatingFrequency oldFrequency = frequency;
		frequency = newFrequency == null ? FREQUENCY_EDEFAULT : newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannel(int newChannel) {
		int oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationWifi getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthentication(AuthenticationWifi newAuthentication) {
		AuthenticationWifi oldAuthentication = authentication;
		authentication = newAuthentication == null ? AUTHENTICATION_EDEFAULT : newAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__AUTHENTICATION, oldAuthentication, authentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionModeWifi getEncryption() {
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption(EncryptionModeWifi newEncryption) {
		EncryptionModeWifi oldEncryption = encryption;
		encryption = newEncryption == null ? ENCRYPTION_EDEFAULT : newEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__ENCRYPTION, oldEncryption, encryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalIpAddress() {
		return internalIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalIpAddress(String newInternalIpAddress) {
		String oldInternalIpAddress = internalIpAddress;
		internalIpAddress = newInternalIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__INTERNAL_IP_ADDRESS, oldInternalIpAddress, internalIpAddress));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkArchitectureLitePackage.WIFI__VLAN, oldVlan, vlan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitectureLitePackage.WIFI__VLAN, oldVlan, vlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkArchitectureLitePackage.WIFI__SSID:
				return getSsid();
			case NetworkArchitectureLitePackage.WIFI__FREQUENCY:
				return getFrequency();
			case NetworkArchitectureLitePackage.WIFI__CHANNEL:
				return getChannel();
			case NetworkArchitectureLitePackage.WIFI__AUTHENTICATION:
				return getAuthentication();
			case NetworkArchitectureLitePackage.WIFI__ENCRYPTION:
				return getEncryption();
			case NetworkArchitectureLitePackage.WIFI__INTERNAL_IP_ADDRESS:
				return getInternalIpAddress();
			case NetworkArchitectureLitePackage.WIFI__VLAN:
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
			case NetworkArchitectureLitePackage.WIFI__SSID:
				setSsid((String)newValue);
				return;
			case NetworkArchitectureLitePackage.WIFI__FREQUENCY:
				setFrequency((OperatingFrequency)newValue);
				return;
			case NetworkArchitectureLitePackage.WIFI__CHANNEL:
				setChannel((Integer)newValue);
				return;
			case NetworkArchitectureLitePackage.WIFI__AUTHENTICATION:
				setAuthentication((AuthenticationWifi)newValue);
				return;
			case NetworkArchitectureLitePackage.WIFI__ENCRYPTION:
				setEncryption((EncryptionModeWifi)newValue);
				return;
			case NetworkArchitectureLitePackage.WIFI__INTERNAL_IP_ADDRESS:
				setInternalIpAddress((String)newValue);
				return;
			case NetworkArchitectureLitePackage.WIFI__VLAN:
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
			case NetworkArchitectureLitePackage.WIFI__SSID:
				setSsid(SSID_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.WIFI__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.WIFI__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.WIFI__AUTHENTICATION:
				setAuthentication(AUTHENTICATION_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.WIFI__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.WIFI__INTERNAL_IP_ADDRESS:
				setInternalIpAddress(INTERNAL_IP_ADDRESS_EDEFAULT);
				return;
			case NetworkArchitectureLitePackage.WIFI__VLAN:
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
			case NetworkArchitectureLitePackage.WIFI__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case NetworkArchitectureLitePackage.WIFI__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case NetworkArchitectureLitePackage.WIFI__CHANNEL:
				return channel != CHANNEL_EDEFAULT;
			case NetworkArchitectureLitePackage.WIFI__AUTHENTICATION:
				return authentication != AUTHENTICATION_EDEFAULT;
			case NetworkArchitectureLitePackage.WIFI__ENCRYPTION:
				return encryption != ENCRYPTION_EDEFAULT;
			case NetworkArchitectureLitePackage.WIFI__INTERNAL_IP_ADDRESS:
				return INTERNAL_IP_ADDRESS_EDEFAULT == null ? internalIpAddress != null : !INTERNAL_IP_ADDRESS_EDEFAULT.equals(internalIpAddress);
			case NetworkArchitectureLitePackage.WIFI__VLAN:
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
		result.append(" (ssid: ");
		result.append(ssid);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", channel: ");
		result.append(channel);
		result.append(", authentication: ");
		result.append(authentication);
		result.append(", encryption: ");
		result.append(encryption);
		result.append(", internalIpAddress: ");
		result.append(internalIpAddress);
		result.append(')');
		return result.toString();
	}

} //WifiImpl
