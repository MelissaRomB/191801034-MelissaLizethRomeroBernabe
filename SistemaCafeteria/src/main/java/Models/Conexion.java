/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class Conexion {
    
    private static final String URL="jdbc:mysql://localhost:3306/sistemacafe?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        //throws SQLException es el try y catch implementado en un metodo
    }

    public static void close() {
    }
    
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    public static void close(Connection conexion, Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }
}
