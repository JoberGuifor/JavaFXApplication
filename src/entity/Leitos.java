package entity;

import java.util.ArrayList;

public class Leitos {

    
        private final ArrayList<Leito> leitos;
        String nome;
        
	public Leitos(String nome){
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }


    /**
	 *
	 * @return
     */

}
