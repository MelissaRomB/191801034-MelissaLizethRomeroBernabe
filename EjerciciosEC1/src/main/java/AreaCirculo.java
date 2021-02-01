
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
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area=0;
        double pi=3.1416;
        System.out.println("Ingrese el radio del circulo");
        double radio = scanner.nextDouble();
        area=pi*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: "+area);
    }
}
