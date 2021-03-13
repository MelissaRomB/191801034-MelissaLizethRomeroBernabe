
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ConexionCuentaBanc {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexion con base de datos
            Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declaracion de como se va a trabajar en la clase de datos
            Statement declaracion = conexion.createStatement();
            String SQL = "SELECT * FROM usuariocuentabanc";
            //Variable que recibira el resultado de ejecutar la secuencia de SQL
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            while(resultado.next()){
                System.out.println(resultado.getInt("id-usuario"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getInt("num-cuenta"));
                System.out.println(resultado.getInt("clabe-interbancaria"));
                System.out.println(resultado.getString("nombre-banco"));
                System.out.println(resultado.getString("fecha-creacion"));
                System.out.println(resultado.getDouble("credito"));
                System.out.println(resultado.getBoolean("tarjeta-debito"));
            }
            //Cerrar toda conexion con la base de datos
            resultado.close();
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        
    }
}
