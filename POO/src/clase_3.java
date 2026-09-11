public class clase_3 {
    public static void main(String[] args) {
        /*
         * do {
         * ...
         * } while (condicion);
         */
        int numero = 496;
        int i = 1;
        int suma = 0;

        do  {
            if (numero % i == 0) {
                suma += i;
                System.out.println(i + " es un divisor de " + numero + ". suma total: " + suma);
            }
            i++;
        } while (i <= numero / 2); // Condicion que controla la repeticion del bucle
        {
            if (suma == numero) {
                System.out.println(numero + " es un numero perfecto");
            } else {
                System.out.println(numero + " no es un numero perfecto");
            }

        }

    }

}