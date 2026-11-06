public abstract class Personaje implements Combatiente {

    protected String nombre;
    protected int puntosDeVida;

    protected final int VIDA_INICIAL = 100;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = VIDA_INICIAL;
    }

    @Override
    public void recibirDano(int dano) {

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    @Override
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    @Override
    public abstract void atacar(Combatiente oponente);
}