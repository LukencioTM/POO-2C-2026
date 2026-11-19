package bts;

import java.util.Scanner;
import java.util.random.*;

public class main {
    public static void main(String[] args) {
        int opcion;
        String esposo = "nadie XD";
        String amante = "nadie XD";
        bts jimin = new bts("Jimin", 1);
        bts jungkook = new bts("Jungkook", 2);
        bts taehyung = new bts("Taehyung", 3);
        bts hoseok = new bts("Hoseok", 4);
        bts[] listaBTS = {jimin, jungkook, taehyung, hoseok};
        Scanner sc = new Scanner(System.in);

        System.out.println("Doña del registro civil: Hola! Con quien te casaras hoy?");
        for (int i = 0; i < listaBTS.length; i++) {
            System.out.println(i + 1 + ". " + listaBTS[i].nombre);
        }
        opcion = sc.nextInt();
        listaBTS[opcion - 1].esEsposo = true;
        esposo = listaBTS[opcion - 1].nombre;
        System.out.println("Te casaste con " + listaBTS[opcion - 1].nombre + ", Felicidades!");



        System.out.println("Psst... Quien sera tu amante? ;)");

        for (int i = 0; i < listaBTS.length; i++) {
            if (!listaBTS[i].esEsposo) {
                System.out.println(i + 1 + ". " + listaBTS[i].nombre);
            }
        }

        opcion = sc.nextInt();

        if (!listaBTS[opcion - 1].esEsposo || listaBTS[opcion - 1] != null) {
            listaBTS[opcion - 1].esAmante = true;
            System.out.println("Jeje... tu amante sera " + listaBTS[opcion - 1].nombre);
        }

        int numRandom = 0;



        System.out.println("Oh no!" + esposo + " ha descubierto tu infidelidad! Se ha casado con ");

        sc.close();
    }
}
