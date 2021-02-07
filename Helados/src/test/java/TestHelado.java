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
public class TestHelado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el sabor del helado: ");
        String sabor = scan.nextLine();
        System.out.println("Ingrese la marca del helado: ");
        String marca = scan.nextLine();
        System.out.println("Ingrese la calidad del helado: ");
        String calidad = scan.nextLine();
        System.out.println("Ingrese la contenido neta del helado: ");
        String contNeto = scan.nextLine();
        System.out.println("Ingrese el material del envase del helado: ");
        String materialEnvase = scan.nextLine();
        System.out.println("Ingrese el precio del helado: ");
        String precio = scan.nextLine();
        
        Helado chocoMenta = new Helado("Choco Menta", "Holanda", "Buena", 1, "Polipapel", 63.50);
        Helado napolitano = new Helado("Napolitano", "Aurrera", "Media", 3.78, "Polipapel", 112);
        Helado heladoUsuario = new Helado(sabor, marca, calidad, 0, materialEnvase, 0);
        System.out.println(chocoMenta + "\n"+napolitano+"\n"+heladoUsuario);
    }
}
