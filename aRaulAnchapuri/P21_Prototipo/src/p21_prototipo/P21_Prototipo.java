/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21_prototipo;

import p21_prototipo.Modelo.CuentaAHImpl;

/**
 *
 * @author Anchapuri
 */
public class P21_Prototipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(200);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);
        System.out.println(cuentaClonada);

        /*if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		System.out.println(cuentaClonada == cuentaAhorro);*/
    }

}
