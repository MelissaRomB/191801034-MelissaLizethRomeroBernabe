
import hardware.Bateria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class TestBateria {
    public static void main(String[] args){
        
        //instansear es crear un objrto
        //partes para instansear un objeto
        //Bateria = clase, bateriaCel=nombre del objeto, new=palabra reservada, Bateria=clase,()=constructor completo o vacio
        Bateria bateriaCel = new Bateria(100);
        
        System.out.println(bateriaCel);
        
        bateriaCel.setPorcentaje(99);
        System.out.println(bateriaCel);
    }
}
