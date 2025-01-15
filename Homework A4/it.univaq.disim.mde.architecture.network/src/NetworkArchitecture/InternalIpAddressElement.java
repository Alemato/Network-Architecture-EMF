/**
 */
package NetworkArchitecture;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Ip Address Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.InternalIpAddressElement#getInternalIpAddress <em>Internal Ip Address</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getInternalIpAddressElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidInternalIpAddress'"
 * @generated
 */
public interface InternalIpAddressElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Ip Address</em>' attribute.
	 * @see #setInternalIpAddress(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getInternalIpAddressElement_InternalIpAddress()
	 * @model required="true"
	 * @generated
	 */
	String getInternalIpAddress();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.InternalIpAddressElement#getInternalIpAddress <em>Internal Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Ip Address</em>' attribute.
	 * @see #getInternalIpAddress()
	 * @generated
	 */
	void setInternalIpAddress(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t    internalIpAddress.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')'"
	 * @generated
	 */
	boolean ValidInternalIpAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InternalIpAddressElement
