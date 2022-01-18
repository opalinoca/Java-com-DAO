package PrjExemplo;

import java.sql.SQLException;

import DAO.PessoaDao;
import Model.Pessoa;

public class Aplicacao {

	public static void main (String args[]) throws SQLException {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome     ("Jarbas");
		pessoa.setEndereco ("Rua Juan");
		pessoa.setCidade   ("Poá");
		pessoa.setEstado   ("SP");
		pessoa.setCep      ("781212121");
		pessoa.setRg       ("65122233396");
		pessoa.setCpf      ("83122233396");
		pessoa.setTelefone ("999790532");
		pessoa.setCelular  ("88384009");
		pessoa.setEmail    ("doli@.com");
		
		
		PessoaDao pessoaDao = new PessoaDao();
		pessoaDao.adicionar(pessoa);
	}
}

