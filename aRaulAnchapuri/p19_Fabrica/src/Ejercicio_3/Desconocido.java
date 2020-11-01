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
public class Desconocido implements IAnimal{

    @Override
    public void Caminar() {
        System.out.println("Animal desconocido");
    }

    @Override
    public void Correr() {
        System.out.println("Animal desconocido");
    }
    
}
