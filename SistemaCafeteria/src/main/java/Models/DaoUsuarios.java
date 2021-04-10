/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class DaoUsuarios {
    private String SQL;
    PreparedStatement declaracion;
    ResultSet resultado;
    
    public Usuarios login(String usuario, String password){
        Usuarios us = new Usuarios();
        SQL = "SELECT * FROM usuarios WHERE usuario=? AND password=?";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario);
            declaracion.setString(2, password);
            resultado = declaracion.executeQuery();
            if(resultado.next()){
                us.setId(resultado.getInt("id"));
                us.setNombre(resultado.getString("nombre"));
                us.setUsuario(resultado.getString("usuario"));
                us.setPassword(resultado.getString("password"));
                us.setRol(resultado.getString("rol"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
    public boolean RegistrarUs(Usuarios us){
        
        SQL = "INSERT INTO usuarios(usuario, nombre, password, rol) VALUES(?,?,?,?)";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, us.getUsuario());
            declaracion.setString(2, us.getNombre());
            declaracion.setString(3, us.getPassword());
            declaracion.setString(4, us.getRol());
            declaracion.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaUsuarios(String valor){
        List<Usuarios> listaUsuarios = new ArrayList();
        SQL = "SELECT * FROM usuarios";
        String buscar = "SELECT * FROM usuarios WHERE nombre LIKE '%"+valor+"%'OR usuario LIKE '%"+valor+"%'";
        try{
            Connection conexion = Conexion.getConnection();
            if(valor.equalsIgnoreCase("")){
            declaracion = conexion.prepareStatement(SQL);
            resultado = declaracion.executeQuery();
            }else{
                declaracion = conexion.prepareStatement(buscar);
                resultado = declaracion.executeQuery();
            } while(resultado.next()){  
                Usuarios us = new Usuarios();
                us.setId(resultado.getInt("id"));
                us.setUsuario(resultado.getString("usuario"));
                us.setNombre(resultado.getString("nombre"));
                us.setPassword(resultado.getString("password"));
                us.setRol(resultado.getString("rol"));
                us.setStatus(resultado.getString("status"));
                listaUsuarios.add(us);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaUsuarios;
    }
    
    public boolean ModificarUs(Usuarios us){
        SQL = "UPDATE usuarios SET usuario=?, nombre=?, password=?, rol=? WHERE id=?";
        
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);

            declaracion.setString(1, us.getUsuario());
            declaracion.setString(2, us.getNombre());
            declaracion.setString(3, us.getPassword());
            declaracion.setString(4, us.getRol());
            declaracion.setInt(5, us.getId());
            declaracion.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            Conexion.close();
        }
    }
   
    public boolean EliminarUs(int id){
        SQL = "DELETE FROM usuarios WHERE id=?";
        try{
            Connection conexion = Conexion.getConnection();  
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setInt(1, id);
            declaracion.execute();
            return true;  
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            Conexion.close();
        }
    }
}
