package it.univaq.disim.mde.architecture.network.business;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import NetworkArchitecture.AccessPoint;
import NetworkArchitecture.AuthenticationWifi;
import NetworkArchitecture.EncryptionModeWifi;
import NetworkArchitecture.Gateway;
import NetworkArchitecture.GatewayTechnology;
import NetworkArchitecture.NATTechnology;
import NetworkArchitecture.Network;
import NetworkArchitecture.NetworkArchitectureFactory;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.OperatingFrequency;
import NetworkArchitecture.PortType;
import NetworkArchitecture.Router;
import NetworkArchitecture.RoutingProtocol;
import NetworkArchitecture.StaticRoute;
import NetworkArchitecture.SwitchL2;
import NetworkArchitecture.SwitchL3;
import NetworkArchitecture.VLAN;
import NetworkArchitecture.Wifi;

public class ModelUtils {
	public static String FILENAME_NETWORK_DIPENDENTI_COPPITO = "Network_Gateway_Dipendenti_Coppito.xmi";
	public static String FILENAME_NETWORK_HOME = "Network_Home.xmi";

	public static Network createNetworkDipenditiCoppito() {
		Network network = NetworkArchitectureFactory.eINSTANCE.createNetwork();
		network.setName("Gateway Dipenditi Coppito");
		network.setPublicIpAddres("185.224.114.19");

		VLAN vlanDefault = NetworkArchitectureFactory.eINSTANCE.createVLAN();
		vlanDefault.setIdVLan(0);
		vlanDefault.setIpGateway("172.20.0.1");
		vlanDefault.setLowerIp("172.20.0.2");
		vlanDefault.setMtu(1500);
		vlanDefault.setName("Default");
		vlanDefault.setSubnet("255.255.255.0");
		vlanDefault.setUpperIp("172.20.0.254");

		VLAN vlanOne = NetworkArchitectureFactory.eINSTANCE.createVLAN();
		vlanOne.setIdVLan(1);
		vlanOne.setIpGateway("192.168.0.1");
		vlanOne.setLowerIp("192.168.0.2");
		vlanOne.setMtu(1500);
		vlanOne.setName("1");
		vlanOne.setSubnet("255.255.255.0");
		vlanOne.setUpperIp("192.168.0.254");

		VLAN vlanTwo = NetworkArchitectureFactory.eINSTANCE.createVLAN();
		vlanTwo.setIdVLan(2);
		vlanTwo.setIpGateway("192.168.2.1");
		vlanTwo.setLowerIp("192.168.2.2");
		vlanTwo.setMtu(1500);
		vlanTwo.setName("2");
		vlanTwo.setSubnet("255.255.255.0");
		vlanTwo.setUpperIp("192.168.2.254");

		network.getVlans().add(vlanDefault);
		network.getVlans().add(vlanOne);
		network.getVlans().add(vlanTwo);

		Wifi wifiUnivaq24 = NetworkArchitectureFactory.eINSTANCE.createWifi();
		wifiUnivaq24.setAuthentication(AuthenticationWifi.SHARED);
		wifiUnivaq24.setChannel(11);
		wifiUnivaq24.setEncryption(EncryptionModeWifi.AES_CCM);
		wifiUnivaq24.setFrequency(OperatingFrequency.GHZ_24);
		wifiUnivaq24.setInternalIpAddress("192.168.0.2");
		wifiUnivaq24.setName("UNIVAQ 2.4");
		wifiUnivaq24.setSsid("UNIVAQ");
		wifiUnivaq24.setVlan(vlanOne);

		Wifi wifiUnivaq5 = NetworkArchitectureFactory.eINSTANCE.createWifi();
		wifiUnivaq5.setAuthentication(AuthenticationWifi.OPEN);
		wifiUnivaq5.setChannel(140);
		wifiUnivaq5.setEncryption(EncryptionModeWifi.AES_CCM);
		wifiUnivaq5.setFrequency(OperatingFrequency.GHZ_5);
		wifiUnivaq5.setInternalIpAddress("192.168.0.2");
		wifiUnivaq5.setName("UNIVAQ 5");
		wifiUnivaq5.setSsid("UNIVAQ");
		wifiUnivaq5.setVlan(vlanOne);

		Wifi wifiEduroam24 = NetworkArchitectureFactory.eINSTANCE.createWifi();
		wifiEduroam24.setAuthentication(AuthenticationWifi.SHARED);
		wifiEduroam24.setChannel(5);
		wifiEduroam24.setEncryption(EncryptionModeWifi.AES_CCM);
		wifiEduroam24.setFrequency(OperatingFrequency.GHZ_24);
		wifiEduroam24.setInternalIpAddress("192.168.2.2");
		wifiEduroam24.setName("Eduroam 2.4");
		wifiEduroam24.setSsid("Eduroam");
		wifiEduroam24.setVlan(vlanTwo);

		Wifi wifiEduroam5 = NetworkArchitectureFactory.eINSTANCE.createWifi();
		wifiEduroam5.setAuthentication(AuthenticationWifi.OPEN);
		wifiEduroam5.setChannel(144);
		wifiEduroam5.setEncryption(EncryptionModeWifi.AES_CCM);
		wifiEduroam5.setFrequency(OperatingFrequency.GHZ_5);
		wifiEduroam5.setInternalIpAddress("192.168.2.2");
		wifiEduroam5.setName("Eduroam 5");
		wifiEduroam5.setSsid("Eduroam");
		wifiEduroam5.setVlan(vlanTwo);

		network.getWifis().add(wifiUnivaq24);
		network.getWifis().add(wifiUnivaq5);
		network.getWifis().add(wifiEduroam24);
		network.getWifis().add(wifiEduroam5);

		Gateway gateway = NetworkArchitectureFactory.eINSTANCE.createGateway();
		gateway.setInternalIpAddress("172.20.0.1");
		gateway.setModel("Cisco");
		gateway.setName("Dipendenti Coppito");
		gateway.setNat(NATTechnology.STATIC_NAT);
		gateway.setOperatingSystem("Cisco IoS");
		gateway.setOsVersion("1.200.125a");
		gateway.setTecnology(GatewayTechnology.IP);
		gateway.setVlan(vlanDefault);

		Router router = NetworkArchitectureFactory.eINSTANCE.createRouter();
		router.setInternalIpAddress("172.20.0.2");
		router.setModel("Cisco Router");
		router.setName("Reti Dipendenti Coppito");
		router.setOperatingSystem("Cisco IoS");
		router.setOsVersion("1.200.125a");
		router.setPortNumber(16);
		router.setRoutingProtocol(RoutingProtocol.RIP);
		router.getVlans().add(vlanDefault);

		StaticRoute staticRouteInternet = NetworkArchitectureFactory.eINSTANCE.createStaticRoute();
		staticRouteInternet.setGateway("172.20.0.1");
		staticRouteInternet.setMetric(32);
		staticRouteInternet.setName("Internet Route");
		staticRouteInternet.setNetInterface("172.20.0.2");
		staticRouteInternet.setNetmask("0.0.0.0");
		staticRouteInternet.setNetworkDestination("0.0.0.0");

		SwitchL3 switchL3C1Piano1 = NetworkArchitectureFactory.eINSTANCE.createSwitchL3();
		switchL3C1Piano1.setInternalIpAddress("172.20.0.3");
		switchL3C1Piano1.setModel("Cisco Catalyst serie 9400");
		switchL3C1Piano1.setName("Switch Edifico C1 piano 1");
		switchL3C1Piano1.setOperatingSystem("Cisco IoS");
		switchL3C1Piano1.setOsVersion("1.200.125b");
		switchL3C1Piano1.setPortNumber(32);
		switchL3C1Piano1.setRoutingProtocol(RoutingProtocol.OSPF);
		switchL3C1Piano1.getVlans().add(vlanDefault);
		switchL3C1Piano1.getVlans().add(vlanOne);
		switchL3C1Piano1.getVlans().add(vlanTwo);

		StaticRoute staticRouteC1 = NetworkArchitectureFactory.eINSTANCE.createStaticRoute();
		staticRouteC1.setGateway("172.20.0.1");
		staticRouteC1.setMetric(32);
		staticRouteC1.setName("C1 piano 1");
		staticRouteC1.setNetInterface("172.20.0.3");
		staticRouteC1.setNetmask("255.255.225.0");
		staticRouteC1.setNetworkDestination("192.168.0.0");

		AccessPoint accessPointC1Piano1 = NetworkArchitectureFactory.eINSTANCE.createAccessPoint();
		accessPointC1Piano1.setInternalIpAddress("170.20.0.4");
		accessPointC1Piano1.setMaxClientSupport(300);
		accessPointC1Piano1.setModel("Catalyst 9100 Access Points");
		accessPointC1Piano1.setName("Edificio C1 piano 1");
		accessPointC1Piano1.setOperatingSystem("Cisco IoS");
		accessPointC1Piano1.setOsVersion("1.200.125b");
		accessPointC1Piano1.setPortNumber(1);
		accessPointC1Piano1.setVlan(vlanDefault);
		accessPointC1Piano1.getWifis().add(wifiUnivaq24);
		accessPointC1Piano1.getWifis().add(wifiUnivaq5);
		accessPointC1Piano1.getWifis().add(wifiEduroam24);
		accessPointC1Piano1.getWifis().add(wifiEduroam5);

		switchL3C1Piano1.getStaticRoute().add(staticRouteC1);
		switchL3C1Piano1.getAccessPoints().add(accessPointC1Piano1);

		SwitchL3 switchL3C1Piano2 = NetworkArchitectureFactory.eINSTANCE.createSwitchL3();
		switchL3C1Piano2.setInternalIpAddress("172.20.0.5");
		switchL3C1Piano2.setModel("Cisco Catalyst serie 9400");
		switchL3C1Piano2.setName("Switch Edifico C1 piano 2");
		switchL3C1Piano2.setOperatingSystem("Cisco IoS");
		switchL3C1Piano2.setOsVersion("1.200.125b");
		switchL3C1Piano2.setPortNumber(32);
		switchL3C1Piano2.setRoutingProtocol(RoutingProtocol.OSPF);
		switchL3C1Piano2.getVlans().add(vlanDefault);
		switchL3C1Piano2.getVlans().add(vlanOne);
		switchL3C1Piano2.getVlans().add(vlanTwo);

		SwitchL2 switchL2 = NetworkArchitectureFactory.eINSTANCE.createSwitchL2();
		switchL2.setInternalIpAddress("172.20.0.7");
		switchL2.setModel("Cisco Catalyst serie 9600");
		switchL2.setName("Switch C1 piano 2 Stanza 2.25");
		switchL2.setOperatingSystem("Cisco IoS");
		switchL2.setOsVersion("1.200.125c");
		switchL2.setPortNumber(16);
		switchL2.setPortType(PortType.ACCESS);
		switchL2.getVlans().add(vlanDefault);
		switchL2.getVlans().add(vlanOne);
		switchL2.getVlans().add(vlanTwo);

		AccessPoint accessPointC1Piano2 = NetworkArchitectureFactory.eINSTANCE.createAccessPoint();
		accessPointC1Piano2.setInternalIpAddress("170.20.0.4");
		accessPointC1Piano2.setMaxClientSupport(300);
		accessPointC1Piano2.setModel("Catalyst 9100 Access Points");
		accessPointC1Piano2.setName("Edificio C1 piano 1");
		accessPointC1Piano2.setOperatingSystem("Cisco IoS");
		accessPointC1Piano2.setOsVersion("1.200.125b");
		accessPointC1Piano2.setPortNumber(1);
		accessPointC1Piano2.setVlan(vlanDefault);
		accessPointC1Piano2.getWifis().add(wifiUnivaq24);
		accessPointC1Piano2.getWifis().add(wifiUnivaq5);
		accessPointC1Piano2.getWifis().add(wifiEduroam24);
		accessPointC1Piano2.getWifis().add(wifiEduroam5);

		switchL3C1Piano2.getSwitchL2().add(switchL2);
		switchL3C1Piano2.getAccessPoints().add(accessPointC1Piano2);

		router.getStaticRoute().add(staticRouteInternet);
		router.getSwitchL3().add(switchL3C1Piano1);
		router.getSwitchL3().add(switchL3C1Piano2);

		gateway.setRouter(router);

		network.setGateway(gateway);

		return network;
	}
	
