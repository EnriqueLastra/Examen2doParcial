public class Responsable extends Persona {
    Persona persona;

    public Responsable(String nombre, String primerA, String segundoA, Double CI, Persona persona) {
        super(nombre, primerA, segundoA, CI);
        this.persona = persona;
    }
}
