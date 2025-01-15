package it.univaq.disim.mde.architecture.network.ui.dialog;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NetworkArchitectureSaveDialog extends TitleAreaDialog {
	private Text txtFilename;
	private String filename;
	private final String title;
	private final String message;
	private final String defaultFileName; // Nome di file predefinito

	public NetworkArchitectureSaveDialog(Shell parentShell, String title, String message, String defaultFileName) {
		super(parentShell);
		this.title = title;
		this.message = message;
		this.defaultFileName = defaultFileName;
	}

	@Override
	public void create() {
		super.create();
		setTitle(title);
		setMessage(message, IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(3, false);
		container.setLayout(layout);
		// createFirstName(container);

		createFileSelectionSection(container);

		return area;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	private void createFileSelectionSection(Composite container) {
		Label lblFilename = new Label(container, SWT.NONE);
		lblFilename.setText("Filename:");

		txtFilename = new Text(container, SWT.BORDER);
		txtFilename.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Button btnBrowse = new Button(container, SWT.PUSH);
		btnBrowse.setText("Browse...");
		btnBrowse.addListener(SWT.Selection, e -> openFileDialog());
	}

	private void openFileDialog() {
		FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
		dialog.setText("Select File to Save");

		// Ottiene il percorso del workspace corrente
		String workspacePath = getWorkspacePath();
		if (workspacePath != null && !workspacePath.isEmpty()) {
			dialog.setFilterPath(workspacePath);
		}
		
		// Imposta il nome di file predefinito, se fornito
        if (defaultFileName != null && !defaultFileName.isEmpty()) {
            dialog.setFileName(defaultFileName);
        }

		dialog.setFilterExtensions(new String[] { "*.xmi*" }); // filtri sui file, ad esempio "*.xmi"
		String selectedFile = dialog.open();
		if (selectedFile != null) {
			txtFilename.setText(selectedFile);
		}
	}

	private String getWorkspacePath() {
		IPath location = Platform.getLocation(); // Restituisce il percorso del workspace corrente
		return location.toOSString(); // Converte in formato leggibile per il sistema operativo
	}

	private void saveInput() {
		filename = txtFilename.getText();
	}

	public String getFullname() {
		return filename;
	}

}
