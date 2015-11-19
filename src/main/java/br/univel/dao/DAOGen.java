package br.univel.dao;

import java.awt.List;

public interface DAOGen {
	
	public void Conectar();
	
	//public List<> read();

	public void create(DAOGen e);
	
	public void delete(DAOGen e);
	
	public void update();
	
	public void delAll();
	
}
