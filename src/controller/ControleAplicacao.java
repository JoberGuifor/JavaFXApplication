/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author aluno
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleAplicacao {

 @FXML
 Label lblMensagem;

 @FXML
 TextField txtNome;

 public void atualizaMensagem() {
  lblMensagem.setText("Olá, " + txtNome.getText() + ", bem vindo!");
 }
}

