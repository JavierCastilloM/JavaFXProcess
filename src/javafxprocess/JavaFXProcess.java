/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxprocess;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author JavierCastilloM
 */
public class JavaFXProcess extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox box = new HBox();
        box.setSpacing(25);
        box.setAlignment(Pos.CENTER);
        
        Button btnNew = new Button();
        Button btnOpen = new Button();
        Button btnSave = new Button();
        Button btnPrint = new Button();
        btnNew.setText("New");
        btnOpen.setText("Open");
        btnSave.setText("Save");
        btnPrint.setText("Print");
        box.getChildren().addAll(btnNew,btnOpen,btnSave,btnPrint);
        
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process New");
            }
        });;
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Open");
            }
        });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Save");
            }
        });
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Process Print");
            }
        });
        

        

        Scene scene = new Scene(box, 400, 100);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
