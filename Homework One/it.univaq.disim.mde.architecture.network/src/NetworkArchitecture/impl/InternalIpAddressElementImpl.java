/**
 */
package NetworkArchitecture.impl;

import NetworkArchitecture.InternalIpAddressElement;
import NetworkArchitecture.NetworkArchitecturePackage;

import NetworkArchitecture.NetworkArchitectureTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 * An implementation of the model object '<em><b>Internal Ip Address Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.impl.InternalIpAddressElementImpl#getInternalIpAddress <em>Internal Ip Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InternalIpAddressElementImpl extends MinimalEObjectImpl.Container implements InternalIpAddressElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalIpAddressElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkArchitecturePackage.Literals.INTERNAL_IP_ADDRESS_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS, oldInternalIpAddress, internalIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidInternalIpAddress(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "InternalIpAddressElement::ValidInternalIpAddress";
		try {
			/**
			 *
			 * inv ValidInternalIpAddress:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = internalIpAddress.matches('^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.' + '(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NetworkArchitecturePackage.Literals.INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NetworkArchitectureTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ String internalIpAddress = this.getInternalIpAddress();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(NetworkArchitectureTables.STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, NetworkArchitectureTables.STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$);
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, internalIpAddress, sum_1).booleanValue();
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
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS:
				return getInternalIpAddress();
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
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS:
				setInternalIpAddress((String)newValue);
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
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS:
				setInternalIpAddress(INTERNAL_IP_ADDRESS_EDEFAULT);
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
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS:
				return INTERNAL_IP_ADDRESS_EDEFAULT == null ? internalIpAddress != null : !INTERNAL_IP_ADDRESS_EDEFAULT.equals(internalIpAddress);
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
			case NetworkArchitecturePackage.INTERNAL_IP_ADDRESS_ELEMENT___VALID_INTERNAL_IP_ADDRESS__DIAGNOSTICCHAIN_MAP:
				return ValidInternalIpAddress((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (internalIpAddress: ");
		result.append(internalIpAddress);
		result.append(')');
		return result.toString();
	}

} //InternalIpAddressElementImpl
