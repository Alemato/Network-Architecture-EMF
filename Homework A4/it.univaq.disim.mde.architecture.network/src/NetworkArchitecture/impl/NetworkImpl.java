/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.AccessPoint;
import NetworkArchitecture.Gateway;
import NetworkArchitecture.Network;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.Router;
import NetworkArchitecture.SwitchL2;
import NetworkArchitecture.SwitchL3;
import NetworkArchitecture.VLAN;
import NetworkArchitecture.Wifi;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.NetworkImpl#getPublicIpAddres <em>Public Ip Addres</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.NetworkImpl#getVlans <em>Vlans</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.NetworkImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.NetworkImpl#getWifis <em>Wifis</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.NetworkImpl#getNetworkDevicesCount <em>Network Devices Count</em>}</li>
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
	 * The default value of the '{@link #getNetworkDevicesCount() <em>Network Devices Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDevicesCount()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORK_DEVICES_COUNT_EDEFAULT = 0;

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
		return NetworkArchitecturePackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.NETWORK__PUBLIC_IP_ADDRES, oldPublicIpAddres, publicIpAddres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VLAN> getVlans() {
		if (vlans == null) {
			vlans = new EObjectContainmentEList<VLAN>(VLAN.class, this, NetworkArchitecturePackage.NETWORK__VLANS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.NETWORK__GATEWAY, oldGateway, newGateway);
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
				msgs = ((InternalEObject)gateway).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkArchitecturePackage.NETWORK__GATEWAY, null, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkArchitecturePackage.NETWORK__GATEWAY, null, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.NETWORK__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wifi> getWifis() {
		if (wifis == null) {
			wifis = new EObjectContainmentEList<Wifi>(Wifi.class, this, NetworkArchitecturePackage.NETWORK__WIFIS);
		}
		return wifis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNetworkDevicesCount() {
		/**
		 *
		 * let
		 *   gatewayCount : Integer[1] = if gateway.oclIsUndefined()
		 *   then 0
		 *   else 1
		 *   endif
		 * in
		 *   let
		 *     routerCount : Integer[1] = if gateway.oclIsUndefined()
		 *     then 0
		 *     else if gateway.router.oclIsUndefined() then 0 else 1 endif
		 *     endif
		 *   in
		 *     let
		 *       switchL3Count : Integer[1] = if
		 *         gateway.oclIsUndefined() or
		 *         gateway.router.oclIsUndefined()
		 *       then 0
		 *       else gateway.router.switchL3->size()
		 *       endif
		 *     in
		 *       let
		 *         switchL2Count : Integer[1] = if
		 *           gateway.oclIsUndefined() or
		 *           gateway.router.oclIsUndefined()
		 *         then 0
		 *         else
		 *           gateway.router.switchL3->collect(switchL3 |
		 *             switchL3.switchL2->size())
		 *           ->sum()
		 *         endif
		 *       in
		 *         let
		 *           accessPointCount : Integer[1] = if
		 *             gateway.oclIsUndefined() or
		 *             gateway.router.oclIsUndefined()
		 *           then 0
		 *           else
		 *             gateway.router.switchL3->collect(switchL3 |
		 *               switchL3.accessPoints->size())
		 *             ->sum()
		 *           endif
		 *         in gatewayCount + routerCount + switchL3Count + switchL2Count + accessPointCount
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ Boolean or = ValueUtil.FALSE_VALUE;
		if (or == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ IntegerValue switchL3Count;
		if (or) {
			switchL3Count = NetworkArchitectureTables.INT_0;
		}
		else {
			final /*@NonInvalid*/ Gateway gateway = this.getGateway();
			final /*@NonInvalid*/ Router router = gateway.getRouter();
			final /*@NonInvalid*/ List<SwitchL3> switchL3 = router.getSwitchL3();
			final /*@NonInvalid*/ OrderedSetValue BOXED_switchL3 = idResolver.createOrderedSetOfAll(NetworkArchitectureTables.ORD_CLSSid_SwitchL3, switchL3);
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_switchL3);
			switchL3Count = size;
		}
		/*@NonInvalid*/ IntegerValue switchL2Count;
		if (or) {
			switchL2Count = NetworkArchitectureTables.INT_0;
		}
		else {
			final /*@NonInvalid*/ Gateway gateway_0 = this.getGateway();
			final /*@NonInvalid*/ Router router_0 = gateway_0.getRouter();
			final /*@NonInvalid*/ List<SwitchL3> switchL3_0 = router_0.getSwitchL3();
			final /*@NonInvalid*/ OrderedSetValue BOXED_switchL3_0 = idResolver.createOrderedSetOfAll(NetworkArchitectureTables.ORD_CLSSid_SwitchL3, switchL3_0);
			/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(NetworkArchitectureTables.SEQ_PRIMid_Integer);
			Iterator<Object> ITERATOR_switchL3_1 = BOXED_switchL3_0.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR_switchL3_1.hasNext()) {
					collect = accumulator;
					break;
				}
				/*@NonInvalid*/ SwitchL3 switchL3_1 = (SwitchL3)ITERATOR_switchL3_1.next();
				/**
				 * switchL3.switchL2->size()
				 */
				final /*@NonInvalid*/ List<SwitchL2> switchL2 = switchL3_1.getSwitchL2();
				final /*@NonInvalid*/ OrderedSetValue BOXED_switchL2 = idResolver.createOrderedSetOfAll(NetworkArchitectureTables.ORD_CLSSid_SwitchL2, switchL2);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_switchL2);
				//
				accumulator.add(size_0);
			}
			final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, TypeId.INTEGER, collect);
			switchL2Count = sum;
		}
		/*@NonInvalid*/ IntegerValue accessPointCount;
		if (or) {
			accessPointCount = NetworkArchitectureTables.INT_0;
		}
		else {
			final /*@NonInvalid*/ Gateway gateway_1 = this.getGateway();
			final /*@NonInvalid*/ Router router_1 = gateway_1.getRouter();
			final /*@NonInvalid*/ List<SwitchL3> switchL3_2 = router_1.getSwitchL3();
			final /*@NonInvalid*/ OrderedSetValue BOXED_switchL3_2 = idResolver.createOrderedSetOfAll(NetworkArchitectureTables.ORD_CLSSid_SwitchL3, switchL3_2);
			/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(NetworkArchitectureTables.SEQ_PRIMid_Integer);
			Iterator<Object> ITERATOR_switchL3_3 = BOXED_switchL3_2.iterator();
			/*@NonInvalid*/ SequenceValue collect_0;
			while (true) {
				if (!ITERATOR_switchL3_3.hasNext()) {
					collect_0 = accumulator_0;
					break;
				}
				/*@NonInvalid*/ SwitchL3 switchL3_3 = (SwitchL3)ITERATOR_switchL3_3.next();
				/**
				 * switchL3.accessPoints->size()
				 */
				final /*@NonInvalid*/ List<AccessPoint> accessPoints = switchL3_3.getAccessPoints();
				final /*@NonInvalid*/ SetValue BOXED_accessPoints = idResolver.createSetOfAll(NetworkArchitectureTables.SET_CLSSid_AccessPoint, accessPoints);
				final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_accessPoints);
				//
				accumulator_0.add(size_1);
			}
			final /*@NonInvalid*/ IntegerValue sum_0 = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, TypeId.INTEGER, collect_0);
			accessPointCount = sum_0;
		}
		final /*@NonInvalid*/ IntegerValue sum_1 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(NetworkArchitectureTables.INT_1, NetworkArchitectureTables.INT_1);
		final /*@NonInvalid*/ IntegerValue sum_2 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum_1, switchL3Count);
		final /*@NonInvalid*/ IntegerValue sum_3 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum_2, switchL2Count);
		final /*@NonInvalid*/ IntegerValue sum_4 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum_3, accessPointCount);
		final /*@NonInvalid*/ int ECORE_sum_4 = ValueUtil.intValueOf(sum_4);
		return ECORE_sum_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkDevicesCount(int newNetworkDevicesCount) {
		// TODO: implement this method to set the 'Network Devices Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidPublicIpAddres(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Network::ValidPublicIpAddres";
		try {
			/**
			 *
			 * inv ValidPublicIpAddres:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = publicIpAddres.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.NETWORK___VALID_PUBLIC_IP_ADDRES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String publicIpAddres = this.getPublicIpAddres();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, publicIpAddres, sum_1).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkArchitecturePackage.NETWORK__VLANS:
				return ((InternalEList<?>)getVlans()).basicRemove(otherEnd, msgs);
			case NetworkArchitecturePackage.NETWORK__GATEWAY:
				return basicSetGateway(null, msgs);
			case NetworkArchitecturePackage.NETWORK__WIFIS:
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
			case NetworkArchitecturePackage.NETWORK__PUBLIC_IP_ADDRES:
				return getPublicIpAddres();
			case NetworkArchitecturePackage.NETWORK__VLANS:
				return getVlans();
			case NetworkArchitecturePackage.NETWORK__GATEWAY:
				return getGateway();
			case NetworkArchitecturePackage.NETWORK__WIFIS:
				return getWifis();
			case NetworkArchitecturePackage.NETWORK__NETWORK_DEVICES_COUNT:
				return getNetworkDevicesCount();
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
			case NetworkArchitecturePackage.NETWORK__PUBLIC_IP_ADDRES:
				setPublicIpAddres((String)newValue);
				return;
			case NetworkArchitecturePackage.NETWORK__VLANS:
				getVlans().clear();
				getVlans().addAll((Collection<? extends VLAN>)newValue);
				return;
			case NetworkArchitecturePackage.NETWORK__GATEWAY:
				setGateway((Gateway)newValue);
				return;
			case NetworkArchitecturePackage.NETWORK__WIFIS:
				getWifis().clear();
				getWifis().addAll((Collection<? extends Wifi>)newValue);
				return;
			case NetworkArchitecturePackage.NETWORK__NETWORK_DEVICES_COUNT:
				setNetworkDevicesCount((Integer)newValue);
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
			case NetworkArchitecturePackage.NETWORK__PUBLIC_IP_ADDRES:
				setPublicIpAddres(PUBLIC_IP_ADDRES_EDEFAULT);
				return;
			case NetworkArchitecturePackage.NETWORK__VLANS:
				getVlans().clear();
				return;
			case NetworkArchitecturePackage.NETWORK__GATEWAY:
				setGateway((Gateway)null);
				return;
			case NetworkArchitecturePackage.NETWORK__WIFIS:
				getWifis().clear();
				return;
			case NetworkArchitecturePackage.NETWORK__NETWORK_DEVICES_COUNT:
				setNetworkDevicesCount(NETWORK_DEVICES_COUNT_EDEFAULT);
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
			case NetworkArchitecturePackage.NETWORK__PUBLIC_IP_ADDRES:
				return PUBLIC_IP_ADDRES_EDEFAULT == null ? publicIpAddres != null : !PUBLIC_IP_ADDRES_EDEFAULT.equals(publicIpAddres);
			case NetworkArchitecturePackage.NETWORK__VLANS:
				return vlans != null && !vlans.isEmpty();
			case NetworkArchitecturePackage.NETWORK__GATEWAY:
				return gateway != null;
			case NetworkArchitecturePackage.NETWORK__WIFIS:
				return wifis != null && !wifis.isEmpty();
			case NetworkArchitecturePackage.NETWORK__NETWORK_DEVICES_COUNT:
				return getNetworkDevicesCount() != NETWORK_DEVICES_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
			case NetworkArchitecturePackage.NETWORK___VALID_PUBLIC_IP_ADDRES__DIAGNOSTICCHAIN_MAP:
				return ValidPublicIpAddres((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (publicIpAddres: ");
		result.append(publicIpAddres);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
