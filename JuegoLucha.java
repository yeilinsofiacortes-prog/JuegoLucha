public class JuegoLucha {

    private Combatiente jugador1;
    private Combatiente jugador2;

    public JuegoLucha(Combatiente jugador1, Combatiente jugador2) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {

        System.out.println(
            "\nLa pelea comienza entre "
            + jugador1.getNombre()
            + " y "
            + jugador2.getNombre()
            + "..."
        );

        while (jugador1.estaVivo() && jugador2.estaVivo()) {

            turno(jugador1, jugador2);

            if (jugador2.estaVivo()) {

                turno(jugador2, jugador1);
            }
        }

        // Determinar el ganador.
        if (jugador1.estaVivo()) {

            System.out.println(
                "\n" + jugador1.getNombre()
                + " ha ganado la pelea."
            );

        } else {

            System.out.println(
                "\n" + jugador2.getNombre()
                + " ha ganado la pelea."
            );
        }
    }

    private void turno(
        Combatiente atacante,
        Combatiente defensor
    ) {

        System.out.println(
            "\nTurno de " + atacante.getNombre()
            + ". Puntos de vida de "
            + defensor.getNombre()
            + ": " + defensor.getPuntosDeVida()
        );

        atacante.atacar(defensor);

        System.out.println(
            defensor.getNombre()
            + " ahora tiene "
            + defensor.getPuntosDeVida()
            + " puntos de vida."
        );
    }
}