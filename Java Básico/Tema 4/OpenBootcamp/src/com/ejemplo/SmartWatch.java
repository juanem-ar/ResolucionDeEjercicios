package com.ejemplo;

public class SmartWatch extends SmartDevice{
        
//    ATRIBUTOS
    private double pulgadas;
    
//    CONSTRUCTORES
    public SmartWatch() {
    }
    public SmartWatch(double pulgadas, String marca, String modelo, String color) {
        super(marca, modelo, color);
        this.pulgadas = pulgadas;
    }
    
    //    METODOS

    public double getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "SmartWatch{" + "pulgadas=" + pulgadas + super.toString() +'}';
    }

}
