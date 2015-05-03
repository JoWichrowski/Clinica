package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import model.Paciente;

public class PacienteDao {

	Connection conexao;

	public PacienteDao() throws SQLException {
		this.conexao = ProvedorDeConexao.getConexao();
	}

	public int inserir(Paciente paciente) throws SQLException {
		if (conexao.isClosed()) {
			conexao = ProvedorDeConexao.getConexao();
		}

		String consulta = ConsultasSQL.insert("paciente", "nome", "telefone", "data_nascimento", "cod_endereco");
		PreparedStatement preparedStatement = conexao.prepareStatement(
				consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, paciente.getNome());
		preparedStatement.setString(2, paciente.getTelefone());
		preparedStatement.setTimestamp(3, new Timestamp(paciente.getDataNascimento().getTimeInMillis()));
		preparedStatement.setInt(4, paciente.getEndereco().getCodigoEndereco());

		preparedStatement.executeUpdate();

		ResultSet resultado = preparedStatement.getGeneratedKeys();
		resultado.next();
		return resultado.getInt(1);
	}
}
