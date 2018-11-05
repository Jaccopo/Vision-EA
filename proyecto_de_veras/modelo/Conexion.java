/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_de_veras.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class Conexion  {
     Connection Con;

    public Connection getCon() {
        return Con;
    }

    public Conexion(Connection Con) {
        this.Con = Con;
    }

    public  boolean ConectarR(){
        boolean c = true;
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ea","root", "");
            System.out.println("Conectado con exito");
            c = true;
        } catch (ClassNotFoundException ex) {
            System.out.println("error"+ex.getMessage());
            c= false;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            c = false;
        }
        return c;
    }
    
     public boolean Cerrar(){
        try {
            Con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     return false;
     }
     
     public void ConectarP(){
        
         
         try {
             Class.forName("com.mysql.jdbc.Driver");
             Con = DriverManager.getConnection("jdbc:mysql://eaprueba.cnu4x6jaaqeq.us-east-1.rds.amazonaws.com/db1","root", "12345678");
             System.out.println("Conectado con exito");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
     
     }
     
     
    
}
