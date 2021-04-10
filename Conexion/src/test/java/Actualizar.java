import java.sql.*;
import Conexion.Conexion;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
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
public class Actualizar {
    public static void main(String[] args) throws SQLException{
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese ID de usuario para actualizar sus datos");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese el nuevo nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la nueva contrasenia");
        String password = scan.nextLine();
        
        Usuario usuario = new Usuario(id,nombre,password);
        DaoUsuarios.Actualizar(usuario);
        
        /*String url="jdbc:mysql://localhost:3306/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexion con base de datos
            Connection conexion = Conexion.getConnection();
            //Crear una declaracion de como se va a trabajar en la clase de datos
            
            String SQL = "UPDATE usuario SET id=?, nombre=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL); 
            
            //Insertar datos
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Ingrese ID que desea actualizar");
            String id2 = scan.nextLine();
            System.out.println("Ingrese el nuevo ID");
            String id = scan.nextLine();
            System.out.println("Ingrese el nuevo nombre");
            String nombre = scan.nextLine();
            /*System.out.println("Ingrese la nueva contraseña");
            String contraseña = scan.nextLine();
            System.out.println("Ingrese el nuevo status 1 activo, 0 no activo");
            String status = scan.nextLine();
            
            declaracion.setString(3, contraseña);
            declaracion.setString(4, status);
            
            declaracion.setString(1, id);
            declaracion.setString(2, nombre);
            declaracion.setString(3, id2);
         
            
            declaracion.executeUpdate();
            
            //Cerrar toda conexion con la base de datos
            Conexion.close(conexion, declaracion);
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
        
    }    
}
