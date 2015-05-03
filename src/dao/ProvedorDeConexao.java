package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ProvedorDeConexao {

	private static final String URL = "jdbc:postgresql://localhost:5432/clinica";
	private static final String USER = "postgres";
	private static final String PASSWORD = ".";

	private static Connection connection;

	public static Connection getConexao() throws SQLException {
		if (connection == null) {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		return connection;
	}

}