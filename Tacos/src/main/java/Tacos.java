
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Tacos {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int tacos =17;
        int refresco =10;
        
        System.out.println("¿Cuantos tacos comio?");
        int numTacos = scanner.nextInt();
        System.out.println("¿Cuantos refrescos solicito?");
        int numRef = scanner.nextInt();
        
        int cuenta = (tacos*numTacos)+(refresco*numRef);
        System.out.println("Su cuenta es de $" + cuenta);
    }
}
