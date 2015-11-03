package br.univel.tela;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * 
 * @author Danii
 *
 */

public class ScCadCliente extends Moldura {
	
	public ScCadCliente(){
		super();
	}

	@Override
	protected void instCadastro() {
		super.add(new PreeCadCliente(), BorderLayout.CENTER);
		
	}
	
	

}
