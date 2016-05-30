package controller;

import boundary.Admin;
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
       private TextField userName;

       @FXML
       private PasswordField pw;


    public void login(ActionEvent event)   {
        if(userName.getText() != null && pw.getText() != null && userName.getText() != "" && pw.getText() != ""){
              Label.setText("OK");
            String[] args = null;
        Admin.main(args);
        }
        else
            Label.setText("Tente novamente");
       }

//logar no sistema
}