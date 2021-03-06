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
    private String nombre, fecha_alta;
    private int id;
    private CuentaBancaria cuentaBancaria;

    public Usuario() {
    }

    public Usuario(String nombre, int id, String fecha_alta, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.id = id;
        this.fecha_alta = fecha_alta;
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "\n\t*Usuario" + "\nNombre: " + nombre + "\nID de usuario: " + id + "\nFecha de alta: " + fecha_alta + "\n\t*Cuenta Bancaria: "+cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
}
