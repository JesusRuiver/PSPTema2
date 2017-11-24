package coleccionsincronizadaprof;

import java.util.ArrayList;

public class Contenedor {
    // Atributos    
    private ArrayList<String> lista; 

    public Contenedor() {
        lista = new ArrayList<>();
    }

    // Métodos	
    public synchronized void escribir(String msg, int param) {
        try {
            if (lista.size()==10) { // Limitamos la coleccion a 10 elementos
                wait();
            }

            System.out.println(msg + " añade elemento: " + param + " buffer con " + lista.size());
            lista.add("Dato " + param);
            notify();
        } catch (InterruptedException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
    }

    public synchronized void borrar() {
        try {
            if (lista.size()==0) { // No existen elementos en la colección
                wait();
            }

            System.out.println("Se borra: " + lista.remove(0));            
            notify();
        } catch (InterruptedException ex) {
            System.out.println("Error:" + ex.getMessage());
        }
    }
}
