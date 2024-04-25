/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanramongonzalez.juridico36;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author juanr
 */
public class EnlaceBaseDeDatos {
        private static Connection c;

    public static Connection getConexion(){
        try {
            if (c==null) {
                String url = "jdbc:mysql://localhost:3306/mydb";
                //Paso 1 = Crear una conexion;
                c = DriverManager.getConnection(url, "root", "root");
            }
        }catch (Exception e){
            e.printStackTrace();

        }
        return c;
    }

}
