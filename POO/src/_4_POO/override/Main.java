package _4_POO.override;

public class Main {
    public static void main(String[] args) {
        Submarino sub = new Submarino();
        Barco barquito = new Barco();
        Entidad ent = new Entidad();

        ent.mover();
        barquito.mover();
        sub.mover();
    }
}
