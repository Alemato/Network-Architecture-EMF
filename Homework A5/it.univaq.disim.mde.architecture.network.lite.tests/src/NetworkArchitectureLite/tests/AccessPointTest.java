/**
 */
package NetworkArchitectureLite.tests;

import NetworkArchitectureLite.AccessPoint;
import NetworkArchitectureLite.NetworkArchitectureLiteFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessPointTest extends NetworkDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccessPointTest.class);
	}

	/**
	 * Constructs a new Access Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Access Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AccessPoint getFixture() {
		return (AccessPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkArchitectureLiteFactory.eINSTANCE.createAccessPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AccessPointTest
