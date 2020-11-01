/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Anchapuri
 */
public class Animal {
    public IAnimal getAnimal(String texto){
        if (texto.equalsIgnoreCase("Gato")) {
            return new Gato();
        }else if (texto.equalsIgnoreCase("Perro")) {
            return new Perro();
        }
        
        return new Desconocido();
    }
}
