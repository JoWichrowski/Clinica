package view;

import java.util.Scanner;

import model.Especialidade;

public class EspecialidadeView {
	
	private Scanner entrada;
	
	public EspecialidadeView() {
		entrada = new Scanner(System.in);
	}
	
	public Especialidade solicitarInformacoesParaCadastro(){
		Especialidade especialidade = new Especialidade();
		
		System.out.println("Cadastro de especialidade:");
		System.out.println("Digite o nome da especialidade:");		
		String leitura = entrada.nextLine();
		
		especialidade.setNomeEspecialidade(leitura);
		
		return especialidade;		
	}

}
