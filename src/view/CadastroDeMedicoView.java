package view;

import java.sql.SQLException;
import java.util.Scanner;

import controller.MedicoController;
import model.Endereco;
import model.Especialidade;
import model.Medico;

public class CadastroDeMedicoView {

	private Scanner entrada;

	private EnderecoView enderecoView;
	private EspecialidadeView especialidadeView;

	private MedicoController controller;

	public CadastroDeMedicoView() {
		enderecoView = new EnderecoView();
		especialidadeView = new EspecialidadeView();

		try {
			controller = new MedicoController();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		entrada = new Scanner(System.in);
	}

	public void solicitarInformacoesParaCadastro() {
		try {
			Medico medico = new Medico();
			System.out.println("Cadastro de Médico: ");

			System.out.println("Nome: ");
			medico.setNome(entrada.nextLine());

			System.out.println("Rg:");
			medico.setRg(entrada.nextLine());

			System.out.println("Telefone: ");
			medico.setTelefone(entrada.nextLine());

			Endereco endereco = enderecoView.solicitarInformacoesParaCadastro();
			Especialidade especialidade = especialidadeView
					.solicitarInformacoesParaCadastro();

			medico.setEndereco(endereco);
			medico.setEspecialidade(especialidade);

			controller.cadastrar(medico);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}
}