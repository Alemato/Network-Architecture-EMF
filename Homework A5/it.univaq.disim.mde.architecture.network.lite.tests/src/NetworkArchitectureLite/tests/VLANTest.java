/**
 */
package NetworkArchitectureLite.tests;

import NetworkArchitectureLite.NetworkArchitectureLiteFactory;
import NetworkArchitectureLite.VLAN;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VLAN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VLANTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VLANTest.class);
	}

	/**
	 * Constructs a new VLAN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLANTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VLAN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VLAN getFixture() {
		return (VLAN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkArchitectureLiteFactory.eINSTANCE.createVLAN());
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

} //VLANTest
