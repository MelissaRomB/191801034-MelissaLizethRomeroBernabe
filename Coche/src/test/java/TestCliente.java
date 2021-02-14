/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestCliente {
    public static void main(String[] args){
        Coche coche1 = new Coche("AUDI", "Negro", 12000, 23738888, 2018);
        Cliente cliente = new Cliente("Camila", 21344, 98423788, 222734490, coche1);
        
        System.out.println(cliente);
    }
}
