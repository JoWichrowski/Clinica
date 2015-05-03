package view;

import java.util.Scanner;

import model.Usuario;

public class LoginView {
	
	private Scanner leitor;
	
	public LoginView() {
		leitor = new Scanner(System.in);
	}
	
	
	public Usuario solicitarInformacoes(){
		Usuario usuario = new Usuario();
		System.out.println("Login: ");
		String login = leitor.nextLine();
		
		System.out.println("Senha: ");
		String senha = leitor.nextLine();
		
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		return usuario;
	}

}
