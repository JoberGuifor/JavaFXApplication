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
public class Admin extends Application {

@Override
public void start(Stage stage2)  {
    try{
        Parent parent = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene cena = new Scene(parent);
        stage2.setScene(cena);
        stage2.setTitle("Administração hospital");
        stage2.show();
        }
    catch (Exception e){
        e.printStackTrace();
    }

}

    public static void main(String[] args) {
        launch(args);
    }
}


    

