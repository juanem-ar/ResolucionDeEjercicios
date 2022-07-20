package com.ejemplo;

import java.io.*;
import java.util.*;


public class Test {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = false;
        do {
            System.out.println("Escribe un numero del 0 al 9 para ver la resolucion del ejercicio:");
            int op = entrada.nextInt();
            switch (op) {
                case 0:
                    System.out.println("*************Cadena al revés*************");
                    System.out.println("Ingresa la palabra que deseas invertir");
                    String cadena = entrada.next();
                    System.out.println("Palabra invertida------>" + reverse(cadena));
                case 1:
                    System.out.println("*************Array Unidimensional*************");
                    String[] nombres = {"Juan","Pedro","Ramiro"};

                    for (String nombre : nombres) {
                        System.out.println(nombre);
                    }
                    break;
                case 2:
                    //          RESOLUCION N°2
                    System.out.println("*************Array Bidimensional*************");

                    int arrayBidimensional[][] = {{1,12,40,2},{1,12,40,2}};

                    for (int i = 0; i < arrayBidimensional.length; i++) {
                        for (int j = 0; j < arrayBidimensional[i].length; j++) {
                            System.out.println("Fila " + (i+1) + " - Columna " + (j+1) + " = " + arrayBidimensional[i][j]);
                        }
                    }
                    break;
                case 3:
                    //          RESOLUCION N°3
                    System.out.println("*************Vector*************");
                    Vector numeros = new Vector();
                    Vector<Integer> letras = new Vector();
                    for (int i = 0; i <= 4; i++) {
                        numeros.add(i);
                    }
                    System.out.println(numeros);
                    numeros.remove(2);
                    numeros.remove(1);
                    System.out.println("Vector con elementos eliminados");
                    System.out.println(numeros);
                    System.out.println("Tamaño por defecto del vector -> " + letras.size());
                    break;
                case 4:
                    System.out.println("*************Respuesta sobre el vector*************");
                    System.out.println("Se estaria utilizando muchos recursos del sistema de forma innecesaria.\nCada vez que exista un overflow se estaria generando un nuevo vector con el doble de capacidad.");
                    break;
                case 5:
                    System.out.println("\n*************Contenido del ArrayList*************");
                    ArrayList<String> apellidos = new ArrayList<>();
                    apellidos.add("Lopez");
                    apellidos.add("Perez");
                    apellidos.add("Díaz");
                    apellidos.add("Canova");

                    for (String apellido : apellidos) {
                        System.out.print(" | " + apellido);
                    }
                    System.out.println("\n*************Contenido del LinkedList*************");

                    LinkedList<String> copiaApellidos = new LinkedList<>(apellidos);
                    for (String copiaApellido : copiaApellidos) {
                        System.out.print(" | " + copiaApellido);
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("*************ArrayList*************");

                    ArrayList<Integer> segundoArrayList = new ArrayList<>();

                    for (int i = 1; i <= 10; i++) {
                        if(i%2!=0){
                            segundoArrayList.add(i);
                        }
                    }
                    System.out.println("Eliminando pares -->" + segundoArrayList);
                    break;
                case 7:
                    System.out.println("*************Funcion DividePorCero*************");
                    System.out.println("Ingresa el primer número: ");
                    int n1 = entrada.nextInt();
                    System.out.println("Ingresa el segundo número: ");
                    int n2 = entrada.nextInt();
                    try {
                        System.out.println("El resultado es: " + dividePorCero(n1,n2));
                    } catch (ArithmeticException e) {
                        System.out.println("Esto no puede hacerse.");
                    } finally{
                        System.out.println("Demo de código.");
                    }
                    break;
                case 8:
                    System.out.println("*************InputStream / PrintStream*************");
                    System.out.println("Introduce el nombre del archivo que deseas copiar:");
                    String fileIn = entrada.next();
                    System.out.println("Escribe el nombre de destino:");
                    String fileOut = entrada.next();

                    try {
                        copiarArchivo(fileIn, fileOut);
                    } catch (IOException e) {
                        System.out.println("Error-> " + e.getMessage());
                    }
                    break;
                case 9:
                    boolean repetir = true;
                    String respuesta = "";

                    GestionPrograma gestion = new GestionPrograma();
                    List<Estudiante> estudioSuperior = new ArrayList<>();
                    List<Estudiante> estudioInferior = new ArrayList<>();


                    System.out.println("""
                                        ************************************************************************************
                                        *************Bienvenidos a mi programa de registro de estudiantes*******************
                                        ************************************************************************************
                                       """);
                    do {
                        System.out.println("\nPara comenzar, te parece que creemos un archivo de texto del nuevo registro? S/N");
                        respuesta = entrada.next();
                    } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
                    if (respuesta.equalsIgnoreCase("s")) {
                        do {
                            System.out.println("Escribe el nombre del archivo (extension .txt)");
                            respuesta = entrada.next().toLowerCase();   
                        } while (!respuesta.endsWith(".txt"));
                        try {
                            gestion.crearArchivo(respuesta);
                        } catch (FileNotFoundException e) {
                            System.out.println("Error->" + e.getMessage());
                        }
                    }else{
                        do{
                            System.out.println("Dime el nombre del archivo (extension .txt)");
                            respuesta = entrada.next();//nombre del archivo  
                        }while(!gestion.existeArchivo(respuesta));
                    }
                    String nombreArchivo = respuesta;
                    System.out.println("\nYa tenemos nuestro archivo. Es hora de agregar algunos datos");
                    do{
                        gestion.mostrarMenu();
                        int opcion = (Integer)entrada.nextInt();
                        if(opcion > 0  && opcion < 4){
                            switch (opcion) {
                                case 1:
                                    System.out.println("Nombre completo");
                                    String nombre = entrada.next();
                                    System.out.println("Es un estudiante superior? S/N");
                                    respuesta = entrada.next();
                                    if(respuesta.equalsIgnoreCase("s")){
                                        gestion.cargarEstudiante(estudioSuperior, nombre);
                                    }else if (respuesta.equalsIgnoreCase("n")){
                                        gestion.cargarEstudiante(estudioInferior, nombre);
                                    }else{
                                        System.out.println("Respuesta incorrecta");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Ver lista de estudiantes SUPERIORES? S/N");
                                    respuesta = entrada.next();
                                    if (respuesta.equalsIgnoreCase("s")) {
                                        gestion.listarEstudiantes(estudioSuperior);
                                    }else if(respuesta.equalsIgnoreCase("n")){
                                        gestion.listarEstudiantes(estudioInferior);
                                    }else{
                                        System.out.println("Respuesta incorrecta");
                                    }
                                    break;
                                case 3:
                                    Map<List<Estudiante> ,String> mapa = new HashMap<>();
                                    mapa.put(estudioInferior, "Alumnos Primaria");
                                    mapa.put(estudioSuperior, "Alumnos Secundaria");
                                    try {
                                        gestion.escribirArchivo(nombreArchivo, mapa);
                                    } catch (FileNotFoundException e) {
                                        System.out.println("Error->"+ e.getMessage());
                                    } catch (IOException e) {
                                        System.out.println("Error->" + e.getMessage());
                                    }   
                                    break;
                                default:
                                    repetir = false;
                                    System.out.println("Gracias por usar la aplicación");
                            }
                        }else{
                            System.out.println("Opción incorrecta");
                        }
                    }while(repetir);
                    break;
                default:
                    continuar = false;
                    System.out.println("Gracias por ver las resoluciones!");
                    break;
            }
        } while (!continuar);
    }
    
    public static void copiarArchivo(String fileIn, String fileOut) throws FileNotFoundException, IOException{
        InputStream file = new FileInputStream(fileIn);
        PrintStream out = new PrintStream(fileOut);
        BufferedInputStream fileBuff = new BufferedInputStream(file);
        
        int datos = fileBuff.read();
        while(datos!=-1){
            out.print((char)datos);
            datos= fileBuff.read();
        }
    }   
    public static void crearArchivo(String nombre) throws FileNotFoundException, IOException{
        PrintStream imprimir = new PrintStream(nombre);
        imprimir.close();
    }
    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = a / b;
        return resultado;
    }
    public static String reverse(String mensaje){
        String cadenaInversa = "";
        for (int i = mensaje.length()-1; i >= 0; i--) {
            cadenaInversa+=mensaje.charAt(i);
        }
        return cadenaInversa;
    }
    public static class Estudiante{
    private String nombreCompleto;
    
