import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanr
 */
public class TestConeccion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        try {
            
            //establecer una comunicacion con MSQL
            Connection c = DriverManager.getConnection(url,"root","root");
             System.out.println("Conectado Correctamente");
             //crear una sentencia SQL para enviar comandos
        Statement stm = c.createStatement();
        String sql = "insert into editorial values (0,'Ecology','Atequiza','444444','pablitocampana@gmail.com')";
        boolean r = stm.execute(sql);
            if(!r){
                System.out.println("insertado Correctamente");
            }else{
                System.out.println("no se pudo insertar");
            }    
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("fallo de conexion");
        }
        
    }
}