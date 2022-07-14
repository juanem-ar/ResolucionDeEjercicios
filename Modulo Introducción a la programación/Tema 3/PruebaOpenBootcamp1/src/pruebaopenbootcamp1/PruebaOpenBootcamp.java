package pruebaopenbootcamp1;

public class PruebaOpenBootcamp {


public static void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.incrementarPuerta();
    System.out.println(miCoche.numeroPuertas);
    int a = miFuncion(3,4,5);
    System.out.println(a);
   
}
public static int miFuncion(int a, int b, int c){
    return a + b + c;
}

}
class Coche{
    int numeroPuertas = 4;
    
    public void incrementarPuerta(){
        this.numeroPuertas++;
    }
}

