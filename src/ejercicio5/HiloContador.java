/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Vespertino
 */
public class HiloContador implements Runnable {

    private Vista vista;
    private Marcador marcador;
    private Boolean sumar;

    public HiloContador(Vista vista, Marcador marcador, Boolean sumar) {
        this.vista = vista;
        this.marcador = marcador;
        this.sumar = sumar;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000000; i++) {
            if(sumar)
            marcador.suma();
            else
               marcador.resta();
            vista.ponNumero(marcador.getNumero());
        }

    }

}
