package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Especialidade;

public class EspecialidadeDao {
	
	private Connection conexao;
	
	public EspecialidadeDao() throws SQLException {
		conexao = ProvedorDeConexao.getConexao();
	}
	
	public int inserir(Especialidade especialidade) throws SQLException{
		String consulta = ConsultasSQL.insert("especialidade", "especialidade");
		PreparedStatement preparedStatement = conexao.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, especialidade.getNomeEspecialidade());
		
		preparedStatement.executeUpdate();
		
		ResultSet resultado = preparedStatement.getGeneratedKeys();
		resultado.next();
		return resultado.getInt(1);
	}

}
