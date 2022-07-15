package pruebaopenbootcamp;
public class PruebaOpenBootcamp {

    public static void main(String[] args) {
        Cliente c1 = new Cliente(5000,31,"Juan","5493515168306");
        System.out.println(c1.toString());
        Trabajador t1 = new Trabajador(4500,31,"Damian","5493515168306");
        System.out.println(t1.toString());
    }
}
class Persona{ 
    private int edad;
    private String nombre;
    private String telefono;
    
    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

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

    @Override
    public String toString() {
        return "{ " + "edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + " } ";
    }
    
}
class Cliente extends Persona{
    
    private int credito;
    
    public Cliente (int credito, int edad, String nombre, String telefono){
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente { " + super.toString() + " credito=" + credito + " } ";
    }
}
class Trabajador extends Persona{
    
    private int salario;

    public Trabajador(int salario, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador { " + super.toString() + " salario=" + salario + " } ";
    }
}
