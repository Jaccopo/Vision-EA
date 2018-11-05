/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos.Encriptacion;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author A
 */
public class EncriptacionContra {
  
   private String getCifrado(String texto, String hashType) {
      try {
         java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
         byte[] array = md.digest(texto.getBytes());
         StringBuilder sb = new StringBuilder();
         
         for (int i = 0; i < array.length; ++i) {
            sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
         }
         return sb.toString();
      } catch (java.security.NoSuchAlgorithmException e) {
         System.err.println("Error "+e.getMessage());
      }
      return "";
    }

    public String md5(String texto) {
       return getCifrado(texto, "MD5");
    }


}

