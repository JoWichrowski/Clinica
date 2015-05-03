package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Administrador;

public class AdministradorDao {

	Connection conexao;

	public AdministradorDao() throws SQLException {
		this.conexao = ProvedorDeConexao.getConexao();
	}

	public int inserir(Administrador administrador) throws SQLException {
		if (conexao.isClosed()) {
			conexao = ProvedorDeConexao.getConexao();
		}

		String consulta = ConsultasSQL.insert("administrador", "nome", "rg",
				"telefone", "cod_endereco");
		PreparedStatement preparedStatement = conexao.prepareStatement(
				consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, administrador.getNome());
		preparedStatement.setString(2, administrador.getRg());
		preparedStatement.setString(3, administrador.getTelefone());

		// preparedStatement.setInt(4, administrador.getUsuario().getCodigoUsuario());
		preparedStatement.setInt(4, administrador.getEndereco().getCodigoEndereco());

		preparedStatement.executeUpdate();

		ResultSet resultado = preparedStatement.getGeneratedKeys();
		resultado.next();
		return resultado.getInt(1);
	}
}
