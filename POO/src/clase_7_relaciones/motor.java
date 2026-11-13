package clase_7_relaciones;

public class motor {
    private int velocidad = 0;

    public void avanzar() {
        this.velocidad += 1;
    }

    public void retroceder() {
        this.velocidad -= 1;
    }
}
