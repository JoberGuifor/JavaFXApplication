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
    public Listamedicamento(ArrayList<listamedicamento> medicamento_paciente) {
        this.medicamento_paciente = medicamento_paciente;
    }

    public ArrayList<listamedicamento> getMedicamento_paciente() {

        return Listamedicamento;
    }

    public void setMedicamento_paciente(ArrayList<listamedicamento> medicamento_paciente) {
        this.medicamento_paciente = medicamento_paciente;
    }

    private ArrayList <listamedicamento> medicamento_paciente = new ArrayList(Medicamento);
}
