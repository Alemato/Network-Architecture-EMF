/**
 */
package NetworkArchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firmware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitecture.FirmwareElement#getModel <em>Model</em>}</li>
 *   <li>{@link NetworkArchitecture.FirmwareElement#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link NetworkArchitecture.FirmwareElement#getOperatingSystem <em>Operating System</em>}</li>
 * </ul>
 *
 * @see NetworkArchitecture.NetworkArchitecturePackage#getFirmwareElement()
 * @model abstract="true"
 * @generated
 */
public interface FirmwareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getFirmwareElement_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.FirmwareElement#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getFirmwareElement_OsVersion()
	 * @model required="true"
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.FirmwareElement#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see #setOperatingSystem(String)
	 * @see NetworkArchitecture.NetworkArchitecturePackage#getFirmwareElement_OperatingSystem()
	 * @model required="true"
	 * @generated
	 */
	String getOperatingSystem();

	/**
	 * Sets the value of the '{@link NetworkArchitecture.FirmwareElement#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(String value);

} // FirmwareElement
