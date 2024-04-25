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
//        String url = "jdbc:mysql://localhost:3306/mydb";
//        try {
//            Connection conexion=null;
//            Connection c = DriverManager.getConnection(url, "root", "root");
//            System.out.println("Se conecto");
//            Statement stm = c.createStatement();
//                        PreparedStatement insertar = conexion.prepareStatement("insert into abogados values(?,?,?,?,?,?)");
//                        insertar.setString(0, "0");
//                        insertar.setString(1, nombre.getText().trim());
//                        insertar.setString(2, correo.getText().trim());        
//                        insertar.setString(3, telefono.getText().trim());
//                        insertar.setString(4, especialidad.getText().trim());              
//                        insertar.setString(5, contraseña.getText().trim()); 
//        
//                        insertar.executeUpdate();
//                        String sql = "insert into abogados values(0,'nombre.getText()','telefono.getText()','correo.getText()','especialidad.getText()','contraseña.getText()')";
//                        boolean r =stm.execute(sql);
//                        if(!r){
//                          System.out.println("insertado correctamente");
//                          }else{
//                              System.out.println("no se pudo insertar");
//    } 
//        } catch (SQLException ex) {
//            System.out.println("No se conecto");
//            Logger.getLogger(SecondaryController.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
       
    } 
    }
    
    
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("terciary");
    }
}