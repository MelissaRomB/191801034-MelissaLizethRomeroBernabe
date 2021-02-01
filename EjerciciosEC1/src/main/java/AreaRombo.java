
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
public class AreaRombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area=0;
        System.out.println("AREA DE UN ROMBO");
        System.out.println("Ingrese el valor de la diagonal mayor");
        double diaMay=scanner.nextDouble();
        System.out.println("Ingrese el valor de la diagonal menor");
        double diaMen=scanner.nextDouble();
        
        area=(diaMay*diaMen)/2;
        System.out.println("El area del rombo es: "+ area);
    }
}
