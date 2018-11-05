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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**Clase Buscar
 *La presente clase tiene las sencitncias SQL para realizar las busquedas en la
 * base de datos
 * @author A
 */
public class Buscar  {
    ResultSet RS;
    String SQL;
    PreparedStatement PS;
    Statement ST;
    Connection Con;
    Conexion pr;
      /**UsuarioSistema
       * Busca al usuario 
       * @return 
       */
    private boolean UsuarioSistema(String Nombre,String Clave){
        
        try {
            Con = pr.getCon();
            RS = null;
            
            SQL = "SELECT FROM usuario WHERE Nombre_Usuario = ? AND contra= ? ";
            PS = Con.prepareStatement(SQL);
            PS.setString(1, Nombre);
            PS.setString(2, Clave);
            RS = ST.executeQuery(SQL);
            
         return false;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Revisar Sentencia:" + ex.getSQLState());
        }
        
        return true;
    }
    
    
    public boolean BUsuario(String N, String C){
        if (UsuarioSistema(N,C)== true) {
            System.out.println("busquede exitosa");
        }
        else{
            System.out.println("errorrrorororororo");
        
        }
       return false;
    }
}
