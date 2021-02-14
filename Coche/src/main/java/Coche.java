/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Coche {
    public String marca, color;
    public double precio;
    public int matricula, anio;
    
    public Coche(){
        
    }
    public Coche(String marca, String color, double precio, int matricula, int anio){
        this.anio = anio;
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "\nMarca: "+marca+"\nMatricula: "+matricula+"\nAnio del coche: "+anio
                +"\nColor: "+color+"\nPrecio $"+precio;
    }
}
