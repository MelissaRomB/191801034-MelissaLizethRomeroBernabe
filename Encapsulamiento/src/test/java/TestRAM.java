
import hardware.RAM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestRAM {
    public static void main(String[] args){
        RAM ramEst = new RAM(8, "Estatica", 800);
        System.out.println(ramEst);
        
        //Modificar capacidad
        ramEst.setCapacidad(4);
        System.out.println(ramEst);
        //Consultar frecuencia
        ramEst.getFrecuencia();
        System.out.println(ramEst);
        //Modificar tipo
        ramEst.setTipo("Dinamica");
        System.out.println(ramEst);
        
    }
}
