/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import Ejercicio_2.Interface.Fabrica_Abstracta;
import Ejercicio_2.Interface.IModelo;
import Ejercicio_2.Interface.IMueble;

/**
 *
 * @author Anchapuri
 */
public class Producir_Mueble_Tipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica_Abstracta FabricaMuebles = Producir.getFabrica("Mueble");
        IMueble mueble1 = FabricaMuebles.getMueble("Silla");
        mueble1.Preparar_Mueble();
        
        Fabrica_Abstracta FabricaModelos = Producir.getFabrica("Modelo");
        IModelo modelo1 = FabricaModelos.getModelo("Moderna");
        modelo1.Preparar_Modelo();
    }
    
}
