/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author MauroRoberto
 */
public class LogicTools2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Locale.getDefault());
        FXMLLoader scrldr = new FXMLLoader(getClass().getResource("/Design/Telas/Carregando.fxml"));
        scrldr.setResources(ResourceBundle.getBundle("Design.Idiomas.Idioma", Locale.getDefault()));
        Parent root = scrldr.load();
        
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll("/Design/CSS/Material.css", "/Design/CSS/Estruturas.css");
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
