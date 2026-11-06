import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== JUEGO DE LUCHA =====");

        // Nombres de los jugadores.
        System.out.print("Nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        // Seleccion del primer personaje.
        System.out.println("\nSeleccione el personaje del jugador 1:");
        System.out.println("1. Guerrero");
        System.out.println("2. Ninja");

        int opcion1 = scanner.nextInt();

        // Seleccion del segundo personaje.
        System.out.println("\nSeleccione el personaje del jugador 2:");
        System.out.println("1. Guerrero");
        System.out.println("2. Ninja");

        int opcion2 = scanner.nextInt();

        // FACTORY METHOD: seleccionar las fabricas.
        CreadorPersonaje creador1;
        CreadorPersonaje creador2;

        if (opcion1 == 1) {

            creador1 = new CreadorGuerrero();

        } else {

            creador1 = new CreadorNinja();
        }

        if (opcion2 == 1) {

            creador2 = new CreadorGuerrero();

        } else {

            creador2 = new CreadorNinja();
        }

        // Crear los personajes mediante las fabricas.
        Combatiente jugador1 =
            creador1.crearPersonaje(nombre1);

        Combatiente jugador2 =
            creador2.crearPersonaje(nombre2);

        // DECORATOR: agregar habilidades especiales.
        System.out.println(
            "\nDesea agregar FUERZA EXTRA al jugador 1? (1=Si, 2=No)"
        );

        int habilidad1 = scanner.nextInt();

        if (habilidad1 == 1) {

            jugador1 = new FuerzaExtra(jugador1);
        }

        System.out.println(
            "\nDesea agregar FUERZA EXTRA al jugador 2? (1=Si, 2=No)"
        );

        int habilidad2 = scanner.nextInt();

        if (habilidad2 == 1) {

            jugador2 = new FuerzaExtra(jugador2);
        }

        // Iniciar el juego.
        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();

        scanner.close();
    }
}
