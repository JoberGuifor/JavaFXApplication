package entity;

/**
 *
 *
 */
public class ConvenioPaciente {


	private int abrangencia;

	private PacienteOUExpaciente contratante;

	private char tipo_conta;

	public ConvenioPaciente(int abrangencia, PacienteOUExpaciente contratante, char tipo_conta) {
		this.abrangencia = abrangencia;
		this.contratante = contratante;
		this.tipo_conta = tipo_conta;
	}

}
