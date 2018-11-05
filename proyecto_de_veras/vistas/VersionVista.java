/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_de_veras.vistas;

import javax.swing.UIManager;

/**
 *
 * @author A
 */
public class VersionVista extends javax.swing.JFrame {
    public static void  Acomodar(){
    try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    }
}
