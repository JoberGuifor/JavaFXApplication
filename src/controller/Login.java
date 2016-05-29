package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author lc
 */
public class Login implements Initializable{
@FXML
private AnchorPane paneLogin, paneNovoUsuario;
@FXML
private TextField txLogin, txNome, txidade, txLoginUsuario;
@FXML
private PasswordField txSenha, txSenhaUsuario;

@FXML
protected void btEntrarAction(ActionEvent evt){
//logar no sistema
}
@FXML
protected void btSairAction(ActionEvent evt){
System.exit(0);
}
@FXML
protected void btCadastrarAction(ActionEvent evt)
{//cadastrar novo usuario
    
}
@FXML
protected void btCancelarAction(ActionEvent evt){
        //cancelar operação
       paneLogin.setVisible(true);
paneNovoUsuario.setVisible(false);
}
@FXML
protected void linkCliqueAquiAction(ActionEvent evt){
       paneLogin.setVisible(false);
paneNovoUsuario.setVisible(true);

}

       @Override
       public void initialize(URL location, ResourceBundle resources) {

       }
}