package clase_7_relaciones;

// Clase submarino con 100 de vida como atributo y sus getter y setter
public class submarino {
    private int hp = 100;
    private antena a;
    // COMPOSICION: Al crear la clase submarino, se crea ligada a el la clase motor
    // Si submarino se destruye, la clase motor tambien
    private motor m = new motor();

    // AGREGACION: Se crea la clase antena y posterior la clase submarino
    // la clase antena se lo pasa por parametro al crear el submarino
    // Si se destruye el submarino, la clase antena sigue existiendo y puede asignarse a un nuevo submarino
    public submarino(antena antenita) {
        this.a = antenita;
    }

    public void recibirDanio(int danio) {
        this.hp -= danio;
    }
    public int getHp() {
        return this.hp;
    }
}