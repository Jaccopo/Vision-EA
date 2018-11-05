/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_de_veras.Proyecto_de_veras;
import proyecto_de_veras.modelo.Querys;

/**
 *
 * @author A
 */
public class Informacion {
    /**INFORED
     * Obtiene la informacion de la computadora 
     * conectada
     * 
     */
    InetAddress ip;
    String nombre,IP,MAC,cadena;
    
    String[] ips;


   
    public void Datos(){
        Querys q = new Querys();
    try {
            ip = InetAddress.getLocalHost();
//           System.out.println("la ip es:"+ip.toString());
            cadena=ip.toString();
            ips=cadena.split("/");
            nombre = ips[0];
            IP=ips[1];
           System.out.println("nombre del dispostivio:"+nombre+"\n");
            System.out.println("direccion IP:"+IP);
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			
		byte[] mac = network.getHardwareAddress();
			
		System.out.print("Current MAC address : ");
                
                StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			 sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                         
		}
		System.out.println(sb.toString());
                MAC = sb.toString();
               
                SimpleDateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                Date d = new Date();
                String hf = hourdateFormat.format(d);
                q.QueryRegistro(nombre, IP, MAC, hf);
                
        } catch (UnknownHostException ex ) {
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SocketException ex) {
            Logger.getLogger(Proyecto_de_veras.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    
    }
  
    
}
