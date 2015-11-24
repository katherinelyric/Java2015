package br.univel.cadastro;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DAOCliente {
	private Connection conexao;
	
	
	public void Conectar() throws SQLException{
		
		String url = "jdbc:h2:~/cadfinal";
		String user = "sa";
		String pass = "";
		conexao = (Connection) DriverManager.getConnection(url, user, pass);
		
	}
   
	
	public void create(DAOCliente cli) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
	public void disconnect() throws SQLException {
		conexao.close();
		
	}
	
	 protected List<Cliente> read() throws SQLException{
			Conectar();
			
			List<Cliente> clista = new ArrayList<>();
			
			Statement state = null;
			ResultSet result = null;
			
			try{
				try{
					state = (Statement) conexao.createStatement();
					result = state.executeQuery("SELECT * FROM CLIENTE");
					while (result.next()){
						Cliente cl = new Cliente();
						cl.setId(result.getInt("ID"));
						cl.setNome(result.getString("NAME"));
						cl.setTel(result.getString("TELEFONE"));
						cl.setEnd(result.getString("ENDERECO"));
						cl.setCidade(result.getString("CIDADE"));
						cl.setEmail(result.getString("EMAIL"));
						clista.add(cl);
						
					}
				disconnect();	
				}finally{
					if (state != null)
						state.close();
					if(result != null)
						result.close();
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
			
			return clista;
		}


	public void delete(DAOCliente cli) throws SQLException {
		Conectar();
		String sql = "DELETE FROM CONTATO WHERE ID = ?";
		try(PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql)){
			ps.setInt(1,con);
		}
		
	}


	public void update() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void delAll() throws SQLException {
		// TODO Auto-generated method stub
		
	}



}
