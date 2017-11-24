package coleccionsincronizadaprof;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritor extends Thread {
    // Atributos.

    private Contenedor contenedor = null;
    private String msg;

    // Constructor.
    public Escritor(Contenedor param, String msg) {
        contenedor = param;
        this.msg = msg;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                contenedor.escribir(msg, i);
                Thread.sleep((int) (Math.random() * 1500) + 500); // Esperamos para comprobar cómo el Escritor
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
