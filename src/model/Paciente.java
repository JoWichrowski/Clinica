package model;

import java.util.GregorianCalendar;

public class Paciente {

	private int codigoPaciente;
	private String nome;
	private String telefone;
	private GregorianCalendar dataNascimento;
	private Endereco endereco;

	public Paciente() {

	}

	public Paciente(int codigoPaciente, String nome, String telefone,
			GregorianCalendar dataNascimento, Endereco endereco) {
		this.codigoPaciente = codigoPaciente;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public int getCodigoPaciente() {
		return codigoPaciente;
	}

	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public GregorianCalendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(GregorianCalendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
