package entity;

import entity.Paciente_ou_expaciente;

public class AuxiliarInfermagem {

	private char usuario;

	private char senha;

	private char nome;

	private float salario;


	private Paciente_ou_expaciente paciente_ou_expaciente;

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

	public Aplicação[] getAplicação() {
		return aplicação;
	}

	public void setAplicação(Aplicação[] aplicação) {
		this.aplicação = aplicação;
	}


	public Paciente_ou_expaciente getPaciente_ou_expaciente() {
		return paciente_ou_expaciente;
	}

	public void setPaciente_ou_expaciente(Paciente_ou_expaciente paciente_ou_expaciente) {
		this.paciente_ou_expaciente = paciente_ou_expaciente;
	}

}
