import java.util.Scanner;
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
public class TestCine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String titulo;
        Cine cine = new Cine("CINE", 9, 24);
        
        System.out.println("¿Desea agregar una pelicula? ");
        String resp=scanner.nextLine();
        //scanner.nextLine();
        while(resp.equals("si")){
            System.out.println("¿Esta seguro de agregar una pelicula? ");
            String answer=scanner.nextLine();
            if(resp.equals(answer)){
            System.out.println("Titulo de la pelicula: ");
            titulo = scanner.nextLine();
            Pelicula pelicula = new Pelicula(titulo);
            cine.agregarPelicula(pelicula);
            }
            else if(!resp.equals(answer))
                break;
        }
        //cine.totalPeliculas();
        cine.menuPeliculas();
        System.out.println("Consulta horario");
        int hora = scanner.nextInt();
        cine.horarioCine(hora);
    }
}
