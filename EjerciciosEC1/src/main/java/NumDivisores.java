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
public class NumDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0, check=1, j=1;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        System.out.println("Sus divisores son: ");
        for(int i=num; i>=1; i--){
            check=num%i;
            if(check==0){
                System.out.println("Divisor numero "+j+"=;\t"+num/i);
                j++;
            }
        }
    }
}
