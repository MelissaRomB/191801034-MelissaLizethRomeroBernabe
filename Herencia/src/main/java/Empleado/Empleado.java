/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    private String nombre, apellidoPaterno, apellidoMaterno;
    private int dni;

    public Empleado(){   
    }
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int dni){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
    }
    @Override
    public String toString(){
        return "\nNombre: "+getNombre()+"\nApellido paterno: "+getApellidoPaterno()
                +"\nApellido materno: "+getApellidoMaterno()+"\nDNI: "+getDni();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
