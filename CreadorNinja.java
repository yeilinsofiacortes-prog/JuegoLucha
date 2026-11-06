public class CreadorNinja extends CreadorPersonaje {

    @Override
    public Personaje crearPersonaje(String nombre) {

        return new Ninja(nombre);
    }
}