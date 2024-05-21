/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanramongonzalez.juridico36;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author juanr
 */
public class ConsulAboController {
    @FXML
    private TableColumn id;
     @FXML
    private TableColumn nombre;
      @FXML
    private TableColumn contraseña;
       @FXML
    private TableColumn telefono;
        @FXML
    private TableColumn correo;
         @FXML
    private TableColumn especialidad;
          @FXML
    private TableView<String> tableView;
    private String sql = "";
@FXML         
private void botonMostrarAbogados(){
//      // Conectar a la base de datos y recuperar datos
//        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
//             Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("SELECT idAbogado, Nombre, Correo, Telefono, Especialidad, Contraseña FROM abogados");
//            while (resultSet.next()) {
//                String[] rowData = new String[2];
//                rowData[0] = resultSet.getString("idAbogado");
//                rowData[1] = resultSet.getString("Nombre");
//                rowData[2] = resultSet.getString("Correo");
//                rowData[3] = resultSet.getString("Telefono");
//                rowData[4] = resultSet.getString("Especialidad");
//                rowData[5] = resultSet.getString("Contraseña");
//                tableView.getItems().add(rowData);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
try {
            // Conexión a la base de datos MySQL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
            Statement stmt = conn.createStatement();
            sql = "SELECT * FROM abogados";
            stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            // Limpiar TableView antes de cargar nuevos datos
            tableView.getItems().clear();

            // Recorrer los resultados y agregarlos a la TableView
            while (rs.next()) {
                int id = rs.getInt("idAbogado");
//                tableView.getItems().add(rs.getString("idAbogado"));
                tableView.getItems().add(rs.getString("Nombre"));
                tableView.getItems().add(rs.getString("Correo"));
                tableView.getItems().add(rs.getString("Telefono"));
                tableView.getItems().add(rs.getString("Especialidad"));
                tableView.getItems().add(rs.getString("Contrasena"));
            }

            // Cerrar conexiones
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

@FXML
private void switchPrincipal() throws IOException{
        App.setRoot("principal");
}
     
}
