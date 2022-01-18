package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import Model.Pessoa;

public class PessoaDao {
	
	private  Connection connection;
	
	public PessoaDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void  adicionar(Pessoa pessoa) throws SQLException {
		
		try {
			String sql = "insert into tbpessoa"+
						 "(nome,endereco,cidade,estado,cep,rg,cpf,telefone,celular,email)"+
						 "values (?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement smtm = connection.prepareStatement(sql);
			
			smtm.setString(1, pessoa.getNome());
			smtm.setString(2, pessoa.getEndereco());
			smtm.setString(3, pessoa.getCidade());
			smtm.setString(4, pessoa.getEstado());
			smtm.setString(5, pessoa.getCep());
			smtm.setString(6, pessoa.getRg());
			smtm.setString(7, pessoa.getCpf());
			smtm.setString(8, pessoa.getTelefone());
			smtm.setString(9, pessoa.getCelular());
			smtm.setString(10, pessoa.getEmail());
			
			smtm.execute();
			smtm.close();
			JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso");
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro: " +e);
		}
		finally {
			connection.close();
		}
	}

	public List<Pessoa> consultar() throws SQLException{
		try {
			List<Pessoa> pessoas =  new ArrayList <Pessoa>();
			
			String sql = "select * from tbPessoa";
			PreparedStatement stmt =  this.connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(rs.getInt(1));
				pessoa.setNome(rs.getString(2));
				pessoa.setEndereco(rs.getString(3));
				pessoa.setCidade(rs.getString(4));
				pessoa.setEstado(rs.getString(5));
				pessoa.setCep(rs.getString(6));
				pessoa.setRg(rs.getString(7));
				pessoa.setCpf(rs.getString(8));
				pessoa.setTelefone(rs.getString(9));
				pessoa.setCelular(rs.getString(10));
				pessoa.setEmail(rs.getString(11));
				
				pessoas.add(pessoa);
			}
			
			rs.close();
			stmt.close();
			return pessoas;
		} 
		catch(SQLException e) {
			throw new RuntimeException();
		}
		
		finally{
			connection.close();
		}
	}
	
	public void alterar(Pessoa pessoa) throws SQLException {
		
		String sql = "update tbPessoa set nome= ? , endereco= ?, cidade= ?, estado= ?, cep= ?, rg= ?, cpf= ?, telefone= ?, celular= ?, email= ? where idPessoa =  ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEndereco());
			stmt.setString(3, pessoa.getCidade());
			stmt.setString(4, pessoa.getEstado());
			stmt.setString(5, pessoa.getCep());
			stmt.setString(6, pessoa.getRg());
			stmt.setString(7, pessoa.getCpf());
			stmt.setString(8, pessoa.getTelefone());
			stmt.setString(9, pessoa.getCelular());
			stmt.setString(10, pessoa.getEmail());
			stmt.setInt   (11, pessoa.getIdPessoa());
			
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Pessoa alterada com Sucesso");
		}
		catch(SQLException e) {
			throw new RuntimeException();
		}
		finally {
			connection.close();
		}
	}
	public void excluir(Pessoa pessoa) throws SQLException {
		
		String sql = "delete from tbPessoa where  idPessoa = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, pessoa.getIdPessoa());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Pessoa excluida com Sucesso");
		
		}
		
		catch(SQLException e){
			throw new RuntimeException();
		}
		
		finally {
			connection.close();
		}
	}
}
