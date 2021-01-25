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
public class Promedio {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el primer numero double");
        double numUno = scanner.nextDouble();
        System.out.println("Dame el segundo numero double");
        double numDos = scanner.nextDouble();
        System.out.println("Dame el tercer numero double");
        double numTres = scanner.nextDouble();
        double promNum = (numUno+numDos+numTres)/3;
        
        System.out.println("El promedio de los tres sumeros es: " + promNum);
    }
}
