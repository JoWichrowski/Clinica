package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Secretaria;

public class SecretariaDao {
	
	Connection conexao;

	public SecretariaDao() throws SQLException {
		this.conexao = ProvedorDeConexao.getConexao();
	}

	public int inserir(Secretaria secretaria) throws SQLException {
		if (conexao.isClosed()) {
			conexao = ProvedorDeConexao.getConexao();
		}

		String consulta = ConsultasSQL.insert("secretaria", "nome", "rg",
				"telefone", "cod_endereco");
		PreparedStatement preparedStatement = conexao.prepareStatement(
				consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, secretaria.getNome());
		preparedStatement.setString(2, secretaria.getRg());
		preparedStatement.setString(3, secretaria.getTelefone());

		// preparedStatement.setInt(4, secretaria.getUsuario().getCodigoUsuario());
		preparedStatement.setInt(4, secretaria.getEndereco().getCodigoEndereco());

		preparedStatement.executeUpdate();

		ResultSet resultado = preparedStatement.getGeneratedKeys();
		resultado.next();
		return resultado.getInt(1);
	}


}
