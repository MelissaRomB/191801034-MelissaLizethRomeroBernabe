/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestTaza {
     public static void main(String[] args){
         
         Taza tazaRoja = new Taza();
         tazaRoja.color = "Roja";
         tazaRoja.material = "Plastico";
         tazaRoja.modelo = "Navideño 2020";
         tazaRoja.precio = 350.90;
         tazaRoja.tamanio = "Mediana";
         
         System.out.println(tazaRoja);
         
         Taza tazaNaranja = new Taza("Naranja", "Industrial", "Plata", "Grande", 119.50);
         System.out.println(tazaNaranja);
     }
}
