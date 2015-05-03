package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Endereco;

public class EnderecoDao {
	
	private Connection conexao;
	
	public EnderecoDao() throws SQLException {
		this.conexao = ProvedorDeConexao.getConexao();
	}
	
	public int inserir(Endereco endereco) throws SQLException{
		
		if(conexao.isClosed()){
			conexao = ProvedorDeConexao.getConexao();
		}
		
		String consulta = ConsultasSQL.insert("endereco", "bairro", "cidade", "logradouro");
		
		System.out.println(consulta);
		
		PreparedStatement preparedStatement  = conexao.prepareStatement(consulta, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, endereco.getBairro());
		preparedStatement.setString(2, endereco.getCidade());
		preparedStatement.setString(3, endereco.getLogradouro());
		
		preparedStatement.executeUpdate();
		
		ResultSet resultado = preparedStatement.getGeneratedKeys();
		resultado.next();
		return resultado.getInt(1);
	}

}
