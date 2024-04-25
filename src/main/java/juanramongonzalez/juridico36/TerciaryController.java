/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanramongonzalez.juridico36;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author juanr
 */
public class TerciaryController {
    @FXML
    private TextField nombre;
     @FXML
    private void switchPrincipal() throws IOException {
        App.setRoot("principal");
    }
    @FXML
    public void borrarText(ActionEvent e){
        nombre.setText("");
        
    }
    
}
