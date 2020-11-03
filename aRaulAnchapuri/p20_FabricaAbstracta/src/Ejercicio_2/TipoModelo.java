/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import Ejercicio_2.Impl.ArtDeco;
import Ejercicio_2.Impl.Moderna;
import Ejercicio_2.Impl.Victoriana;
import Ejercicio_2.Interface.Fabrica_Abstracta;
import Ejercicio_2.Interface.IModelo;
import Ejercicio_2.Interface.IMueble;

/**
 *
 * @author Anchapuri
 */
public class TipoModelo implements Fabrica_Abstracta{

    @Override
    public IModelo getModelo(String Modelo) {
        if (Modelo.equalsIgnoreCase("ArtDeco")) {
            return new ArtDeco();
        }else if (Modelo.equalsIgnoreCase("Victoriana")) {
            return new Victoriana();
        }else if (Modelo.equalsIgnoreCase("Moderna")) {
            return new Moderna();
        }
        return null;
    }

    @Override
    public IMueble getMueble(String Mueble) {
        return null;
    }
    
}
