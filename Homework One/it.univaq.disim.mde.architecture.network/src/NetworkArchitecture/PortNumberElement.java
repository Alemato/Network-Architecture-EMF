/**
 */
package NetworkArchitecture;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Number Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.PortNumberElement#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getPortNumberElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidLanPortNumber'"
 * @generated
 */
public interface PortNumberElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(int)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getPortNumberElement_PortNumber()
	 * @model required="true"
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.PortNumberElement#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t            portNumber &gt;= 1 and portNumber &lt;= 48'"
	 * @generated
	 */
	boolean isValidLanPortNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        \tself.isValidLanPortNumber()'"
	 * @generated
	 */
	boolean ValidLanPortNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PortNumberElement
