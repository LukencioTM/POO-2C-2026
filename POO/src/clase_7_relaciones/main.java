package clase_7_relaciones;

public class main {
    public static void main(String[] args) {
        antena ant = new antena();
        submarino sub = new submarino(ant);
        bomba b = new bomba();

        System.out.println(sub.getHp());
        b.explotarSobre(sub);
        System.out.println(sub.getHp());
    }
}
