/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProfVespertino
 */
public class Animal implements Runnable {

    private Gui gui;
    private int tiempo;
    private String mensaje;
    private int num;

    public Animal(Gui gui, int tiempo, String mensaje, int num) {
        this.gui = gui;
        this.tiempo = tiempo;
        this.mensaje = mensaje;
        this.num=num;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 25; i++) {
                gui.setMensaje(num, mensaje + " " + i);
                Thread.sleep(tiempo);
            }
            gui.estableceVencedor(num);
        } catch (InterruptedException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
