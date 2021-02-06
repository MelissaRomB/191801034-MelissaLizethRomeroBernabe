/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestScooter {
    public static void main(String[] args){
  
        Scooter kymco = new Scooter();
        kymco.marca = "Kymco";
        kymco.cilindrada = 125;
        kymco.color = "Blanco";
        kymco.estabilidad = "Alta";
        kymco.modelo = "like 125";
        kymco.potenciaMax = 11.56;
        kymco.velocidad = 90;
        
        System.out.println(kymco);
    }
}
