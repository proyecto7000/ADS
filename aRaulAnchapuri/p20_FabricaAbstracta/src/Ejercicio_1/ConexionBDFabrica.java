/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import Ejercicio_1.Impl.ConexionMySQL;
import Ejercicio_1.Impl.ConexionOracle;
import Ejercicio_1.Impl.ConexionPostgreSQL;
import Ejercicio_1.Impl.ConexionSQLServer;
import Ejercicio_1.Impl.ConexionVacia;
import Ejercicio_1.Interface.Fabrica_Abstracta;
import Ejercicio_1.Interface.IConexionDB;
import Ejercicio_1.Interface.IConexionREST;

/**
 *
 * @author Anchapuri
 */
public class ConexionBDFabrica implements Fabrica_Abstracta {

    @Override
    public IConexionDB getBD(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();
        }

        return new ConexionVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
