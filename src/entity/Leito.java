package entity;
//em um quarto há varios leitos
public class Leito {

	private PacienteOUExpaciente paciente;

	private int quantidadepaciente;

	private int contpaciente;

	private double preço;

	private int quarto;

	private boolean ocupado;

	private int numero;

	private Admin admin;

	private Admin admin;

	private PacienteOUExpaciente PacienteOUExpaciente;

	private Hospital hospital;

	private Conta[] conta;

	public Leito(PacienteOUExpaciente paciente, int quantidadepaciente, int contpaciente, double preço, int quarto, boolean ocupado, int numero, Admin admin, Admin admin1, PacienteOUExpaciente pacienteOUExpaciente, Hospital hospital, Conta[] conta) {
		this.paciente = paciente;
		this.quantidadepaciente = quantidadepaciente;
		this.contpaciente = contpaciente;
		this.preço = preço;
		this.quarto = quarto;
		this.ocupado = ocupado;
		this.numero = numero;
		this.admin = admin;
		this.admin = admin1;
		PacienteOUExpaciente = pacienteOUExpaciente;
		this.hospital = hospital;
		this.conta = conta;
	}


	public Conta[] getConta() {
		return conta;
	}

	public void setConta(Conta[] conta) {
		this.conta = conta;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public PacienteOUExpaciente getPacienteOUExpaciente() {
		return PacienteOUExpaciente;
	}

	public void setPacienteOUExpaciente(PacienteOUExpaciente pacienteOUExpaciente) {
		PacienteOUExpaciente = pacienteOUExpaciente;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getContpaciente() {
		return contpaciente;
	}

	public void setContpaciente(int contpaciente) {
		this.contpaciente = contpaciente;
	}

	public int getQuantidadepaciente() {
		return quantidadepaciente;
	}

	public void setQuantidadepaciente(int quantidadepaciente) {
		this.quantidadepaciente = quantidadepaciente;
	}

	public PacienteOUExpaciente getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteOUExpaciente paciente) {
		this.paciente = paciente;
	}
}
