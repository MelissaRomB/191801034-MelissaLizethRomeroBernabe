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
public class TestMateria {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la materia: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la carrera: ");
        String carrera = scan.nextLine();
        System.out.println("Ingrese los credito de la nateria: ");
        int creditos = scan.nextInt();
        System.out.println("Ingrese el codigo de la materia: ");
        int codigo= scan.nextInt();
        System.out.println("Ingrese el cuatrimestre de la materia: ");
        int cuatriCurso= scan.nextInt();
        
        Materia POO = new Materia("Programacion Orientada a Objetos", "TIC", 8, 123, 5);
        Materia Ingles5 = new Materia("Ingles 5", "TIC", 4, 345, 5);
        Materia BaseDatos = new Materia("Base de Datos", "TIC", 8, 789, 5);
        Materia materiaUsuario = new Materia(nombre, carrera, codigo, creditos, cuatriCurso);
        
        System.out.println(POO + "\n" +Ingles5 + "\n"+ BaseDatos+ "\n"+materiaUsuario);
    }
}
