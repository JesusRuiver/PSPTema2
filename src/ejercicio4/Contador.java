/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Vespertino
 */
public class Contador implements Runnable {

    private Gui gui;
    private JLabel label;
    private int c = 0, i = 0;

    public Contador(Gui gui) {
        this.gui = gui;
        this.c = 0;
        this.label = gui.getJlHilo();
    }

    @Override
    public void run() {

        while (true) {
            label.setText(i + "");
            try {
                Thread.sleep(1000);
                if (c != -1) {
                    c++;
                    i++;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
        this.c = 0;
    }

}
