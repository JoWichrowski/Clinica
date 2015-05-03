package model;

public class Medico {

	private int codigoMedico;
	private String nome;
	private String rg;
	private String telefone;
	private Endereco endereco;
	private Especialidade especialidade;
	private Usuario usuario;

	public Medico() {

	}

	public Medico(int codigoMedico, String nome, String rg, String telefone,
			Endereco endereco, Especialidade especialidade, Usuario usuario) {
		this.codigoMedico = codigoMedico;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		this.endereco = endereco;
		this.especialidade = especialidade;
		this.usuario = usuario;
	}

	public int getCodigoMedico() {
		return codigoMedico;
	}

	public void setCodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
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

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}