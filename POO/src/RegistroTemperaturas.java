import javax.swing.plaf.synth.SynthTextAreaUI;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];
        double promedio;
        double tempMax = 0;
        double tempMin = 100;
        double umbralTemperatura = 25;
        int DiasSobreUmbral = 0;
        double suma = 0;

        temperaturas[0] = 27.3;
        temperaturas[1] = 9.8;
        temperaturas[2] = 21.6;
        temperaturas[3] = 14.7;
        temperaturas[4] = 1.8;
        temperaturas[5] = 37.9;
        temperaturas[6] = 23.4;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura dia "+ (i + 1) + ": " + temperaturas[i] + "°C");
            suma += temperaturas[i];
            if (temperaturas[i] > tempMax) {
                tempMax = temperaturas[i];
            }
            if (temperaturas[i] < tempMin) {
                tempMin = temperaturas [i];
            }
            if (temperaturas[i] > umbralTemperatura) {
                DiasSobreUmbral++;
            }

        }
        promedio = suma / temperaturas.length;
        System.out.println("Promedio: " + promedio);
        System.out.println("Temperatura maxima: " + tempMax);
        System.out.println("Temperatura minima: " + tempMin);
        System.out.println("Dias que superaron el umbral: " +  DiasSobreUmbral);

    }
}
