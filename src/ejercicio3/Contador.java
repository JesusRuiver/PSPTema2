/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Vespertino
 */
public class Contador implements Runnable {
    
    private Ventana gui;
    private int segundos = 0;
    private int sleep = 0;

    public Contador(Ventana gui) {
        this.gui = gui;
    }
    
    
    @Override
    public void run() {
        while(true) {
            try {
                segundos++;
                gui.ponNumero(segundos);
                sleep(sleep);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    } 
//    public void arrancaContador(){
//        this.segundos = 0;
//      
//        
//    }
    
//    public void detieneContador
    
}
