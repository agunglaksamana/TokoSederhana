/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author agung
 */
public class Databases {
public static Connection connection;
public static Connection getkoneksi(){
    try {
        DriverManager.registerDriver(new org.postgresql.Driver());
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemPenjualan",
                                                  "postgres","12345");
    } catch (SQLException e) {
        System.out.println("Koneksi Database Error");
    }
    
    return connection;
}

}
