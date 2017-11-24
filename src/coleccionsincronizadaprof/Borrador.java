package coleccionsincronizadaprof;

public class Borrador extends Thread {
    // Atributos
    private Contenedor contenedor = null;

    // Constructor.
    public Borrador(Contenedor param) {
        contenedor = param;
    }

    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                contenedor.borrar();
                Thread.sleep((int) (Math.random() * 200)); // Esperamos para comprobar cómo el Escritor
                // no escribe nada hasta que el Borrador haya borrado.
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
