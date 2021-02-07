/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Helado {
    public String sabor, marca, calidad, materialEnvase;
    public double precio, contNeto;
    
    public Helado(){
        
    }
    public Helado(String sabor, String marca, String calidad, double contNeto, String materialEnvase, double precio){
        this.calidad = calidad;
        this.contNeto = contNeto;
        this.marca = marca;
        this.materialEnvase = materialEnvase;
        this.precio = precio;
        this.sabor = sabor;
    }
    
    @Override
    public String toString(){
        return "\nEl helado es de sabor "+sabor+"\nDe la marca "+marca+"\nLa calidad del helado es "
                +calidad+"\nCantidad de contenido neto "+contNeto+" L"+"\nEl envase es de material "
                +materialEnvase+"\nPrecio del helado $"+precio;
    }
}
