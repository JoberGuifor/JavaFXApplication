/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Conta {
     char data;
     float total;
     Paciente_ou_expaciente paciente_ou_expaciente;
     boolean paga;
     String descricao;
     ArrayList <listamedicamento> medicamento_paciente = new ArrayList();
  
     int qtdfucionarios;
     float precofuncionario;

    public void setpaga(boolean paga){
         this.paga = paga;
}
     public String get_name(){
 return Paciente_ou_expaciente.nome;
 }
}