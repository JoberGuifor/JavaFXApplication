package entity;
//
//import Controller.controle_adm;
//import Controller.controller_login;

public class Admin {

	private String usuario;

	private String senha;

	private String nome;

	private float salario;

	private int idade;

	//private Aplicacao aplicacao;

	private Hospital hospital;

	public Admin(String usuario, String senha, String nome, float salario, int idade) {
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
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

//	public Aplicacao getAplicacao() {
//		return aplicacao;
//	}
//
//	public void setAplicacao(Aplicacao aplicacao) {
//		this.aplicacao = aplicacao;
//	}


//
//	public controller_login getController_login() {
//		return controller_login;
//	}
//
//	public void setController_login(controller_login controller_login) {
//		this.controller_login = controller_login;
//	}
//
//	public controle_adm getControle_adm() {
//		return controle_adm;
//	}
//
//	public void setControle_adm(controle_adm controle_adm) {
//		this.controle_adm = controle_adm;
//	}

}