	public static Network createNetworkHome() {
		Network network = NetworkArchitectureFactory.eINSTANCE.createNetwork();
		network.setName("Gateway Home");
		network.setPublicIpAddres("185.224.114.19");

		VLAN vlanDefault = NetworkArchitectureFactory.eINSTANCE.createVLAN();
		vlanDefault.setIdVLan(0);
		vlanDefault.setIpGateway("192.168.0.1");
		vlanDefault.setLowerIp("192.168.0.2");
		vlanDefault.setMtu(1500);
		vlanDefault.setName("Default");
		vlanDefault.setSubnet("255.255.255.0");
		vlanDefault.setUpperIp("192.168.0.254");

		network.getVlans().add(vlanDefault);

		Wifi wifiHome24 = NetworkArchitectureFactory.eINSTANCE.createWifi();
		wifiHome24.setAuthentication(AuthenticationWifi.SHARED);
		wifiHome24.setChannel(11);
		wifiHome24.setEncryption(EncryptionModeWifi.AES_CCM);
		wifiHome24.setFrequency(OperatingFrequency.GHZ_24);
		wifiHome24.setInternalIpAddress("192.168.0.2");
		wifiHome24.setName("HOME 2.4");
		wifiHome24.setSsid("HOME");
		wifiHome24.setVlan(vlanDefault);

		Wifi wifiHome5 = NetworkArchitectureFactory.eINSTANCE.createWifi();
		wifiHome5.setAuthentication(AuthenticationWifi.OPEN);
		wifiHome5.setChannel(140);
		wifiHome5.setEncryption(EncryptionModeWifi.AES_CCM);
		wifiHome5.setFrequency(OperatingFrequency.GHZ_5);
		wifiHome5.setInternalIpAddress("192.168.0.2");
		wifiHome5.setName("HOME 5");
		wifiHome5.setSsid("HOME");
		wifiHome5.setVlan(vlanDefault);

		network.getWifis().add(wifiHome24);
		network.getWifis().add(wifiHome5);
		
		Gateway gateway = NetworkArchitectureFactory.eINSTANCE.createGateway();
		gateway.setInternalIpAddress("192.168.0.1");
		gateway.setModel("FRITZ!Box 5690 Pro");
		gateway.setName("Home");
		gateway.setNat(NATTechnology.STATIC_NAT);
		gateway.setOperatingSystem("FRITZ!OS");
		gateway.setOsVersion("7.90");
		gateway.setTecnology(GatewayTechnology.IP);
		gateway.setVlan(vlanDefault);

		Router router = NetworkArchitectureFactory.eINSTANCE.createRouter();
		router.setInternalIpAddress("192.168.0.1");
		router.setModel("FRITZ!Box 5690 Pro");
		router.setName("Home");
		router.setOperatingSystem("FRITZ!OS");
		router.setOsVersion("7.90");
		router.setPortNumber(5);
		router.setRoutingProtocol(RoutingProtocol.RIP);
		router.getVlans().add(vlanDefault);

		StaticRoute staticRouteInternet = NetworkArchitectureFactory.eINSTANCE.createStaticRoute();
		staticRouteInternet.setGateway("192.168.0.1");
		staticRouteInternet.setMetric(32);
		staticRouteInternet.setName("Internet Route");
		staticRouteInternet.setNetInterface("192.168.0.1");
		staticRouteInternet.setNetmask("0.0.0.0");
		staticRouteInternet.setNetworkDestination("0.0.0.0");

		SwitchL3 switchL3 = NetworkArchitectureFactory.eINSTANCE.createSwitchL3();
		switchL3.setInternalIpAddress("192.168.0.1");
		switchL3.setModel("FRITZ!Box 5690 Pro");
		switchL3.setName("Home");
		switchL3.setOperatingSystem("FRITZ!OS");
		switchL3.setOsVersion("7.90");
		switchL3.setPortNumber(5);
		switchL3.setRoutingProtocol(RoutingProtocol.OSPF);
		switchL3.getVlans().add(vlanDefault);

		AccessPoint accessPoint = NetworkArchitectureFactory.eINSTANCE.createAccessPoint();
		accessPoint.setInternalIpAddress("192.168.0.1");
		accessPoint.setMaxClientSupport(300);
		accessPoint.setModel("FRITZ!Box 5690 Pro");
		accessPoint.setName("Home");
		accessPoint.setOperatingSystem("FRITZ!OS");
		accessPoint.setOsVersion("7.90");
		accessPoint.setPortNumber(1);
		accessPoint.setVlan(vlanDefault);
		accessPoint.getWifis().add(wifiHome24);
		accessPoint.getWifis().add(wifiHome5);
		
		switchL3.getAccessPoints().add(accessPoint);

		router.getStaticRoute().add(staticRouteInternet);
		router.getSwitchL3().add(switchL3);

		gateway.setRouter(router);

		network.setGateway(gateway);

		return network;
	}


