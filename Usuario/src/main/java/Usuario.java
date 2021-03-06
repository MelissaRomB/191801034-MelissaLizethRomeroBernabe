/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private String nombre, password, fecha_alta;
    private int id;
    private boolean status;

    public Usuario() {
    }

    public Usuario(String nombre, int id,String password, String fecha_alta, boolean status) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
        this.fecha_alta = fecha_alta;
        this.status = status;
    }

    @Override
    public String toString() {
        return "\n\t*Usuario" + "\nNombre: " + nombre + "\nID de usuario: " + id + "\nFecha de alta: " + fecha_alta + "\nPassword" + password+ "\nStatus: " + status;
    }

    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getFecha_alta() {
        return fecha_alta;
    }
    public boolean getStatus() {
        return status;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
