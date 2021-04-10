/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.*;
import Models.Conexion;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class DaoClientes {
    private String SQL;
    PreparedStatement declaracion;
    ResultSet resultado;
    
    public boolean Registrar(Clientes cl){
        
        SQL = "INSERT INTO clientes(nombre, telefono, direccion) VALUES(?,?,?)";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, cl.getNombre());
            declaracion.setString(2, cl.getTelefono());
            declaracion.setString(3, cl.getDireccion());
            declaracion.executeUpdate();
            //Conexion.close(conexion, declaracion);
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaClientes(String valor){
        List<Clientes> listaClientes = new ArrayList();
        SQL = "SELECT * FROM clientes";
        String buscar = "SELECT * FROM clientes WHERE nombre LIKE '%"+valor+"%'OR telefono LIKE '%"+valor+"%'";
        try{
            Connection conexion = Conexion.getConnection();
            if(valor.equalsIgnoreCase("")){
            declaracion = conexion.prepareStatement(SQL);
            resultado = declaracion.executeQuery();
            }else{
                declaracion = conexion.prepareStatement(buscar);
                resultado = declaracion.executeQuery();
            } while(resultado.next()){  
                Clientes cl = new Clientes();
                cl.setId(resultado.getInt("id"));
                cl.setNombre(resultado.getString("nombre"));
                cl.setTelefono(resultado.getString("telefono"));
                cl.setDireccion(resultado.getString("direccion"));
                cl.setEstado(resultado.getString("estado"));
                listaClientes.add(cl);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaClientes;
    }
    
    public boolean Modificar(Clientes cl){
        SQL = "UPDATE clientes SET nombre=?, telefono=?, direccion=? WHERE id=?";
        
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);

            declaracion.setString(1, cl.getNombre());
            declaracion.setString(2, cl.getTelefono());
            declaracion.setString(3, cl.getDireccion());
            declaracion.setInt(4, cl.getId());
            declaracion.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            Conexion.close();
        }
    }
    
    public Clientes BuscarCliente(int id){
        Clientes cliente = new Clientes();
        SQL =  "SELECT * FROM clientes WHERE id=?";
        try{
            Connection conexion = Conexion.getConnection();  
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setInt(1, id);
            resultado = declaracion.executeQuery();
            if(resultado.next()){  
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setDireccion(resultado.getString("direccion"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return cliente;
    }
    
    public boolean EliminarCliente(int id){
        SQL = "DELETE FROM clientes WHERE id=?";
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
