package _4_POO.estatico;

public class main {
    public static void main(String[] args) {
        amigo amigo1 = new amigo("Sebastian");
        amigo amigo2 = new amigo("Juan");
        amigo amigo3 = new amigo("Pablo");

        System.out.println(amigo1.nombre);
        System.out.println(amigo2.nombre);
        System.out.println(amigo3.nombre);
        System.out.println(amigo.cantDeAmigos);

    }
}
