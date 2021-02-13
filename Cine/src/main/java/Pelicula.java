/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Pelicula {
    public String titulo, director, genero, casaProductora, clasificacion;
    public int año;
    public double duracion;
    public boolean subtitulos;
    
    public Pelicula(){
      this.año = 0;
        this.casaProductora = "";
        this.clasificacion = "";
        this.director = "";
        this.duracion = 0;
        this.genero = "";
        this.subtitulos = false;
        this.titulo = "";
    }
    public Pelicula(String titulo, String director, String genero, String casaProductora, String clasificacion, int año,double duracion, boolean subtitulos){
        this.año = año;
        this.casaProductora = casaProductora;
        this.clasificacion = clasificacion;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.subtitulos = subtitulos;
        this.titulo = titulo;
    }
    public Pelicula(String titulo){
        this.titulo = titulo;
    }
    @Override
    public String toString(){
        return "\nTitulo "+titulo+"\nClasificacion "+clasificacion+"\nCasa Productora "+casaProductora
                +"\nDirector "+director+"\nDuracion "+duracion+"\nGenero "+genero+"\nAnio "+año
                +"\nSubtitulos "+subtitulos;
    }
    
}
