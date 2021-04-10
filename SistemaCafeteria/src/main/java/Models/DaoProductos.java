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

public class DaoProductos {
    private String SQL;
    PreparedStatement declaracion;
    ResultSet resultado;
    
    public boolean Insertar(Productos producto){
        
        SQL = "INSERT INTO productos(codigo,nombre,precio,cantidad,medida) VALUES(?,?,?,?,?)";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, producto.getCodigo());
            declaracion.setString(2, producto.getNombrePro());
            declaracion.setDouble(3, producto.getPrecio());
            declaracion.setInt(4, producto.getCantidad());
            declaracion.setString(5, producto.getMedida());
            declaracion.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaProductos(String valor){
        List<Productos> listaProductos = new ArrayList();
        SQL = "SELECT * FROM productos ORDER BY estado ASC";
        String buscar = "SELECT * FROM productos WHERE codigo LIKE '%"+valor+"%'OR nombre LIKE '%"+valor+"%'";
        try{
            Connection conexion = Conexion.getConnection();
            if(valor.equalsIgnoreCase("")){
            declaracion = conexion.prepareStatement(SQL);
            resultado = declaracion.executeQuery();
            }else{
                declaracion = conexion.prepareStatement(buscar);
                resultado = declaracion.executeQuery();
            } while(resultado.next()){  
                Productos producto = new Productos();
                producto.setId(resultado.getInt("id"));
                producto.setCodigo(resultado.getString("codigo"));
                producto.setNombrePro(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCantidad(resultado.getInt("cantidad"));
                producto.setMedida(resultado.getString("medida"));
                producto.setEstado(resultado.getString("estado"));
                listaProductos.add(producto);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProductos;
    } 
    
    public boolean Modificar(Productos prod){
        SQL = "UPDATE productos SET codigo=?, nombre=?, precio=?, cantidad=?, medida=? WHERE id=?";
        
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);

            declaracion.setString(1, prod.getCodigo());
            declaracion.setString(2, prod.getNombrePro());
            declaracion.setDouble(3, prod.getPrecio());
            declaracion.setInt(4, prod.getCantidad());
            declaracion.setString(5, prod.getMedida());
            declaracion.setInt(6, prod.getId());
            declaracion.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
           
        }
         return false;
    }
    
    public Productos BuscarProductos(String codigo){
        Productos producto = new Productos();
        SQL =  "SELECT * FROM productos WHERE codigo=?";
        try{
            Connection conexion = Conexion.getConnection();  
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, codigo);
            resultado = declaracion.executeQuery();
            if(resultado.next()){  
                producto.setNombrePro(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCantidad(resultado.getInt("cantidad"));
                producto.setMedida(resultado.getString("medida"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return producto;
    }
    
    public boolean EliminarProducto(int id){
        SQL = "DELETE FROM productos WHERE id=?";
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
