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
public class Dibujar {
    public IForma getDiujar(String Forma){
        if (Forma.equalsIgnoreCase("Circulo")) {
            return new Circulo();
        }else if (Forma.equalsIgnoreCase("Rectangulo")) {
            return new Rectangulo();
        }else if (Forma.equalsIgnoreCase("Cuadrado")) {
            return new Cuadrado();
        }
        return new FormaVacia();
    }
    
}
