/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author aluno
 */
public class Aplicacao extends JavaFXApplication1{
    public static void main(String[] args) {
        
     launch(); // 2
 }

 @Override
 public void start(Stage palco) throws Exception { // 3
  StackPane raiz = new StackPane(); // 4
  Label lblMensagem = new Label(); // 5

  lblMensagem.setText("Estou aprendendo JavaFX!"); // 6
  raiz.getChildren().add(lblMensagem); // 7

  Scene cena = new Scene(raiz, 250, 100); // 8
  palco.setTitle("Aprendendo JavaFX"); // 9
  palco.setScene(cena); // 10
  palco.show(); // 11

 }
}
    
}
