package view;

import java.util.Scanner;

public class AdministradorView {

	private Scanner entrada;

	public AdministradorView() {
		entrada = new Scanner(System.in);
	}

	public void menu() {
		System.out.println("Menu:");
		System.out.println("1 - Cadastrar médico");
		System.out.println("2 - Cadastrar secretária");
//		System.out.println("3 - Alterar cadastro de médico");
//		System.out.println("4 - Alterar cadastro de secretária");
//		System.out.println("5 - Excluir cadastro de médico");
//		System.out.println("6 - Excluir cadastro de secretária");
//		
		String opcao = entrada.nextLine();

		if (opcao.equals(1)) {
			new CadastroDeMedicoView().solicitarInformacoesParaCadastro();
		} else {
			new CadastroDeSecretariaView().solicitarInformacoesParaCadastro();
		}
	}

}
