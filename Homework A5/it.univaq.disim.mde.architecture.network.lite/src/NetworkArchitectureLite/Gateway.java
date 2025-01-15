/**
 */
package NetworkArchitectureLite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NetworkArchitectureLite.Gateway#getTecnology <em>Tecnology</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Gateway#getNat <em>Nat</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Gateway#getRouter <em>Router</em>}</li>
 *   <li>{@link NetworkArchitectureLite.Gateway#getVlan <em>Vlan</em>}</li>
 * </ul>
 *
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends NetworkDevice {
	/**
	 * Returns the value of the '<em><b>Tecnology</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.GatewayTechnology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnology</em>' attribute.
	 * @see NetworkArchitectureLite.GatewayTechnology
	 * @see #setTecnology(GatewayTechnology)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getGateway_Tecnology()
	 * @model required="true"
	 * @generated
	 */
	GatewayTechnology getTecnology();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Gateway#getTecnology <em>Tecnology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnology</em>' attribute.
	 * @see NetworkArchitectureLite.GatewayTechnology
	 * @see #getTecnology()
	 * @generated
	 */
	void setTecnology(GatewayTechnology value);

	/**
	 * Returns the value of the '<em><b>Nat</b></em>' attribute.
	 * The literals are from the enumeration {@link NetworkArchitectureLite.NATTechnology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat</em>' attribute.
	 * @see NetworkArchitectureLite.NATTechnology
	 * @see #setNat(NATTechnology)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getGateway_Nat()
	 * @model required="true"
	 * @generated
	 */
	NATTechnology getNat();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Gateway#getNat <em>Nat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat</em>' attribute.
	 * @see NetworkArchitectureLite.NATTechnology
	 * @see #getNat()
	 * @generated
	 */
	void setNat(NATTechnology value);

	/**
	 * Returns the value of the '<em><b>Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' containment reference.
	 * @see #setRouter(Router)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getGateway_Router()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Router getRouter();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Gateway#getRouter <em>Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router</em>' containment reference.
	 * @see #getRouter()
	 * @generated
	 */
	void setRouter(Router value);

	/**
	 * Returns the value of the '<em><b>Vlan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan</em>' reference.
	 * @see #setVlan(VLAN)
	 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getGateway_Vlan()
	 * @model required="true"
	 * @generated
	 */
	VLAN getVlan();

	/**
	 * Sets the value of the '{@link NetworkArchitectureLite.Gateway#getVlan <em>Vlan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan</em>' reference.
	 * @see #getVlan()
	 * @generated
	 */
	void setVlan(VLAN value);

} // Gateway
