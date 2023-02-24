/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package flags;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Administrator
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button lesothoButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button seirraButton;

    @FXML
    private Rectangle RECT3;

    @FXML
    private Button luxemButton;

    @FXML
    private Rectangle RECT2;

    @FXML
    private Button hungaryButton;

    @FXML
    private Rectangle RECT1;

    @FXML
    private Button netherlandsButton;

    @FXML
    void lesotho(ActionEvent event) {
        RECT1.setFill(Color.BLUE);
        RECT2.setFill(Color.WHITE);
        RECT3.setFill(Color.GREEN);
    }

    @FXML
    void netherlands(ActionEvent event) {
       RECT1.setFill(Color.MAROON);
        RECT2.setFill(Color.WHITE);
        RECT3.setFill(Color.DARKBLUE);
    }

    @FXML
    void hungary(ActionEvent event) {
        RECT1.setFill(Color.RED);
        RECT2.setFill(Color.WHITE);
        RECT3.setFill(Color.GREEN);
    }

    @FXML
    void seirra(ActionEvent event) {
        RECT1.setFill(Color.LIGHTGREEN);
        RECT2.setFill(Color.WHITE);
        RECT3.setFill(Color.BLUE);
    }

    @FXML
    void luxem(ActionEvent event) {
        RECT1.setFill(Color.RED);
        RECT2.setFill(Color.WHITE);
        RECT3.setFill(Color.BLUE);
    }

    @FXML
    void clear(ActionEvent event) {
        RECT1.setFill(Color.BLUE);
        RECT2.setFill(Color.BLUE);
        RECT3.setFill(Color.BLUE);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
