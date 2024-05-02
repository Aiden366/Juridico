package juanramongonzalez.juridico36;

import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SecondaryController {
    @FXML
    private TextField nombre;
    @FXML
    private TextField telefono;
    @FXML
    private PasswordField contraseña;
    @FXML
    private TextField correo;
    @FXML
    private TextField especialidad;
    
    
    @FXML
    private void switchPrincipal2() throws IOException{
        App.setRoot("principal");
    }
     @FXML
    private void switchPrincipal() throws IOException, SQLException {
        App.setRoot("principal");
        // Replace with your database connection details
        String dbURL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";

        // Replace with the actual text field values
        String name = nombre.getText();
        String correoE = correo.getText();
        String tel = telefono.getText();
        String spe = especialidad.getText();
        String contra = contraseña.getText();

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            // Create PreparedStatement
            String sql = "INSERT INTO abogados VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Set PreparedStatement parameters
            statement.setInt(1,0);
            statement.setString(2, name);
            statement.setString(3, correoE);
            statement.setString(4, tel);
            statement.setString(5, spe);
            statement.setString(6, contra);

            // Execute PreparedStatement
            statement.executeUpdate();

            System.out.println("Data inserted successfully!");

            // Close resources
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace(); 
        } 
    }
}