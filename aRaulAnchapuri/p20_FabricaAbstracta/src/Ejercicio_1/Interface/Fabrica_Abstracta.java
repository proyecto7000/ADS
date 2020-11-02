/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1.Interface;

/**
 *
 * @author Anchapuri
 */
public interface Fabrica_Abstracta {

    IConexionDB getBD(String motor);
    IConexionREST getREST(String area);
}
