package entity;
//em um quarto há varios leitos
public class Leito {


	public Paciente_ou_expaciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente_ou_expaciente paciente) {
		this.paciente = paciente;
	}

	public int getQuantidadepaciente() {
		return quantidadepaciente;
	}

	public void setQuantidadepaciente(int quantidadepaciente) {
		this.quantidadepaciente = quantidadepaciente;
	}

	public int getContpaciente() {
		return contpaciente;
	}

	public void setContpaciente(int contpaciente) {
		this.contpaciente = contpaciente;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Paciente_ou_expaciente getPaciente_ou_expaciente() {
		return paciente_ou_expaciente;
	}

	public void setPaciente_ou_expaciente(Paciente_ou_expaciente[] paciente_ou_expaciente) {
		this.paciente_ou_expaciente = paciente_ou_expaciente;
	}

	public Conta[] getConta() {
		return conta;
	}

	public void setConta(Conta[] conta) {
		this.conta = conta;
	}

	public void setPaciente_ou_expaciente(Paciente_ou_expaciente paciente_ou_expaciente) {
		this.paciente_ou_expaciente = paciente_ou_expaciente;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Controller.Entity.Leito getLeitos() {
		return leitos;
	}

	public void setLeitos(Leitos leitos) {
		this.leitos = leitos;
	}

	public void setLeitos(Controller.Entity.Leito leitos) {
		this.leitos = leitos;
	}

	public Controller.Entity.Leito getLeito() {
		return leito;
	}

	public void setLeito(Controller.Entity.Leito leito) {
		this.leito = leito;
	}

	private Paciente_ou_expaciente paciente;

	private int quantidadepaciente;

	private int contpaciente;

	private double preço;

	private int quarto;

	private boolean ocupado;

	private int numero;

	private Admin admin;

	private Leito leitos;

	private Leito leito;

	private Admin admin;

	private Paciente_ou_expaciente paciente_ou_expaciente;

	private Hospital hospital;

	private Paciente_ou_expaciente[] paciente_ou_expaciente;

	private Conta[] conta;

	private Conta[] conta;

	private Leitos leitos;

	public boolean setpreço(double preco) {
		return false;
	}

	public float getpreço() {
		return 0;
	}

	public void setquarto(int numero) {

	}

	public void setpaciete(Paciente_ou_expaciente paciente) {

	}

	public void setocupado(boolean ocupado) {

	}

	public void setnumero(int numero) {

	}

	public Paciente_ou_expaciente getpaciente(int nquartro, int nleito) {
		return null;
	}

	public boolean getocupado() {
		return false;
	}

	public int getnumero() {
		return 0;
	}

}
