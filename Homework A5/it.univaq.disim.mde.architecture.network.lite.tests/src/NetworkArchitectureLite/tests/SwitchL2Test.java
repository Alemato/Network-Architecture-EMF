/**
 */
package NetworkArchitectureLite.tests;

import NetworkArchitectureLite.NetworkArchitectureLiteFactory;
import NetworkArchitectureLite.SwitchL2;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch L2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchL2Test extends NetworkDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwitchL2Test.class);
	}

	/**
	 * Constructs a new Switch L2 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchL2Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Switch L2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SwitchL2 getFixture() {
		return (SwitchL2)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkArchitectureLiteFactory.eINSTANCE.createSwitchL2());
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

} //SwitchL2Test
