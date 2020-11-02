/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import Ejercicio_1.Interface.Fabrica_Abstracta;
import Ejercicio_1.Interface.IConexionDB;
import Ejercicio_1.Interface.IConexionREST;

/**
 *
 * @author Anchapuri
 */
public class P20_FabricaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica_Abstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionDB cxBD1 = fabricaBD.getBD("MYSQL");

        cxBD1.conectar();

        Fabrica_Abstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
    }

}
