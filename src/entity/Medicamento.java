package entity;

/**
 *
 */
public class Medicamento {
	public Medicamento(String tarja, String nome, float preco) {
		this.tarja = tarja;
		this.nome = nome;
		this.preco = preco;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public String getNome() {
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


	private String tarja;

	private String nome ;

	private float preco;


}
