/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import Ejercicio_2.Impl.Mesa;
import Ejercicio_2.Impl.Silla;
import Ejercicio_2.Impl.Sofa;
import Ejercicio_2.Interface.Fabrica_Abstracta;
import Ejercicio_2.Interface.IModelo;
import Ejercicio_2.Interface.IMueble;

/**
 *
 * @author Anchapuri
 */
public class TipoMueble implements Fabrica_Abstracta{

    @Override
    public IModelo getModelo(String Modelo) {
        return null;
    }

    @Override
    public IMueble getMueble(String Mueble) {
        if (Mueble.equalsIgnoreCase("Silla")) {
            return new Silla();
            
        }else if (Mueble.equalsIgnoreCase("Sofa")) {
            return new Sofa();
        }else if (Mueble.equalsIgnoreCase("Mesa")) {
            return new Mesa();
        }
        return null;
    }
    
}
