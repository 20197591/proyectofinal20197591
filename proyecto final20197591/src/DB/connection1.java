/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class connection1 {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USER = "root";
    private static String PASSWORD = "123456";
    
    //AQUI tenia problemas con la zona horaria por eso uso ?serverTimezone=UTC
    private static String URL = "jdbc:mysql://localhost:3306/proyecto20197591?serverTimezone=UTC";

    static {

        try {

            Class.forName(DRIVER);

        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Error en el Driver" + e);
        }

    }

    public Connection getConnection() {
        Connection con = null;

        try {

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error en la Conexion" + e);
        }

        return con;

    }

    PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