	public static Diagnostic validate(Network nm) {
		return Diagnostician.INSTANCE.validate(nm);
	}

	public static Network load(String filename) {
		EPackage.Registry.INSTANCE.put(NetworkArchitecturePackage.eNS_URI, NetworkArchitecturePackage.eINSTANCE);
		ResourceSet rSet = new ResourceSetImpl();
		Resource resource = rSet.getResource(URI.createFileURI(filename), true);
		Network network = (Network) resource.getContents().get(0);
		System.out.println(network);
		return network;
	}

	public static void serializeModel(Network nm, String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		/*
		 * // Obtain a new resource set ResourceSet resSet = new ResourceSetImpl();
		 * 
		 * // create a resource Resource resource =
		 * resSet.createResource(URI.createURI(fileName));
		 * resource.getContents().add(nm);
		 * 
		 * // now save the content. try { resource.save(Collections.EMPTY_MAP); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		// Ottieni un nuovo set di risorse
		ResourceSet resSet = new ResourceSetImpl();

		// Crea l'URI assoluto
		URI uri;
		if (fileName.startsWith("/") || fileName.contains(":")) {
			// Percorso assoluto
			uri = URI.createFileURI(fileName);
		} else {
			// Percorso relativo -> usa la directory corrente
			String workDir = System.getProperty("user.dir");
			uri = URI.createFileURI(workDir + "/" + fileName);
		}

		// Crea una risorsa
		Resource resource = resSet.createResource(uri);
		resource.getContents().add(nm);

		// Salva il contenuto
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Network network = createNetworkDipenditiCoppito();
		serializeModel(network, FILENAME_NETWORK_DIPENDENTI_COPPITO);
		Network loadNetwork = load(FILENAME_NETWORK_DIPENDENTI_COPPITO);

		Diagnostic d = validate(loadNetwork);
		switch (d.getSeverity()) {
		case Diagnostic.OK:
			System.out.println("The model is completely valid (no problem)!");
			break;
		case Diagnostic.INFO:
			// Spesso non viene usato, ma viene usato se vengono definiti dei Diagnostics di
			// tipo INFO
			System.out.println("The model is valid but with information:");
			break;
		case Diagnostic.WARNING:
			System.out.println("The template has warnings, you can still proceed but it is advisable to check:");
			printDiagnostic(d, "  ");
			break;
		case Diagnostic.ERROR:
		default:
			System.out.println("The model is invalid. Here are the errors:");
			printDiagnostic(d, "  ");
			break;
		}
		System.out.println("Number of Network Device: " + network.getNetworkDevicesCount());
		
		Network network1 = createNetworkHome();
		serializeModel(network1, FILENAME_NETWORK_HOME);
	}

	public static void printDiagnostic(Diagnostic diagnostic, String indent) {
		// Stampa la severità
		switch (diagnostic.getSeverity()) {
		case Diagnostic.ERROR:
			System.out.print("ERROR: ");
			break;
		case Diagnostic.WARNING:
			System.out.print("WARNING: ");
			break;
		case Diagnostic.INFO:
			System.out.print("INFO: ");
			break;
		default:
			System.out.print("OK: ");
			break;
		}
		// Stampa il messaggio
		System.out.println(indent + diagnostic.getMessage());

		// Ricorsione per i figli
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

}
