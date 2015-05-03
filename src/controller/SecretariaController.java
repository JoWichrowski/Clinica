package controller;

import java.sql.SQLException;

import model.Secretaria;
import business.SecretariaBo;

public class SecretariaController {
	
private SecretariaBo secretariaBo;
	
	public SecretariaController() throws SQLException {
		secretariaBo = new SecretariaBo();
	}
	
	public void cadastrar(Secretaria secretaria) throws SQLException{
		secretariaBo.cadastrar(secretaria);
	}
}
