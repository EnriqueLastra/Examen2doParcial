import java.util.Date;

public class Producto2 extends Almacen{
    String Item;
    int cantidadSolicitada;
    Date FechaSolicitud;
    String AutorizacionDirectorFi;

    public Producto2(int cantidadIngresada, int numEntrada, Date fechaIngreso, Persona persona, Empresa empresa, String item, int cantidadSolicitada, Date fechaSolicitud, String autorizacionDirectorFi) {
        super(cantidadIngresada, numEntrada, fechaIngreso, persona, empresa);
        Item = item;
        this.cantidadSolicitada = cantidadSolicitada;
        FechaSolicitud = fechaSolicitud;
        AutorizacionDirectorFi = autorizacionDirectorFi;
    }
}
