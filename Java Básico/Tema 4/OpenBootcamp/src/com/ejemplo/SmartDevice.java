package com.ejemplo;

public class SmartDevice {
    
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
    
    
public static class SmartPhone extends SmartDevice{
   
//    ATRIBUTOS
    private String sistemaOperativo;
    private int cantMemoria;
    private boolean dobleSim;
    
//    CONSTRUCTORES
    public SmartPhone() {
    }

    public SmartPhone(String sistemaOperativo, int cantMemoria, boolean dobleSim, String marca, String modelo, String color) {
        super(marca, modelo, color);
        this.sistemaOperativo = sistemaOperativo;
        this.cantMemoria = cantMemoria;
        this.dobleSim = dobleSim;
    }

//    METODOS

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCantMemoria() {
        return this.cantMemoria;
    }

    public void setCantMemoria(int cantMemoria) {
        this.cantMemoria = cantMemoria;
    }

    public boolean isDobleSim() {
        return this.dobleSim;
    }

    public void setDobleSim(boolean dobleSim) {
        this.dobleSim = dobleSim;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "sistemaOperativo=" + sistemaOperativo + ", cantMemoria=" + cantMemoria + ", dobleSim=" + dobleSim + super.toString() + '}';
    }

}
public static class SmartWatch extends SmartDevice{
        
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
public static void main(String[] args) {
        
        SmartDevice telefono = new SmartPhone("Android", 256, false, "Samsung", "S20 Ultra", "Azul");
        SmartDevice reloj = new SmartWatch(1.3, "Samsung", "Gear", "Negro");
        
        System.out.println("Información sobre el " + telefono);
        System.out.println("Información sobre el " + reloj);
}

}
