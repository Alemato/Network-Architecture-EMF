/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.AuthenticationWifi;
import NetworkArchitecture.EncryptionModeWifi;
import NetworkArchitecture.NamedElement;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.OperatingFrequency;
import NetworkArchitecture.VLAN;
import NetworkArchitecture.Wifi;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wifi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getName <em>Name</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getSsid <em>Ssid</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.WifiImpl#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WifiImpl extends InternalIpAddressElementImpl implements Wifi {
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
		return NetworkArchitecturePackage.Literals.WIFI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__SSID, oldSsid, ssid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__FREQUENCY, oldFrequency, frequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__CHANNEL, oldChannel, channel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__AUTHENTICATION, oldAuthentication, authentication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__ENCRYPTION, oldEncryption, encryption));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkArchitecturePackage.WIFI__VLAN, oldVlan, vlan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.WIFI__VLAN, oldVlan, vlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean isValidChannelForFrequency() {
		/**
		 *
		 * if frequency = OperatingFrequency::Ghz_2_4
		 * then channel >= 1 and channel <= 14
		 * elseif frequency = OperatingFrequency::Ghz_5
		 * then channel = 36 or channel = 40 or channel = 44 or channel = 48 or channel = 52 or channel = 56 or channel = 60 or channel = 64 or channel = 100 or channel = 104 or channel = 108 or channel = 112 or channel = 116 or channel = 120 or channel = 124 or channel = 128 or channel = 132 or channel = 136 or channel = 140 or channel = 144 or channel = 149 or channel = 153 or channel = 157 or channel = 161 or channel = 165
		 * else true
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ OperatingFrequency frequency = this.getFrequency();
		final /*@NonInvalid*/ EnumerationLiteralId BOXED_frequency = NetworkArchitectureTables.ENUMid_OperatingFrequency.getEnumerationLiteralId(ClassUtil.nonNullState(frequency.getName()));
		final /*@NonInvalid*/ boolean eq = BOXED_frequency == NetworkArchitectureTables.ELITid_Ghz_2_4;
		/*@Thrown*/ Boolean IF_eq;
		if (eq) {
			final /*@NonInvalid*/ int channel_0 = this.getChannel();
			final /*@NonInvalid*/ IntegerValue BOXED_channel_0 = ValueUtil.integerValueOf(channel_0);
			final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_channel_0, NetworkArchitectureTables.INT_1).booleanValue();
			final /*@NonInvalid*/ Boolean and;
			if (!ge) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_channel_0, NetworkArchitectureTables.INT_14).booleanValue();
				if (!le) {
					and = ValueUtil.FALSE_VALUE;
				}
				else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
			IF_eq = and;
		}
		else {
			final /*@NonInvalid*/ boolean eq_0 = BOXED_frequency == NetworkArchitectureTables.ELITid_Ghz_5;
			/*@Thrown*/ Boolean IF_eq_0;
			if (eq_0) {
				final /*@NonInvalid*/ int channel_25 = this.getChannel();
				final /*@NonInvalid*/ IntegerValue BOXED_channel_25 = ValueUtil.integerValueOf(channel_25);
				/*@Caught*/ Object CAUGHT_or_21;
				try {
					/*@Caught*/ Object CAUGHT_or_20;
					try {
						/*@Caught*/ Object CAUGHT_or_19;
						try {
							/*@Caught*/ Object CAUGHT_or_18;
							try {
								/*@Caught*/ Object CAUGHT_or_17;
								try {
									/*@Caught*/ Object CAUGHT_or_16;
									try {
										/*@Caught*/ Object CAUGHT_or_15;
										try {
											/*@Caught*/ Object CAUGHT_or_14;
											try {
												/*@Caught*/ Object CAUGHT_or_13;
												try {
													/*@Caught*/ Object CAUGHT_or_12;
													try {
														/*@Caught*/ Object CAUGHT_or_11;
														try {
															/*@Caught*/ Object CAUGHT_or_10;
															try {
																/*@Caught*/ Object CAUGHT_or_9;
																try {
																	/*@Caught*/ Object CAUGHT_or_8;
																	try {
																		/*@Caught*/ Object CAUGHT_or_7;
																		try {
																			/*@Caught*/ Object CAUGHT_or_6;
																			try {
																				/*@Caught*/ Object CAUGHT_or_5;
																				try {
																					/*@Caught*/ Object CAUGHT_or_4;
																					try {
																						/*@Caught*/ Object CAUGHT_or_3;
																						try {
																							/*@Caught*/ Object CAUGHT_or_2;
																							try {
																								/*@Caught*/ Object CAUGHT_or_1;
																								try {
																									/*@Caught*/ Object CAUGHT_or_0;
																									try {
																										final /*@NonInvalid*/ boolean eq_1 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_36);
																										final /*@NonInvalid*/ Boolean or;
																										if (eq_1) {
																											or = ValueUtil.TRUE_VALUE;
																										}
																										else {
																											final /*@NonInvalid*/ boolean eq_2 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_40);
																											if (eq_2) {
																												or = ValueUtil.TRUE_VALUE;
																											}
																											else {
																												or = ValueUtil.FALSE_VALUE;
																											}
																										}
																										final /*@Thrown*/ Boolean or_0;
																										if (or == ValueUtil.TRUE_VALUE) {
																											or_0 = ValueUtil.TRUE_VALUE;
																										}
																										else {
																											final /*@NonInvalid*/ boolean eq_3 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_44);
																											if (eq_3) {
																												or_0 = ValueUtil.TRUE_VALUE;
																											}
																											else {
																												if (or == null) {
																													or_0 = null;
																												}
																												else {
																													or_0 = ValueUtil.FALSE_VALUE;
																												}
																											}
																										}
																										CAUGHT_or_0 = or_0;
																									}
																									catch (Exception e) {
																										CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
																									}
																									final /*@Thrown*/ Boolean or_1;
																									if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
																										or_1 = ValueUtil.TRUE_VALUE;
																									}
																									else {
																										final /*@NonInvalid*/ boolean eq_4 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_48);
																										if (eq_4) {
																											or_1 = ValueUtil.TRUE_VALUE;
																										}
																										else {
																											if (CAUGHT_or_0 instanceof InvalidValueException) {
																												throw (InvalidValueException)CAUGHT_or_0;
																											}
																											if (CAUGHT_or_0 == null) {
																												or_1 = null;
																											}
																											else {
																												or_1 = ValueUtil.FALSE_VALUE;
																											}
																										}
																									}
																									CAUGHT_or_1 = or_1;
																								}
																								catch (Exception e) {
																									CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
																								}
																								final /*@Thrown*/ Boolean or_2;
																								if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
																									or_2 = ValueUtil.TRUE_VALUE;
																								}
																								else {
																									final /*@NonInvalid*/ boolean eq_5 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_52);
																									if (eq_5) {
																										or_2 = ValueUtil.TRUE_VALUE;
																									}
																									else {
																										if (CAUGHT_or_1 instanceof InvalidValueException) {
																											throw (InvalidValueException)CAUGHT_or_1;
																										}
																										if (CAUGHT_or_1 == null) {
																											or_2 = null;
																										}
																										else {
																											or_2 = ValueUtil.FALSE_VALUE;
																										}
																									}
																								}
																								CAUGHT_or_2 = or_2;
																							}
																							catch (Exception e) {
																								CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
																							}
																							final /*@Thrown*/ Boolean or_3;
																							if (CAUGHT_or_2 == ValueUtil.TRUE_VALUE) {
																								or_3 = ValueUtil.TRUE_VALUE;
																							}
																							else {
																								final /*@NonInvalid*/ boolean eq_6 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_56);
																								if (eq_6) {
																									or_3 = ValueUtil.TRUE_VALUE;
																								}
																								else {
																									if (CAUGHT_or_2 instanceof InvalidValueException) {
																										throw (InvalidValueException)CAUGHT_or_2;
																									}
																									if (CAUGHT_or_2 == null) {
																										or_3 = null;
																									}
																									else {
																										or_3 = ValueUtil.FALSE_VALUE;
																									}
																								}
																							}
																							CAUGHT_or_3 = or_3;
																						}
																						catch (Exception e) {
																							CAUGHT_or_3 = ValueUtil.createInvalidValue(e);
																						}
																						final /*@Thrown*/ Boolean or_4;
																						if (CAUGHT_or_3 == ValueUtil.TRUE_VALUE) {
																							or_4 = ValueUtil.TRUE_VALUE;
																						}
																						else {
																							final /*@NonInvalid*/ boolean eq_7 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_60);
																							if (eq_7) {
																								or_4 = ValueUtil.TRUE_VALUE;
																							}
																							else {
																								if (CAUGHT_or_3 instanceof InvalidValueException) {
																									throw (InvalidValueException)CAUGHT_or_3;
																								}
																								if (CAUGHT_or_3 == null) {
																									or_4 = null;
																								}
																								else {
																									or_4 = ValueUtil.FALSE_VALUE;
																								}
																							}
																						}
																						CAUGHT_or_4 = or_4;
																					}
																					catch (Exception e) {
																						CAUGHT_or_4 = ValueUtil.createInvalidValue(e);
																					}
																					final /*@Thrown*/ Boolean or_5;
																					if (CAUGHT_or_4 == ValueUtil.TRUE_VALUE) {
																						or_5 = ValueUtil.TRUE_VALUE;
																					}
																					else {
																						final /*@NonInvalid*/ boolean eq_8 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_64);
																						if (eq_8) {
																							or_5 = ValueUtil.TRUE_VALUE;
																						}
																						else {
																							if (CAUGHT_or_4 instanceof InvalidValueException) {
																								throw (InvalidValueException)CAUGHT_or_4;
																							}
																							if (CAUGHT_or_4 == null) {
																								or_5 = null;
																							}
																							else {
																								or_5 = ValueUtil.FALSE_VALUE;
																							}
																						}
																					}
																					CAUGHT_or_5 = or_5;
																				}
																				catch (Exception e) {
																					CAUGHT_or_5 = ValueUtil.createInvalidValue(e);
																				}
																				final /*@Thrown*/ Boolean or_6;
																				if (CAUGHT_or_5 == ValueUtil.TRUE_VALUE) {
																					or_6 = ValueUtil.TRUE_VALUE;
																				}
																				else {
																					final /*@NonInvalid*/ boolean eq_9 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_100);
																					if (eq_9) {
																						or_6 = ValueUtil.TRUE_VALUE;
																					}
																					else {
																						if (CAUGHT_or_5 instanceof InvalidValueException) {
																							throw (InvalidValueException)CAUGHT_or_5;
																						}
																						if (CAUGHT_or_5 == null) {
																							or_6 = null;
																						}
																						else {
																							or_6 = ValueUtil.FALSE_VALUE;
																						}
																					}
																				}
																				CAUGHT_or_6 = or_6;
																			}
																			catch (Exception e) {
																				CAUGHT_or_6 = ValueUtil.createInvalidValue(e);
																			}
																			final /*@Thrown*/ Boolean or_7;
																			if (CAUGHT_or_6 == ValueUtil.TRUE_VALUE) {
																				or_7 = ValueUtil.TRUE_VALUE;
																			}
																			else {
																				final /*@NonInvalid*/ boolean eq_10 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_104);
																				if (eq_10) {
																					or_7 = ValueUtil.TRUE_VALUE;
																				}
																				else {
																					if (CAUGHT_or_6 instanceof InvalidValueException) {
																						throw (InvalidValueException)CAUGHT_or_6;
																					}
																					if (CAUGHT_or_6 == null) {
																						or_7 = null;
																					}
																					else {
																						or_7 = ValueUtil.FALSE_VALUE;
																					}
																				}
																			}
																			CAUGHT_or_7 = or_7;
																		}
																		catch (Exception e) {
																			CAUGHT_or_7 = ValueUtil.createInvalidValue(e);
																		}
																		final /*@Thrown*/ Boolean or_8;
																		if (CAUGHT_or_7 == ValueUtil.TRUE_VALUE) {
																			or_8 = ValueUtil.TRUE_VALUE;
																		}
																		else {
																			final /*@NonInvalid*/ boolean eq_11 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_108);
																			if (eq_11) {
																				or_8 = ValueUtil.TRUE_VALUE;
																			}
																			else {
																				if (CAUGHT_or_7 instanceof InvalidValueException) {
																					throw (InvalidValueException)CAUGHT_or_7;
																				}
																				if (CAUGHT_or_7 == null) {
																					or_8 = null;
																				}
																				else {
																					or_8 = ValueUtil.FALSE_VALUE;
																				}
																			}
																		}
																		CAUGHT_or_8 = or_8;
																	}
																	catch (Exception e) {
																		CAUGHT_or_8 = ValueUtil.createInvalidValue(e);
																	}
																	final /*@Thrown*/ Boolean or_9;
																	if (CAUGHT_or_8 == ValueUtil.TRUE_VALUE) {
																		or_9 = ValueUtil.TRUE_VALUE;
																	}
																	else {
																		final /*@NonInvalid*/ boolean eq_12 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_112);
																		if (eq_12) {
																			or_9 = ValueUtil.TRUE_VALUE;
																		}
																		else {
																			if (CAUGHT_or_8 instanceof InvalidValueException) {
																				throw (InvalidValueException)CAUGHT_or_8;
																			}
																			if (CAUGHT_or_8 == null) {
																				or_9 = null;
																			}
																			else {
																				or_9 = ValueUtil.FALSE_VALUE;
																			}
																		}
																	}
																	CAUGHT_or_9 = or_9;
																}
																catch (Exception e) {
																	CAUGHT_or_9 = ValueUtil.createInvalidValue(e);
																}
																final /*@Thrown*/ Boolean or_10;
																if (CAUGHT_or_9 == ValueUtil.TRUE_VALUE) {
																	or_10 = ValueUtil.TRUE_VALUE;
																}
																else {
																	final /*@NonInvalid*/ boolean eq_13 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_116);
																	if (eq_13) {
																		or_10 = ValueUtil.TRUE_VALUE;
																	}
																	else {
																		if (CAUGHT_or_9 instanceof InvalidValueException) {
																			throw (InvalidValueException)CAUGHT_or_9;
																		}
																		if (CAUGHT_or_9 == null) {
																			or_10 = null;
																		}
																		else {
																			or_10 = ValueUtil.FALSE_VALUE;
																		}
																	}
																}
																CAUGHT_or_10 = or_10;
															}
															catch (Exception e) {
																CAUGHT_or_10 = ValueUtil.createInvalidValue(e);
															}
															final /*@Thrown*/ Boolean or_11;
															if (CAUGHT_or_10 == ValueUtil.TRUE_VALUE) {
																or_11 = ValueUtil.TRUE_VALUE;
															}
															else {
																final /*@NonInvalid*/ boolean eq_14 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_120);
																if (eq_14) {
																	or_11 = ValueUtil.TRUE_VALUE;
																}
																else {
																	if (CAUGHT_or_10 instanceof InvalidValueException) {
																		throw (InvalidValueException)CAUGHT_or_10;
																	}
																	if (CAUGHT_or_10 == null) {
																		or_11 = null;
																	}
																	else {
																		or_11 = ValueUtil.FALSE_VALUE;
																	}
																}
															}
															CAUGHT_or_11 = or_11;
														}
														catch (Exception e) {
															CAUGHT_or_11 = ValueUtil.createInvalidValue(e);
														}
														final /*@Thrown*/ Boolean or_12;
														if (CAUGHT_or_11 == ValueUtil.TRUE_VALUE) {
															or_12 = ValueUtil.TRUE_VALUE;
														}
														else {
															final /*@NonInvalid*/ boolean eq_15 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_124);
															if (eq_15) {
																or_12 = ValueUtil.TRUE_VALUE;
															}
															else {
																if (CAUGHT_or_11 instanceof InvalidValueException) {
																	throw (InvalidValueException)CAUGHT_or_11;
																}
																if (CAUGHT_or_11 == null) {
																	or_12 = null;
																}
																else {
																	or_12 = ValueUtil.FALSE_VALUE;
																}
															}
														}
														CAUGHT_or_12 = or_12;
													}
													catch (Exception e) {
														CAUGHT_or_12 = ValueUtil.createInvalidValue(e);
													}
													final /*@Thrown*/ Boolean or_13;
													if (CAUGHT_or_12 == ValueUtil.TRUE_VALUE) {
														or_13 = ValueUtil.TRUE_VALUE;
													}
													else {
														final /*@NonInvalid*/ boolean eq_16 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_128);
														if (eq_16) {
															or_13 = ValueUtil.TRUE_VALUE;
														}
														else {
															if (CAUGHT_or_12 instanceof InvalidValueException) {
																throw (InvalidValueException)CAUGHT_or_12;
															}
															if (CAUGHT_or_12 == null) {
																or_13 = null;
															}
															else {
																or_13 = ValueUtil.FALSE_VALUE;
															}
														}
													}
													CAUGHT_or_13 = or_13;
												}
												catch (Exception e) {
													CAUGHT_or_13 = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean or_14;
												if (CAUGHT_or_13 == ValueUtil.TRUE_VALUE) {
													or_14 = ValueUtil.TRUE_VALUE;
												}
												else {
													final /*@NonInvalid*/ boolean eq_17 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_132);
													if (eq_17) {
														or_14 = ValueUtil.TRUE_VALUE;
													}
													else {
														if (CAUGHT_or_13 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_or_13;
														}
														if (CAUGHT_or_13 == null) {
															or_14 = null;
														}
														else {
															or_14 = ValueUtil.FALSE_VALUE;
														}
													}
												}
												CAUGHT_or_14 = or_14;
											}
											catch (Exception e) {
												CAUGHT_or_14 = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean or_15;
											if (CAUGHT_or_14 == ValueUtil.TRUE_VALUE) {
												or_15 = ValueUtil.TRUE_VALUE;
											}
											else {
												final /*@NonInvalid*/ boolean eq_18 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_136);
												if (eq_18) {
													or_15 = ValueUtil.TRUE_VALUE;
												}
												else {
													if (CAUGHT_or_14 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_or_14;
													}
													if (CAUGHT_or_14 == null) {
														or_15 = null;
													}
													else {
														or_15 = ValueUtil.FALSE_VALUE;
													}
												}
											}
											CAUGHT_or_15 = or_15;
										}
										catch (Exception e) {
											CAUGHT_or_15 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or_16;
										if (CAUGHT_or_15 == ValueUtil.TRUE_VALUE) {
											or_16 = ValueUtil.TRUE_VALUE;
										}
										else {
											final /*@NonInvalid*/ boolean eq_19 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_140);
											if (eq_19) {
												or_16 = ValueUtil.TRUE_VALUE;
											}
											else {
												if (CAUGHT_or_15 instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_or_15;
												}
												if (CAUGHT_or_15 == null) {
													or_16 = null;
												}
												else {
													or_16 = ValueUtil.FALSE_VALUE;
												}
											}
										}
										CAUGHT_or_16 = or_16;
									}
									catch (Exception e) {
										CAUGHT_or_16 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_17;
									if (CAUGHT_or_16 == ValueUtil.TRUE_VALUE) {
										or_17 = ValueUtil.TRUE_VALUE;
									}
									else {
										final /*@NonInvalid*/ boolean eq_20 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_144);
										if (eq_20) {
											or_17 = ValueUtil.TRUE_VALUE;
										}
										else {
											if (CAUGHT_or_16 instanceof InvalidValueException) {
												throw (InvalidValueException)CAUGHT_or_16;
											}
											if (CAUGHT_or_16 == null) {
												or_17 = null;
											}
											else {
												or_17 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or_17 = or_17;
								}
								catch (Exception e) {
									CAUGHT_or_17 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or_18;
								if (CAUGHT_or_17 == ValueUtil.TRUE_VALUE) {
									or_18 = ValueUtil.TRUE_VALUE;
								}
								else {
									final /*@NonInvalid*/ boolean eq_21 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_149);
									if (eq_21) {
										or_18 = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_or_17 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_or_17;
										}
										if (CAUGHT_or_17 == null) {
											or_18 = null;
										}
										else {
											or_18 = ValueUtil.FALSE_VALUE;
										}
									}
								}
								CAUGHT_or_18 = or_18;
							}
							catch (Exception e) {
								CAUGHT_or_18 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or_19;
							if (CAUGHT_or_18 == ValueUtil.TRUE_VALUE) {
								or_19 = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean eq_22 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_153);
								if (eq_22) {
									or_19 = ValueUtil.TRUE_VALUE;
								}
								else {
									if (CAUGHT_or_18 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_or_18;
									}
									if (CAUGHT_or_18 == null) {
										or_19 = null;
									}
									else {
										or_19 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_19 = or_19;
						}
						catch (Exception e) {
							CAUGHT_or_19 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_20;
						if (CAUGHT_or_19 == ValueUtil.TRUE_VALUE) {
							or_20 = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_23 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_157);
							if (eq_23) {
								or_20 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_or_19 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_or_19;
								}
								if (CAUGHT_or_19 == null) {
									or_20 = null;
								}
								else {
									or_20 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_20 = or_20;
					}
					catch (Exception e) {
						CAUGHT_or_20 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or_21;
					if (CAUGHT_or_20 == ValueUtil.TRUE_VALUE) {
						or_21 = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_24 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_161);
						if (eq_24) {
							or_21 = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_or_20 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_or_20;
							}
							if (CAUGHT_or_20 == null) {
								or_21 = null;
							}
							else {
								or_21 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_or_21 = or_21;
				}
				catch (Exception e) {
					CAUGHT_or_21 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or_22;
				if (CAUGHT_or_21 == ValueUtil.TRUE_VALUE) {
					or_22 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean eq_25 = BOXED_channel_25.equals(NetworkArchitectureTables.INT_165);
					if (eq_25) {
						or_22 = ValueUtil.TRUE_VALUE;
					}
					else {
						if (CAUGHT_or_21 instanceof InvalidValueException) {
							throw (InvalidValueException)CAUGHT_or_21;
						}
						if (CAUGHT_or_21 == null) {
							or_22 = null;
						}
						else {
							or_22 = ValueUtil.FALSE_VALUE;
						}
					}
				}
				IF_eq_0 = or_22;
			}
			else {
				IF_eq_0 = ValueUtil.TRUE_VALUE;
			}
			IF_eq = IF_eq_0;
		}
		return IF_eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidChannelForFrequency(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Wifi::ValidChannelForFrequency";
		try {
			/**
			 *
			 * inv ValidChannelForFrequency:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.isValidChannelForFrequency()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.WIFI___VALID_CHANNEL_FOR_FREQUENCY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ boolean result = this.isValidChannelForFrequency();
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
			case NetworkArchitecturePackage.WIFI__NAME:
				return getName();
			case NetworkArchitecturePackage.WIFI__SSID:
				return getSsid();
			case NetworkArchitecturePackage.WIFI__FREQUENCY:
				return getFrequency();
			case NetworkArchitecturePackage.WIFI__CHANNEL:
				return getChannel();
			case NetworkArchitecturePackage.WIFI__AUTHENTICATION:
				return getAuthentication();
			case NetworkArchitecturePackage.WIFI__ENCRYPTION:
				return getEncryption();
			case NetworkArchitecturePackage.WIFI__VLAN:
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
			case NetworkArchitecturePackage.WIFI__NAME:
				setName((String)newValue);
				return;
			case NetworkArchitecturePackage.WIFI__SSID:
				setSsid((String)newValue);
				return;
			case NetworkArchitecturePackage.WIFI__FREQUENCY:
				setFrequency((OperatingFrequency)newValue);
				return;
			case NetworkArchitecturePackage.WIFI__CHANNEL:
				setChannel((Integer)newValue);
				return;
			case NetworkArchitecturePackage.WIFI__AUTHENTICATION:
				setAuthentication((AuthenticationWifi)newValue);
				return;
			case NetworkArchitecturePackage.WIFI__ENCRYPTION:
				setEncryption((EncryptionModeWifi)newValue);
				return;
			case NetworkArchitecturePackage.WIFI__VLAN:
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
			case NetworkArchitecturePackage.WIFI__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkArchitecturePackage.WIFI__SSID:
				setSsid(SSID_EDEFAULT);
				return;
			case NetworkArchitecturePackage.WIFI__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case NetworkArchitecturePackage.WIFI__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case NetworkArchitecturePackage.WIFI__AUTHENTICATION:
				setAuthentication(AUTHENTICATION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.WIFI__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.WIFI__VLAN:
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
			case NetworkArchitecturePackage.WIFI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkArchitecturePackage.WIFI__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case NetworkArchitecturePackage.WIFI__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case NetworkArchitecturePackage.WIFI__CHANNEL:
				return channel != CHANNEL_EDEFAULT;
			case NetworkArchitecturePackage.WIFI__AUTHENTICATION:
				return authentication != AUTHENTICATION_EDEFAULT;
			case NetworkArchitecturePackage.WIFI__ENCRYPTION:
				return encryption != ENCRYPTION_EDEFAULT;
			case NetworkArchitecturePackage.WIFI__VLAN:
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
				case NetworkArchitecturePackage.WIFI__NAME: return NetworkArchitecturePackage.NAMED_ELEMENT__NAME;
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
				case NetworkArchitecturePackage.NAMED_ELEMENT__NAME: return NetworkArchitecturePackage.WIFI__NAME;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NetworkArchitecturePackage.WIFI___IS_VALID_CHANNEL_FOR_FREQUENCY:
				return isValidChannelForFrequency();
			case NetworkArchitecturePackage.WIFI___VALID_CHANNEL_FOR_FREQUENCY__DIAGNOSTICCHAIN_MAP:
				return ValidChannelForFrequency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", ssid: ");
		result.append(ssid);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", channel: ");
		result.append(channel);
		result.append(", authentication: ");
		result.append(authentication);
		result.append(", encryption: ");
		result.append(encryption);
		result.append(')');
		return result.toString();
	}

} //WifiImpl
