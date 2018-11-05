/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_de_veras.hilos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class Servidor extends Thread {
    final int port = 5000;
    ServerSocket ss;
    Socket  cliente;
    Hashtable <String,String> conexiones;
    
    @Override
    public void run(){
        conexiones = new Hashtable<String,String>();
        try {
            ss=new ServerSocket(port);
            System.out.println("Listo para entradas");
        } catch (IOException ex) {
            System.out.println("prblema con el puerto" + ex.getMessage());
        }
    while (true){
    
        cliente = new Socket();
            try {
                cliente = ss.accept();
            } catch (IOException ex) {
                System.out.println("No fue aceptado");
            }
           conexiones.put(cliente.getInetAddress().getHostAddress(),cliente.getInetAddress().getHostName());
    
    }
        
        
        
        
        
    }
}
