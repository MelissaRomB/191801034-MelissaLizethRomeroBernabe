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
public class SiEntonces {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int num1=scanner.nextInt();
        
        if(num1<0)
            System.out.println("El numero es negativo");
        else
            System.out.println("El numero es positivo");    
    }
}
