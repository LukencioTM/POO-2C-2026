public class clase_2_For {
    public static void main(String[] args) {
        // Blucle repetitivo for
        // EJERCICIO: Numeros amigos
        // Se obtienen los divisores del numero A y se suman
        // Si la suma es igual al numero B y viceversa, A y B son numeros amigos.
        int numero_A = 284;
        int numero_B = 220;
        int aux_a = 0;
        int aux_b = 0;
        // Creacion de un bucle 1
        // for (inicializacion del contador ; condicion de parada ; pasos como i++ o i+=2, etc.)
        for (int i = 1; i < numero_A; i++) {

            if (numero_A % i == 0) {
                System.out.println("Divisor de numero " + numero_A + " encontrado: " + i);
                aux_a += i;
            }
        }
        // Bucle 2 para el segundo numero
        for (int i = 1; i < numero_B; i++) {

            if (numero_B % i == 0) {
                System.out.println("Divisor de numero " + numero_B + " encontrado: " + i);
                aux_b += i;
            }
        }
        System.out.println("A divisor: " + aux_a);
        System.out.println("B divisor: " + aux_b);
        if (aux_a == numero_B && aux_b == numero_A) {
            System.out.println(numero_A + " Y " + numero_B + " son numeros amigos");
        } else {System.out.println(numero_A + " Y " + numero_B + " no son numeros amigos");}

    }
}
