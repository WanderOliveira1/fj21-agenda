package br.com.caelum.main;

import java.util.List;

import br.com.caelum.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List <Contato> contatos = dao.getLista();
		for (Contato contato : contatos) {
			System.out.println("Nome " +contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
			}
	}

}
