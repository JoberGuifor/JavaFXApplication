package entity;

import java.util.ArrayList;

public class Leitos {
	/**
	 *
	 * @param listaleitos
     */
    
        private ArrayList<Leito> leitos;
        
	public Leitos(Hospital hospital) {
		this.hospital = hospital;
	}

//
//	public void getLeitos(int num){
//		return leitos.;
//	}
        
	private final Hospital hospital;
        void addleito(Leito leito){
            leitos.add(leito);
        }

	/**
	 *
	 * @return
     */

}
