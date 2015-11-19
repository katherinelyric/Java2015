package br.univel.tela;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * 
 * @author Danii
 *
 */
public class ScCadUser extends Moldura {

	/**
	 * Create the panel.
	 */
	public ScCadUser() {
		super();
	}

	@Override
	protected void instCadastro() {
		super.add(new PreeCadUsuario(), BorderLayout.CENTER);
		
	}

}
