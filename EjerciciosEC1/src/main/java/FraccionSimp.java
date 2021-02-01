
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
public class FraccionSimp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int simpl=0;
     
        System.out.println("Ingrese numerador de la fraccion");
        int num=scanner.nextInt();
        System.out.println("Ingrese denominador de la fraccion");
        int den=scanner.nextInt();
        if((num%den)==0){
            simpl=num/den;
            System.out.println("La fraccion "+num+"/"+den+" Simplificada es igual a \n" + simpl);
        }
        else if((den%num)==0){
            simpl=den/num;
            System.out.println("La fraccion"+num+"/"+den+" Simplificada es igual a 1/" + simpl);
        }
        else
            System.out.println("No se puede simplificar esta fraccion " +num+"/"+den);
    }
}
