/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanramongonzalez.juridico36;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author juanr
 */
public class PrincipalController {
     @FXML
    private void switchSalir() throws IOException {
        App.setRoot("primary");
    }
     @FXML
    private void switchAbogados() throws IOException {
        App.setRoot("secondary");
    }
     @FXML
    private void switchClientes() throws IOException {
        App.setRoot("terciary");
    }
}
