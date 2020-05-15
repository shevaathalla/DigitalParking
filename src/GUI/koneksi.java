/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import digitalparking.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP ProBook
 */
public class koneksi {

    private static Connection mysqlkon;

    public static Connection koneksiDB() throws SQLException {
        if (mysqlkon == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/parkiran";
                String User = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkon = (Connection) DriverManager.getConnection(DB, User, pass);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal Koneksi");
            }
        }
        return mysqlkon;
    }
}
