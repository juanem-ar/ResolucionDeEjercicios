package pruebaopenbootcamp;
public class PruebaOpenBootcamp {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        
        p1.setNombre("Juan");
        p1.setEdad(31);
        p1.setTelefono("3515168306");
        
        System.out.println("¡Hola a todos!, mi nombre es " + p1.getNombre() + ", tengo " + p1.getEdad() 
                + " de edad y mi número telefónico es " + p1.getTelefono());
    }
}
class Persona{
    
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
