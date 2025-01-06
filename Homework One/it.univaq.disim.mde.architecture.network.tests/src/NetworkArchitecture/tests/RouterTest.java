/**
 */
package NetworkArchitecture.tests;

import NetworkArchitecture.NetworkArchitectureFactory;
import NetworkArchitecture.Router;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link NetworkArchitecture.PortNumberElement#isValidLanPortNumber() <em>Is Valid Lan Port Number</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RouterTest extends InternalIpAddressElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RouterTest.class);
	}

	/**
	 * Constructs a new Router test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Router test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Router getFixture() {
		return (Router)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkArchitectureFactory.eINSTANCE.createRouter());
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

	/**
	 * Tests the '{@link NetworkArchitecture.PortNumberElement#isValidLanPortNumber() <em>Is Valid Lan Port Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NetworkArchitecture.PortNumberElement#isValidLanPortNumber()
	 * @generated
	 */
	public void testIsValidLanPortNumber() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RouterTest
