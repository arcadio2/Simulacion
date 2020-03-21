/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author arcad
 */
public class acceso1 extends Thread {
    //  Sala obj=new Sala(); 

    int cantidad;
    private int cont;
    String img; 
    JLabel poner=new JLabel();
    JButton barrera=new JButton(); 
    public acceso1(int cantidad) {
        this.cantidad = cantidad;
    }

    
    JLabel j1;
    JLabel restantes; 
    personas obj=new personas();

    acceso1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void run() {
        int c1=0, c2=0; 
        for (int i = 1; i < cantidad; i = i + 2) {
            cont++;
            img=obj.random();
            poner.setIcon(new javax.swing.ImageIcon(getClass().getResource(img)));
        /*    while(true){
                try{
                    acceso1.sleep(1000);
                   c1=poner.getLocation().y; 
                    if (c1<barrera.getLocation().y-10) {
                    poner.setLocation(poner.getLocation().x,poner.getLocation().y+10);
                    poner.repaint();
                    }else{
                    break; 
                    } 
                }catch(InterruptedException e){
                    
                }
                
            }*/
            
            j1.setText("Persona " + i + " En fila");
            System.out.println("Persona " + i + " En fila");
            try {
                acceso1.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(acceso1.class.getName()).log(Level.SEVERE, null, ex);
            }
            restantes.setText("Restantes: "+(cantidad-cont*2));
            if (i % 20 == 0) {
                System.out.println("Esperando a que se vacie la fila");
                j1.setText("Esperando a que se vacie la fila");
                try {
                    acceso1.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(acceso1.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Fila vaciada");
                j1.setText("Fila vaciada");
                
            }
        }
        
    }

    public void actualizar(JLabel j1) {
        this.j1 = j1;
    }
    public void restantes(JLabel restantes){
        this.restantes=restantes; 
    }

    public void cupos(int cont) {
        this.cont=cont;
    }
    public void imagenes(String img) {
        this.img=img; 
    }
   public void enviari(JLabel poner){
       this.poner=poner; 
   }
   public void imagen(JButton barrera){
       this.barrera=barrera; 
   }

    void poner(JButton persona1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
