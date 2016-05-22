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

    private ArrayList <listamedicamento> MedicamentoPaciente = new ArrayList(Medicamento);
    public Listamedicamento(ArrayList<listamedicamento> MedicamentoPaciente) {
        this.MedicamentoPaciente = MedicamentoPaciente;
    }

    public ArrayList<listamedicamento> getMedicamentoPaciente() {

        return Listamedicamento;
    }

    public void setMedicamentoPaciente(ArrayList<listamedicamento> MedicamentoPaciente) {
        this.MedicamentoPaciente = MedicamentoPaciente;
    }

}
