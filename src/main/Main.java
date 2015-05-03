package main;

import model.NivelAcesso;
import model.Usuario;
import view.AdministradorView;
import view.LoginView;
import controller.LoginController;

public class Main {
	
	public static void main(String[] args) {
		LoginView login = new LoginView();
		LoginController controller = new LoginController();
		
		Usuario usuario = login.solicitarInformacoes();
		
		boolean usuarioValido = controller.autenticarUsuario(usuario);
		
		if(usuarioValido){
			NivelAcesso nivelDeAcesso = controller.getUsuarioAutenticado().getNivelAcesso();
			
			switch (nivelDeAcesso) {
			case ADMINISTRADOR:	
				new AdministradorView().menu();
				break;
			case MEDICO:
				break;
			case SECRETARIA:
				break;
			}
		}
		
	}

}
