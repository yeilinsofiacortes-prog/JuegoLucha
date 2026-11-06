public abstract class PersonajeDecorator implements Combatiente {

    protected Combatiente personaje;

    public PersonajeDecorator(Combatiente personaje) {

        this.personaje = personaje;
    }

    @Override
    public void atacar(Combatiente oponente) {

        personaje.atacar(oponente);
    }

    @Override
    public void recibirDano(int dano) {

        personaje.recibirDano(dano);
    }

    @Override
    public boolean estaVivo() {

        return personaje.estaVivo();
    }

    @Override
    public String getNombre() {

        return personaje.getNombre();
    }

    @Override
    public int getPuntosDeVida() {

        return personaje.getPuntosDeVida();
    }
}
