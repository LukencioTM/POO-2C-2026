package clase_6_Clases;

public class clase_6_Clases {
    public static void main(String[] args) {
        // Instanciacion con constructor normal
        Persona Roberto = new Persona("Roberto", "Constanza", 45147200, 13092004);
        Roberto.mostrarDatos();

        // Instanciacion usando constructor con valores predefinidos
        Persona Juan = new Persona(22945132, 21071987);
        Juan.mostrarDatos();
    }
}
