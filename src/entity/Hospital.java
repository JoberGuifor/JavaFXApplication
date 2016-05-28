package entity;

import java.util.ArrayList;

/**
 *
 */
public class Hospital {

	private Leitos leitos_lista;
	private ArrayList<Admins>admin_lista;
	
public Hospital(){}

	public Hospital(Leitos leitos_lista, ArrayList<Admins> admin_lista) {
		this.leitos_lista = leitos_lista;
		this.admin_lista = admin_lista;
	}


	public void addleito(Leito leito) {
		          leitos_lista.addleito(leito);
        }

}
