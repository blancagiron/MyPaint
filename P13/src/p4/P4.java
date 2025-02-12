/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4;

/**
 *
 * @author Blanca Girón Ricoy 
 * Grupo: A3
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() { // uando usamos runnable creamos objeto para tirar en hebra (paralelo)
            public void run() {
                new ventana_principal().setVisible(true);
            }
        });
    }
    
}
