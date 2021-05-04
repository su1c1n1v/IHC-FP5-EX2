package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button clearBtt;
    @FXML
    Pane pane;

    @FXML
    ToggleButton circleBtt,squareBtt,triangleBtt;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void InsertShape(MouseEvent event) {
        double x = event.getSceneX(),
                y = event.getSceneY();
        if(circleBtt.isSelected() || squareBtt.isSelected() || triangleBtt.isSelected()){
            pane.getChildren().add(new Circle(x,y+10 ,30 ));
        }
    }

    public void ClearPane(ActionEvent event){
        pane = new Pane();
    }

}
