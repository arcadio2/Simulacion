/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author arcad
 */
public class acceso2 extends Thread{
    
    int cantidad; 
    public acceso2(int cantidad){
        this.cantidad=cantidad; 
    }
    
    JLabel j2; 
    JLabel ven; 

    acceso2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void run() {
        for (int i = 1; i < cantidad; i=i+2) {
            ven.setText("Cantidad de ventas: "+(i+1));
            j2.setText("Persona " + (i+1) +" En fila");
            System.out.println("Persona " + (i+1) +" En fila");
            try { 
                acceso2.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(acceso1.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i % 20 == 0) {
                System.out.println("Esperando a que se vacie la fila");
                j2.setText("Esperando a que se vacie la fila");
                try {
                    acceso2.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(acceso1.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Fila vaciada");
                j2.setText("Fila vaciada"); 
            }
        }

    }
    public void actualizar(JLabel j2){
         this.j2=j2; 
    }
    public void ventas(JLabel ven){
        this.ven=ven; 
    }
    
}
