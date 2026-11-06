public class clase_5_Array {
    public static void main(String[] args) {
        // Arrays estaticos
        int[] lista = new int[6]; // Creacion de array con 5 "casillas"
        lista[0] = 1;
        lista[1] = 7;
        lista[2] = 14;
        lista[3] = 9;
        lista[4] = 5;
        lista[5] = 3;

        // Impresion de todos los elementos de la lista con bucle for
        for (int i = 0 ; i < lista.length ; i++) {
            System.out.println(lista[i]);
        }

        // Impresion con bucle While
        int q = 0;
        while (q < lista.length) {
            System.out.println(lista[q]);
            q++;
        }

        System.out.println("\nEJERCICIO: NUMEROS DUPLICADOS");
        // Ejercicio: Elementos duplicados
        // Dado un array de numeros enteros, se desea saber si el numero de una posicion
        // es igual al de su posicion posterior.
        int[] listaNumeros = {1, 2, 3, 3, 4, 4, 5, 2};

        // Impresion del array
        for (int i = 0 ; i < listaNumeros.length ; i++) {
            System.out.println(listaNumeros[i]);
        }
        // Busqueda de elementos duplicados (doble bucle. El primero obtiene el valor a buscar
        // El segundo bucle, a partir de la posicion del primer bucle, busca en el resto de la lista si esta duplicado
        for (int i = 0 ; i < listaNumeros.length ; i++) {
            for (int j = i + 1 ; j < listaNumeros.length ; j++) {
                if (listaNumeros[i] == listaNumeros[j]) {
                    System.out.println("ELEMENTO DUPLICADO: " + listaNumeros[i]);
                }
            }
            // Condicion de busqueda unicamente con el elemento posterior
            //if (i != listaNumeros.length-1 && listaNumeros[i] == listaNumeros[i+1]) {
            //    System.out.println("ELEMENTO DUPLICADO: " +  listaNumeros[i]);
            //}
        }


    }
}