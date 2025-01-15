/**
 */
package NetworkArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch L2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.SwitchL2#getPortType <em>Port Type</em>}</li>
 *   <li>{@link NetworkArchitecture.SwitchL2#getVlans <em>Vlans</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL2()
 * @model
 * @generated
 */
public interface SwitchL2 extends InternalIpAddressElement, NamedElement, FirmwareElement, PortNumberElement {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitecture.PortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see NetworkArchitecture.PortType
	 * @see #setPortType(PortType)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL2_PortType()
	 * @model required="true"
	 * @generated
	 */
	PortType getPortType();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.SwitchL2#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see NetworkArchitecture.PortType
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(PortType value);

	/**
	 * Returns the value of the '<em><b>Vlans</b></em>' reference list.
	 * The list contents are of type {@link NetworkArchitecture.VLAN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlans</em>' reference list.
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getSwitchL2_Vlans()
	 * @model required="true"
	 * @generated
	 */
	EList<VLAN> getVlans();

} // SwitchL2
