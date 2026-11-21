package _4_POO.override;

// Entidad maestra (padre)
public class Entidad {
    String name;
    int hp;

    // Las entidades pueden moverse
    public void mover() {
        System.out.println("Moviendo entidad");
    }

}
