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
    private TextField telefono;
    @FXML
    private TextField correo;
    @FXML
    private TextField firma;
    @FXML
    private TextField demanda;
    @FXML
    private void switchPrincipal() throws IOException {
        App.setRoot("principal");
        
        // Replace with your database connection details
        String dbURL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";

        // Replace with the actual text field values
        String name = nombre.getText();
        String correoE = correo.getText();
        String tel = telefono.getText();
        String fir = firma.getText();
        String dem = demanda.getText();

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(dbURL, username, password);

            // Create PreparedStatement
            String sql = "INSERT INTO actor VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Set PreparedStatement parameters
            statement.setInt(1,0);
            statement.setString(2, name);
            statement.setString(3, correoE);
            statement.setString(4, tel);
            statement.setString(5, fir);
//            statement.setString(6, dem);

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
    @FXML
    private void switchPrincipal2() throws IOException {
        App.setRoot("principal");
    }
   
    
}
