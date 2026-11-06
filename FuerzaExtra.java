public class FuerzaExtra extends PersonajeDecorator {

    public FuerzaExtra(Combatiente personaje) {

        super(personaje);
    }

    @Override
    public void atacar(Combatiente oponente) {

        // Ejecutar el ataque normal.
        personaje.atacar(oponente);

        // Agregar 10 puntos de dano adicional.
        int danoExtra = 10;

        oponente.recibirDano(danoExtra);

        System.out.println(
            getNombre()
            + " activa FUERZA EXTRA y causa "
            + danoExtra
            + " puntos adicionales de dano."
        );
    }
}