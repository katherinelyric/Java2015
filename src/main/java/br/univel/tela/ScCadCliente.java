package br.univel.tela;

import java.awt.BorderLayout;

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
