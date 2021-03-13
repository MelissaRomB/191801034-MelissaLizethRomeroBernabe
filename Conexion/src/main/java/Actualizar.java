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
public class Actualizar {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/usuario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexion con base de datos
            Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declaracion de como se va a trabajar en la clase de datos
            
            String SQL = "UPDATE usuario SET id=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL); 
            
            //Insertar datos
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Ingrese ID que desea actualizar");
            String id2 = scan.nextLine();
            System.out.println("Ingrese el nuevo ID");
            String id = scan.nextLine();
            
            declaracion.setString(1, id);
            declaracion.setString(2, id2);
            
            declaracion.executeUpdate();
            
            //Cerrar toda conexion con la base de datos
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        
    }    
}
