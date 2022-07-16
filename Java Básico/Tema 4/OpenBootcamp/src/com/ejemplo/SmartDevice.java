package com.ejemplo;

public abstract class SmartDevice {
    
//    ATRIBUTOS
    private String marca;
    private String modelo;
    private String color;
    
//    CONSTRUCTORES
    public SmartDevice() {
    }
    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
//    METODOS
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ", marca=" + marca + ", modelo=" + modelo + ", color=" + color;
    }
    
    
}
