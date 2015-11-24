package br.univel.cadastro;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableCliente extends AbstractTableModel {
	List<Cliente> lcliente = new ArrayList<>();
	DAOCliente dcliente = new DAOCliente();
	Cliente cl = new Cliente();
	
	
	protected TableCliente(List<Cliente> lcliente){
		super();
		this.lcliente = lcliente;
	}
	
	@Override
	public int getColumnCount() {
		return 8;
	}

	@Override
	public int getRowCount() {
		
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
