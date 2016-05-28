package entity;

import java.util.ArrayList;

/**
 *
 */
public class Hospital {
        
	private Leitos leitos_lista;
	private ArrayList<Admin>admin_lista;
	
public Hospital(){}



	public void addleito(Leito leito) {
		          leitos_lista.addleito(leito);
        }
        public void removeleito(Leito leito){
        leitos_lista.remove(leito);
        }
        public void addAdmin(Admin admin){
                admin_lista.add(admin);
        }

}
