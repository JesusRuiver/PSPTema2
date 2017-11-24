/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Jesús Manuel Ruiz Verdejo
 */
public class Marcador {
    
    private int numero;
    
    public Marcador(){
        
        this.numero = 0;
    }
    
    public synchronized void suma(){
        
        numero++;
    }
    
    public synchronized void resta(){
        
        numero--;
    }
    
    public int getNumero(){
        
        return numero;
    }
}
