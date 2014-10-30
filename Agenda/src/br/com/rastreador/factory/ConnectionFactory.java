package br.com.rastreador.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Usuario MySQL
	
	private static final String USERNAME = "root";
	
	//Senha do MySQL
	
	private static final String PASSWORD = "121314";
	
	//Dados para conexao com o banco
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	public static Connection createConnectionToMySQL()  throws  Exception {
		Class.forName ("com.mysql.jdbc.Driver");
	
		
		// Cria a conexao com o Banco de dados
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		//Recupera a conexao com o Banco de Dados
		
		Connection con = createConnectionToMySQL();
		
		//Verifica a nulidade da conexao
		
		if (con != null){
			
			System.out.println("Conexao Obtida com Sucesso " + con);
			con.close();
		}
	}

}
