/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.Impl;

import Ejercicio_2.Interface.IModelo;

/**
 *
 * @author Anchapuri
 */
public class ArtDeco implements IModelo{
    public ArtDeco(){
        
    }

    @Override
    public void Preparar_Modelo() {
        System.out.println("Elaborando a Modelo Art Deco");
    }
}
