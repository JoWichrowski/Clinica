package view;

import java.util.Scanner;

public class SecretariaView {

	private Scanner entrada;

	public SecretariaView() {
		entrada = new Scanner(System.in);
	}

	public void menu() {
		System.out.println("Menu:");
		System.out.println("1 - Cadastrar consulta");
		System.out.println("2 - Cadastrar paciente");
//		System.out.println("3 - Excluir consulta");
//		System.out.println("4 - Excluir paciente");
//		
		String opcao = entrada.nextLine();

//		if (opcao.equals(1)) {
//			new CadastroDeMedicoView().solicitarInformacoesParaCadastro();
//		} else {
//			new CadastroDeSecretariaView().solicitarInformacoesParaCadastro();
//		}
	}

}
