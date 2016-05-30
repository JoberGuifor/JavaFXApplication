/**
 * Sample Skeleton for 'Admin.fxml' Controller Class
 */

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

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
    private ComboBox<?> leitos; // Value injected by FXMLLoader

    @FXML // fx:id="paciente"
    private ComboBox<?> paciente; // Value injected by FXMLLoader

    @FXML
    public void callsetsenha(ActionEvent event) {

            Usuario.setText("Tente novamente");

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
