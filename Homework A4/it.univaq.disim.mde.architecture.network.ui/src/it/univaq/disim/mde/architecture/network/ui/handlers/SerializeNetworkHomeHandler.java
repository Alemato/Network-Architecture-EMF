package it.univaq.disim.mde.architecture.network.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import NetworkArchitecture.Network;
import it.univaq.disim.mde.architecture.network.business.ModelUtils;
import it.univaq.disim.mde.architecture.network.ui.dialog.NetworkArchitectureSaveDialog;

public class SerializeNetworkHomeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		NetworkArchitectureSaveDialog dialog = new NetworkArchitectureSaveDialog(window.getShell(), "File Name for Network Home Model", "Enter the filename for the NetworkArchitecture Model\n Type: Network Home Model", "Network_Home.xmi");
		dialog.create();
		if (dialog.open() == Window.OK) {
			try {
				System.out.println(dialog.getFullname());
				Network net = ModelUtils.createNetworkHome();
				System.out.println("Number of Network Device Serialized: " + net.getNetworkDevicesCount());
				ModelUtils.serializeModel(net, dialog.getFullname());
				
				refreshAllProjects();
				
				Network net1 = ModelUtils.load(dialog.getFullname());
				System.out.println("Number of Network Device Re-Load: " + net1.getNetworkDevicesCount());
				
				MessageDialog.openInformation(window.getShell(), "Model Serialized Successfully!", "The model has been successfully serialized!\n\n Number of Network Devices within the Model are: " + net1.getNetworkDevicesCount());
			} catch (Exception e) {
				ErrorDialog dialogo = new ErrorDialog(window.getShell(), "ERROR", e.getMessage(),
						getMultiStatus(e.getMessage(), e), IStatus.ERROR);
				dialogo.open();
			}
		}
		return null;
	}
		
	private static MultiStatus getMultiStatus(String msg, Throwable t) {
		List<Status> statuses = new ArrayList<>();
		StackTraceElement[] stackTraces = t.getStackTrace();

		for (StackTraceElement stackTrace : stackTraces) {
			Status status = new Status(IStatus.ERROR, SerializeNetworkDipenditiCoppitoHandler.class.getName(), stackTrace.toString());
			statuses.add(status);
		}
		MultiStatus ms = new MultiStatus(SerializeNetworkDipenditiCoppitoHandler.class.getName(), IStatus.ERROR,
				statuses.toArray(new Status[] {}), t.toString(), t);
		return ms;
	}
	
	public static void refreshAllProjects() {
	    // Ottieni la radice dello spazio di lavoro
	    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

	    // Ottieni tutti i progetti
	    IProject[] projects = root.getProjects();

	    for (IProject project : projects) {
	        try {
	            // Controlla se il progetto è aperto
	            if (project.isOpen()) {
	                // Esegui il refresh
	                project.refreshLocal(IProject.DEPTH_INFINITE, null);
	                System.out.println("Refreshed project: " + project.getName());
	            }
	        } catch (CoreException e) {
	            e.printStackTrace();
	        }
	    }
	}

}
