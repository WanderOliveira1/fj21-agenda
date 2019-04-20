package br.com.caelum.jdbc.teste;

import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory connection = new ConnectionFactory();
		connection.getConnection();
		System.out.println("Conexao aberta");
		try {

		} catch (Error e) {
			throw new RuntimeErrorException(e);

		}

	}
}
