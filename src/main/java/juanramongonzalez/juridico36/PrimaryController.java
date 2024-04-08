package juanramongonzalez.juridico36;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField nombre;
    

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
