package controller;

import java.sql.SQLException;

import model.Administrador;
import business.AdministradorBo;

public class AdministradorController {

	private AdministradorBo administradorBo;

	public AdministradorController() throws SQLException {
		administradorBo = new AdministradorBo();
	}

	public void cadastrar(Administrador administrador) throws SQLException {
		administradorBo.cadastrar(administrador);
	}

}
