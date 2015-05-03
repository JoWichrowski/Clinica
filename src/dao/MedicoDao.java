package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Medico;

public class MedicoDao {
	
	Connection conexao;
	
	public MedicoDao() throws SQLException{
		this.conexao = ProvedorDeConexao.getConexao();
	}
	
	public int inserir(Medico medico) throws SQLException{		
		if(conexao.isClosed()){
			conexao = ProvedorDeConexao.getConexao();
		}
		
		String consulta = ConsultasSQL.insert("medico", "nome", "rg", "telefone", "cod_especialidade", "cod_endereco");
		PreparedStatement preparedStatement = conexao.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, medico.getNome());
		preparedStatement.setString(2, medico.getRg());
		preparedStatement.setString(3, medico.getTelefone());
		
//		preparedStatement.setInt(4, medico.getUsuario().getCodigoUsuario());
		preparedStatement.setInt(4, medico.getEspecialidade().getCodigoEspecialidade());
		preparedStatement.setInt(5, medico.getEndereco().getCodigoEndereco());
		
		preparedStatement.executeUpdate();
		
		ResultSet resultado = preparedStatement.getGeneratedKeys();
		resultado.next();
		return resultado.getInt(1);		
	}
}