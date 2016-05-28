package entity;

import entity.PacienteOUExpaciente;

/**
 *
 *
 */
public class AuxiliarInfermagem {

	private char usuario;

	private char senha;

	private char nome;

	private float salario;


	private PacienteOUExpaciente PacienteOUExpaciente;

	public char getUsuario() {
		return usuario;
	}

	public void setUsuario(char usuario) {
		this.usuario = usuario;
	}

	public char getSenha() {
		return senha;
	}

	public void setSenha(char senha) {
		this.senha = senha;
	}

	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
//
//	public Aplicacao[] getAplicação() {
//		return aplicacao;
//	}
//
//	public void setAplicação(Aplicacao[] aplicação) {
//		this.aplicacao = aplicação;
//	}


	public PacienteOUExpaciente getPacienteOUExpaciente() {
		return PacienteOUExpaciente;
	}
/**
 * set para o paciente
 *
 * */
	public void setPacienteOUExpaciente(PacienteOUExpaciente PacienteOUExpaciente) {
		this.PacienteOUExpaciente = PacienteOUExpaciente;
	}

}
