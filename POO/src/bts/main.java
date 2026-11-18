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

        for (int i = 0; i < listaBTS.length; i++) {
            if (i == opcion - 1) {
                listaBTS[opcion].esEsposo = true;
            }
        }

        System.out.println("Te casaste con " + esposo + ", Felicidades!");



        System.out.println("Psst... Quien sera tu amante? ;)");
        if (jimin.esEsposo == true) {
            System.out.println("1.Jungkook\n2.Taehyung\n3.Hoseok");
        } else if (jungkook.esEsposo == true) {
            System.out.println("1.Jimin\n2.Taehyung\n3.Hoseok");
        } else if (taehyung.esEsposo == true) {
            System.out.println("1.Jimin\n2.Jungkook\n3.Hoseok");
        } else {
            System.out.println("1.Jimin\n2.Jungkook\n3.Taehyung");
        }

        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> if (jimin.esEsposo == true) {
                jungkook.esAmante = true;
                System.out.println("Jeje... tu amante sera " + jungkook.nombre);
            } else
            case 2 -> if (jungkook.esEsposo == true) {
                System.out.println("Jeje... tu amante sera " + );
            }
            case 3 -> System.out.println("Jeje... tu amante sera " + );
            case 4 -> System.out.println("Jeje... tu amante sera " + );
        }

        System.out.println("Oh no!" + esposo + "ha descubierto tu infidelidad! o.O");

        sc.close();
    }
}
