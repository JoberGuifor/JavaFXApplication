/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import entity.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;

/**
 *
 * @author aluno
 */
public class Raiz extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage palco) throws Exception {
        final Reflection r = new Reflection();
        final VBox raiz = new VBox(30);
        final HBox hbTopo = new HBox(5);
        final TextField txtNome = new TextField();
        final Button btnAcao = new Button("Enviar");
        final Label lblMensagem = new Label();
        raiz.setTranslateX(10);raiz.setTranslateY(10);
        lblMensagem.setText("Digite seu nome e clique no botão");
        hbTopo.getChildren().addAll(txtNome, btnAcao);
        /////////////////


        Admin jorge;
        jorge = new Admin("usuario", "senha", "nome", 10000, 30);

        Hospital Sao_Joaquim;
        Sao_Joaquim = new Hospital();
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
        Leitos urgencia = new Leitos();
        Leitos queimaduras = new Leitos();

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

        leito.setPaciente(paciente);
        leito.setOcupado(true);

        paciente.addHistorico_doença("Diabetes");

        JOptionPane.showMessageDialog(null, paciente.getHistorico_doenca());
        ///////////////
        raiz.getChildren().addAll(hbTopo, lblMensagem);
        lblMensagem.setEffect(r);
        Scene cena = new Scene(raiz, 250, 100);
        palco.setTitle("Aplicação usando código Java");
        palco.setScene(cena);
        palco.show();

    }
}