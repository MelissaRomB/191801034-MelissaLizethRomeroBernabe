/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author USUARIO
 */
public class Bateria {
    private int porcentaje;
    
    public int getPorcentaje(){
        return this.porcentaje;
    }
    public void setPorcentaje(int porcentaje){
        this.porcentaje= porcentaje;
    }
    public Bateria(){
        
    }
    public Bateria(int porcentaje){
        this.porcentaje = 100;
    }
    @Override
    public String toString(){
        return "Porcentaje " + porcentaje;
    }
}
