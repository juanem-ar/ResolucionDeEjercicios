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
        //Numeros enteros
        byte n1 = 1;
        short n2 = 2;
        int n3 = 3;
        long n4 = 1232;
        
        System.out.println("Numeros enteros:" 
                + " byte-> " + n1 + ","
                + " short-> " + n2 + ","
                + " int-> " + n3 + ","
                + " long-> " + n4);
        
        //Numeros decimales
        float n5 = 5.1f;
        double n6 = 5.05d;
        
        System.out.println("Numeros decimales:" 
                + " float-> " + n5 + ","
                + " double-> " + n6);
        
        //Texto
        char character = 'a';
        String cadena = "cadena";
        
        System.out.println("Texto:" 
                + " char-> " + character + ","
                + " String-> " + cadena);
        
        //Boolean
        boolean sure = false;
        
        System.out.println("Texto:" 
                + " boolean-> " + sure);
    }
}
