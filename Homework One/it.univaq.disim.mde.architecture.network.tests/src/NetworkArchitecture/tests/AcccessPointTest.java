/**
 */
package NetworkArchitecture.tests;

import NetworkArchitecture.AcccessPoint;
import NetworkArchitecture.NetworkArchitectureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Acccess Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link NetworkArchitecture.PortNumberElement#isValidLanPortNumber() <em>Is Valid Lan Port Number</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AcccessPointTest extends InternalIpAddressElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcccessPointTest.class);
	}

	/**
	 * Constructs a new Acccess Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcccessPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Acccess Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AcccessPoint getFixture() {
		return (AcccessPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetworkArchitectureFactory.eINSTANCE.createAcccessPoint());
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

} //AcccessPointTest
