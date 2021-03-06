/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author USUARIO
 */
public class RAM {
    private int capacidad, frecuencia;
    private String tipo;
    
    public int getCapacidad(){
        return this.capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public int getFrecuencia(){
        return this.frecuencia;
    }
    public void setFrecuencia(int frecuencia){
        this.frecuencia= frecuencia;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    
    public RAM(){
        
    }
    public RAM(int capacidad, String tipo, int frecuencia){
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return "\nMemoria RAM de tipo: " + tipo + "\nCapacidad: " + capacidad 
                + " GB \nFrecuencia: " + frecuencia + " MHz";
    }
}
