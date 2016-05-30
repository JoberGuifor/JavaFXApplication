package entity;

import java.util.ArrayList;

public class Leitos {

    
        private final ArrayList<Leito> leitos;
        
        
	public Leitos() {
        this.leitos = new ArrayList();
        
	}

    /**
     *
     * @param leito
     */
    public void addleito(Leito leito){
            boolean add = leitos.add(leito);
        }

   public void remove(Leito leito) {
       leitos.remove(leito);    }

	/**
	 *
	 * @return
     */

}
