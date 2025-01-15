/**
 */
package NetworkArchitectureLite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Routing Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NetworkArchitectureLite.NetworkArchitectureLitePackage#getRoutingProtocol()
 * @model
 * @generated
 */
public enum RoutingProtocol implements Enumerator {
	/**
	 * The '<em><b>RIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIP_VALUE
	 * @generated
	 * @ordered
	 */
	RIP(0, "RIP", "RIP"),

	/**
	 * The '<em><b>OSPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSPF_VALUE
	 * @generated
	 * @ordered
	 */
	OSPF(1, "OSPF", "OSPF"),

	/**
	 * The '<em><b>EIGRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGRP_VALUE
	 * @generated
	 * @ordered
	 */
	EIGRP(2, "EIGRP", "EIGRP"),

	/**
	 * The '<em><b>IS IS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_IS_VALUE
	 * @generated
	 * @ordered
	 */
	IS_IS(3, "IS_IS", "IS_IS"),

	/**
	 * The '<em><b>BGP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BGP_VALUE
	 * @generated
	 * @ordered
	 */
	BGP(4, "BGP", "BGP"),

	/**
	 * The '<em><b>IGRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGRP_VALUE
	 * @generated
	 * @ordered
	 */
	IGRP(5, "IGRP", "IGRP");

	/**
	 * The '<em><b>RIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIP_VALUE = 0;

	/**
	 * The '<em><b>OSPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OSPF_VALUE = 1;

	/**
	 * The '<em><b>EIGRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EIGRP_VALUE = 2;

	/**
	 * The '<em><b>IS IS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_IS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_IS_VALUE = 3;

	/**
	 * The '<em><b>BGP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BGP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BGP_VALUE = 4;

	/**
	 * The '<em><b>IGRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IGRP_VALUE = 5;

	/**
	 * An array of all the '<em><b>Routing Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoutingProtocol[] VALUES_ARRAY =
		new RoutingProtocol[] {
			RIP,
			OSPF,
			EIGRP,
			IS_IS,
			BGP,
			IGRP,
		};

	/**
	 * A public read-only list of all the '<em><b>Routing Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoutingProtocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Routing Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoutingProtocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoutingProtocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Routing Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoutingProtocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoutingProtocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Routing Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoutingProtocol get(int value) {
		switch (value) {
			case RIP_VALUE: return RIP;
			case OSPF_VALUE: return OSPF;
			case EIGRP_VALUE: return EIGRP;
			case IS_IS_VALUE: return IS_IS;
			case BGP_VALUE: return BGP;
			case IGRP_VALUE: return IGRP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RoutingProtocol(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RoutingProtocol
