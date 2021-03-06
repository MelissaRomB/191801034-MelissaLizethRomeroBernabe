/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Productos {
    private double precio;
    private String nombre;
    private int id, cantidad;
    private boolean impuestos;
    
    public Productos(){
        
    }
    public Productos(double precio, String nombre, int id, int cantidad, boolean impuestos){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad= cantidad;
        this.id=id;
        this.impuestos = impuestos;
    }
    
    @Override
    public String toString(){
      return "\nPRODUCTO: "+ getNombre()+"\nPrecio: "+getPrecio()+"\nid"+getId()+"\ncantidad: "+getCantidad()
              +"\nimpuestos: "+isImpuestos();  
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isImpuestos() {
        return impuestos;
    }

    public void setImpuestos(boolean impuestos) {
        this.impuestos = impuestos;
    }
    
}
