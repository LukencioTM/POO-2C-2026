public class clase_1 {
    public static void main(String[] args) {
        int puntaje = 95;
        char calificacion;

        if (puntaje >= 90) {
            calificacion = 'A';
        } else if (puntaje >=80) {
            calificacion = 'B';
        } else if (puntaje >= 70) {
            calificacion = 'B';
        } else if (puntaje >= 60) {
            calificacion = 'C';
        } else {
            calificacion = 'F';
        }
        System.out.println("Tu puntaje es: " + calificacion);
    }
}

