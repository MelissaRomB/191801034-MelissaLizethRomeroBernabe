import java.sql.*;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */

public class Lista {
    public static void main(String[] args) throws SQLException{
        
        List <Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = DaoUsuarios.listaUsuarios();
        
        for(Usuario usuario:listaUsuarios){
            System.out.println(usuario);
        }
        /*
            //Crear conexion con base de datos
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Conexion.getConnection();
            //Crear una declaracion de como se va a trabajar en la clase de datos
            Statement declaracion = conexion.createStatement();
            String SQL = "SELECT * FROM usuario";
            //Variable que recibira el resultado de ejecutar la secuencia de SQL
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            while(resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre"));
            }
            //Cerrar toda conexion con la base de datos
            Conexion.close(conexion, declaracion, resultado);
            resultado.close();
            declaracion.close();
            conexion.close();
        */
    }
}