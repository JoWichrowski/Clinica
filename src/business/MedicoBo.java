package business;

import java.sql.SQLException;

import model.Endereco;
import model.Especialidade;
import model.Medico;
import model.NivelAcesso;
import model.Usuario;
import dao.EnderecoDao;
import dao.EspecialidadeDao;
import dao.MedicoDao;
import dao.UsuarioDao;

public class MedicoBo {
	
	private MedicoDao medicoDao;
	private EnderecoDao enderecoDao;
	private EspecialidadeDao especialidadeDao;
	private UsuarioDao usuarioDao;
	
	public MedicoBo() throws SQLException {
		medicoDao = new MedicoDao();
		enderecoDao = new EnderecoDao();
		especialidadeDao = new EspecialidadeDao();		
	}
	
	public void cadastrar(Medico medico) throws SQLException{
//		int codigoUsuario = usuarioDao.inserir(medico.getUsuario());
		int codigoEspec  = especialidadeDao.inserir(medico.getEspecialidade());
		int codEndereco = enderecoDao.inserir(medico.getEndereco());
		
//		medico.getUsuario().setCodigoUsuario(codigoUsuario);
//		medico.getUsuario().setNivelAcesso(NivelAcesso.MEDICO);
		
		medico.getEndereco().setCodigoEndereco(codEndereco);
		medico.getEspecialidade().setCodigoEspecialidade(codigoEspec);
		
		medicoDao.inserir(medico);		
	}

}
