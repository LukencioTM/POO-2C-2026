import java.util.Scanner;

// Clase SCANNER
public class Clase_11 {
    public static void main(String[] args) {
        System.out.print("Introduce el numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("El numero introducido es: " + num);
    }
}
