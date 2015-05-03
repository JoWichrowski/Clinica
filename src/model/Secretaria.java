package model;

public class Secretaria {

	private int codigoSecretaria;
	private String nome;
	private String rg;
	private String telefone;
	private Endereco endereco;
	private Usuario usuario;

	public Secretaria() {

	}

	public Secretaria(int codigoSecretaria, String nome, String rg,
			String telefone, Endereco endereco, Usuario usuario) {
		this.codigoSecretaria = codigoSecretaria;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		this.endereco = endereco;
		this.usuario = usuario;
	}

	public int getCodigoSecretaria() {
		return codigoSecretaria;
	}

	public void setCodigoSecretaria(int codigoSecretaria) {
		this.codigoSecretaria = codigoSecretaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}