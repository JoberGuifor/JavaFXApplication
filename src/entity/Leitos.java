package entity;

import java.util.ArrayList;

public class Leitos {
	/**
	 *
	 * @param listaleitos
     */
	public Leitos(Leitos listalLeitos, Hospital hospital) {
		this.leitos = leitos;
		this.hospital = hospital;
	}


	public ArrayList<Leito> leitos() {
		return leitos;
	}
	

	private Leitos leitos;

	private Hospital hospital;

	/**
	 *
	 * @return
     */

}
