/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author lc
 */
public class Aplicacao extends Application {
    
public static void main(String[] args) {
launch(args);
}
@Override
public void start(Stage stage) throws Exception {
Parent parent =
    FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
Scene scene = new Scene(parent);
stage.setScene(scene);
    stage.setTitle("Login");
stage.show();
}
}

