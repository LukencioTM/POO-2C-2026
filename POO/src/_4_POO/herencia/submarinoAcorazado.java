package _4_POO.herencia;

public class submarinoAcorazado extends submarino {
    private int blindaje;

    public submarinoAcorazado(int x, int y, int vida, int blindaje) {
        super(x, y, vida);
        this.blindaje = blindaje;
    }
}
