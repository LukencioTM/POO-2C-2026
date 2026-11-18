package _4_POO.estatico;

public class amigo {
    static int cantDeAmigos;
    String nombre;

    amigo(String nombre) {
        this.nombre = nombre;
        cantDeAmigos++;
    }

    public void mostrarCantDeAmigos() {
        System.out.println("Amigos: " + cantDeAmigos);
    }

}
