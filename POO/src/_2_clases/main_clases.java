package _2_clases;

public class main_clases {
    public static void main(String[] args) {
        // Instanciacion con constructor normal
        Persona Roberto = new Persona("Roberto", "Constanza", 45147200, 13092004);
        Roberto.mostrarDatos();

        // Instanciacion usando constructor con valores predefinidos
        Persona Juan = new Persona(22945132, 21071987);
        Juan.mostrarDatos();
    }
}
