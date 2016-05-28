/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
class Listamedicamento {

    private ArrayList <Listamedicamento> MedicamentoPaciente = new ArrayList<>();
    public Listamedicamento(ArrayList<Listamedicamento> MedicamentoPaciente) {
        this.MedicamentoPaciente = MedicamentoPaciente;
    }

    public ArrayList<Listamedicamento> getMedicamentoPaciente() {

        return MedicamentoPaciente;
    }

    public void setMedicamentoPaciente(ArrayList<Listamedicamento> MedicamentoPaciente) {
        this.MedicamentoPaciente = MedicamentoPaciente;
    }

}
