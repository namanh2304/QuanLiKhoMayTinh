/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thanh
 */
public class Connector {
    public static Connection getConnection () {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quanlimaytinh",
                    "root",
                    ""
            );
            System.out.println("model.Connector.getConnection()");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
