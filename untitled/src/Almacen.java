import java.util.Date;

public class Almacen {
    int CantidadIngresada;
    int NumEntrada;
    Date FechaIngreso;
    Persona persona;
    Empresa empresa;

    public Almacen(int cantidadIngresada, int numEntrada, Date fechaIngreso, Persona persona, Empresa empresa) {
        CantidadIngresada = cantidadIngresada;
        NumEntrada = numEntrada;
        FechaIngreso = fechaIngreso;
        this.persona = persona;
        this.empresa = empresa;
    }
}
