/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuarios;

import java.sql.*;
import Conexion.Conexion;
import Usuarios.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class DaoUsuarios {
    
    private static String SQL;
    
    public static List<Usuario> listaUsuarios() throws SQLException{
        List <Usuario> listaUsuarios = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM usuario";
        ResultSet resultado = declaracion.executeQuery(SQL);
            
        while(resultado.next()){
            Usuario usuario = new Usuario(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("password"),resultado.getString("fecha_alta"), resultado.getBoolean("status"));
            listaUsuarios.add(usuario);
        }
        Conexion.close(conexion, declaracion, resultado);
        return listaUsuarios;
    }
    public static void Insertar(Usuario usuario)throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO usuario(nombre, password,status) VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL); 
        
        declaracion.setString(1,usuario.getNombre());
        declaracion.setString(2,usuario.getPassword());
        declaracion.setInt(3,1);
        
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void Eliminar(Usuario usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM usuario WHERE id=?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void Actualizar(Usuario usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE usuario SET nombre=?, password=?" + "WHERE id=?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        
        declaracion.setString(1, usuario.getNombre());
        declaracion.setString(2, usuario.getPassword());
        declaracion.setInt(3, usuario.getId());

        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}
