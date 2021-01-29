
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
public class Opciones {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Dame el segundo numero");
        int num2 = scanner.nextInt();
        
        System.out.println("Opcion 1. SUMA"
                       + "\nOpcion 2. RESTA");
        int opcion= scanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println(num1+num2);
            break;
            case 2:
                System.out.println(num1-num2);
            break;
            default:
                System.out.println("No existe esa opcion");
           break;
        }
       
    }
}
