/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1.Impl;

import Ejercicio_1.Interface.IConexionREST;

/**
 *
 * @author Anchapuri
 */
public class ConexionRESTCompras implements IConexionREST {
    @Override
	public void leerURL(String url) {		
		System.out.println("Conectándose a " + url);
	}
}
