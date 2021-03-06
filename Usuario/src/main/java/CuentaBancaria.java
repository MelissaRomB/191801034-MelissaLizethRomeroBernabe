/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class CuentaBancaria {
    private int clabe, numCuenta, id;
    private String nombreBanco, fecha_creacion;
    private double credito;
    private boolean tarjetaDeb;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(int clabe, int numCuenta, int id, String nombreBanco, String fecha_creacion, double credito, boolean tarjetaDeb) {
        this.clabe = clabe;
        this.numCuenta = numCuenta;
        this.id = id;
        this.nombreBanco = nombreBanco;
        this.fecha_creacion = fecha_creacion;
        this.credito = credito;
        this.tarjetaDeb = tarjetaDeb;
    }

    @Override
    public String toString() {
        return "\nID de usuario:" + id +"\nNombre del Banco: " + nombreBanco+ "\nCLABE interbancaria: " + clabe + "\nNumero de cuenta: " + numCuenta  + "\nCredito: $" + credito + "\nFecha de creacion de la cuenta: "+ fecha_creacion +"\nTarjeta de debito: " + tarjetaDeb;
    }

    public int getClabe() {
        return clabe;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getCredito() {
        return credito;
    }

    public boolean isTarjetaDeb() {
        return tarjetaDeb;
    }

    public void setClabe(int clabe) {
        this.clabe = clabe;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setTarjetaDeb(boolean tarjetaDeb) {
        this.tarjetaDeb = tarjetaDeb;
    }

    
    
    
    
    
    
    
    
}
