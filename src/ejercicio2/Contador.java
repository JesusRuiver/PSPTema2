/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vespertino
 */
public class Contador implements  Runnable       {
    private Gui gui;
    private int indice;

    public Contador(Gui gui, int indice) {
        this.gui = gui;
        this.indice = indice;
    }


    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                gui.ponValorContador(i,indice);
                sleep((long)(Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        gui.cambiaColor(indice);
    }
    
    
    
}
