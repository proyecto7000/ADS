/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Anchapuri
 */
public class ConvertirTemperatura {
    private double Kelvin;
    private double Celsius;
    private double Fareheit;
    
    private static ConvertirTemperatura unicainstancia;
    private ConvertirTemperatura(){}
    public static ConvertirTemperatura getinstacia(){
        if (unicainstancia == null) {
            unicainstancia = new ConvertirTemperatura();
        }
        return unicainstancia;
    }
    
    public void CovertirCelsiusKelvin(double celsius){
        System.out.println("se convertira a  grados Kelvin ingrdando grado celsius");
    }
}
