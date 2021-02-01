
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
public class Operador {
    public static void main(String[] args) {
        Scanner receptor = new Scanner(System.in);
        int num1=0,dato1=0,division1=0,dato2 =0,dato3=0,division2=0,division3=0, suma =0;
     
        System.out.println("Escribir un numero entero entre 100 y 999: ");
        num1 = receptor.nextInt();
        dato1 = num1%10;
        System.out.println("el residuo1 es:" + dato1);
        division1 = num1/10;
        System.out.println("La division1 es:" + division1);
        
        dato2 = division1%10;
        System.out.println("el residuo2 es:" + dato2);
        division2 = division1/10;
        System.out.println("La division2 es:" + division2);
        
        dato3 = division2%10;
        System.out.println("el residuo3 es:" + dato3);
        division3 = division2/10;
        System.out.println("La division3 es:" + division3);
        
        suma = dato1 + dato2 + dato3;
        System.out.println("La suma es:" + suma);
    }
}
