/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author lc
 */
public class Aplicacao {
    public static void main(String[]args){
     
   // Hospital hospital = new Hospital(leitos_lista, admin_lista);
//        Admin admin = new Admin("a","a", 2003, 20, 0, hospital, args);
       
Leito leito = new Leito(0, 0, true, 0, pacienteOUExpaciente);
PacienteOUExpaciente paciente = new PacienteOUExpaciente( leito, convenio, cpf, nome);
       // System.out.println(.ddoo);
}
}