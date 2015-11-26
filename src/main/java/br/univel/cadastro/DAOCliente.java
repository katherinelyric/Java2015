package br.univel.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class DAOCliente {
	protected Connection conexao;
	
	public void Conectar() throws SQLException{
		
		String url = "jdbc:h2:~/cadfinal";
		String user = "sa";
		String pass = "";
		conexao = (Connection) DriverManager.getConnection(url, user, pass);
		
	}
	
	public void disconnect() throws SQLException {
		conexao.close();
		
	}
	
	public void create(Cliente cli) throws SQLException {
		Conectar();
		
		String sql = "INSERT INTO CLIENTE(ID,NAME,TELEFONE,ENDERECO,CIDADE,EMAIL";
		PreparedStatement stt = (PreparedStatement) conexao.prepareStatement(sql);
		stt.setInt(1, cli.getId());
		stt.setString(2, cli.getNome());
		stt.setString(3, cli.getTel());
		stt.setString(3, cli.getEnd());
		stt.setString(5, cli.getCidade());
		stt.setString(6, cli.getEmail());
		
		int upd = stt.executeUpdate();		
		disconnect();
		stt.close();
		System.out.println(upd + "Registro adicionado com sucesso");
		
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
						//TA FALTANDO A UF 
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


	public void delete(Cliente cli) throws SQLException {
		Conectar();
		String sql = "DELETE FROM CLIENTE WHERE ID = ?";
		
		try(PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(sql)){
			ps.setInt(1, cli.getId());
			int excluindo = ps.executeUpdate();
			System.out.println(excluindo + "Registro "+ ps + "excluído com sucesso");
		}
		JOptionPane.showMessageDialog(null, "Seleção excluída");
		disconnect();
	}


	public void update() throws SQLException {
		Conectar();
		String sql = "UPDATE CLIENTE SET ID = ?, NOME = ?, WHERE ID = ?";
		disconnect();
		
	}

	public void delAll() throws SQLException {
		Conectar();
		String str = "DELETE FROM CONTATO";
		try(PreparedStatement ps = (PreparedStatement) conexao.prepareStatement(str)){
			int exl = ps.executeUpdate();
			System.out.println(exl + "Todos os registros foram excluídos do banco.");
		}
		disconnect();
	}



}
