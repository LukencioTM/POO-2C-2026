package _2_clases.encapsulamiento;

public class main_encapsulamiento {
    public static void main(String[] args) {
        PersonaEncapsulada personita = new PersonaEncapsulada();
        System.out.println(personita.getEdad());
        personita.setEdad(45);
        System.out.println(personita.getEdad());
        personita.setEdad(103);
        System.out.println(personita.getEdad());
    }
}
