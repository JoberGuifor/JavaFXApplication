package entity;

import java.util.ArrayList;

public class Hospital {
public Hospital(){}
	private ArrayList<Leitos>leitos_lista;

	private ArrayList<Admin>admin_lista;

	public Hospital(ArrayList<Leitos> leitos_lista, ArrayList<Admin> admin_lista) {
		this.leitos_lista = leitos_lista;
		this.admin_lista = admin_lista;
	}


	public void addleito(Leito leito) {
		Leitos.add(leito);
	}

}
