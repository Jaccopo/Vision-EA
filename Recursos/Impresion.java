/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import javax.print.Doc;
import javax.print.DocPrintJob;
import javax.print.SimpleDoc;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.print.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.swing.JOptionPane;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.ServiceUI;
import javax.print.attribute.*;
import proyecto_de_veras.Proyecto_de_veras;



/**Impresion
 *Se encarga de la impresion
 * de tickets de recibos
 * @author A
 */

    
 
public class Impresion {
  
  //Ticket attribute content
  
  //El constructor que setea los valores a la instancia
 
    
  public void print() {
    FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("Eaproffesional/impri/prueba.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (inputStream == null) {
            return;
        }
 
        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);
 
        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
 
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
 
 
        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try {
                printJob.print(document, attributeSet);
 
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("No existen impresoras instaladas");
        }
 
        try {
            inputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Proyecto_de_veras.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

}
    

