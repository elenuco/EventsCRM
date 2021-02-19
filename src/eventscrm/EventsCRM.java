/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscrm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.Modelo;
/**
 *
 * @author Evelyn
 */
public class EventsCRM {
     Statement ejecutaSentencia = null;
     Conexion objconexion =null;
     Connection accesoBD=null;
     public EventsCRM(){
           objconexion=new Conexion();
         accesoBD=objconexion.getConexion();
        try {
           
           ejecutaSentencia=accesoBD.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
   }
     
     
     /**
     * Este metodo lo utilizamos para ejecutar sentencias select, insert, update
     * 
     * @param consultaSql recibe la consulta sql
     * @return retorna la cantidad de registros afectados, -1 en caso se genero un error
     */
    public int ejecutaSetenciaAccion(String consultaSql)
    {
        try {
            return ejecutaSentencia.executeUpdate(consultaSql);
        } catch (Exception e) {
             System.out.println(e.getMessage().toString());
             return -1;
        }
        
    }
    
    public ResultSet ejecutaSentenciaBusqueda(String consultaSql)
            {
                ResultSet objResultado =null;
                try {
                 objResultado = ejecutaSentencia.executeQuery(consultaSql); 
                } catch (Exception e) {
                    System.out.println(e.getMessage().toString());
                    
                }
                finally{
                    return objResultado;
                }
            }
    
    //------------CRUD DE LA TABLA MENU
    //--
    //--
    public int insertarMenu(Modelo objModelo)
    {
        String consultaSql="";
        consultaSql="INSERT INTO `menu_evento` (`id_Menu`, `Menu_Evento_Nombre`, `Menu_Evento_Descripción`, `Menu_Evento_Precio`) "+ 
        "values('"+null+"','"+objModelo.getMenu_Evento_Nombre()+"','"+objModelo.getMenu_Evento_Descripcion()+"',"+objModelo.getMenu_Evento_Precio()+")";
        return ejecutaSetenciaAccion(consultaSql);
    }
    
    
    public ResultSet MostrarMenu()
    {
        ResultSet listado= null;
        try {
           String consultaSql="Select Menu_Evento_Nombre, Menu_Evento_Precio from menu_evento";
             listado=ejecutaSentenciaBusqueda(consultaSql);
            return listado;
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
            return listado=null;
        }
    }
    //--
    //--
    //------------CRUD DE LA TABLA LOCAL
    //--
    //--
    public int insertarLocal(Modelo objModelo)
    {
        String consultaSql="";
        consultaSql="INSERT INTO `local` (`id_Local`, `Local_Nombre`, `Local_Sillas`, `Local_Mesas`)"+ 
        "values('"+null+"','"+objModelo.getLocal_Nombre()+"',"+objModelo.getLocal_Sillas()+","+objModelo.getLocal_Mesas()+")";
        return ejecutaSetenciaAccion(consultaSql);
    }
    
    
    public ResultSet MostrarLocal()
    {
        ResultSet listado= null;
        try {
           String consultaSql="Select Local_Nombre, Local_Mesas, Local_Sillas from local";
             listado=ejecutaSentenciaBusqueda(consultaSql);
            return listado;
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
            return listado=null;
        }
    }
    //--
    //--
    //------------CRUD DE LA TABLA TIPO DE EVENTO
    //--
    //--
    public int insertarTipoEvento(Modelo objModelo)
    {
        String consultaSql="";
        consultaSql="INSERT INTO `tipo_evento` (`id_Evento`, `Evento_Evento`)  "+ 
        "values('"+null+"','"+objModelo.getTipo_Evento()+")";
        return ejecutaSetenciaAccion(consultaSql);
    }
    
    
    public ResultSet MostrarTipoEvento()
    {
        ResultSet listado= null;
        try {
           String consultaSql="Select tipo_evento from tipo_evento";
             listado=ejecutaSentenciaBusqueda(consultaSql);
            return listado;
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
            return listado=null;
        }
    }
   
}
