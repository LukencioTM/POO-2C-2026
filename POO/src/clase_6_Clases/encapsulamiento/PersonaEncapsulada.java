package clase_6_Clases.encapsulamiento;

public class PersonaEncapsulada {
    // El encapsulamiento es en escencia, restringir el acceso directo a los datos internos de un objeto
    // para evitar que el codigo externo altere sus valores inadecuadamente.
    // Para evitarlo, se utiliza MODIFICADORES DE ACCESO
    // private: accesible/modificable solo desde la clase
    // protected: accesible/modificable dentro del mismo paquete
    // public: accesible/modificable desde cualquier lugar de la aplicacion/proyecto
    private String Nombre;
    private String Apellido;
    private int edad;
    private int DNI;

    // Para consultar o actualizar datos encapsulados de forma controlada se implementan getters y setters
    // Getter: Permite leer un atributo sin dar acceso directo a la variable
    public int getEdad() {
        return this.edad;
    }

    // Setter: Permite modificar un atributo de forma controlada y/o dentro de un rango definido
    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        }
        else {
            System.out.println("La edad debe ser mayor a 0 o menor a 100");
        }
    }
}
