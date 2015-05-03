package view;

import java.util.Scanner;

public class MedicoView {

	private Scanner entrada;

	public MedicoView() {
		entrada = new Scanner(System.in);
	}

	public void menu() {
		System.out.println("Menu:");
		System.out.println("1 - Registrar observações da consulta");
//		
		String opcao = entrada.nextLine();

//		if (opcao.equals(1)) {
//			new CadastroDeMedicoView().solicitarInformacoesParaCadastro();
//		} else {
//			new CadastroDeSecretariaView().solicitarInformacoesParaCadastro();
//		}
	}
}
