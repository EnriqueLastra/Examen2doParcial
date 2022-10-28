public class DirectorFi extends Persona {
    Persona persona;

    public DirectorFi(String nombre, String primerA, String segundoA, Double CI, Persona persona) {
        super(nombre, primerA, segundoA, CI);
        this.persona = persona;
    }
}
