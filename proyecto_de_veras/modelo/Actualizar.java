/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_de_veras.modelo;

import Recursos.Encriptacion.EncriptacionContra;
import java.sql.PreparedStatement;

/**
 *
 * @author A
 */
public class Actualizar {
    private PreparedStatement ps;
    private String Query;
    
    
    public boolean ActaulizarAlumno(String Nombre, String Apellidos, String Direccion, String Tel1, String Tel2,String CE, String Contraseña ){
    EncriptacionContra contra = new EncriptacionContra();
    String pass = contra.md5(Contraseña);
    
    Query = "UPDATE alumnos set ";
    
    return false;
    }
}
