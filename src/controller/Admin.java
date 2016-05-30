/**
 * Sample Skeleton for 'Admin.fxml' Controller Class
 */

package controller;

import entity.Leitos;
import entity.PacienteOUExpaciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Admin {

    @FXML // fx:id="arquivo"
    private Menu arquivo; // Value injected by FXMLLoader

    @FXML // fx:id="novo"
    private MenuItem novo; // Value injected by FXMLLoader

    @FXML // fx:id="fecharmenu"
    private MenuItem fecharmenu; // Value injected by FXMLLoader

    @FXML // fx:id="salvar"
    private MenuItem salvar; // Value injected by FXMLLoader

    @FXML // fx:id="salvarcomo"
    private MenuItem salvarcomo; // Value injected by FXMLLoader

    @FXML // fx:id="fecharapp"
    private MenuItem fecharapp; // Value injected by FXMLLoader

    @FXML // fx:id="ajuda"
    private Menu ajuda; // Value injected by FXMLLoader

    @FXML // fx:id="sobre"
    private MenuItem sobre; // Value injected by FXMLLoader

    @FXML // fx:id="conta"
    private Menu conta; // Value injected by FXMLLoader

    @FXML // fx:id="setsenha"
    private MenuItem setsenha; // Value injected by FXMLLoader

    @FXML // fx:id="Usuario"
    private Label Usuario; // Value injected by FXMLLoader

    @FXML // fx:id="Hospitais"
    private TitledPane Hospitais; // Value injected by FXMLLoader

    @FXML // fx:id="leitos"
    private ComboBox<Leitos> leitos; // Value injected by FXMLLoader

    @FXML // fx:id="paciente"
    private ComboBox<PacienteOUExpaciente> paciente; // Value injected by FXMLLoader

    @FXML
    public void callsetsenha(ActionEvent event) {

        final JFrame frame = new JFrame("JDialog Demo");
        final JButton btnLogin = new JButton("Click to login");

        btnLogin.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        LoginDialog loginDlg = new LoginDialog(frame);
                        loginDlg.setVisible(true);
                        // if logon successfully
                        if(loginDlg.isSucceeded())
                            btnLogin.setText("Hi " + loginDlg.getUsername() + "!");

                    }
                });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(btnLogin);
        frame.setVisible(true);

    }


    @FXML
    public void fechatutotatatatata(ActionEvent event) {

        Usuario.setText("Tente novamente");

    }

    @FXML
    public void sair(ActionEvent event) {

        Usuario.setText("Tente novamente");

    }

    @FXML
    public void salvar(ActionEvent event) {

        Usuario.setText("Tente novamente");

    }

    @FXML
   public void salvarcomo(ActionEvent event) {

        Usuario.setText("Tente novamente");
    }


    public void show(MouseEvent event) {

        Usuario.setText("Tente novamente");
    }


}
