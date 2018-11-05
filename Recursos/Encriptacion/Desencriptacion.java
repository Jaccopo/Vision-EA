/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos.Encriptacion;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author A
 */
public class Desencriptacion {
    
    private  String GetDecrypt(byte[] encryptedText) throws Exception {
    byte[] keyBytes = "ThisIs128bitSize".getBytes();
    Key key = new SecretKeySpec(keyBytes, "AES");
    Cipher c = Cipher.getInstance("AES");
    c.init(Cipher.DECRYPT_MODE, key);
    byte[] decValue = c.doFinal(encryptedText);
    String decryptedValue = new String(decValue);
    return decryptedValue;
  }
    
    public String Des_Encriptacion(byte[] encryptedText) throws Exception{
    return GetDecrypt(encryptedText);
    }
   
}
