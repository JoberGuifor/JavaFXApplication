package entity;

/**
 *
 */
public class MedicamentoPaciente {
	public MedicamentoPaciente(String tarja, boolean vendacomreceita, char nome, float preco, Admin admin, Conta conta) {
		this.tarja = tarja;
		this.vendacomreceita = vendacomreceita;
		this.nome = nome;
		this.preco = preco;
		this.admin = admin;
		this.conta = conta;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public boolean isVendacomreceita() {
		return vendacomreceita;
	}

	public void setVendacomreceita(boolean vendacomreceita) {
		this.vendacomreceita = vendacomreceita;
	}

	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	private String tarja;

	private boolean vendacomreceita;

	private char nome :String;

	private float preco;

	private Admin admin;

	private Conta conta;

	private Conta conta;
}
