package view;

import java.util.Scanner;

public class AdministradorView {

	private Scanner entrada;

	public AdministradorView() {
		entrada = new Scanner(System.in);
	}

	public void menu() {
		System.out.println("Menu:");
		System.out.println("1 - Cadastrar m�dico");
		System.out.println("2 - Cadastrar secret�ria");
//		System.out.println("3 - Alterar cadastro de m�dico");
//		System.out.println("4 - Alterar cadastro de secret�ria");
//		System.out.println("5 - Excluir cadastro de m�dico");
//		System.out.println("6 - Excluir cadastro de secret�ria");
//		
		String opcao = entrada.nextLine();

		if (opcao.equals(1)) {
			new CadastroDeMedicoView().solicitarInformacoesParaCadastro();
		} else {
			new CadastroDeSecretariaView().solicitarInformacoesParaCadastro();
		}
	}

}
