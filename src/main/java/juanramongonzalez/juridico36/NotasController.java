/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanramongonzalez.juridico36;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author juanr
 */
public class NotasController {
    @FXML
    private TextArea nota;
    @FXML
    private TextField abogado;
    
    @FXML
private void switchPrincipal() throws IOException{
        App.setRoot("principal");
}

    public void botonAgragarNota() throws IOException{
        App.setRoot("principal");
         String dbURL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";

        // Replace with the actual text field values
        String not = nota.getText();
        String abogad = abogado.getText();

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            // Create PreparedStatement
            String sql = "INSERT INTO notas VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Set PreparedStatement parameters
            statement.setInt(1,0);
            statement.setString(2, not);
            statement.setString(3, abogad);

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
