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



    }
}