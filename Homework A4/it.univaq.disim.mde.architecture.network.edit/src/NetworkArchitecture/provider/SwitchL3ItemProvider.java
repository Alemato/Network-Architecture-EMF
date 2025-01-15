/**
 */
package NetworkArchitecture.provider;


import NetworkArchitecture.NetworkArchitectureFactory;
import NetworkArchitecture.NetworkArchitecturePackage;
import NetworkArchitecture.SwitchL3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link NetworkArchitecture.SwitchL3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchL3ItemProvider extends InternalIpAddressElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchL3ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addOsVersionPropertyDescriptor(object);
			addOperatingSystemPropertyDescriptor(object);
			addPortNumberPropertyDescriptor(object);
			addRoutingProtocolPropertyDescriptor(object);
			addVlansPropertyDescriptor(object);
			addTotalConnectedDevicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 NetworkArchitecturePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FirmwareElement_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareElement_model_feature", "_UI_FirmwareElement_type"),
				 NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT__MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Os Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FirmwareElement_osVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareElement_osVersion_feature", "_UI_FirmwareElement_type"),
				 NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT__OS_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operating System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatingSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FirmwareElement_operatingSystem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FirmwareElement_operatingSystem_feature", "_UI_FirmwareElement_type"),
				 NetworkArchitecturePackage.Literals.FIRMWARE_ELEMENT__OPERATING_SYSTEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortNumberElement_portNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortNumberElement_portNumber_feature", "_UI_PortNumberElement_type"),
				 NetworkArchitecturePackage.Literals.PORT_NUMBER_ELEMENT__PORT_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Routing Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwitchL3_routingProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchL3_routingProtocol_feature", "_UI_SwitchL3_type"),
				 NetworkArchitecturePackage.Literals.SWITCH_L3__ROUTING_PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vlans feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVlansPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwitchL3_vlans_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchL3_vlans_feature", "_UI_SwitchL3_type"),
				 NetworkArchitecturePackage.Literals.SWITCH_L3__VLANS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Connected Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalConnectedDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwitchL3_totalConnectedDevices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwitchL3_totalConnectedDevices_feature", "_UI_SwitchL3_type"),
				 NetworkArchitecturePackage.Literals.SWITCH_L3__TOTAL_CONNECTED_DEVICES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NetworkArchitecturePackage.Literals.SWITCH_L3__SWITCH_L2);
			childrenFeatures.add(NetworkArchitecturePackage.Literals.SWITCH_L3__STATIC_ROUTE);
			childrenFeatures.add(NetworkArchitecturePackage.Literals.SWITCH_L3__ACCESS_POINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SwitchL3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwitchL3"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SwitchL3)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SwitchL3_type") :
			getString("_UI_SwitchL3_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SwitchL3.class)) {
			case NetworkArchitecturePackage.SWITCH_L3__NAME:
			case NetworkArchitecturePackage.SWITCH_L3__MODEL:
			case NetworkArchitecturePackage.SWITCH_L3__OS_VERSION:
			case NetworkArchitecturePackage.SWITCH_L3__OPERATING_SYSTEM:
			case NetworkArchitecturePackage.SWITCH_L3__PORT_NUMBER:
			case NetworkArchitecturePackage.SWITCH_L3__ROUTING_PROTOCOL:
			case NetworkArchitecturePackage.SWITCH_L3__TOTAL_CONNECTED_DEVICES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NetworkArchitecturePackage.SWITCH_L3__SWITCH_L2:
			case NetworkArchitecturePackage.SWITCH_L3__STATIC_ROUTE:
			case NetworkArchitecturePackage.SWITCH_L3__ACCESS_POINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NetworkArchitecturePackage.Literals.SWITCH_L3__SWITCH_L2,
				 NetworkArchitectureFactory.eINSTANCE.createSwitchL2()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkArchitecturePackage.Literals.SWITCH_L3__STATIC_ROUTE,
				 NetworkArchitectureFactory.eINSTANCE.createStaticRoute()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkArchitecturePackage.Literals.SWITCH_L3__ACCESS_POINTS,
				 NetworkArchitectureFactory.eINSTANCE.createAccessPoint()));
	}

}
