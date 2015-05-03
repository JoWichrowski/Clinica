package business;

import java.sql.SQLException;

import model.Endereco;
import model.Administrador;
import model.NivelAcesso;
import model.Usuario;
import dao.EnderecoDao;
import dao.AdministradorDao;
import dao.UsuarioDao;

public class AdministradorBo {

	private AdministradorDao administradorDao;
	private EnderecoDao enderecoDao;
	private UsuarioDao usuarioDao;
	
	public AdministradorBo() throws SQLException {
		administradorDao = new AdministradorDao();
		enderecoDao = new EnderecoDao();
		}
	
	public void cadastrar(Administrador administrador) throws SQLException{
//		int codigoUsuario = usuarioDao.inserir(administrador.getUsuario());
		int codEndereco = enderecoDao.inserir(administrador.getEndereco());
		
//		medico.getUsuario().setCodigoUsuario(codigoUsuario);
//		medico.getUsuario().setNivelAcesso(NivelAcesso.ADMINISTRADOR);
		
		administrador.getEndereco().setCodigoEndereco(codEndereco);
		
		administradorDao.inserir(administrador);		
	}

}
