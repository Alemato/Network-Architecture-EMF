/**
 */
package NetworkArchitecture.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>NetworkArchitecture</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkArchitectureTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new NetworkArchitectureTests("NetworkArchitecture Tests");
		suite.addTestSuite(NetworkTest.class);
		suite.addTestSuite(GatewayTest.class);
		suite.addTestSuite(RouterTest.class);
		suite.addTestSuite(SwitchL3Test.class);
		suite.addTestSuite(AcccessPointTest.class);
		suite.addTestSuite(WifiTest.class);
		suite.addTestSuite(SwitchL2Test.class);
		suite.addTestSuite(VLANTest.class);
		suite.addTestSuite(StaticRouteTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkArchitectureTests(String name) {
		super(name);
	}

} //NetworkArchitectureTests
