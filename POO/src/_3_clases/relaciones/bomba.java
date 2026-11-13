package _3_clases.relaciones;

// Clase bomba con danio como atributo y un metodo para hacer daño sobre otra clase que lo permita
public class bomba {
    private int danio = 25;

    // Metodo para hacer danio a clases que lo permitan
    // ASOCIACION: Se obtiene por parametro una clase compatible para utilizar su metodo y enviar el danio
    public void explotarSobre(submarino sub) {
        sub.recibirDanio(danio);
        System.out.println("Bomba explotada!");
    }
}
