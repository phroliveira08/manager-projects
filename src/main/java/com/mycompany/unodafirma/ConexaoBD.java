/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unodafirma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Henrique
 */
public class ConexaoBD {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection conectar() throws SQLException {
        String servidor = "UDF";
        String porta = "3306";
        String database = "UDF";
        return DriverManager.getConnection("jdbc:mysql://" + servidor + ":" + porta + "/" + database + "?useTimezone=true&serverTimezone=UTC", "root", "Luis821132109");
    }

    public static void desconectar(Connection conn) throws SQLException {
        conn.close();
    }
}
