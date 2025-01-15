package it.univaq.disim.mde.architecture.network.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import NetworkArchitecture.Network;
import it.univaq.disim.mde.architecture.network.business.ModelUtils;
import it.univaq.disim.mde.architecture.network.ui.dialog.NetworkArchitectureSaveDialog;
import it.univaq.disim.mde.architecture.network.ui.dialog.ValidationResultDialog;

public class ValidateNetworkArchitectureModelHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		NetworkArchitectureSaveDialog dialog = new NetworkArchitectureSaveDialog(window.getShell(),
				"Select Model file for Validation",
				"Enter the file name for the Network Architecture Model to perform Model Validation!", null);
		dialog.create();
		if (dialog.open() == Window.OK) {
			try {
				System.out.println("File selezionato: " + dialog.getFullname());

				// 1) Carico il modello dal file
				Network net = ModelUtils.load(dialog.getFullname());

				// 2) Esempio: stampo in console un'informazione (facoltativo)
				System.out.println("Number of Network Devices: " + net.getNetworkDevicesCount());

				// 3) Validazione
				Diagnostic d = ModelUtils.validate(net);

				// 4) In base alla severità, apro un dialog diverso
				ValidationResultDialog vrd = new ValidationResultDialog(window.getShell(), d);
				vrd.open();
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
			Status status = new Status(IStatus.ERROR, ValidateNetworkArchitectureModelHandler.class.getName(),
					stackTrace.toString());
			statuses.add(status);
		}

		MultiStatus ms = new MultiStatus(ValidateNetworkArchitectureModelHandler.class.getName(), IStatus.ERROR,
				statuses.toArray(new Status[] {}), t.toString(), t);
		return ms;

	}
}
