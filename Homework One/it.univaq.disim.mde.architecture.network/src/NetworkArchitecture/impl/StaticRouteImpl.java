/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.StaticRoute;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.StaticRouteImpl#getNetworkDestination <em>Network Destination</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.StaticRouteImpl#getNetmask <em>Netmask</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.StaticRouteImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.StaticRouteImpl#getNetInterface <em>Net Interface</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.StaticRouteImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticRouteImpl extends NamedElementImpl implements StaticRoute {
	/**
	 * The default value of the '{@link #getNetworkDestination() <em>Network Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkDestination() <em>Network Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDestination()
	 * @generated
	 * @ordered
	 */
	protected String networkDestination = NETWORK_DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetmask() <em>Netmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetmask()
	 * @generated
	 * @ordered
	 */
	protected static final String NETMASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetmask() <em>Netmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetmask()
	 * @generated
	 * @ordered
	 */
	protected String netmask = NETMASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetInterface() <em>Net Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetInterface() <em>Net Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetInterface()
	 * @generated
	 * @ordered
	 */
	protected String netInterface = NET_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final int METRIC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected int metric = METRIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitecturePackage.Literals.STATIC_ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkDestination() {
		return networkDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkDestination(String newNetworkDestination) {
		String oldNetworkDestination = networkDestination;
		networkDestination = newNetworkDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.STATIC_ROUTE__NETWORK_DESTINATION, oldNetworkDestination, networkDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetmask() {
		return netmask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetmask(String newNetmask) {
		String oldNetmask = netmask;
		netmask = newNetmask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.STATIC_ROUTE__NETMASK, oldNetmask, netmask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGateway(String newGateway) {
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.STATIC_ROUTE__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetInterface() {
		return netInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetInterface(String newNetInterface) {
		String oldNetInterface = netInterface;
		netInterface = newNetInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.STATIC_ROUTE__NET_INTERFACE, oldNetInterface, netInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(int newMetric) {
		int oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.STATIC_ROUTE__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidNetworkInterface(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StaticRoute::ValidNetworkInterface";
		try {
			/**
			 *
			 * inv ValidNetworkInterface:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = netInterface.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.STATIC_ROUTE___VALID_NETWORK_INTERFACE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String netInterface = this.getNetInterface();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, netInterface, sum_1).booleanValue();
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
	public boolean ValidNetworkDestination(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StaticRoute::ValidNetworkDestination";
		try {
			/**
			 *
			 * inv ValidNetworkDestination:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = networkDestination.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.STATIC_ROUTE___VALID_NETWORK_DESTINATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String networkDestination = this.getNetworkDestination();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, networkDestination, sum_1).booleanValue();
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
	public boolean MetricPositive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StaticRoute::MetricPositive";
		try {
			/**
			 *
			 * inv MetricPositive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = metric > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.STATIC_ROUTE___METRIC_POSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int metric = this.getMetric();
				final /*@NonInvalid*/ IntegerValue BOXED_metric = ValueUtil.integerValueOf(metric);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_metric, NetworkArchitectureTables.INT_0).booleanValue();
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
	public boolean ValidGateway(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StaticRoute::ValidGateway";
		try {
			/**
			 *
			 * inv ValidGateway:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = gateway.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.STATIC_ROUTE___VALID_GATEWAY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String gateway = this.getGateway();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, gateway, sum_1).booleanValue();
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
	public boolean ValidNetmask(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "StaticRoute::ValidNetmask";
		try {
			/**
			 *
			 * inv ValidNetmask:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = netmask.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.STATIC_ROUTE___VALID_NETMASK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String netmask = this.getNetmask();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, netmask, sum_1).booleanValue();
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
			case NetworkArchitecturePackage.STATIC_ROUTE__NETWORK_DESTINATION:
				return getNetworkDestination();
			case NetworkArchitecturePackage.STATIC_ROUTE__NETMASK:
				return getNetmask();
			case NetworkArchitecturePackage.STATIC_ROUTE__GATEWAY:
				return getGateway();
			case NetworkArchitecturePackage.STATIC_ROUTE__NET_INTERFACE:
				return getNetInterface();
			case NetworkArchitecturePackage.STATIC_ROUTE__METRIC:
				return getMetric();
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
			case NetworkArchitecturePackage.STATIC_ROUTE__NETWORK_DESTINATION:
				setNetworkDestination((String)newValue);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__NETMASK:
				setNetmask((String)newValue);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__GATEWAY:
				setGateway((String)newValue);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__NET_INTERFACE:
				setNetInterface((String)newValue);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__METRIC:
				setMetric((Integer)newValue);
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
			case NetworkArchitecturePackage.STATIC_ROUTE__NETWORK_DESTINATION:
				setNetworkDestination(NETWORK_DESTINATION_EDEFAULT);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__NETMASK:
				setNetmask(NETMASK_EDEFAULT);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__GATEWAY:
				setGateway(GATEWAY_EDEFAULT);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__NET_INTERFACE:
				setNetInterface(NET_INTERFACE_EDEFAULT);
				return;
			case NetworkArchitecturePackage.STATIC_ROUTE__METRIC:
				setMetric(METRIC_EDEFAULT);
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
			case NetworkArchitecturePackage.STATIC_ROUTE__NETWORK_DESTINATION:
				return NETWORK_DESTINATION_EDEFAULT == null ? networkDestination != null : !NETWORK_DESTINATION_EDEFAULT.equals(networkDestination);
			case NetworkArchitecturePackage.STATIC_ROUTE__NETMASK:
				return NETMASK_EDEFAULT == null ? netmask != null : !NETMASK_EDEFAULT.equals(netmask);
			case NetworkArchitecturePackage.STATIC_ROUTE__GATEWAY:
				return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
			case NetworkArchitecturePackage.STATIC_ROUTE__NET_INTERFACE:
				return NET_INTERFACE_EDEFAULT == null ? netInterface != null : !NET_INTERFACE_EDEFAULT.equals(netInterface);
			case NetworkArchitecturePackage.STATIC_ROUTE__METRIC:
				return metric != METRIC_EDEFAULT;
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
			case NetworkArchitecturePackage.STATIC_ROUTE___VALID_NETWORK_INTERFACE__DIAGNOSTICCHAIN_MAP:
				return ValidNetworkInterface((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.STATIC_ROUTE___VALID_NETWORK_DESTINATION__DIAGNOSTICCHAIN_MAP:
				return ValidNetworkDestination((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.STATIC_ROUTE___METRIC_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return MetricPositive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.STATIC_ROUTE___VALID_GATEWAY__DIAGNOSTICCHAIN_MAP:
				return ValidGateway((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.STATIC_ROUTE___VALID_NETMASK__DIAGNOSTICCHAIN_MAP:
				return ValidNetmask((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (networkDestination: ");
		result.append(networkDestination);
		result.append(", netmask: ");
		result.append(netmask);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(", netInterface: ");
		result.append(netInterface);
		result.append(", metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //StaticRouteImpl
