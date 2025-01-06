/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /it.univaq.disim.mde.architecture.network/models/NetworkArchitecture.ecore
 * using:
 *   /it.univaq.disim.mde.architecture.network/models/NetworkArchitecture.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package NetworkArchitecture;

// import NetworkArchitecture.NetworkArchitecturePackage;
// import NetworkArchitecture.NetworkArchitectureTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * NetworkArchitectureTables provides the dispatch tables for the NetworkArchitecture for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class NetworkArchitectureTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(NetworkArchitecturePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_univaq_disim_mde_s_NA = IdManager.getNsURIPackageId("https://it.univaq.disim.mde/NA", null, NetworkArchitecturePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AcccessPoint = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("AcccessPoint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Gateway = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("Gateway", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InternalIpAddressElement = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("InternalIpAddressElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Network = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("Network", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PortNumberElement = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("PortNumberElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Router = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("Router", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StaticRoute = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("StaticRoute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SwitchL2 = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("SwitchL2", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SwitchL3 = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("SwitchL3", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VLAN = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("VLAN", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Wifi = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getClassId("Wifi", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = NetworkArchitectureTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_AuthenticationWifi = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("AuthenticationWifi");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_EncryptionModeWifi = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("EncryptionModeWifi");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_GatewayTechnology = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("GatewayTechnology");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_NATTechnology = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("NATTechnology");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OperatingFrequency = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("OperatingFrequency");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PortType = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("PortType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_RoutingProtocol = NetworkArchitectureTables.PACKid_https_c_s_s_it_univaq_disim_mde_s_NA.getEnumerationId("RoutingProtocol");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_100 = ValueUtil.integerValueOf("100");
	public static final /*@NonInvalid*/ IntegerValue INT_104 = ValueUtil.integerValueOf("104");
	public static final /*@NonInvalid*/ IntegerValue INT_108 = ValueUtil.integerValueOf("108");
	public static final /*@NonInvalid*/ IntegerValue INT_112 = ValueUtil.integerValueOf("112");
	public static final /*@NonInvalid*/ IntegerValue INT_116 = ValueUtil.integerValueOf("116");
	public static final /*@NonInvalid*/ IntegerValue INT_120 = ValueUtil.integerValueOf("120");
	public static final /*@NonInvalid*/ IntegerValue INT_124 = ValueUtil.integerValueOf("124");
	public static final /*@NonInvalid*/ IntegerValue INT_128 = ValueUtil.integerValueOf("128");
	public static final /*@NonInvalid*/ IntegerValue INT_132 = ValueUtil.integerValueOf("132");
	public static final /*@NonInvalid*/ IntegerValue INT_136 = ValueUtil.integerValueOf("136");
	public static final /*@NonInvalid*/ IntegerValue INT_14 = ValueUtil.integerValueOf("14");
	public static final /*@NonInvalid*/ IntegerValue INT_140 = ValueUtil.integerValueOf("140");
	public static final /*@NonInvalid*/ IntegerValue INT_144 = ValueUtil.integerValueOf("144");
	public static final /*@NonInvalid*/ IntegerValue INT_149 = ValueUtil.integerValueOf("149");
	public static final /*@NonInvalid*/ IntegerValue INT_153 = ValueUtil.integerValueOf("153");
	public static final /*@NonInvalid*/ IntegerValue INT_157 = ValueUtil.integerValueOf("157");
	public static final /*@NonInvalid*/ IntegerValue INT_161 = ValueUtil.integerValueOf("161");
	public static final /*@NonInvalid*/ IntegerValue INT_165 = ValueUtil.integerValueOf("165");
	public static final /*@NonInvalid*/ IntegerValue INT_36 = ValueUtil.integerValueOf("36");
	public static final /*@NonInvalid*/ IntegerValue INT_40 = ValueUtil.integerValueOf("40");
	public static final /*@NonInvalid*/ IntegerValue INT_44 = ValueUtil.integerValueOf("44");
	public static final /*@NonInvalid*/ IntegerValue INT_48 = ValueUtil.integerValueOf("48");
	public static final /*@NonInvalid*/ IntegerValue INT_52 = ValueUtil.integerValueOf("52");
	public static final /*@NonInvalid*/ IntegerValue INT_56 = ValueUtil.integerValueOf("56");
	public static final /*@NonInvalid*/ IntegerValue INT_60 = ValueUtil.integerValueOf("60");
	public static final /*@NonInvalid*/ IntegerValue INT_64 = ValueUtil.integerValueOf("64");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_Integer = TypeId.SEQUENCE.getSpecializedId(TypeId.INTEGER, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR__94_o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_ = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.";
	public static final /*@NonInvalid*/ String STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_$ = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
	public static final /*@NonInvalid*/ String STR__o_25_91_0_m_5_93_124_2_91_0_m_4_93_91_0_m_9_93_124_91_0_m_1_93_63_91_0_m_9_93_91_0_m_9_93_63_e_92_ = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AcccessPoint = TypeId.BAG.getSpecializedId(NetworkArchitectureTables.CLSSid_AcccessPoint, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Gateway = TypeId.BAG.getSpecializedId(NetworkArchitectureTables.CLSSid_Gateway, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Router = TypeId.BAG.getSpecializedId(NetworkArchitectureTables.CLSSid_Router, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SwitchL2 = TypeId.BAG.getSpecializedId(NetworkArchitectureTables.CLSSid_SwitchL2, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SwitchL3 = TypeId.BAG.getSpecializedId(NetworkArchitectureTables.CLSSid_SwitchL3, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Wifi = TypeId.BAG.getSpecializedId(NetworkArchitectureTables.CLSSid_Wifi, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Ghz_2_4 = NetworkArchitectureTables.ENUMid_OperatingFrequency.getEnumerationLiteralId("Ghz_2_4");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Ghz_5 = NetworkArchitectureTables.ENUMid_OperatingFrequency.getEnumerationLiteralId("Ghz_5");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StaticRoute = TypeId.ORDERED_SET.getSpecializedId(NetworkArchitectureTables.CLSSid_StaticRoute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SwitchL2 = TypeId.ORDERED_SET.getSpecializedId(NetworkArchitectureTables.CLSSid_SwitchL2, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SwitchL3 = TypeId.ORDERED_SET.getSpecializedId(NetworkArchitectureTables.CLSSid_SwitchL3, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_VLAN = TypeId.ORDERED_SET.getSpecializedId(NetworkArchitectureTables.CLSSid_VLAN, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Wifi = TypeId.ORDERED_SET.getSpecializedId(NetworkArchitectureTables.CLSSid_Wifi, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Wifi = TypeId.SEQUENCE.getSpecializedId(NetworkArchitectureTables.CLSSid_Wifi, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_AcccessPoint = TypeId.SET.getSpecializedId(NetworkArchitectureTables.CLSSid_AcccessPoint, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			NetworkArchitectureTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AcccessPoint = new EcoreExecutorType(NetworkArchitecturePackage.Literals.ACCCESS_POINT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _AuthenticationWifi = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.AUTHENTICATION_WIFI, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _EncryptionModeWifi = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.ENCRYPTION_MODE_WIFI, PACKAGE, 0);
		public static final EcoreExecutorType _FirmwareElement = new EcoreExecutorType(NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Gateway = new EcoreExecutorType(NetworkArchitecturePackage.Literals.GATEWAY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _GatewayTechnology = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY, PACKAGE, 0);
		public static final EcoreExecutorType _InternalIpAddressElement = new EcoreExecutorType(NetworkArchitecturePackage.Literals.INTERNAL_IP_ADDRESS_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _NATTechnology = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(NetworkArchitecturePackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Network = new EcoreExecutorType(NetworkArchitecturePackage.Literals.NETWORK, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OperatingFrequency = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.OPERATING_FREQUENCY, PACKAGE, 0);
		public static final EcoreExecutorType _PortNumberElement = new EcoreExecutorType(NetworkArchitecturePackage.Literals.PORT_NUMBER_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _PortType = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.PORT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Router = new EcoreExecutorType(NetworkArchitecturePackage.Literals.ROUTER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _RoutingProtocol = new EcoreExecutorEnumeration(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL, PACKAGE, 0);
		public static final EcoreExecutorType _StaticRoute = new EcoreExecutorType(NetworkArchitecturePackage.Literals.STATIC_ROUTE, PACKAGE, 0);
		public static final EcoreExecutorType _SwitchL2 = new EcoreExecutorType(NetworkArchitecturePackage.Literals.SWITCH_L2, PACKAGE, 0);
		public static final EcoreExecutorType _SwitchL3 = new EcoreExecutorType(NetworkArchitecturePackage.Literals.SWITCH_L3, PACKAGE, 0);
		public static final EcoreExecutorType _VLAN = new EcoreExecutorType(NetworkArchitecturePackage.Literals.VLAN, PACKAGE, 0);
		public static final EcoreExecutorType _Wifi = new EcoreExecutorType(NetworkArchitecturePackage.Literals.WIFI, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AcccessPoint,
			_AuthenticationWifi,
			_EncryptionModeWifi,
			_FirmwareElement,
			_Gateway,
			_GatewayTechnology,
			_InternalIpAddressElement,
			_NATTechnology,
			_NamedElement,
			_Network,
			_OperatingFrequency,
			_PortNumberElement,
			_PortType,
			_Router,
			_RoutingProtocol,
			_StaticRoute,
			_SwitchL2,
			_SwitchL3,
			_VLAN,
			_Wifi
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AcccessPoint__AcccessPoint = new ExecutorFragment(Types._AcccessPoint, NetworkArchitectureTables.Types._AcccessPoint);
		private static final ExecutorFragment _AcccessPoint__FirmwareElement = new ExecutorFragment(Types._AcccessPoint, NetworkArchitectureTables.Types._FirmwareElement);
		private static final ExecutorFragment _AcccessPoint__InternalIpAddressElement = new ExecutorFragment(Types._AcccessPoint, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _AcccessPoint__NamedElement = new ExecutorFragment(Types._AcccessPoint, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _AcccessPoint__OclAny = new ExecutorFragment(Types._AcccessPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AcccessPoint__OclElement = new ExecutorFragment(Types._AcccessPoint, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AcccessPoint__PortNumberElement = new ExecutorFragment(Types._AcccessPoint, NetworkArchitectureTables.Types._PortNumberElement);

		private static final ExecutorFragment _AuthenticationWifi__AuthenticationWifi = new ExecutorFragment(Types._AuthenticationWifi, NetworkArchitectureTables.Types._AuthenticationWifi);
		private static final ExecutorFragment _AuthenticationWifi__OclAny = new ExecutorFragment(Types._AuthenticationWifi, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AuthenticationWifi__OclElement = new ExecutorFragment(Types._AuthenticationWifi, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AuthenticationWifi__OclEnumeration = new ExecutorFragment(Types._AuthenticationWifi, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _AuthenticationWifi__OclType = new ExecutorFragment(Types._AuthenticationWifi, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EncryptionModeWifi__EncryptionModeWifi = new ExecutorFragment(Types._EncryptionModeWifi, NetworkArchitectureTables.Types._EncryptionModeWifi);
		private static final ExecutorFragment _EncryptionModeWifi__OclAny = new ExecutorFragment(Types._EncryptionModeWifi, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EncryptionModeWifi__OclElement = new ExecutorFragment(Types._EncryptionModeWifi, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _EncryptionModeWifi__OclEnumeration = new ExecutorFragment(Types._EncryptionModeWifi, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _EncryptionModeWifi__OclType = new ExecutorFragment(Types._EncryptionModeWifi, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _FirmwareElement__FirmwareElement = new ExecutorFragment(Types._FirmwareElement, NetworkArchitectureTables.Types._FirmwareElement);
		private static final ExecutorFragment _FirmwareElement__OclAny = new ExecutorFragment(Types._FirmwareElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FirmwareElement__OclElement = new ExecutorFragment(Types._FirmwareElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Gateway__FirmwareElement = new ExecutorFragment(Types._Gateway, NetworkArchitectureTables.Types._FirmwareElement);
		private static final ExecutorFragment _Gateway__Gateway = new ExecutorFragment(Types._Gateway, NetworkArchitectureTables.Types._Gateway);
		private static final ExecutorFragment _Gateway__InternalIpAddressElement = new ExecutorFragment(Types._Gateway, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _Gateway__NamedElement = new ExecutorFragment(Types._Gateway, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _Gateway__OclAny = new ExecutorFragment(Types._Gateway, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Gateway__OclElement = new ExecutorFragment(Types._Gateway, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GatewayTechnology__GatewayTechnology = new ExecutorFragment(Types._GatewayTechnology, NetworkArchitectureTables.Types._GatewayTechnology);
		private static final ExecutorFragment _GatewayTechnology__OclAny = new ExecutorFragment(Types._GatewayTechnology, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GatewayTechnology__OclElement = new ExecutorFragment(Types._GatewayTechnology, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _GatewayTechnology__OclEnumeration = new ExecutorFragment(Types._GatewayTechnology, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _GatewayTechnology__OclType = new ExecutorFragment(Types._GatewayTechnology, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _InternalIpAddressElement__InternalIpAddressElement = new ExecutorFragment(Types._InternalIpAddressElement, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _InternalIpAddressElement__OclAny = new ExecutorFragment(Types._InternalIpAddressElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InternalIpAddressElement__OclElement = new ExecutorFragment(Types._InternalIpAddressElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NATTechnology__NATTechnology = new ExecutorFragment(Types._NATTechnology, NetworkArchitectureTables.Types._NATTechnology);
		private static final ExecutorFragment _NATTechnology__OclAny = new ExecutorFragment(Types._NATTechnology, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NATTechnology__OclElement = new ExecutorFragment(Types._NATTechnology, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NATTechnology__OclEnumeration = new ExecutorFragment(Types._NATTechnology, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _NATTechnology__OclType = new ExecutorFragment(Types._NATTechnology, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Network__NamedElement = new ExecutorFragment(Types._Network, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, NetworkArchitectureTables.Types._Network);
		private static final ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OperatingFrequency__OclAny = new ExecutorFragment(Types._OperatingFrequency, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OperatingFrequency__OclElement = new ExecutorFragment(Types._OperatingFrequency, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OperatingFrequency__OclEnumeration = new ExecutorFragment(Types._OperatingFrequency, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OperatingFrequency__OclType = new ExecutorFragment(Types._OperatingFrequency, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OperatingFrequency__OperatingFrequency = new ExecutorFragment(Types._OperatingFrequency, NetworkArchitectureTables.Types._OperatingFrequency);

		private static final ExecutorFragment _PortNumberElement__OclAny = new ExecutorFragment(Types._PortNumberElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PortNumberElement__OclElement = new ExecutorFragment(Types._PortNumberElement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PortNumberElement__PortNumberElement = new ExecutorFragment(Types._PortNumberElement, NetworkArchitectureTables.Types._PortNumberElement);

		private static final ExecutorFragment _PortType__OclAny = new ExecutorFragment(Types._PortType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PortType__OclElement = new ExecutorFragment(Types._PortType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PortType__OclEnumeration = new ExecutorFragment(Types._PortType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PortType__OclType = new ExecutorFragment(Types._PortType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PortType__PortType = new ExecutorFragment(Types._PortType, NetworkArchitectureTables.Types._PortType);

		private static final ExecutorFragment _Router__FirmwareElement = new ExecutorFragment(Types._Router, NetworkArchitectureTables.Types._FirmwareElement);
		private static final ExecutorFragment _Router__InternalIpAddressElement = new ExecutorFragment(Types._Router, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _Router__NamedElement = new ExecutorFragment(Types._Router, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _Router__OclAny = new ExecutorFragment(Types._Router, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Router__OclElement = new ExecutorFragment(Types._Router, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Router__PortNumberElement = new ExecutorFragment(Types._Router, NetworkArchitectureTables.Types._PortNumberElement);
		private static final ExecutorFragment _Router__Router = new ExecutorFragment(Types._Router, NetworkArchitectureTables.Types._Router);

		private static final ExecutorFragment _RoutingProtocol__OclAny = new ExecutorFragment(Types._RoutingProtocol, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RoutingProtocol__OclElement = new ExecutorFragment(Types._RoutingProtocol, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RoutingProtocol__OclEnumeration = new ExecutorFragment(Types._RoutingProtocol, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _RoutingProtocol__OclType = new ExecutorFragment(Types._RoutingProtocol, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _RoutingProtocol__RoutingProtocol = new ExecutorFragment(Types._RoutingProtocol, NetworkArchitectureTables.Types._RoutingProtocol);

		private static final ExecutorFragment _StaticRoute__NamedElement = new ExecutorFragment(Types._StaticRoute, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _StaticRoute__OclAny = new ExecutorFragment(Types._StaticRoute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StaticRoute__OclElement = new ExecutorFragment(Types._StaticRoute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StaticRoute__StaticRoute = new ExecutorFragment(Types._StaticRoute, NetworkArchitectureTables.Types._StaticRoute);

		private static final ExecutorFragment _SwitchL2__FirmwareElement = new ExecutorFragment(Types._SwitchL2, NetworkArchitectureTables.Types._FirmwareElement);
		private static final ExecutorFragment _SwitchL2__InternalIpAddressElement = new ExecutorFragment(Types._SwitchL2, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _SwitchL2__NamedElement = new ExecutorFragment(Types._SwitchL2, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _SwitchL2__OclAny = new ExecutorFragment(Types._SwitchL2, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SwitchL2__OclElement = new ExecutorFragment(Types._SwitchL2, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SwitchL2__PortNumberElement = new ExecutorFragment(Types._SwitchL2, NetworkArchitectureTables.Types._PortNumberElement);
		private static final ExecutorFragment _SwitchL2__SwitchL2 = new ExecutorFragment(Types._SwitchL2, NetworkArchitectureTables.Types._SwitchL2);

		private static final ExecutorFragment _SwitchL3__FirmwareElement = new ExecutorFragment(Types._SwitchL3, NetworkArchitectureTables.Types._FirmwareElement);
		private static final ExecutorFragment _SwitchL3__InternalIpAddressElement = new ExecutorFragment(Types._SwitchL3, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _SwitchL3__NamedElement = new ExecutorFragment(Types._SwitchL3, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _SwitchL3__OclAny = new ExecutorFragment(Types._SwitchL3, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SwitchL3__OclElement = new ExecutorFragment(Types._SwitchL3, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SwitchL3__PortNumberElement = new ExecutorFragment(Types._SwitchL3, NetworkArchitectureTables.Types._PortNumberElement);
		private static final ExecutorFragment _SwitchL3__SwitchL3 = new ExecutorFragment(Types._SwitchL3, NetworkArchitectureTables.Types._SwitchL3);

		private static final ExecutorFragment _VLAN__NamedElement = new ExecutorFragment(Types._VLAN, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _VLAN__OclAny = new ExecutorFragment(Types._VLAN, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VLAN__OclElement = new ExecutorFragment(Types._VLAN, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VLAN__VLAN = new ExecutorFragment(Types._VLAN, NetworkArchitectureTables.Types._VLAN);

		private static final ExecutorFragment _Wifi__InternalIpAddressElement = new ExecutorFragment(Types._Wifi, NetworkArchitectureTables.Types._InternalIpAddressElement);
		private static final ExecutorFragment _Wifi__NamedElement = new ExecutorFragment(Types._Wifi, NetworkArchitectureTables.Types._NamedElement);
		private static final ExecutorFragment _Wifi__OclAny = new ExecutorFragment(Types._Wifi, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Wifi__OclElement = new ExecutorFragment(Types._Wifi, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Wifi__Wifi = new ExecutorFragment(Types._Wifi, NetworkArchitectureTables.Types._Wifi);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _PortNumberElement__isValidLanPortNumber = new ExecutorOperation("isValidLanPortNumber", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PortNumberElement,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Wifi__isValidChannelForFrequency = new ExecutorOperation("isValidChannelForFrequency", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Wifi,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AcccessPoint__maxClientSupport = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ACCCESS_POINT__MAX_CLIENT_SUPPORT, Types._AcccessPoint, 0);
		public static final ExecutorProperty _AcccessPoint__vlan = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ACCCESS_POINT__VLAN, Types._AcccessPoint, 1);
		public static final ExecutorProperty _AcccessPoint__wifis = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ACCCESS_POINT__WIFIS, Types._AcccessPoint, 2);
		public static final ExecutorProperty _AcccessPoint__SwitchL3__accessPoints = new ExecutorPropertyWithImplementation("SwitchL3", Types._AcccessPoint, 3, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__ACCESS_POINTS));

		public static final ExecutorProperty _FirmwareElement__model = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT__MODEL, Types._FirmwareElement, 0);
		public static final ExecutorProperty _FirmwareElement__operatingSystem = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT__OPERATING_SYSTEM, Types._FirmwareElement, 1);
		public static final ExecutorProperty _FirmwareElement__osVersion = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT__OS_VERSION, Types._FirmwareElement, 2);

		public static final ExecutorProperty _Gateway__nat = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.GATEWAY__NAT, Types._Gateway, 0);
		public static final ExecutorProperty _Gateway__router = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.GATEWAY__ROUTER, Types._Gateway, 1);
		public static final ExecutorProperty _Gateway__tecnology = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.GATEWAY__TECNOLOGY, Types._Gateway, 2);
		public static final ExecutorProperty _Gateway__vlan = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.GATEWAY__VLAN, Types._Gateway, 3);
		public static final ExecutorProperty _Gateway__Network__gateway = new ExecutorPropertyWithImplementation("Network", Types._Gateway, 4, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.NETWORK__GATEWAY));

		public static final ExecutorProperty _InternalIpAddressElement__internalIpAddress = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.INTERNAL_IP_ADDRESS_ELEMENT__INTERNAL_IP_ADDRESS, Types._InternalIpAddressElement, 0);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Network__gateway = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.NETWORK__GATEWAY, Types._Network, 0);
		public static final ExecutorProperty _Network__networkDevicesCount = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.NETWORK__NETWORK_DEVICES_COUNT, Types._Network, 1);
		public static final ExecutorProperty _Network__publicIpAddres = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.NETWORK__PUBLIC_IP_ADDRES, Types._Network, 2);
		public static final ExecutorProperty _Network__vlans = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.NETWORK__VLANS, Types._Network, 3);
		public static final ExecutorProperty _Network__wifis = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.NETWORK__WIFIS, Types._Network, 4);

		public static final ExecutorProperty _PortNumberElement__portNumber = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.PORT_NUMBER_ELEMENT__PORT_NUMBER, Types._PortNumberElement, 0);

		public static final ExecutorProperty _Router__routingProtocol = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ROUTER__ROUTING_PROTOCOL, Types._Router, 0);
		public static final ExecutorProperty _Router__staticRoute = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ROUTER__STATIC_ROUTE, Types._Router, 1);
		public static final ExecutorProperty _Router__switchL3 = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ROUTER__SWITCH_L3, Types._Router, 2);
		public static final ExecutorProperty _Router__vlans = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.ROUTER__VLANS, Types._Router, 3);
		public static final ExecutorProperty _Router__Gateway__router = new ExecutorPropertyWithImplementation("Gateway", Types._Router, 4, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.GATEWAY__ROUTER));

		public static final ExecutorProperty _StaticRoute__gateway = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.STATIC_ROUTE__GATEWAY, Types._StaticRoute, 0);
		public static final ExecutorProperty _StaticRoute__metric = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.STATIC_ROUTE__METRIC, Types._StaticRoute, 1);
		public static final ExecutorProperty _StaticRoute__netInterface = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.STATIC_ROUTE__NET_INTERFACE, Types._StaticRoute, 2);
		public static final ExecutorProperty _StaticRoute__netmask = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.STATIC_ROUTE__NETMASK, Types._StaticRoute, 3);
		public static final ExecutorProperty _StaticRoute__networkDestination = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.STATIC_ROUTE__NETWORK_DESTINATION, Types._StaticRoute, 4);
		public static final ExecutorProperty _StaticRoute__Router__staticRoute = new ExecutorPropertyWithImplementation("Router", Types._StaticRoute, 5, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.ROUTER__STATIC_ROUTE));
		public static final ExecutorProperty _StaticRoute__SwitchL3__staticRoute = new ExecutorPropertyWithImplementation("SwitchL3", Types._StaticRoute, 6, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__STATIC_ROUTE));

		public static final ExecutorProperty _SwitchL2__portType = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L2__PORT_TYPE, Types._SwitchL2, 0);
		public static final ExecutorProperty _SwitchL2__vlans = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L2__VLANS, Types._SwitchL2, 1);
		public static final ExecutorProperty _SwitchL2__SwitchL3__switchL2 = new ExecutorPropertyWithImplementation("SwitchL3", Types._SwitchL2, 2, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__SWITCH_L2));

		public static final ExecutorProperty _SwitchL3__accessPoints = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__ACCESS_POINTS, Types._SwitchL3, 0);
		public static final ExecutorProperty _SwitchL3__routingProtocol = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__ROUTING_PROTOCOL, Types._SwitchL3, 1);
		public static final ExecutorProperty _SwitchL3__staticRoute = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__STATIC_ROUTE, Types._SwitchL3, 2);
		public static final ExecutorProperty _SwitchL3__switchL2 = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__SWITCH_L2, Types._SwitchL3, 3);
		public static final ExecutorProperty _SwitchL3__totalConnectedDevices = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__TOTAL_CONNECTED_DEVICES, Types._SwitchL3, 4);
		public static final ExecutorProperty _SwitchL3__vlans = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__VLANS, Types._SwitchL3, 5);
		public static final ExecutorProperty _SwitchL3__Router__switchL3 = new ExecutorPropertyWithImplementation("Router", Types._SwitchL3, 6, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.ROUTER__SWITCH_L3));

		public static final ExecutorProperty _VLAN__idVLan = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.VLAN__ID_VLAN, Types._VLAN, 0);
		public static final ExecutorProperty _VLAN__ipGateway = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.VLAN__IP_GATEWAY, Types._VLAN, 1);
		public static final ExecutorProperty _VLAN__lowerIp = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.VLAN__LOWER_IP, Types._VLAN, 2);
		public static final ExecutorProperty _VLAN__mtu = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.VLAN__MTU, Types._VLAN, 3);
		public static final ExecutorProperty _VLAN__subnet = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.VLAN__SUBNET, Types._VLAN, 4);
		public static final ExecutorProperty _VLAN__upperIp = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.VLAN__UPPER_IP, Types._VLAN, 5);
		public static final ExecutorProperty _VLAN__AcccessPoint__vlan = new ExecutorPropertyWithImplementation("AcccessPoint", Types._VLAN, 6, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.ACCCESS_POINT__VLAN));
		public static final ExecutorProperty _VLAN__Gateway__vlan = new ExecutorPropertyWithImplementation("Gateway", Types._VLAN, 7, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.GATEWAY__VLAN));
		public static final ExecutorProperty _VLAN__Network__vlans = new ExecutorPropertyWithImplementation("Network", Types._VLAN, 8, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.NETWORK__VLANS));
		public static final ExecutorProperty _VLAN__Router__vlans = new ExecutorPropertyWithImplementation("Router", Types._VLAN, 9, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.ROUTER__VLANS));
		public static final ExecutorProperty _VLAN__SwitchL2__vlans = new ExecutorPropertyWithImplementation("SwitchL2", Types._VLAN, 10, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.SWITCH_L2__VLANS));
		public static final ExecutorProperty _VLAN__SwitchL3__vlans = new ExecutorPropertyWithImplementation("SwitchL3", Types._VLAN, 11, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.SWITCH_L3__VLANS));
		public static final ExecutorProperty _VLAN__Wifi__vlan = new ExecutorPropertyWithImplementation("Wifi", Types._VLAN, 12, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.WIFI__VLAN));

		public static final ExecutorProperty _Wifi__authentication = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.WIFI__AUTHENTICATION, Types._Wifi, 0);
		public static final ExecutorProperty _Wifi__channel = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.WIFI__CHANNEL, Types._Wifi, 1);
		public static final ExecutorProperty _Wifi__encryption = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.WIFI__ENCRYPTION, Types._Wifi, 2);
		public static final ExecutorProperty _Wifi__frequency = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.WIFI__FREQUENCY, Types._Wifi, 3);
		public static final ExecutorProperty _Wifi__ssid = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.WIFI__SSID, Types._Wifi, 4);
		public static final ExecutorProperty _Wifi__vlan = new EcoreExecutorProperty(NetworkArchitecturePackage.Literals.WIFI__VLAN, Types._Wifi, 5);
		public static final ExecutorProperty _Wifi__AcccessPoint__wifis = new ExecutorPropertyWithImplementation("AcccessPoint", Types._Wifi, 6, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.ACCCESS_POINT__WIFIS));
		public static final ExecutorProperty _Wifi__Network__wifis = new ExecutorPropertyWithImplementation("Network", Types._Wifi, 7, new EcoreLibraryOppositeProperty(NetworkArchitecturePackage.Literals.NETWORK__WIFIS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AcccessPoint =
			{
				Fragments._AcccessPoint__OclAny /* 0 */,
				Fragments._AcccessPoint__OclElement /* 1 */,
				Fragments._AcccessPoint__FirmwareElement /* 2 */,
				Fragments._AcccessPoint__InternalIpAddressElement /* 2 */,
				Fragments._AcccessPoint__NamedElement /* 2 */,
				Fragments._AcccessPoint__PortNumberElement /* 2 */,
				Fragments._AcccessPoint__AcccessPoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __AcccessPoint = { 1,1,4,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AuthenticationWifi =
			{
				Fragments._AuthenticationWifi__OclAny /* 0 */,
				Fragments._AuthenticationWifi__OclElement /* 1 */,
				Fragments._AuthenticationWifi__OclType /* 2 */,
				Fragments._AuthenticationWifi__OclEnumeration /* 3 */,
				Fragments._AuthenticationWifi__AuthenticationWifi /* 4 */
			};
		private static final int /*@NonNull*/ [] __AuthenticationWifi = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EncryptionModeWifi =
			{
				Fragments._EncryptionModeWifi__OclAny /* 0 */,
				Fragments._EncryptionModeWifi__OclElement /* 1 */,
				Fragments._EncryptionModeWifi__OclType /* 2 */,
				Fragments._EncryptionModeWifi__OclEnumeration /* 3 */,
				Fragments._EncryptionModeWifi__EncryptionModeWifi /* 4 */
			};
		private static final int /*@NonNull*/ [] __EncryptionModeWifi = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FirmwareElement =
			{
				Fragments._FirmwareElement__OclAny /* 0 */,
				Fragments._FirmwareElement__OclElement /* 1 */,
				Fragments._FirmwareElement__FirmwareElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __FirmwareElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Gateway =
			{
				Fragments._Gateway__OclAny /* 0 */,
				Fragments._Gateway__OclElement /* 1 */,
				Fragments._Gateway__FirmwareElement /* 2 */,
				Fragments._Gateway__InternalIpAddressElement /* 2 */,
				Fragments._Gateway__NamedElement /* 2 */,
				Fragments._Gateway__Gateway /* 3 */
			};
		private static final int /*@NonNull*/ [] __Gateway = { 1,1,3,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GatewayTechnology =
			{
				Fragments._GatewayTechnology__OclAny /* 0 */,
				Fragments._GatewayTechnology__OclElement /* 1 */,
				Fragments._GatewayTechnology__OclType /* 2 */,
				Fragments._GatewayTechnology__OclEnumeration /* 3 */,
				Fragments._GatewayTechnology__GatewayTechnology /* 4 */
			};
		private static final int /*@NonNull*/ [] __GatewayTechnology = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InternalIpAddressElement =
			{
				Fragments._InternalIpAddressElement__OclAny /* 0 */,
				Fragments._InternalIpAddressElement__OclElement /* 1 */,
				Fragments._InternalIpAddressElement__InternalIpAddressElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __InternalIpAddressElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NATTechnology =
			{
				Fragments._NATTechnology__OclAny /* 0 */,
				Fragments._NATTechnology__OclElement /* 1 */,
				Fragments._NATTechnology__OclType /* 2 */,
				Fragments._NATTechnology__OclEnumeration /* 3 */,
				Fragments._NATTechnology__NATTechnology /* 4 */
			};
		private static final int /*@NonNull*/ [] __NATTechnology = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Network =
			{
				Fragments._Network__OclAny /* 0 */,
				Fragments._Network__OclElement /* 1 */,
				Fragments._Network__NamedElement /* 2 */,
				Fragments._Network__Network /* 3 */
			};
		private static final int /*@NonNull*/ [] __Network = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OperatingFrequency =
			{
				Fragments._OperatingFrequency__OclAny /* 0 */,
				Fragments._OperatingFrequency__OclElement /* 1 */,
				Fragments._OperatingFrequency__OclType /* 2 */,
				Fragments._OperatingFrequency__OclEnumeration /* 3 */,
				Fragments._OperatingFrequency__OperatingFrequency /* 4 */
			};
		private static final int /*@NonNull*/ [] __OperatingFrequency = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PortNumberElement =
			{
				Fragments._PortNumberElement__OclAny /* 0 */,
				Fragments._PortNumberElement__OclElement /* 1 */,
				Fragments._PortNumberElement__PortNumberElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __PortNumberElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PortType =
			{
				Fragments._PortType__OclAny /* 0 */,
				Fragments._PortType__OclElement /* 1 */,
				Fragments._PortType__OclType /* 2 */,
				Fragments._PortType__OclEnumeration /* 3 */,
				Fragments._PortType__PortType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PortType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Router =
			{
				Fragments._Router__OclAny /* 0 */,
				Fragments._Router__OclElement /* 1 */,
				Fragments._Router__FirmwareElement /* 2 */,
				Fragments._Router__InternalIpAddressElement /* 2 */,
				Fragments._Router__NamedElement /* 2 */,
				Fragments._Router__PortNumberElement /* 2 */,
				Fragments._Router__Router /* 3 */
			};
		private static final int /*@NonNull*/ [] __Router = { 1,1,4,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RoutingProtocol =
			{
				Fragments._RoutingProtocol__OclAny /* 0 */,
				Fragments._RoutingProtocol__OclElement /* 1 */,
				Fragments._RoutingProtocol__OclType /* 2 */,
				Fragments._RoutingProtocol__OclEnumeration /* 3 */,
				Fragments._RoutingProtocol__RoutingProtocol /* 4 */
			};
		private static final int /*@NonNull*/ [] __RoutingProtocol = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StaticRoute =
			{
				Fragments._StaticRoute__OclAny /* 0 */,
				Fragments._StaticRoute__OclElement /* 1 */,
				Fragments._StaticRoute__NamedElement /* 2 */,
				Fragments._StaticRoute__StaticRoute /* 3 */
			};
		private static final int /*@NonNull*/ [] __StaticRoute = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SwitchL2 =
			{
				Fragments._SwitchL2__OclAny /* 0 */,
				Fragments._SwitchL2__OclElement /* 1 */,
				Fragments._SwitchL2__FirmwareElement /* 2 */,
				Fragments._SwitchL2__InternalIpAddressElement /* 2 */,
				Fragments._SwitchL2__NamedElement /* 2 */,
				Fragments._SwitchL2__PortNumberElement /* 2 */,
				Fragments._SwitchL2__SwitchL2 /* 3 */
			};
		private static final int /*@NonNull*/ [] __SwitchL2 = { 1,1,4,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SwitchL3 =
			{
				Fragments._SwitchL3__OclAny /* 0 */,
				Fragments._SwitchL3__OclElement /* 1 */,
				Fragments._SwitchL3__FirmwareElement /* 2 */,
				Fragments._SwitchL3__InternalIpAddressElement /* 2 */,
				Fragments._SwitchL3__NamedElement /* 2 */,
				Fragments._SwitchL3__PortNumberElement /* 2 */,
				Fragments._SwitchL3__SwitchL3 /* 3 */
			};
		private static final int /*@NonNull*/ [] __SwitchL3 = { 1,1,4,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VLAN =
			{
				Fragments._VLAN__OclAny /* 0 */,
				Fragments._VLAN__OclElement /* 1 */,
				Fragments._VLAN__NamedElement /* 2 */,
				Fragments._VLAN__VLAN /* 3 */
			};
		private static final int /*@NonNull*/ [] __VLAN = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Wifi =
			{
				Fragments._Wifi__OclAny /* 0 */,
				Fragments._Wifi__OclElement /* 1 */,
				Fragments._Wifi__InternalIpAddressElement /* 2 */,
				Fragments._Wifi__NamedElement /* 2 */,
				Fragments._Wifi__Wifi /* 3 */
			};
		private static final int /*@NonNull*/ [] __Wifi = { 1,1,2,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AcccessPoint.initFragments(_AcccessPoint, __AcccessPoint);
			Types._AuthenticationWifi.initFragments(_AuthenticationWifi, __AuthenticationWifi);
			Types._EncryptionModeWifi.initFragments(_EncryptionModeWifi, __EncryptionModeWifi);
			Types._FirmwareElement.initFragments(_FirmwareElement, __FirmwareElement);
			Types._Gateway.initFragments(_Gateway, __Gateway);
			Types._GatewayTechnology.initFragments(_GatewayTechnology, __GatewayTechnology);
			Types._InternalIpAddressElement.initFragments(_InternalIpAddressElement, __InternalIpAddressElement);
			Types._NATTechnology.initFragments(_NATTechnology, __NATTechnology);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Network.initFragments(_Network, __Network);
			Types._OperatingFrequency.initFragments(_OperatingFrequency, __OperatingFrequency);
			Types._PortNumberElement.initFragments(_PortNumberElement, __PortNumberElement);
			Types._PortType.initFragments(_PortType, __PortType);
			Types._Router.initFragments(_Router, __Router);
			Types._RoutingProtocol.initFragments(_RoutingProtocol, __RoutingProtocol);
			Types._StaticRoute.initFragments(_StaticRoute, __StaticRoute);
			Types._SwitchL2.initFragments(_SwitchL2, __SwitchL2);
			Types._SwitchL3.initFragments(_SwitchL3, __SwitchL3);
			Types._VLAN.initFragments(_VLAN, __VLAN);
			Types._Wifi.initFragments(_Wifi, __Wifi);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__AcccessPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__FirmwareElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AcccessPoint__PortNumberElement = {
			NetworkArchitectureTables.Operations._PortNumberElement__isValidLanPortNumber /* isValidLanPortNumber() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AuthenticationWifi__AuthenticationWifi = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AuthenticationWifi__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AuthenticationWifi__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AuthenticationWifi__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AuthenticationWifi__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EncryptionModeWifi__EncryptionModeWifi = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EncryptionModeWifi__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncryptionModeWifi__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncryptionModeWifi__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EncryptionModeWifi__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FirmwareElement__FirmwareElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FirmwareElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FirmwareElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__Gateway = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__FirmwareElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GatewayTechnology__GatewayTechnology = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GatewayTechnology__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GatewayTechnology__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GatewayTechnology__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GatewayTechnology__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InternalIpAddressElement__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InternalIpAddressElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InternalIpAddressElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NATTechnology__NATTechnology = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NATTechnology__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NATTechnology__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NATTechnology__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NATTechnology__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Network__Network = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OperatingFrequency__OperatingFrequency = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingFrequency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingFrequency__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingFrequency__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatingFrequency__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PortNumberElement__PortNumberElement = {
			NetworkArchitectureTables.Operations._PortNumberElement__isValidLanPortNumber /* isValidLanPortNumber() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortNumberElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortNumberElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PortType__PortType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PortType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Router__Router = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Router__FirmwareElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Router__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Router__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Router__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Router__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Router__PortNumberElement = {
			NetworkArchitectureTables.Operations._PortNumberElement__isValidLanPortNumber /* isValidLanPortNumber() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RoutingProtocol__RoutingProtocol = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RoutingProtocol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoutingProtocol__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoutingProtocol__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoutingProtocol__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StaticRoute__StaticRoute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StaticRoute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StaticRoute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StaticRoute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__SwitchL2 = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__FirmwareElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL2__PortNumberElement = {
			NetworkArchitectureTables.Operations._PortNumberElement__isValidLanPortNumber /* isValidLanPortNumber() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__SwitchL3 = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__FirmwareElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwitchL3__PortNumberElement = {
			NetworkArchitectureTables.Operations._PortNumberElement__isValidLanPortNumber /* isValidLanPortNumber() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VLAN__VLAN = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VLAN__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VLAN__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VLAN__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Wifi__Wifi = {
			NetworkArchitectureTables.Operations._Wifi__isValidChannelForFrequency /* isValidChannelForFrequency() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Wifi__InternalIpAddressElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Wifi__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Wifi__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Wifi__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AcccessPoint__AcccessPoint.initOperations(_AcccessPoint__AcccessPoint);
			Fragments._AcccessPoint__FirmwareElement.initOperations(_AcccessPoint__FirmwareElement);
			Fragments._AcccessPoint__InternalIpAddressElement.initOperations(_AcccessPoint__InternalIpAddressElement);
			Fragments._AcccessPoint__NamedElement.initOperations(_AcccessPoint__NamedElement);
			Fragments._AcccessPoint__OclAny.initOperations(_AcccessPoint__OclAny);
			Fragments._AcccessPoint__OclElement.initOperations(_AcccessPoint__OclElement);
			Fragments._AcccessPoint__PortNumberElement.initOperations(_AcccessPoint__PortNumberElement);

			Fragments._AuthenticationWifi__AuthenticationWifi.initOperations(_AuthenticationWifi__AuthenticationWifi);
			Fragments._AuthenticationWifi__OclAny.initOperations(_AuthenticationWifi__OclAny);
			Fragments._AuthenticationWifi__OclElement.initOperations(_AuthenticationWifi__OclElement);
			Fragments._AuthenticationWifi__OclEnumeration.initOperations(_AuthenticationWifi__OclEnumeration);
			Fragments._AuthenticationWifi__OclType.initOperations(_AuthenticationWifi__OclType);

			Fragments._EncryptionModeWifi__EncryptionModeWifi.initOperations(_EncryptionModeWifi__EncryptionModeWifi);
			Fragments._EncryptionModeWifi__OclAny.initOperations(_EncryptionModeWifi__OclAny);
			Fragments._EncryptionModeWifi__OclElement.initOperations(_EncryptionModeWifi__OclElement);
			Fragments._EncryptionModeWifi__OclEnumeration.initOperations(_EncryptionModeWifi__OclEnumeration);
			Fragments._EncryptionModeWifi__OclType.initOperations(_EncryptionModeWifi__OclType);

			Fragments._FirmwareElement__FirmwareElement.initOperations(_FirmwareElement__FirmwareElement);
			Fragments._FirmwareElement__OclAny.initOperations(_FirmwareElement__OclAny);
			Fragments._FirmwareElement__OclElement.initOperations(_FirmwareElement__OclElement);

			Fragments._Gateway__FirmwareElement.initOperations(_Gateway__FirmwareElement);
			Fragments._Gateway__Gateway.initOperations(_Gateway__Gateway);
			Fragments._Gateway__InternalIpAddressElement.initOperations(_Gateway__InternalIpAddressElement);
			Fragments._Gateway__NamedElement.initOperations(_Gateway__NamedElement);
			Fragments._Gateway__OclAny.initOperations(_Gateway__OclAny);
			Fragments._Gateway__OclElement.initOperations(_Gateway__OclElement);

			Fragments._GatewayTechnology__GatewayTechnology.initOperations(_GatewayTechnology__GatewayTechnology);
			Fragments._GatewayTechnology__OclAny.initOperations(_GatewayTechnology__OclAny);
			Fragments._GatewayTechnology__OclElement.initOperations(_GatewayTechnology__OclElement);
			Fragments._GatewayTechnology__OclEnumeration.initOperations(_GatewayTechnology__OclEnumeration);
			Fragments._GatewayTechnology__OclType.initOperations(_GatewayTechnology__OclType);

			Fragments._InternalIpAddressElement__InternalIpAddressElement.initOperations(_InternalIpAddressElement__InternalIpAddressElement);
			Fragments._InternalIpAddressElement__OclAny.initOperations(_InternalIpAddressElement__OclAny);
			Fragments._InternalIpAddressElement__OclElement.initOperations(_InternalIpAddressElement__OclElement);

			Fragments._NATTechnology__NATTechnology.initOperations(_NATTechnology__NATTechnology);
			Fragments._NATTechnology__OclAny.initOperations(_NATTechnology__OclAny);
			Fragments._NATTechnology__OclElement.initOperations(_NATTechnology__OclElement);
			Fragments._NATTechnology__OclEnumeration.initOperations(_NATTechnology__OclEnumeration);
			Fragments._NATTechnology__OclType.initOperations(_NATTechnology__OclType);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Network__NamedElement.initOperations(_Network__NamedElement);
			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);

			Fragments._OperatingFrequency__OclAny.initOperations(_OperatingFrequency__OclAny);
			Fragments._OperatingFrequency__OclElement.initOperations(_OperatingFrequency__OclElement);
			Fragments._OperatingFrequency__OclEnumeration.initOperations(_OperatingFrequency__OclEnumeration);
			Fragments._OperatingFrequency__OclType.initOperations(_OperatingFrequency__OclType);
			Fragments._OperatingFrequency__OperatingFrequency.initOperations(_OperatingFrequency__OperatingFrequency);

			Fragments._PortNumberElement__OclAny.initOperations(_PortNumberElement__OclAny);
			Fragments._PortNumberElement__OclElement.initOperations(_PortNumberElement__OclElement);
			Fragments._PortNumberElement__PortNumberElement.initOperations(_PortNumberElement__PortNumberElement);

			Fragments._PortType__OclAny.initOperations(_PortType__OclAny);
			Fragments._PortType__OclElement.initOperations(_PortType__OclElement);
			Fragments._PortType__OclEnumeration.initOperations(_PortType__OclEnumeration);
			Fragments._PortType__OclType.initOperations(_PortType__OclType);
			Fragments._PortType__PortType.initOperations(_PortType__PortType);

			Fragments._Router__FirmwareElement.initOperations(_Router__FirmwareElement);
			Fragments._Router__InternalIpAddressElement.initOperations(_Router__InternalIpAddressElement);
			Fragments._Router__NamedElement.initOperations(_Router__NamedElement);
			Fragments._Router__OclAny.initOperations(_Router__OclAny);
			Fragments._Router__OclElement.initOperations(_Router__OclElement);
			Fragments._Router__PortNumberElement.initOperations(_Router__PortNumberElement);
			Fragments._Router__Router.initOperations(_Router__Router);

			Fragments._RoutingProtocol__OclAny.initOperations(_RoutingProtocol__OclAny);
			Fragments._RoutingProtocol__OclElement.initOperations(_RoutingProtocol__OclElement);
			Fragments._RoutingProtocol__OclEnumeration.initOperations(_RoutingProtocol__OclEnumeration);
			Fragments._RoutingProtocol__OclType.initOperations(_RoutingProtocol__OclType);
			Fragments._RoutingProtocol__RoutingProtocol.initOperations(_RoutingProtocol__RoutingProtocol);

			Fragments._StaticRoute__NamedElement.initOperations(_StaticRoute__NamedElement);
			Fragments._StaticRoute__OclAny.initOperations(_StaticRoute__OclAny);
			Fragments._StaticRoute__OclElement.initOperations(_StaticRoute__OclElement);
			Fragments._StaticRoute__StaticRoute.initOperations(_StaticRoute__StaticRoute);

			Fragments._SwitchL2__FirmwareElement.initOperations(_SwitchL2__FirmwareElement);
			Fragments._SwitchL2__InternalIpAddressElement.initOperations(_SwitchL2__InternalIpAddressElement);
			Fragments._SwitchL2__NamedElement.initOperations(_SwitchL2__NamedElement);
			Fragments._SwitchL2__OclAny.initOperations(_SwitchL2__OclAny);
			Fragments._SwitchL2__OclElement.initOperations(_SwitchL2__OclElement);
			Fragments._SwitchL2__PortNumberElement.initOperations(_SwitchL2__PortNumberElement);
			Fragments._SwitchL2__SwitchL2.initOperations(_SwitchL2__SwitchL2);

			Fragments._SwitchL3__FirmwareElement.initOperations(_SwitchL3__FirmwareElement);
			Fragments._SwitchL3__InternalIpAddressElement.initOperations(_SwitchL3__InternalIpAddressElement);
			Fragments._SwitchL3__NamedElement.initOperations(_SwitchL3__NamedElement);
			Fragments._SwitchL3__OclAny.initOperations(_SwitchL3__OclAny);
			Fragments._SwitchL3__OclElement.initOperations(_SwitchL3__OclElement);
			Fragments._SwitchL3__PortNumberElement.initOperations(_SwitchL3__PortNumberElement);
			Fragments._SwitchL3__SwitchL3.initOperations(_SwitchL3__SwitchL3);

			Fragments._VLAN__NamedElement.initOperations(_VLAN__NamedElement);
			Fragments._VLAN__OclAny.initOperations(_VLAN__OclAny);
			Fragments._VLAN__OclElement.initOperations(_VLAN__OclElement);
			Fragments._VLAN__VLAN.initOperations(_VLAN__VLAN);

			Fragments._Wifi__InternalIpAddressElement.initOperations(_Wifi__InternalIpAddressElement);
			Fragments._Wifi__NamedElement.initOperations(_Wifi__NamedElement);
			Fragments._Wifi__OclAny.initOperations(_Wifi__OclAny);
			Fragments._Wifi__OclElement.initOperations(_Wifi__OclElement);
			Fragments._Wifi__Wifi.initOperations(_Wifi__Wifi);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AcccessPoint = {
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			NetworkArchitectureTables.Properties._AcccessPoint__maxClientSupport,
			NetworkArchitectureTables.Properties._FirmwareElement__model,
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._FirmwareElement__operatingSystem,
			NetworkArchitectureTables.Properties._FirmwareElement__osVersion,
			NetworkArchitectureTables.Properties._PortNumberElement__portNumber,
			NetworkArchitectureTables.Properties._AcccessPoint__vlan,
			NetworkArchitectureTables.Properties._AcccessPoint__wifis
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AuthenticationWifi = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EncryptionModeWifi = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FirmwareElement = {
			NetworkArchitectureTables.Properties._FirmwareElement__model,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._FirmwareElement__operatingSystem,
			NetworkArchitectureTables.Properties._FirmwareElement__osVersion
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Gateway = {
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			NetworkArchitectureTables.Properties._FirmwareElement__model,
			NetworkArchitectureTables.Properties._NamedElement__name,
			NetworkArchitectureTables.Properties._Gateway__nat,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._FirmwareElement__operatingSystem,
			NetworkArchitectureTables.Properties._FirmwareElement__osVersion,
			NetworkArchitectureTables.Properties._Gateway__router,
			NetworkArchitectureTables.Properties._Gateway__tecnology,
			NetworkArchitectureTables.Properties._Gateway__vlan
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GatewayTechnology = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InternalIpAddressElement = {
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NATTechnology = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Network = {
			NetworkArchitectureTables.Properties._Network__gateway,
			NetworkArchitectureTables.Properties._NamedElement__name,
			NetworkArchitectureTables.Properties._Network__networkDevicesCount,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._Network__publicIpAddres,
			NetworkArchitectureTables.Properties._Network__vlans,
			NetworkArchitectureTables.Properties._Network__wifis
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OperatingFrequency = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PortNumberElement = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._PortNumberElement__portNumber
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PortType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Router = {
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			NetworkArchitectureTables.Properties._FirmwareElement__model,
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._FirmwareElement__operatingSystem,
			NetworkArchitectureTables.Properties._FirmwareElement__osVersion,
			NetworkArchitectureTables.Properties._PortNumberElement__portNumber,
			NetworkArchitectureTables.Properties._Router__routingProtocol,
			NetworkArchitectureTables.Properties._Router__staticRoute,
			NetworkArchitectureTables.Properties._Router__switchL3,
			NetworkArchitectureTables.Properties._Router__vlans
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RoutingProtocol = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StaticRoute = {
			NetworkArchitectureTables.Properties._StaticRoute__gateway,
			NetworkArchitectureTables.Properties._StaticRoute__metric,
			NetworkArchitectureTables.Properties._NamedElement__name,
			NetworkArchitectureTables.Properties._StaticRoute__netInterface,
			NetworkArchitectureTables.Properties._StaticRoute__netmask,
			NetworkArchitectureTables.Properties._StaticRoute__networkDestination,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SwitchL2 = {
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			NetworkArchitectureTables.Properties._FirmwareElement__model,
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._FirmwareElement__operatingSystem,
			NetworkArchitectureTables.Properties._FirmwareElement__osVersion,
			NetworkArchitectureTables.Properties._PortNumberElement__portNumber,
			NetworkArchitectureTables.Properties._SwitchL2__portType,
			NetworkArchitectureTables.Properties._SwitchL2__vlans
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SwitchL3 = {
			NetworkArchitectureTables.Properties._SwitchL3__accessPoints,
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			NetworkArchitectureTables.Properties._FirmwareElement__model,
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._FirmwareElement__operatingSystem,
			NetworkArchitectureTables.Properties._FirmwareElement__osVersion,
			NetworkArchitectureTables.Properties._PortNumberElement__portNumber,
			NetworkArchitectureTables.Properties._SwitchL3__routingProtocol,
			NetworkArchitectureTables.Properties._SwitchL3__staticRoute,
			NetworkArchitectureTables.Properties._SwitchL3__switchL2,
			NetworkArchitectureTables.Properties._SwitchL3__totalConnectedDevices,
			NetworkArchitectureTables.Properties._SwitchL3__vlans
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VLAN = {
			NetworkArchitectureTables.Properties._VLAN__idVLan,
			NetworkArchitectureTables.Properties._VLAN__ipGateway,
			NetworkArchitectureTables.Properties._VLAN__lowerIp,
			NetworkArchitectureTables.Properties._VLAN__mtu,
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._VLAN__subnet,
			NetworkArchitectureTables.Properties._VLAN__upperIp
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Wifi = {
			NetworkArchitectureTables.Properties._Wifi__authentication,
			NetworkArchitectureTables.Properties._Wifi__channel,
			NetworkArchitectureTables.Properties._Wifi__encryption,
			NetworkArchitectureTables.Properties._Wifi__frequency,
			NetworkArchitectureTables.Properties._InternalIpAddressElement__internalIpAddress,
			NetworkArchitectureTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			NetworkArchitectureTables.Properties._Wifi__ssid,
			NetworkArchitectureTables.Properties._Wifi__vlan
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AcccessPoint__AcccessPoint.initProperties(_AcccessPoint);
			Fragments._AuthenticationWifi__AuthenticationWifi.initProperties(_AuthenticationWifi);
			Fragments._EncryptionModeWifi__EncryptionModeWifi.initProperties(_EncryptionModeWifi);
			Fragments._FirmwareElement__FirmwareElement.initProperties(_FirmwareElement);
			Fragments._Gateway__Gateway.initProperties(_Gateway);
			Fragments._GatewayTechnology__GatewayTechnology.initProperties(_GatewayTechnology);
			Fragments._InternalIpAddressElement__InternalIpAddressElement.initProperties(_InternalIpAddressElement);
			Fragments._NATTechnology__NATTechnology.initProperties(_NATTechnology);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Network__Network.initProperties(_Network);
			Fragments._OperatingFrequency__OperatingFrequency.initProperties(_OperatingFrequency);
			Fragments._PortNumberElement__PortNumberElement.initProperties(_PortNumberElement);
			Fragments._PortType__PortType.initProperties(_PortType);
			Fragments._Router__Router.initProperties(_Router);
			Fragments._RoutingProtocol__RoutingProtocol.initProperties(_RoutingProtocol);
			Fragments._StaticRoute__StaticRoute.initProperties(_StaticRoute);
			Fragments._SwitchL2__SwitchL2.initProperties(_SwitchL2);
			Fragments._SwitchL3__SwitchL3.initProperties(_SwitchL3);
			Fragments._VLAN__VLAN.initProperties(_VLAN);
			Fragments._Wifi__Wifi.initProperties(_Wifi);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _AuthenticationWifi__shared = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.AUTHENTICATION_WIFI.getEEnumLiteral("shared"), Types._AuthenticationWifi, 0);
		public static final EcoreExecutorEnumerationLiteral _AuthenticationWifi__open = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.AUTHENTICATION_WIFI.getEEnumLiteral("open"), Types._AuthenticationWifi, 1);
		public static final EcoreExecutorEnumerationLiteral _AuthenticationWifi__wpa_version_2 = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.AUTHENTICATION_WIFI.getEEnumLiteral("wpa_version_2"), Types._AuthenticationWifi, 2);
		public static final EcoreExecutorEnumerationLiteral _AuthenticationWifi__sea = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.AUTHENTICATION_WIFI.getEEnumLiteral("sea"), Types._AuthenticationWifi, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AuthenticationWifi = {
			_AuthenticationWifi__shared,
			_AuthenticationWifi__open,
			_AuthenticationWifi__wpa_version_2,
			_AuthenticationWifi__sea
		};

		public static final EcoreExecutorEnumerationLiteral _EncryptionModeWifi__aes_ccm = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ENCRYPTION_MODE_WIFI.getEEnumLiteral("aes_ccm"), Types._EncryptionModeWifi, 0);
		public static final EcoreExecutorEnumerationLiteral _EncryptionModeWifi__wep = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ENCRYPTION_MODE_WIFI.getEEnumLiteral("wep"), Types._EncryptionModeWifi, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _EncryptionModeWifi = {
			_EncryptionModeWifi__aes_ccm,
			_EncryptionModeWifi__wep
		};

		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__IP = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("IP"), Types._GatewayTechnology, 0);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__LTE = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("LTE"), Types._GatewayTechnology, 1);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__FiveG = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("FiveG"), Types._GatewayTechnology, 2);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__Coaxial = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("Coaxial"), Types._GatewayTechnology, 3);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__UMTS = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("UMTS"), Types._GatewayTechnology, 4);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__ADSL = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("ADSL"), Types._GatewayTechnology, 5);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__ADSL_Plus = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("ADSL_Plus"), Types._GatewayTechnology, 6);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__ADSL_2 = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("ADSL_2"), Types._GatewayTechnology, 7);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__FTTC = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("FTTC"), Types._GatewayTechnology, 8);
		public static final EcoreExecutorEnumerationLiteral _GatewayTechnology__FTTH = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.GATEWAY_TECHNOLOGY.getEEnumLiteral("FTTH"), Types._GatewayTechnology, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _GatewayTechnology = {
			_GatewayTechnology__IP,
			_GatewayTechnology__LTE,
			_GatewayTechnology__FiveG,
			_GatewayTechnology__Coaxial,
			_GatewayTechnology__UMTS,
			_GatewayTechnology__ADSL,
			_GatewayTechnology__ADSL_Plus,
			_GatewayTechnology__ADSL_2,
			_GatewayTechnology__FTTC,
			_GatewayTechnology__FTTH
		};

		public static final EcoreExecutorEnumerationLiteral _NATTechnology__Static_NAT = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY.getEEnumLiteral("Static_NAT"), Types._NATTechnology, 0);
		public static final EcoreExecutorEnumerationLiteral _NATTechnology__Dynamic_NAT = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY.getEEnumLiteral("Dynamic_NAT"), Types._NATTechnology, 1);
		public static final EcoreExecutorEnumerationLiteral _NATTechnology__Port_Address_Translation = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY.getEEnumLiteral("Port_Address_Translation"), Types._NATTechnology, 2);
		public static final EcoreExecutorEnumerationLiteral _NATTechnology__One_To_One_NAT = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY.getEEnumLiteral("One_To_One_NAT"), Types._NATTechnology, 3);
		public static final EcoreExecutorEnumerationLiteral _NATTechnology__Dual_NAT = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY.getEEnumLiteral("Dual_NAT"), Types._NATTechnology, 4);
		public static final EcoreExecutorEnumerationLiteral _NATTechnology__Twice_NAT = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.NAT_TECHNOLOGY.getEEnumLiteral("Twice_NAT"), Types._NATTechnology, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _NATTechnology = {
			_NATTechnology__Static_NAT,
			_NATTechnology__Dynamic_NAT,
			_NATTechnology__Port_Address_Translation,
			_NATTechnology__One_To_One_NAT,
			_NATTechnology__Dual_NAT,
			_NATTechnology__Twice_NAT
		};

		public static final EcoreExecutorEnumerationLiteral _OperatingFrequency__Ghz_2_4 = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.OPERATING_FREQUENCY.getEEnumLiteral("Ghz_2_4"), Types._OperatingFrequency, 0);
		public static final EcoreExecutorEnumerationLiteral _OperatingFrequency__Ghz_5 = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.OPERATING_FREQUENCY.getEEnumLiteral("Ghz_5"), Types._OperatingFrequency, 1);
		public static final EcoreExecutorEnumerationLiteral _OperatingFrequency__Ghz_6 = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.OPERATING_FREQUENCY.getEEnumLiteral("Ghz_6"), Types._OperatingFrequency, 2);
		public static final EcoreExecutorEnumerationLiteral _OperatingFrequency__Ghz_60 = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.OPERATING_FREQUENCY.getEEnumLiteral("Ghz_60"), Types._OperatingFrequency, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperatingFrequency = {
			_OperatingFrequency__Ghz_2_4,
			_OperatingFrequency__Ghz_5,
			_OperatingFrequency__Ghz_6,
			_OperatingFrequency__Ghz_60
		};

		public static final EcoreExecutorEnumerationLiteral _PortType__Voip = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.PORT_TYPE.getEEnumLiteral("Voip"), Types._PortType, 0);
		public static final EcoreExecutorEnumerationLiteral _PortType__Access = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.PORT_TYPE.getEEnumLiteral("Access"), Types._PortType, 1);
		public static final EcoreExecutorEnumerationLiteral _PortType__Trunk = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.PORT_TYPE.getEEnumLiteral("Trunk"), Types._PortType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PortType = {
			_PortType__Voip,
			_PortType__Access,
			_PortType__Trunk
		};

		public static final EcoreExecutorEnumerationLiteral _RoutingProtocol__RIP = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL.getEEnumLiteral("RIP"), Types._RoutingProtocol, 0);
		public static final EcoreExecutorEnumerationLiteral _RoutingProtocol__OSPF = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL.getEEnumLiteral("OSPF"), Types._RoutingProtocol, 1);
		public static final EcoreExecutorEnumerationLiteral _RoutingProtocol__EIGRP = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL.getEEnumLiteral("EIGRP"), Types._RoutingProtocol, 2);
		public static final EcoreExecutorEnumerationLiteral _RoutingProtocol__IS_IS = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL.getEEnumLiteral("IS_IS"), Types._RoutingProtocol, 3);
		public static final EcoreExecutorEnumerationLiteral _RoutingProtocol__BGP = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL.getEEnumLiteral("BGP"), Types._RoutingProtocol, 4);
		public static final EcoreExecutorEnumerationLiteral _RoutingProtocol__IGRP = new EcoreExecutorEnumerationLiteral(NetworkArchitecturePackage.Literals.ROUTING_PROTOCOL.getEEnumLiteral("IGRP"), Types._RoutingProtocol, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RoutingProtocol = {
			_RoutingProtocol__RIP,
			_RoutingProtocol__OSPF,
			_RoutingProtocol__EIGRP,
			_RoutingProtocol__IS_IS,
			_RoutingProtocol__BGP,
			_RoutingProtocol__IGRP
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AuthenticationWifi.initLiterals(_AuthenticationWifi);
			Types._EncryptionModeWifi.initLiterals(_EncryptionModeWifi);
			Types._GatewayTechnology.initLiterals(_GatewayTechnology);
			Types._NATTechnology.initLiterals(_NATTechnology);
			Types._OperatingFrequency.initLiterals(_OperatingFrequency);
			Types._PortType.initLiterals(_PortType);
			Types._RoutingProtocol.initLiterals(_RoutingProtocol);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of NetworkArchitectureTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new NetworkArchitectureTables();
	}

	private NetworkArchitectureTables() {
		super(NetworkArchitecturePackage.eNS_URI);
	}
}
