package entity;
//em um quarto há varios leitos
public class Leito {


	public PacienteOUExpaciente getPaciente() {
		return paciente;
	}


	public void setPaciente(PacienteOUExpaciente paciente) {
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

	public PacienteOUExpaciente getPacienteOUExpaciente() {
		return PacienteOUExpaciente;
	}

	public void setPacienteOUExpaciente(PacienteOUExpaciente[] PacienteOUExpaciente) {
		this.PacienteOUExpaciente = PacienteOUExpaciente;
	}

	public Conta[] getConta() {
		return conta;
	}

	public void setConta(Conta[] conta) {
		this.conta = conta;
	}

	public void setPacienteOUExpaciente(PacienteOUExpaciente PacienteOUExpaciente) {
		this.PacienteOUExpaciente = PacienteOUExpaciente;
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

	private PacienteOUExpaciente paciente;

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

	private PacienteOUExpaciente PacienteOUExpaciente;

	private Hospital hospital;

	private PacienteOUExpaciente[] PacienteOUExpaciente;

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

	public void setpaciete(PacienteOUExpaciente paciente) {

	}

	public void setocupado(boolean ocupado) {

	}

	public void setnumero(int numero) {

	}

	public PacienteOUExpaciente getpaciente(int nquartro, int nleito) {
		return null;
	}

	public boolean getocupado() {
		return false;
	}

	public int getnumero() {
		return 0;
	}

}
