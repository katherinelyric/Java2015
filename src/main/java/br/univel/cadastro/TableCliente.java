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
		return lcliente.size();
	}

	
	
	@Override
	public String getColumnName(int arg0) {
		switch (arg0) {
        case 0:
            return "ID";
        case 1:
            return "Nome";
        case 2:
            return "Telefone";
        case 3:
            return "Endereço";
        case 4:
            return "Cidade";
        case 5:
            return "Email";
        default :
            return null;
		}
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
       Integer tab = 0;
       
       if(tab == 0){
    	  tab = new Integer(arg0);
    	  cl = (Cliente) lcliente.get(arg0);
       }
       
		switch (arg0) {
        case 0:
            return cl.getId();
        case 1:
            return cl.getNome();
        case 2:
            return cl.getTel();
        case 3:
            return cl.getEnd();
        case 4:
            return cl.getCidade();
        case 5:
            return cl.getEmail();
        default :
            return null;
		}

	}

}
