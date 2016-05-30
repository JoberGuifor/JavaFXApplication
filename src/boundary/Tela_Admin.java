/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import entity.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lc
 */
public class Tela_Admin extends Application {

@Override
public void start(Stage stage)  {
    try{

        Parent parent = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene cena = new Scene(parent);
        stage.setScene(cena);
        stage.setTitle("Administração hospitalar");
        stage.show();
        }
    catch (Exception e){
        e.printStackTrace();
    }    }


    public static void main(String[] args) {




        Admin jorge;
        jorge = new Admin("usuario", "senha", "nome", 10000, 30);

        Hospital Sao_Joaquim;
        Sao_Joaquim = new Hospital("São Joaquim");
        Sao_Joaquim.addAdmin(jorge);

//tela de inserção de leitos
        Leito leito = new Leito(100, 1, false, 1);
        Leito leito2 = new Leito(100, 2, false, 1);
        Leito leito3 = new Leito(110, 3, false, 1);
        Leito leito4 = new Leito(110, 4, false, 1);
        Leito leito5 = new Leito(100, 6, false, 2);
        Leito leito6 = new Leito(100, 7, false, 2);
        Leito leito7 = new Leito(100, 8, false, 2);
        Leito leito8 = new Leito(100, 9, false, 2);


//conjunto
        Leitos urgencia = new Leitos("urgencia");
        Leitos queimaduras = new Leitos("queimaduras");
//        lei.getItems().addAll(urgencia.getNome(),
//                queimaduras.getNome());

        urgencia.addleito(leito);
        urgencia.addleito(leito2);
        urgencia.addleito(leito3);
        urgencia.addleito(leito4);
        urgencia.addleito(leito5);
        urgencia.addleito(leito6);
        queimaduras.addleito(leito7);
        queimaduras.addleito(leito8);

        ConvenioPaciente convenio = new ConvenioPaciente(1, 'A');
        PacienteOUExpaciente paciente = new PacienteOUExpaciente( leito, convenio, "143322", "219942");

     // pac.getItems().addAll(Sao_Joaquim.getNome());

        leito.setPaciente(paciente);
        leito.setOcupado(true);

        paciente.addHistorico_doença("Diabetes");


        launch(args);
    }
}


    

