/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.Impl;

import Ejercicio_2.Interface.IMueble;

/**
 *
 * @author Anchapuri
 */
public class Mesa implements IMueble{
    public Mesa(){
        
    }

    @Override
    public void Preparar_Mueble() {
        System.out.println("Preparando la Mesa");
    }
}
