/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.*;
import Models.Conexion;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class DaoVentas {
    private String SQL;
    PreparedStatement declaracion;
    ResultSet resultado;
    int res;
    
    public int IngresarVenta(Ventas ven){
        SQL = "INSERT INTO ventas(cliente, mesero, total) VALUES(?,?,?)";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, ven.getCliente());
            declaracion.setString(2, ven.getMesero());
            declaracion.setDouble(3, ven.getTotal());
            declaracion.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        finally{
            Conexion.close();
        }
        return res;
    }
    public int IngresarDetalles(DetallesVenta detVen){
        SQL = "INSERT INTO detallesventa (codigoprod, cantidad, precio, idventa) VALUES(?,?,?,?)";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, detVen.getCodigoProd());
            declaracion.setInt(2, detVen.getCantidad());
            declaracion.setDouble(3, detVen.getPrecio());
            declaracion.setInt(4, detVen.getIdVenta());
            declaracion.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            Conexion.close();
        }
        return res;
    }
    public int IdVenta(){
        int id=0;
        SQL = "SELECT MAX(id) FROM ventas";
        try{
            Connection conexion = Conexion.getConnection();
            declaracion = conexion.prepareStatement(SQL);
            resultado = declaracion.executeQuery();
            if(resultado.next()){
                id = resultado.getInt(1);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        finally{
            Conexion.close();
        }
        return id;
    }
}
