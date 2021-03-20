/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    //Static es una palabra reservada que determina que el atributo es de la clase y no del objeto
    //Final es un modificador que indica que el atributo es una constante por lo que no se le podra cambiar el valor en ningun modo
    private static final String URL="jdbc:mysql://localhost:3306/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        //throws SQLException es el try y catch implementado en un metodo
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
