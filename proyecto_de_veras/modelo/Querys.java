/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_de_veras.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class Querys  {
    PreparedStatement stmt;
    ResultSet rs;
    Conexion pr;
    Connection Con;
   
     String[] dc = new String[4];

    public void QueryRegistro(String nombre, String ip, String Mac,String hf){
    dc[0] = "NombreEquipo";
    dc[1] = "IP";
    dc[2] = "MAC";
    dc[3] = "FechaRegistro";
   
      
        String col = "INSERT INTO coneccion (NombreEquipo,IP,MAC,FechaRegistro) VALUES (?,?,?,?)";
        try {
            Con = pr.getCon();
            System.out.println("paso 1");
            stmt=Con.prepareStatement(col);
            stmt.setString(1, nombre);
            System.out.println("paso2");
            stmt.setString(2, ip);
            System.out.println("paso3");
            stmt.setString(3, Mac);
            System.out.println("paso4");
            stmt.setString(4, hf);
            
            System.out.println(stmt.toString());
            //stmt.execute();
            System.out.println("se ingreso con exito");
        } catch (SQLException ex) {
            System.out.println(ex.getSQLState());
        }
     
    }
    
    public void QueryBusqueda(String Nombre, String Ip,String Mac){
    
    
    
    }
}
