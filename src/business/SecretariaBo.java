package business;

import java.sql.SQLException;

import model.Administrador;
import model.Endereco;
import model.Secretaria;
import model.NivelAcesso;
import model.Usuario;
import dao.AdministradorDao;
import dao.EnderecoDao;
import dao.SecretariaDao;
import dao.UsuarioDao;

public class SecretariaBo {

	private SecretariaDao secretariaDao;
	private EnderecoDao enderecoDao;
	private UsuarioDao usuarioDao;
	
	public SecretariaBo() throws SQLException {
		secretariaDao = new SecretariaDao();
		enderecoDao = new EnderecoDao();
		}
	
	public void cadastrar(Secretaria secretaria) throws SQLException{
//		int codigoUsuario = usuarioDao.inserir(secretaria.getUsuario());
		int codEndereco = enderecoDao.inserir(secretaria.getEndereco());
		
//		medico.getUsuario().setCodigoUsuario(codigoUsuario);
//		medico.getUsuario().setNivelAcesso(NivelAcesso.SECRETARIA);
		
		secretaria.getEndereco().setCodigoEndereco(codEndereco);
		
		secretariaDao.inserir(secretaria);		
	}
	
}
