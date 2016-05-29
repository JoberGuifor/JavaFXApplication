package entity;

import java.util.ArrayList;

/**
 *
 */
public class Hospital {
        
	private Leitos leitos_lista;
	private final ArrayList<Admin>admin_lista;
        
	
public Hospital(){
admin_lista = new ArrayList<>();
}



	public void addleito(Leito leito) {
		          leitos_lista.addleito(leito);
        }
        public void removeleito(Leito leito){
        leitos_lista.remove(leito);
        }
        public void addAdmin(Admin admin){
                admin_lista.add(admin);
        }

    void addAdmin(int i, Admin admin) {
        this.admin_lista.add(i ,admin);
        }

}
