package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author lc
 */
public class Login{

        @FXML
        private Label Label;

        @FXML
        private Label invalid_label;

        @FXML
        private TextField userName;

        @FXML
        private PasswordField pw;


    public void login(ActionEvent event)   {

        Label.setText(userName.getText());

        if((userName.getText() != null) && userName.getText() != "Usuario" &&  pw.getText() != "Login" && pw.getText() != null && (userName.getText() != " ") && pw.getText() != " ")
        {
            Label.setText("OK");
            Label.setText(userName.getText());
            invalid_label.setText("Credenciais Aceitas");
            boundary.Tela_Admin.launch();

        }
        else
            Label.setText("Tente novamente");
        userName.clear();
        pw.clear();
        invalid_label.setText("Descupas, credenciais inválidas");
    }

    }

//logar no sistema
