/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import Ejercicio_1.Impl.ConexionRESTCompras;
import Ejercicio_1.Impl.ConexionRESTNoArea;
import Ejercicio_1.Impl.ConexionRESTVentas;
import Ejercicio_1.Interface.Fabrica_Abstracta;
import Ejercicio_1.Interface.IConexionDB;
import Ejercicio_1.Interface.IConexionREST;

/**
 *
 * @author Anchapuri
 */
public class ConexionRESTFabrica implements Fabrica_Abstracta {

    @Override
    public IConexionREST getREST(String area) {
        if (area == null) {
            return new ConexionRESTNoArea();
        }
        if (area.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRESTCompras();
        } else if (area.equalsIgnoreCase("VENTAS")) {
            return new ConexionRESTVentas();
        }

        return new ConexionRESTNoArea();
    }

    @Override
    public IConexionDB getBD(String motor) {
        return null;
    }
}
