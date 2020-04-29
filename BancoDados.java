package com.qintess.bd.Entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDados {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		System.out.println("Inciando execução");
		try (Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")) {

			Class.forName("org.h2.Driver");
			System.out.println("Inciando conexão com Banco de Dados");
			Statement stmt = conn.createStatement();

			String cadcliente = "CREATE TABLE IF NOT EXISTS cadcliente "
					+ "(id_cliente INTEGER AUTO_INCREMENT PRIMARY KEY, " + "nome VARCHAR(255) NOT NULL UNIQUE"
					+ "email VARCHAR(100) NOT NULL, " + "senha VARCHAR(255) NOT NULL)";
			stmt.execute(cadcliente);
			System.out.println("Tabela CADCLIENTE criada!");

			String cadevento = "CREATE TABLE IF NOT EXISTS cadevento "
					+ "(id_evento INTEGER AUTO_INCREMENT PRIMARY KEY, " + "nome VARCHAR(255) NOT NULL, "
					+ "lugar FOREIGN KEY (id_cs) REFERENCES VENDAS (id_cs), " + "data DATE NOT NULL, "
					+ "preco FLOAT NOT NULL, " + "ingresso INT NOT NULL, " + "descricao VARCHAR(100) NOT NULL)";
			stmt.execute(cadevento);
			System.out.println("Tabela CADEVENTO criada!");

			String cadcs = "CREATE TABLE IF NOT EXISTS cadcs" + "id_cs INT AUTO_INCREMENT PRIMARY KEY, "
					+ "nome VARCHAR(100) NOT NULL, " + "capacid INT NOT NULL" + "endereço VARCHAR(255) NOT NULL)";
			stmt.execute(cadcs);
			System.out.println("Tabela CADCS criada!");

		}

	}

}
