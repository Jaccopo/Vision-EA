/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos.Encriptacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author A
 */
public class Encriptacion {
   
    /**Clase de encriptacion en 
     *
     * @param message mensaje a encriptar
     * @return Regresa la cadena en arrelgo de Bytes
     * @throws Exception por si se ocasiona un error
     */
    private byte[] getEncriptando(String message,String Clave) throws Exception {
    byte[] keyBytes = "ThisIs128bitSize".getBytes();
    Key key = new SecretKeySpec(keyBytes, "AES");
    Cipher c = Cipher.getInstance("AES");
    c.init(Cipher.ENCRYPT_MODE, key);
    return c.doFinal(message.getBytes());
  }
    private void GuardarLLave(Key key, String Nombre){
    
        try {
            byte[] publicKeyBytes = key.getEncoded();
            try (FileOutputStream fos = new FileOutputStream(Nombre)) {
                fos.write(publicKeyBytes);
            }
        } catch (IOException ex) {
            Logger.getLogger(Encriptacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public  byte[] encirptar(String Message, String Clave) throws Exception{
    return getEncriptando(Message, Clave);
    }
}
