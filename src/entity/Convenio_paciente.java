package entity;

public class Convenio_paciente {

	private int abrangencia;

	private Paciente_ou_expaciente contratante;

	private char tipo_conta;

	private Paciente_ou_expaciente[] paciente_ou_expaciente;

	private Paciente_ou_expaciente paciente_ou_expaciente;

	public Convenio_paciente(int abrangencia, Paciente_ou_expaciente contratante, char tipo_conta, Paciente_ou_expaciente[] paciente_ou_expaciente) {
		this.abrangencia = abrangencia;
		this.contratante = contratante;
		this.tipo_conta = tipo_conta;
		this.paciente_ou_expaciente = paciente_ou_expaciente;
	}

}
