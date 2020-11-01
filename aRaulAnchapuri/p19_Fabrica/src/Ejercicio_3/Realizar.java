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
public class Realizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Animal animal = new Animal();
        IAnimal animal1 = animal.getAnimal("Perro");
        animal1.Caminar();
        
        IAnimal animal2 = animal.getAnimal("Gato");
        animal2.Correr();
    }
    
}
