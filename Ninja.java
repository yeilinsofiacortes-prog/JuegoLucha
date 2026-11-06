import java.util.Random;

public class Ninja extends Personaje {

    private Random random = new Random();

    public Ninja(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Combatiente oponente) {

        int dano = random.nextInt(16) + 10;

        oponente.recibirDano(dano);

        System.out.println(
            nombre + " (Ninja) realiza un ataque rapido a "
            + oponente.getNombre()
            + " causando " + dano + " puntos de dano."
        );
    }
}
