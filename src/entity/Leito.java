package entity;

/**
 *
 */
//em um quarto há varios leitos
public class Leito {

	private PacienteOUExpaciente paciente;

	private double preço;

	private int quarto;

	private boolean ocupado;

	private int numero;

	private Admin admin;

	private PacienteOUExpaciente PacienteOUExpaciente;


	public Leito(double preço, int quarto, boolean ocupado, int numero) {
		this.preço = preço;
		this.quarto = quarto;
		this.ocupado = ocupado;
		this.numero = numero;
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

	public PacienteOUExpaciente getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteOUExpaciente paciente) {
		this.paciente = paciente;
	}

}
