public class clase_1_ElseIf {
    public static void main(String[] args) {
        int puntaje = 95;
        char calificacion;

        // if (A condicion B) {}  // "< > <= >= =="
        // && = and  || = or
        // if (A condicion B && C condicion D || E condicion F) {}
        if (puntaje >= 90) {
            calificacion = 'A';
        } else if (puntaje >= 80) {
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

