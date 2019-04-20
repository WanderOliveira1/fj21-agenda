package br.com.caelum.main;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class Main {
	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDao contatodao = new ContatoDao();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("Rua dois");
		contato.setDataNascimento(Calendar.getInstance());
		
		//remove
		contato.setId(3L);
		contatodao.remove(contato);
		try {
			contatodao.insert(contato);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
