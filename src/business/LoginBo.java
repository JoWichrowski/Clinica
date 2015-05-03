package business;

import model.NivelAcesso;
import model.Usuario;

public class LoginBo {
	
	private Usuario usuarioAutenticado;
	
	public boolean autenticarUsario(Usuario usuario){		
		return true;
	}
	
	
	
	public Usuario getUsuarioAutenticado(){
		
		if(usuarioAutenticado == null){
			return new Usuario(1, "usuario", "usuario", NivelAcesso.ADMINISTRADOR);
		}
		
		return usuarioAutenticado;		
	}

}
