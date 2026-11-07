package clase_6_Clases;

public class Persona {
    // CLase 6: CLASES
    // Clase: Plantilla de creacion de un objeto que define atributos (datos) y metodos (acciones)
    // Objeto: Instancia creada a partir de la plantilla con sus propios valores de atributos

    // Asignacion de atributos
    String nombre;
    String apellido;
    int DNI;
    int nacimiento;

    // Asignacion de metodos
    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Nacimiento: " + nacimiento);
    }

    // Creacion del constructor
    // Constructor: Metodo especial opcional que se invoca automaticamente cuando se crea una instancia.
    // Su objetivo es principal es definir valores de los atributos al instanciar la clase
    // Palabra reservada "this": referencia que apunta al atributo del objeto actual
    public Persona(String nombre, String apellido, int DNI, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
    }
    // SOBRECARGA: Una clase se le puede "sobrecargar" constructores que instancien de distintas formas
    // Como valores por defecto
    public Persona(int DNI, int nacimiento) {
        this.nombre = "Juan";
        this.apellido = "Ortondo";
        this.DNI = DNI;
        this.nacimiento = nacimiento;
    }

}
