import java.util.Random;

public class Guerrero extends Personaje {

    private Random random = new Random();

    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Combatiente oponente) {

        int dano = random.nextInt(21) + 20;

        oponente.recibirDano(dano);

        System.out.println(
            nombre + " (Guerrero) ataca con fuerza a "
            + oponente.getNombre()
            + " causando " + dano + " puntos de dano."
        );
    }
}
