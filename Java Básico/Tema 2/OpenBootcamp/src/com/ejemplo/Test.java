package com.ejemplo;
/**
 * 
 * Clase principal punto de entrada aplicación
 * @author Juan
 */
public class Test {
 /**
 *
 * @param args argumentos a recibir
 * @since 1.0
 */
    public static void main(String[] args) {
        agregarIva(10);
    }
    public static void agregarIva(double precioSinIva){
        double precioConIva = precioSinIva * 1.21;
        System.out.println(precioConIva);
    }
}
