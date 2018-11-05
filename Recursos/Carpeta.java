/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class Carpeta {
    
    public void CrearCarpetas(){
    File Inicio = new File("InformacionEA");
    File IMG = new File("InformacionEA/IMG");
    File Tickets = new File("InformacionEA/Tickets");
    File Correos = new File("InformacionEA/Correos");
    File Impresion = new File("InformacionEA/Impresion");
    File Movimientos = new File("InformacionEA/Caja/Movimientos");
    File Historial = new File("InformacionEA/Caja/Historial");
    File Retiro = new File("InformacionEA/Caja/Movimintos/Retiro");
    File Compra = new File("InformacionEA/Caja/Movimintos/Compra");
    File Paga = new File("InformacionEA/Caja/Movimintos/Paga");
  
    
    
    
    
        if (!Inicio.exists()){
            Inicio.mkdir();
            IMG.mkdir();
            Tickets.mkdir();
            Correos.mkdir();
            Impresion.mkdir();
            Movimientos.mkdir();
            Historial.mkdir();
            Retiro.mkdir();
            Compra.mkdir();
            Paga.mkdir();
            System.out.println("se creo");
        }else{
            System.out.println("ya existe");
            if(!IMG.exists()){
                IMG.mkdir();
            }
            if (!Tickets.exists()) {
                Tickets.mkdir();
            }
            if (!Correos.exists()) {
                Correos.mkdir();
            }
            if (!Impresion.exists()) {
                Impresion.mkdir();
            }
            if (!Movimientos.exists()) {
                Movimientos.mkdir();
            }
            if (!Historial.exists()) {
                Historial.mkdir();
            }
            if (!Retiro.exists()) {
                Retiro.mkdir();
            }
            if (!Compra.mkdir()) {
                Compra.mkdir();
            }
            if (!Paga.exists()) {
                Paga.mkdir();
            }
        }
    
    
    }
}
