package pruebaopenbootcamp;
public class PruebaOpenBootcamp {

    public static void main(String[] args) {
//        ETAPA 1
        int numeroIf = 0;
        
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        }else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }
        
//        ETAPA 2

        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
//        ETAPA 3

        do {
            numeroWhile++;
            System.out.println(numeroWhile); 
        } while (numeroWhile < 3);
        
//        ETAPA 4

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
//        ETAPA 5
        
        int estacion = 3;
        
        switch(estacion){
            case 1:
                System.out.println("La estación seleccionada es Verano.");
                break;
            case 2:
                System.out.println("La estación seleccionada es Otoño.");
                break;
            case 3:
                System.out.println("La estación seleccionada es Invierno.");
                break;
            case 4:
                System.out.println("La estación seleccionada es Primavera.");
                break;
            default:
                System.out.println("El valor ingresado no corresponde a una estacion");
                break;
                
        }
                
        
    }
    
}
