
public interface Combatiente {

    void atacar(Combatiente oponente);

    void recibirDano(int dano);

    boolean estaVivo();

    String getNombre();

    int getPuntosDeVida();
}


