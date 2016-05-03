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
     paciente paciente_ou_expaciente;
     boolean paga;
     String descricao;
     ArrayList <listamedicamento> medicamento_paciente = new ArrayList();
  
     int qtdfucionarios;
     float precofuncionario;
 void setpaga(){
 //Conta.paga = 1;
 }   
     void get_name(){
 //return paciente_ou_expaciente.nome;
 }

    private static class listamedicamento {

        public listamedicamento() {
        }
    }
}
