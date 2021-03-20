import Conexion.Conexion;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.sql.*;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Eliminar {
    public static void main(String[] args) throws SQLException{
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese ID de usuario que desea eliminar");
        int id = scan.nextInt();
        
        Usuario usuario = new Usuario(id);
        DaoUsuarios.Eliminar(usuario);
        
        /*String url="jdbc:mysql://localhost:3306/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexion con base de datos
            Connection conexion = Conexion.getConnection();
            
            String SQL = "DELETE FROM usuario WHERE id=?";
            
            PreparedStatement declaracion = conexion.prepareStatement(SQL); 
            //Eliminar datos
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese ID de usuario que desea eliminar");
            String id = scan.nextLine();
         
            declaracion.setString(1, id);
            declaracion.executeUpdate();
            
            //Cerrar toda conexion con la base de datos
            Conexion.close(conexion, declaracion);
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        */
    }   
}
