package entity;

/**
 *
 */
public class MedicamentoPaciente {
	public MedicamentoPaciente(String tarja, boolean vendacomreceita, String nome, float preco, Admins admin, Conta conta) {
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Admins getAdmin() {
		return admin;
	}

	public void setAdmin(Admins admin) {
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

	private String nome ;

	private float preco;

	private Admins admin;

	private Conta conta;

}
