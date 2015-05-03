package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDao {
	
	private Connection conexao;
	
	public UsuarioDao() throws SQLException {
		conexao = ProvedorDeConexao.getConexao();				
	}
	

	public int inserir(Usuario usuario) throws SQLException {
		if (conexao.isClosed()) {
			conexao = ProvedorDeConexao.getConexao();
		}

		String consulta = ConsultasSQL.insert("usuario", "login", "senha", "nivel");				

		PreparedStatement preparedStatement = conexao.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, usuario.getLogin());
		preparedStatement.setString(2, usuario.getSenha());
		preparedStatement.setInt(3, usuario.getNivelAcesso().getNumeroNivelAcesso());

		preparedStatement.executeUpdate();

		ResultSet resultado = preparedStatement.getGeneratedKeys();
		return resultado.getInt(1);
	}

}
