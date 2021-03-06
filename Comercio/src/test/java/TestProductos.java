/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestProductos {
    public static void main(String[] args){
        Productos leche = new Productos(15, "ALPURA", 123456, 34, false);
        System.out.println(leche);
        
        leche.setCantidad(40);
        System.out.println(leche);
        leche.getNombre();
        System.out.println(leche);
    }
}
