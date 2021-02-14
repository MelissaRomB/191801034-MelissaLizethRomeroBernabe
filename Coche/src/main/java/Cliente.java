/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Cliente {
    public int dni, telefono, rfc;
    public String nombre;
    public Coche coche;
    
    public Cliente(){
        
    }
    public Cliente(String nombre, int dni, int telefono, int rfc, Coche coche){
        this.coche = coche;
        this.dni = dni;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return "\nNombre: "+nombre+"\nDNI: "+dni+"\nRFC: "+rfc+"\nTelefono: "+telefono
                +"\nInformacion de su coche "+coche;
    }
}
