/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestUsuario {
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria(1234567891, 2345,191020, "BBVA Bancomer", "01/Enero/2012", 9500.50, true);
        CuentaBancaria cuenta2 = new CuentaBancaria(1987654321, 4567, 150721, "Santander", "15/Enero/2018", 1000.89, false);
        Usuario usuario1 = new Usuario("Melissa Romero", 191020, "05/Marzo/2018", cuenta1);
        
        Usuario usuario2 = new Usuario("Josselyn ", 150721, "07/Enero/2020", cuenta2);
        
        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
