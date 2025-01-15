package it.univaq.disim.mde.architecture.network.ui.dialog;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ValidationResultDialog extends TitleAreaDialog {

	private Diagnostic diagnostic;

	public ValidationResultDialog(Shell parentShell, Diagnostic diagnostic) {
		super(parentShell);
		this.diagnostic = diagnostic;
	}

	@Override
	public void create() {
		super.create();
		setTitle("Model Validation Results");

		// Impostazione di un messaggio in base alla gravità più alta del Diagnostic
		// root
		switch (diagnostic.getSeverity()) {
		case Diagnostic.OK:
			setMessage("✅ The model is completely valid!!");
			break;
		case Diagnostic.WARNING:
			setMessage("⚠ The template contains warnings.");
			break;
		case Diagnostic.ERROR:
		default:
			setMessage("❌ The model contains validation errors.");
			break;
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// Creazione dell'area di base
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new GridLayout(1, false));

		// ScrolledComposite per gestire molti messaggi
		ScrolledComposite scrolled = new ScrolledComposite(area, SWT.BORDER | SWT.V_SCROLL);
		scrolled.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite container = new Composite(scrolled, SWT.NONE);
		container.setLayout(new GridLayout(2, false)); // 2 colonne: colonna icona + colonna testo
		scrolled.setContent(container);
		scrolled.setExpandVertical(true);
		scrolled.setExpandHorizontal(true);

		// Mmessaggi
		populateMessages(container, diagnostic, "");

		container.layout();
		scrolled.setMinSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		return area;
	}

	/**
	 * Naviga ricorsivamente i Diagnostic (e i suoi figli) e crea label con icona e
	 * testo.
	 */
	private void populateMessages(Composite parent, Diagnostic diag, String indent) {
		// Sceglie l'icona in base alla gravità
		Image severityIcon = null;
		switch (diag.getSeverity()) {
		case Diagnostic.ERROR:
			severityIcon = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
			break;
		case Diagnostic.WARNING:
			severityIcon = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);
			break;
		case Diagnostic.INFO:
			severityIcon = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);
			break;
		default:
			// Ok, nessuna icona
			severityIcon = null;
			break;
		}

		// Label per l'icona
		Label iconLabel = new Label(parent, SWT.NONE);
		iconLabel.setImage(severityIcon);

		// Label per il testo (indent + messaggio)
		Label msgLabel = new Label(parent, SWT.WRAP);
		msgLabel.setText(indent + diag.getMessage());

		// Processa ricorsivamente i figli
		List<Diagnostic> children = diag.getChildren();
		for (Diagnostic child : children) {
			populateMessages(parent, child, indent + "   ");
		}
	}

	@Override
	protected void okPressed() {
		// Chiude semplicemente la dialog
		super.okPressed();
	}
}