        public Estudiante(){};

        public Estudiante(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getNombreCompleto() {
            return this.nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        
        @Override
        public String toString() {
            return "Estudiante{" + "nombreCompleto=" + nombreCompleto  + '}';
        }
    
    
    }
    public static class GestionPrograma{
        public void mostrarMenu(){
            
            System.out.println("""
                                ***************************************
                                Para continuar, ingresa una opci\u00f3n
                                1.- Ingresar alumnos
                                2.- Listar Alumnos
                                3.- Registrar datos en archivo creado.
                                0.- Salir
                                """);
        }
        public boolean existeArchivo(String nombreArchivo){
            File file = new File(nombreArchivo);
            return file.exists();
        }
        public void crearArchivo(String nombreArchivo) throws FileNotFoundException{
            boolean exists = existeArchivo(nombreArchivo);
            if (exists) {
                System.out.println("Ups! El archivo ya existe.");
            } else {
                PrintStream out = new PrintStream(nombreArchivo);    
                out.close();
                System.out.println("""
                                   *******************************************
                                   **¡Genial! ya creamos tu archivo de texto**
                                   *******************************************
                                   """);
            }
        }
        public Estudiante crearEstudiante(String nombreCompleto){
        
        Estudiante estudiante = new Estudiante(nombreCompleto);
        
        return estudiante;
        
    }
        public void cargarEstudiante(List<Estudiante> lista, String nombreCompleto){
            
            lista.add(crearEstudiante(nombreCompleto));
            
            System.out.println("""
                                   *******************************************
                                   ** Se agregó correctamente el estudiante **
                                   *******************************************
                                   """);
        }
        public void listarEstudiantes(List<Estudiante> lista){
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Estudiante " + (i+1) + " -> " + lista.get(i));
            }
        }
        public void escribirArchivo(String nombreArchivo, Map mapa) throws FileNotFoundException, IOException{ 
            try{
                InputStream file = new FileInputStream(nombreArchivo);
                PrintStream salida = new PrintStream(nombreArchivo);
                BufferedInputStream fileBuff = new BufferedInputStream(file);
                int datos = fileBuff.read();
                while(datos!=-1){
                    salida.print((char)datos);
                    datos = fileBuff.read();
                }
                salida.print(mapa);
                salida.close();
                System.out.println("""
                                   ***************************************************
                                   **¡Genial! Se imprimieron correctamente los datos**
                                   ***************************************************
                                   """);
            }catch(FileNotFoundException e){
                System.out.println("Error->" + e.getMessage());
            }
        }
    }
}
