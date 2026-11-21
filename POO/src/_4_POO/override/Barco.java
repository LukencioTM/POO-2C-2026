package _4_POO.override;

public class Barco extends Entidad {

    // El movimiento de la entidad hija es diferente
    // Lo reemplaza con uno suyo mas apropiado
    @Override
    public void mover() {
        System.out.println("Este barco esta navegando los mares...");
    }
}
