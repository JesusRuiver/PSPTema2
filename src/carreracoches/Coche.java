/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracoches;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Coche implements Runnable {

    private GuiCarreraCoches carrera;
    private int numeroCoche;
    private String mensaje;
    private int tiempo;

    public Coche(GuiCarreraCoches carrera, int numeroCoche, String mensaje, int tiempo) {
        this.carrera = carrera;
        this.numeroCoche = numeroCoche;
        this.mensaje = mensaje;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                carrera.setMensaje(numeroCoche,"El " +  mensaje + " completa la vuelta " + i);

                Thread.sleep(tiempo);
            }
            carrera.estableceVencedor(numeroCoche);
        } catch (InterruptedException ex) {
            Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
