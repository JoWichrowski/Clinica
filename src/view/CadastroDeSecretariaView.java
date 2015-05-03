package view;

import java.sql.SQLException;
import java.util.Scanner;

import model.Endereco;
import model.Secretaria;
import controller.SecretariaController;

public class CadastroDeSecretariaView {

	private Scanner entrada;

	private EnderecoView enderecoView;

	private SecretariaController controller;

	public CadastroDeSecretariaView() {
		enderecoView = new EnderecoView();
		
		try {
			controller = new SecretariaController();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		entrada = new Scanner(System.in);
	}

	public void solicitarInformacoesParaCadastro() {
		try {
			Secretaria secretaria = new Secretaria();
			System.out.println("Cadastro de Secretária: ");

			System.out.println("Nome: ");
			secretaria.setNome(entrada.nextLine());

			System.out.println("Rg:");
			secretaria.setRg(entrada.nextLine());

			System.out.println("Telefone: ");
			secretaria.setTelefone(entrada.nextLine());

			Endereco endereco = enderecoView.solicitarInformacoesParaCadastro();
			
			secretaria.setEndereco(endereco);
			
			controller.cadastrar(secretaria);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}

}
