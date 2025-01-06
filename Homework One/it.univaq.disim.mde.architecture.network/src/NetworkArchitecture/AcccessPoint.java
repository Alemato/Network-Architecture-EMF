/**
 */
package NetworkArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acccess Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.AcccessPoint#getMaxClientSupport <em>Max Client Support</em>}</li>
 *   <li>{@link NetworkArchitecture.AcccessPoint#getWifis <em>Wifis</em>}</li>
 *   <li>{@link NetworkArchitecture.AcccessPoint#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getAcccessPoint()
 * @model
 * @generated
 */
public interface AcccessPoint extends InternalIpAddressElement, NamedElement, FirmwareElement, PortNumberElement {
	/**
	 * Returns the value of the '<em><b>Max Client Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Client Support</em>' attribute.
	 * @see #setMaxClientSupport(int)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getAcccessPoint_MaxClientSupport()
	 * @model required="true"
	 * @generated
	 */
	int getMaxClientSupport();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.AcccessPoint#getMaxClientSupport <em>Max Client Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Client Support</em>' attribute.
	 * @see #getMaxClientSupport()
	 * @generated
	 */
	void setMaxClientSupport(int value);

	/**
	 * Returns the value of the '<em><b>Wifis</b></em>' reference list.
	 * The list contents are of type {@link NetworkArchitecture.Wifi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wifis</em>' reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getAcccessPoint_Wifis()
	 * @model required="true"
	 * @generated
	 */
	EList<Wifi> getWifis();

	/**
	 * Returns the value of the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan</em>' reference.
	 * @see #setVlan(VLAN)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getAcccessPoint_Vlan()
	 * @model required="true"
	 * @generated
	 */
	VLAN getVlan();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.AcccessPoint#getVlan <em>Vlan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan</em>' reference.
	 * @see #getVlan()
	 * @generated
	 */
	void setVlan(VLAN value);

} // AcccessPoint
