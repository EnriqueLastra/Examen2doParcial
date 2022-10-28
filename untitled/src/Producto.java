import java.util.Date;

public class Producto extends Compras{
    String item;
    int Cantidad;
    Date FechaSolicitud;
    String AutorizacionDirectorFi;
    int UnidadMedida;
    Empresa empresa;
    FacturaCompras facturaCompras;

    public Producto(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto, String item, int cantidad, Date fechaSolicitud, String autorizacionDirectorFi, int unidadMedida, Empresa empresa, FacturaCompras facturaCompras) {
        super(autorizacionJefeA, numeroSolicitud, centroCostos, presupuesto, numOrden, persona, codigoProducto, producto);
        this.item = item;
        Cantidad = cantidad;
        FechaSolicitud = fechaSolicitud;
        AutorizacionDirectorFi = autorizacionDirectorFi;
        UnidadMedida = unidadMedida;
        this.empresa = empresa;
        this.facturaCompras = facturaCompras;
    }

    public Producto(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto) {
        super(autorizacionJefeA, numeroSolicitud, centroCostos, presupuesto, numOrden, persona, codigoProducto, producto);
    }
}
