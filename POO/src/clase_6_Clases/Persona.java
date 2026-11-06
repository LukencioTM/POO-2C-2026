package clase_6_Clases;

public class Persona {
    String nombre;
    String apellido;
    int DNI;
    int nacimiento;

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Nacimiento: " + nacimiento);
    }

    public Persona(String nombre, String apellido, int DNI, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
    }
}
