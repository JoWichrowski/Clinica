package controller;

import business.LoginBo;
import model.Usuario;

public class LoginController {
	
	private LoginBo loginBo;
	
	public LoginController(){
		loginBo = new LoginBo();
	}
	
	public boolean autenticarUsuario(Usuario usuario){
		return loginBo.autenticarUsario(usuario);		
	}
	
	public Usuario getUsuarioAutenticado(){
		return loginBo.getUsuarioAutenticado();
	}

}
