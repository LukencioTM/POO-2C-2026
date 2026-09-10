public class clase_2 {
    public static void main(String[] args) {
        // Inicializamos numero, auxiliar a utilizar en calculo, ultimoDigito para almacenarlo.
        // Inicializamos calculo para la potencia y suma para sumar el total de cada calculo.
        int num = 371;
        int aux = num;
        int ultimoDigito;
        double calculo;
        double suma = 0;
        double digitos = Math.floor(Math.log10(aux) + 1); // obtenemos cantidad de digitos.
        System.out.println("cantidad de digitos: " + digitos);

        // Bucle de calculo y suma al total
        while (aux > 0) {
            ultimoDigito = aux % 10;
            System.out.println("Ultimo numero: " + ultimoDigito);
            calculo = (Math.pow(ultimoDigito, digitos));
            System.out.println("Calculo: " + aux + "^" + digitos + " = " + calculo);
            suma += calculo;
            System.out.println(suma);
            aux = aux / 10;

        }
        // Condicion comparativa para saber si es un numero de Armstrong o no.
        if (suma == num) {
            System.out.println("El numero " + num + " Es un numero de Armstrong.");
        } else {
            System.out.println(" El numero " + num + " No es un numero de Armstrong");
        }
    }
}
