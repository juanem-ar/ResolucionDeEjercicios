package com.ejemplo;

public class SmartPhone extends SmartDevice{
   
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
