package coleccionsincronizadaprof;

public class ProductorConsumidor {

    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        for (int i = 0; i < 5; i++) {
            new Escritor(contenedor, "Hilo" + i).start();
        }

        new Borrador(contenedor).start();
    }
}
