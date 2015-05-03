package controller;

import java.sql.SQLException;

import model.Medico;
import business.MedicoBo;

public class MedicoController {
	
	private MedicoBo medicoBo;
	
	public MedicoController() throws SQLException {
		medicoBo = new MedicoBo();
	}
	
	public void cadastrar(Medico medico) throws SQLException{
		medicoBo.cadastrar(medico);
	}

}
