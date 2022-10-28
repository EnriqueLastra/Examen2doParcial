public class JefeDeArea extends Persona{
    Persona perosna;

    public JefeDeArea(String nombre, String primerA, String segundoA, Double CI, Persona perosna) {
        super(nombre, primerA, segundoA, CI);
        this.perosna = perosna;
    }
}
