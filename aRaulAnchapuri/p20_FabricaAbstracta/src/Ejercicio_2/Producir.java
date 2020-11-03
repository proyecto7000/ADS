/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import Ejercicio_2.Interface.Fabrica_Abstracta;

/**
 *
 * @author Anchapuri
 */
public class Producir {
    public static Fabrica_Abstracta getFabrica(String TipoFabrica){
        if (TipoFabrica.equalsIgnoreCase("Mueble")) {
            return new TipoMueble();
        }else if (TipoFabrica.equalsIgnoreCase("Modelo")) {
            return new TipoModelo();
        }
        return null;
    }
}
