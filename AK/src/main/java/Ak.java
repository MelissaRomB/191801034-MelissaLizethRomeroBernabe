/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Ak {
    
    //Atributos
    public String material, disponibilidad;
    public int municiones;
    public double danio, precio, velocidadDisparo;
    
    //Metodos
    public String mostrarCaracteristicas(){
       return "\nEl material del arma es de " + material+" \ncon una disponibilidad "+ disponibilidad
               +"\n con una municion de "+municiones+"\n con una velocidad de disparo de "+velocidadDisparo
               +"\n con un daño de "+ danio+"\n y con  un precio de "+ precio;
    }
}
