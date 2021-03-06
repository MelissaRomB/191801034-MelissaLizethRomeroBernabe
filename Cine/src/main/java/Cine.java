import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Cine {
    public String nombre;
    public int horaInicio, horaFin;
    public ArrayList <Pelicula> peliculas = new ArrayList();
    
    public Cine(){
       
    }
    public Cine(String nombre, int horaInicio, int horaFin, ArrayList <Pelicula> peliculas){
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.peliculas = peliculas;           
    }
    public Cine (String nombre,int horaInicio,int horaFin){
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public String imprimirPeliculas (){
        String cartelera = "";
        for (Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo+"\n";
        }
        return cartelera;
    } 
    //metodo para agregar una pelicula
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public int totalPeliculas(){
        return  peliculas.size();
    }
    public String menuPeliculas(){
        String menu = "";
        int i=1;
        menu += "\t\t\n Menu de peliculas\n";
        for (Pelicula pelicula:peliculas){
            menu += i+" "+pelicula.titulo+"\n";
            i++;
        }
        return menu;
    }
    public void horarioCine(int hora){
        this.horaInicio = horaInicio;
        if(hora>=horaInicio||hora<=horaFin)
            System.out.println("Cine abierto");
        else
            System.out.println("Cine cerrado");  
    }
  @Override
    public String toString(){
       return "Nombre: "+ nombre;
    }
}
