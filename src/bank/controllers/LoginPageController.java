/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shaim
 */
public class LoginPageController implements Initializable {

    @FXML
    private FontAwesomeIconView Minimizebtn;
    @FXML
    private FontAwesomeIconView Maximizebtn;

    /**
     * Initializes the controller class.
     */    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Min(MouseEvent event) {
           Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
           s.setIconified(true);

    }
    @FXML
    private void Close(MouseEvent event) {
            Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
            s.close();
    }

    @FXML
    private void Minimize(MouseEvent event) {
            Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
             s.setFullScreen(false);
             Maximizebtn.setVisible(true);
             Minimizebtn.setVisible(false);
             
    }

    @FXML
    private void Max(MouseEvent event) {
        Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
             s.setFullScreen(true);
             Maximizebtn.setVisible(false);
             Minimizebtn.setVisible(true);
    }
    
}
