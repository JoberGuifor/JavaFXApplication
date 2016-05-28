package entity;

import java.util.ArrayList;

/**
 *
 */
public class Hospital {

	private Leitos leitos_lista;
	private ArrayList<Admin>admin_lista;
	
public Hospital(){}

	public Hospital(Leitos leitos_lista, ArrayList<Admin> admin_lista) {
		this.leitos_lista = leitos_lista;
		this.admin_lista = admin_lista;
	}


	public void addleito(int num, Leito leito) {
		          leitos_lista.add(num, leito);
        }

}
