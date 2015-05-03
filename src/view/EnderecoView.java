package view;

import java.util.Scanner;

import model.Endereco;

public class EnderecoView {
	
	private Scanner entrada;
	
	public EnderecoView() {
		entrada = new Scanner(System.in);
	}
	
	public Endereco solicitarInformacoesParaCadastro(){
		Endereco endereco = new Endereco();
		
		System.out.println("Cadastro de endereço:");		
		System.out.println("Digite a cidade:");
		endereco.setCidade(entrada.nextLine());
		
		System.out.println("Digite o bairro:");
		endereco.setBairro(entrada.nextLine());
		
		System.out.println("Digite o logradouro:");
		endereco.setLogradouro(entrada.nextLine());
		
		return endereco;
	}

}
