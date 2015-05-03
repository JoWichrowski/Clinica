package model;

public class Usuario {

	private int codigoUsuario; 
	private String login;
	private String senha;
	private NivelAcesso nivelAcesso;
	
	public Usuario(){
		
	}		
	
	public Usuario(int codigoUsuario, String login, String senha,
			NivelAcesso nivelAcesso) {
		this.codigoUsuario = codigoUsuario;
		this.login = login;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}		
}