package clase_6_Clases.encapsulamiento;

import clase_6_Clases.Persona;

public class main {
    public static void main(String[] args) {
        PersonaEncapsulada personita = new PersonaEncapsulada();
        System.out.println(personita.getEdad());
        personita.setEdad(45);
        System.out.println(personita.getEdad());
        personita.setEdad(103);
        System.out.println(personita.getEdad());
    }
}
