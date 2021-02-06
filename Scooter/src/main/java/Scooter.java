/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Scooter {
    //Atributos
    public String color,marca, modelo, estabilidad;
    public int cilindrada, velocidad;
    public double potenciaMax;
    
   
    @Override
    public String toString(){
       return "El scooter es de la marca "+marca +"\n de color "+ color
               + "\n modelo "+modelo+"\n con una estabilidad "+estabilidad
               +"\n con una cilindrada de "+cilindrada+"\n una velocidad de"
               + velocidad+"km/h \ny una potencia maxima de "+ potenciaMax;
    }
}
