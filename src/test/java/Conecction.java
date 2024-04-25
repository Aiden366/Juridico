
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.InputMismatchException;

public class Conecction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/mydb";
        int opc = 0;
        try{
            Connection c = DriverManager.getConnection(url, "root", "root");
            System.out.println(".......................................................");
            System.out.println(">Detectando Estado de Conexion...");
            System.out.println("(conectado correctamente)");
            System.out.println(".......................................................");
            System.out.println();
            try{
            do{
                System.out.println("Menu de opciones: ");
                System.out.println("1.-agregar");
                System.out.println("2.-editar");
                System.out.println("3.-eliminar");
                System.out.println("4.- traer informacion");
                System.out.println("5.-salir");
                System.out.println("Elige una opcion: ");
                System.out.println();
                opc = sc.nextInt();
              
                
                switch(opc){
                    case 1:{

                        Statement stm = c.createStatement();
                        String sql = "insert into abogados values(0,'pedrito pepe del gozar','gallardo.pppp.com','3320282169','Abogado de Divorcios','juanra88')";
                        boolean r =stm.execute(sql);
                        if(!r){
                          System.out.println("insertado correctamente");
                          }else{
                              System.out.println("no se pudo insertar");
                               }
                      
                        break;
                    }
                    case 2:{
                         Statement stm = c.createStatement();
                         String sql = "update autor set nombre = 'pantumflo' where id = 2";
           
                         stm.executeUpdate(sql);

                      
                        break;
                    }
                    case 3:{
                        Statement stm = c.createStatement();
                        String sql = "delete from autor where id = 3";
                        stm.executeUpdate(sql);
                        break;
                    }
                    case 4:{
                        Statement stm = c.createStatement();
                        String sql = "select * from autor";
                        ResultSet datos = stm.executeQuery(sql);
                        while(datos.next()){
                            System.out.println(datos.getString("nombre"));
                        }
                        break;
                    }
                    case 5:
                        System.out.println("saliendo del programa...");
                        break;
                    default:
                        System.out.println("opcion invalida");
                        break;
                }
                
            }while(opc !=5);
            
            }catch(InputMismatchException ex){
                System.out.println("solo se permiten numeros enteros");
   
            }
   
        }catch(SQLException ex){
            System.out.println("Error en en Conexion");
        }
    }
}