public class clase_7_switch {
    public static void main(String args[]) {
        // Switch: Multiples "elif" que funcionan como opciones de condicion de parada
        int numero = 1;

        switch (numero) {
            case 1:
                System.out.println("Un jugador");
                break; // Cierre del bloque switch
            case 2:
                System.out.println("Multijugador");
                break;
            case 3:
                System.out.println("Opciones");
                break;
            case 4:
                System.out.println("Creditos");
                break;
            case 5:
                System.out.println("Salir");
                break;
        }
        // Sintaxis moderna para Switch: case CONDICION 1, CONDICION 2, ... -> ACCION
        switch (numero) {
            case 1, 2, 3 -> System.out.println("Mover arriba");
            case 4 ->  System.out.println("Mover abajo");
            case 5, 6 ->  System.out.println("Mover izquierda");
            case 7 -> System.out.println("Mover derecha");
        }

    }
}
