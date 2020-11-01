/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Anchapuri
 */
public class ObtenerFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dibujar dibujar = new Dibujar();
        IForma forma1 = dibujar.getDiujar("Circulo");
        forma1.Dibujar();
        
        IForma forma2 = dibujar.getDiujar("Rectangulo");
        forma2.Dibujar();
        
        IForma forma3 = dibujar.getDiujar("Cuadrado");
        forma3.Dibujar();
    }
    
}
