/**
 */
package NetworkArchitecture;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.StaticRoute#getNetworkDestination <em>Network Destination</em>}</li>
 *   <li>{@link NetworkArchitecture.StaticRoute#getNetmask <em>Netmask</em>}</li>
 *   <li>{@link NetworkArchitecture.StaticRoute#getGateway <em>Gateway</em>}</li>
 *   <li>{@link NetworkArchitecture.StaticRoute#getNetInterface <em>Net Interface</em>}</li>
 *   <li>{@link NetworkArchitecture.StaticRoute#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getStaticRoute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidNetmask'"
 * @generated
 */
public interface StaticRoute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Network Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Destination</em>' attribute.
	 * @see #setNetworkDestination(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getStaticRoute_NetworkDestination()
	 * @model required="true"
	 * @generated
	 */
	String getNetworkDestination();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.StaticRoute#getNetworkDestination <em>Network Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Destination</em>' attribute.
	 * @see #getNetworkDestination()
	 * @generated
	 */
	void setNetworkDestination(String value);

	/**
	 * Returns the value of the '<em><b>Netmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netmask</em>' attribute.
	 * @see #setNetmask(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getStaticRoute_Netmask()
	 * @model required="true"
	 * @generated
	 */
	String getNetmask();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.StaticRoute#getNetmask <em>Netmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netmask</em>' attribute.
	 * @see #getNetmask()
	 * @generated
	 */
	void setNetmask(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getStaticRoute_Gateway()
	 * @model required="true"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.StaticRoute#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Net Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Interface</em>' attribute.
	 * @see #setNetInterface(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getStaticRoute_NetInterface()
	 * @model required="true"
	 * @generated
	 */
	String getNetInterface();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.StaticRoute#getNetInterface <em>Net Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Interface</em>' attribute.
	 * @see #getNetInterface()
	 * @generated
	 */
	void setNetInterface(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(int)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getStaticRoute_Metric()
	 * @model required="true"
	 * @generated
	 */
	int getMetric();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.StaticRoute#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        netInterface.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                          \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')'"
	 * @generated
	 */
	boolean ValidNetworkInterface(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        networkDestination.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                                   \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')'"
	 * @generated
	 */
	boolean ValidNetworkDestination(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        metric &gt; 0'"
	 * @generated
	 */
	boolean MetricPositive(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        gateway.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')'"
	 * @generated
	 */
	boolean ValidGateway(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t        netmask.matches(\'^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\\\.\' +\n\t                        \'(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$\')'"
	 * @generated
	 */
	boolean ValidNetmask(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StaticRoute
