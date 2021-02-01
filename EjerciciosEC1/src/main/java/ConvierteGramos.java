
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
public class ConvierteGramos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gramos=0;
        System.out.println("Ingrese el numero de kilos a convertir");
        double kilos = scanner.nextDouble();
        gramos=kilos*1000;
        System.out.println("La cantidad de "+ kilos + " kilos que ingreso, equivalen a " + gramos + " gramos");
    }
}
