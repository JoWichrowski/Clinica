package model;

import java.util.GregorianCalendar;

public class Consulta {

	private Paciente paciente;
	private Medico medico;
	private String planoSaude;
	private GregorianCalendar dataHora;
	private StatusConsulta statusConsulta;
	private String observacoes;
	
	public Consulta(){
		
	}

	public Consulta(Paciente paciente, Medico medico, String planoSaude,
			GregorianCalendar dataHora, StatusConsulta statusConsulta,
			String observacoes) {
		this.paciente = paciente;
		this.medico = medico;
		this.planoSaude = planoSaude;
		this.dataHora = dataHora;
		this.statusConsulta = statusConsulta;
		this.observacoes = observacoes;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	public GregorianCalendar getDataHora() {
		return dataHora;
	}

	public void setDataHora(GregorianCalendar dataHora) {
		this.dataHora = dataHora;
	}

	public StatusConsulta getStatusConsulta() {
		return statusConsulta;
	}

	public void setStatusConsulta(StatusConsulta statusConsulta) {
		this.statusConsulta = statusConsulta;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
