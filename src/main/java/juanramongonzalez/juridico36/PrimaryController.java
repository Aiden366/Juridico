package juanramongonzalez.juridico36;

import java.io.IOException;
import java.sql.Connection;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class PrimaryController {
    @FXML
    private TextField usuario;
    private TextField contraseña;
    
    
       
    @FXML
    private void switchToSecondary() throws IOException {
//        String usuarioB = "root";
//        String clave = "root";
//        String url ="jdbc.mysql://localhost:3306/mydb";
//        String db ="mydb";
//        Connection connection;
        App.setRoot("principal");
    }
}
