/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1.Impl;

import Ejercicio_1.Interface.IConexionDB;

/**
 *
 * @author Anchapuri
 */
public class ConexionMySQL implements IConexionDB{

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a MySQL");

    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySQL");
    }

    @Override
    public String toString() {
        return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
                + contrasena + "]";
    }
}
