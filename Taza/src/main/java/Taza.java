/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Taza {
    
    //Atributos
    public String color, modelo, material, tamanio;
    public double  precio;
    
    //Metodos
    //Constructores
    //Constructor completo
    public Taza(String color, String modelo, String material, String tamanio, double precio){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.precio = precio;
    }
    //Constructor vacio
    public Taza(){
        this.color = "";
        this.material = "";
        this.modelo = "";
        this.tamanio = "";
        this.precio = 0;
    }
    //Metodo toString
    @Override
    public String toString(){
        return "La taza es de color: "+color+"\n de modelo "+modelo+"\nhecha de material"
                + material+"\n de tamanio "+tamanio+"\n y con precio de "+precio;
}
    
}
