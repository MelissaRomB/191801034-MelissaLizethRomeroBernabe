/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Cancion {
    //Atributos
    public int orden;
    public String titulo;
    public double duracion;
    
    //Metodos
    //contructor completo
    public Cancion(int orden, String titulo, double duracion){
        this.orden = orden;
        this.duracion = duracion;
        this.titulo = titulo;
    }
    //constructor vacio
    public Cancion(){
        this.orden = 0;
        this.duracion = 0;
        this.titulo = "";
    }
    //metodo toString
    @Override
    public String toString(){
        return "orden "+orden+" titulo "+titulo+" duracion "+ duracion;
    }
}
