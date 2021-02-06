
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
public class TestDisco {
    public static void main(String[] args){
        ArrayList <Cancion> canciones = new ArrayList();
        
        Cancion cancion1 = new Cancion(1, "Be Alright", 3.20);
        Cancion cancion2 = new Cancion(2, "Six Feet Under", 3.08);
        Cancion cancion3 = new Cancion(3, "Not About Angels", 3.18);
        
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        
        String nombre = "Alone Again";
        Disco MixArtistas = new Disco(nombre, "Mix de artistas", 2018, canciones);
        System.out.println(MixArtistas);
    }
}
