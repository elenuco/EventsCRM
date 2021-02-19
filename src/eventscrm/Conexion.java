/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscrm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yohalmo Esperanza
 */
public class Conexion {
    
    
   //La url para conectar a la base de datos
    private static String url = "jdbc:mysql://localhost/events_crm";
    //El usuario de la base de datos
    private static String user = "root";
    //private static String user = "root";
    //La clave del usuario de la base de datos
    private static String password = "";
    //private static String password = "";
    //Metodo para obtener la conexion con la base de datos

    public Connection getConexion() {
        Connection cn = null;
        try {
            //Cargamos el driver y le decimos que vamos a usar
            //una conexion con mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Obtenemos la conexion
            cn = DriverManager.getConnection(url, user, password);
            
             if(cn!=null){
                System.out.println("Conexión exitosa"); 
            }else{
                System.out.println("Conexión Fallida");           
            }
        } catch (Exception e) {
            cn = null;
        } finally {
            return cn;
        }
    }

    //Metodo utilizado para cerrar la conexion
    public  void cerrarConexion(Connection cn) {
        try {
            cn.close();
        } catch (Exception e) {
        }
    }
    
 
}
