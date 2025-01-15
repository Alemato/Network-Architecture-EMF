/**
 */
package NetworkArchitectureLite.tests;

import NetworkArchitectureLite.NetworkArchitectureLiteFactory;
import NetworkArchitectureLite.SwitchL3;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch L3</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchL3Test extends NetworkDeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwitchL3Test.class);
	}

	/**
	 * Constructs a new Switch L3 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchL3Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Switch L3 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SwitchL3 getFixture() {
		return (SwitchL3)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkArchitectureLiteFactory.eINSTANCE.createSwitchL3());
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

} //SwitchL3Test
