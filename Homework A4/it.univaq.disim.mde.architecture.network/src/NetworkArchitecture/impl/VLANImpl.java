/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.NetworkArchitectureTables;
import NetworkArchitecture.VLAN;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

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
 * An implementation of the model object '<em><b>VLAN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.VLANImpl#getIdVLan <em>Id VLan</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.VLANImpl#getMtu <em>Mtu</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.VLANImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.VLANImpl#getIpGateway <em>Ip Gateway</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.VLANImpl#getLowerIp <em>Lower Ip</em>}</li>
 *   <li>{@link NetworkArchitecture.impl.VLANImpl#getUpperIp <em>Upper Ip</em>}</li>
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
		return NetworkArchitecturePackage.Literals.VLAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.VLAN__ID_VLAN, oldIdVLan, idVLan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.VLAN__MTU, oldMtu, mtu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.VLAN__SUBNET, oldSubnet, subnet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.VLAN__IP_GATEWAY, oldIpGateway, ipGateway));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.VLAN__LOWER_IP, oldLowerIp, lowerIp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.VLAN__UPPER_IP, oldUpperIp, upperIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidUpperIp(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "VLAN::ValidUpperIp";
		try {
			/**
			 *
			 * inv ValidUpperIp:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = upperIp.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.VLAN___VALID_UPPER_IP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String upperIp = this.getUpperIp();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, upperIp, sum_1).booleanValue();
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
	public boolean ValidLowerIp(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "VLAN::ValidLowerIp";
		try {
			/**
			 *
			 * inv ValidLowerIp:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = lowerIp.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.VLAN___VALID_LOWER_IP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String lowerIp = this.getLowerIp();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, lowerIp, sum_1).booleanValue();
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
	public boolean ValidSubnet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "VLAN::ValidSubnet";
		try {
			/**
			 *
			 * inv ValidSubnet:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = subnet.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.VLAN___VALID_SUBNET__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String subnet = this.getSubnet();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, subnet, sum_1).booleanValue();
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
	public boolean ValidIpGateway(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "VLAN::ValidIpGateway";
		try {
			/**
			 *
			 * inv ValidIpGateway:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = ipGateway.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.VLAN___VALID_IP_GATEWAY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String ipGateway = this.getIpGateway();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ipGateway, sum_1).booleanValue();
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
			case NetworkArchitecturePackage.VLAN__ID_VLAN:
				return getIdVLan();
			case NetworkArchitecturePackage.VLAN__MTU:
				return getMtu();
			case NetworkArchitecturePackage.VLAN__SUBNET:
				return getSubnet();
			case NetworkArchitecturePackage.VLAN__IP_GATEWAY:
				return getIpGateway();
			case NetworkArchitecturePackage.VLAN__LOWER_IP:
				return getLowerIp();
			case NetworkArchitecturePackage.VLAN__UPPER_IP:
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
			case NetworkArchitecturePackage.VLAN__ID_VLAN:
				setIdVLan((Integer)newValue);
				return;
			case NetworkArchitecturePackage.VLAN__MTU:
				setMtu((Integer)newValue);
				return;
			case NetworkArchitecturePackage.VLAN__SUBNET:
				setSubnet((String)newValue);
				return;
			case NetworkArchitecturePackage.VLAN__IP_GATEWAY:
				setIpGateway((String)newValue);
				return;
			case NetworkArchitecturePackage.VLAN__LOWER_IP:
				setLowerIp((String)newValue);
				return;
			case NetworkArchitecturePackage.VLAN__UPPER_IP:
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
			case NetworkArchitecturePackage.VLAN__ID_VLAN:
				setIdVLan(ID_VLAN_EDEFAULT);
				return;
			case NetworkArchitecturePackage.VLAN__MTU:
				setMtu(MTU_EDEFAULT);
				return;
			case NetworkArchitecturePackage.VLAN__SUBNET:
				setSubnet(SUBNET_EDEFAULT);
				return;
			case NetworkArchitecturePackage.VLAN__IP_GATEWAY:
				setIpGateway(IP_GATEWAY_EDEFAULT);
				return;
			case NetworkArchitecturePackage.VLAN__LOWER_IP:
				setLowerIp(LOWER_IP_EDEFAULT);
				return;
			case NetworkArchitecturePackage.VLAN__UPPER_IP:
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
			case NetworkArchitecturePackage.VLAN__ID_VLAN:
				return idVLan != ID_VLAN_EDEFAULT;
			case NetworkArchitecturePackage.VLAN__MTU:
				return mtu != MTU_EDEFAULT;
			case NetworkArchitecturePackage.VLAN__SUBNET:
				return SUBNET_EDEFAULT == null ? subnet != null : !SUBNET_EDEFAULT.equals(subnet);
			case NetworkArchitecturePackage.VLAN__IP_GATEWAY:
				return IP_GATEWAY_EDEFAULT == null ? ipGateway != null : !IP_GATEWAY_EDEFAULT.equals(ipGateway);
			case NetworkArchitecturePackage.VLAN__LOWER_IP:
				return LOWER_IP_EDEFAULT == null ? lowerIp != null : !LOWER_IP_EDEFAULT.equals(lowerIp);
			case NetworkArchitecturePackage.VLAN__UPPER_IP:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NetworkArchitecturePackage.VLAN___VALID_UPPER_IP__DIAGNOSTICCHAIN_MAP:
				return ValidUpperIp((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.VLAN___VALID_LOWER_IP__DIAGNOSTICCHAIN_MAP:
				return ValidLowerIp((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.VLAN___VALID_SUBNET__DIAGNOSTICCHAIN_MAP:
				return ValidSubnet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NetworkArchitecturePackage.VLAN___VALID_IP_GATEWAY__DIAGNOSTICCHAIN_MAP:
				return ValidIpGateway((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
