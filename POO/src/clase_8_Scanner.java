import java.util.Scanner;

public class clase_8_Scanner {
    public static void  main(String[] args) {
        // Se instancia la clase Scanner y se utiliza en cada variable para obtener la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numeroIngresado = sc.nextInt();

        // Limpiamos el "\n" del buffer para que no produzca un salto de linea
        // y nos deje seguir ingresando datos luego del primer scanner
        sc.nextLine();

        System.out.println("Ingrese un nombre");
        String nombreIngresado = sc.nextLine();

        System.out.println("Numero ingresado: " + numeroIngresado);
        System.out.println("Nombre ingresado: " + nombreIngresado);

        // buena practica: Cerrar el Scanner al finalizar la entrada en consola
        sc.close();
    }
}
