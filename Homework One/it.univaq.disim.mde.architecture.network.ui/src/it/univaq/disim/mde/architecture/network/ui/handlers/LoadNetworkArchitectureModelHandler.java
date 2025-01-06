package it.univaq.disim.mde.architecture.network.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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

public class LoadNetworkArchitectureModelHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		NetworkArchitectureSaveDialog dialog = new NetworkArchitectureSaveDialog(window.getShell(), "Get File Name of Network Architecture Model", "Enter the filename of the NetworkArchitecture Model in order to load it!", null);
		dialog.create();
		if (dialog.open() == Window.OK) {
			try {
				System.out.println(dialog.getFullname());
				Network net = ModelUtils.load(dialog.getFullname());
				System.out.println("Number of Network Device: " + net.getNetworkDevicesCount());
				MessageDialog.openInformation(window.getShell(), "Loaded Model", "The model has been successfully uploaded!\n\n Number of Network Devices within the Model are: " + net.getNetworkDevicesCount());
			}catch (Exception e) {
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
		   Status status = new Status(IStatus.ERROR, LoadNetworkArchitectureModelHandler.class.getName(), stackTrace.toString());
		   statuses.add(status);
		  }

		  MultiStatus ms = new MultiStatus(LoadNetworkArchitectureModelHandler.class.getName(), IStatus.ERROR, statuses.toArray(new Status[] {}),
		    t.toString(), t);
		  return ms;
	}

}
