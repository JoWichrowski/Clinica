package model;

public class Endereco {
	private int codigoEndereco;
	private String logradouro;
	private String bairro;
	private String cidade;	
	
	public Endereco() {
		
	}
	
	public Endereco(int codigoEndereco, String logradouro, String bairro,
			String cidade) {
		this.codigoEndereco = codigoEndereco;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public int getCodigoEndereco() {
		return codigoEndereco;
	}
	public void setCodigoEndereco(int codigoEndereco) {
		this.codigoEndereco = codigoEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}