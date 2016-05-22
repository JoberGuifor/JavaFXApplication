package entity;

import Controller.controle_adm;
import Controller.controller_login;

public class Admin {

	private char usuario;

	private char senha;

	private char nome;

	private float salario;

	private int idade;

	private Aplicação aplicação;

	private Leito leito;

	private Leito[] leito;

	private Hospital hospital;

	private Hospital hospital;

	private Medicamento_paciente medicamento_paciente;


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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Aplicação getAplicação() {
		return aplicação;
	}

	public void setAplicação(Aplicação aplicação) {
		this.aplicação = aplicação;
	}

	public Leito getLeito() {
		return leito;
	}

	public void setLeito(Leito[] leito) {
		this.leito = leito;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Medicamento_paciente getMedicamento_paciente() {
		return medicamento_paciente;
	}

	public void setMedicamento_paciente(Medicamento_paciente medicamento_paciente) {
		this.medicamento_paciente = medicamento_paciente;
	}

	public controller_login getController_login() {
		return controller_login;
	}

	public void setController_login(controller_login controller_login) {
		this.controller_login = controller_login;
	}

	public controle_adm getControle_adm() {
		return controle_adm;
	}

	public void setControle_adm(controle_adm controle_adm) {
		this.controle_adm = controle_adm;
	}

	public void setLeito(Leito leito) {
		this.leito = leito;
	}
}
