import java.util.Date;

public class FacturaCompras extends Producto{
    Date fecha;
    double ValorUni;
    double ValorTot;
    int Nit;
    int CantidadEntregada;
    int NumFactura;

    public FacturaCompras(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto, String item, int cantidad, Date fechaSolicitud, String autorizacionDirectorFi, int unidadMedida, Empresa empresa, FacturaCompras facturaCompras, Date fecha, double valorUni, double valorTot, int nit, int cantidadEntregada, int numFactura) {
        super(autorizacionJefeA, numeroSolicitud, centroCostos, presupuesto, numOrden, persona, codigoProducto, producto, item, cantidad, fechaSolicitud, autorizacionDirectorFi, unidadMedida, empresa, facturaCompras);
        this.fecha = fecha;
        ValorUni = valorUni;
        ValorTot = valorTot;
        Nit = nit;
        CantidadEntregada = cantidadEntregada;
        NumFactura = numFactura;
    }

    public FacturaCompras(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto, Date fecha, double valorUni, double valorTot, int nit, int cantidadEntregada, int numFactura) {
        super(autorizacionJefeA, numeroSolicitud, centroCostos, presupuesto, numOrden, persona, codigoProducto, producto);
        this.fecha = fecha;
        ValorUni = valorUni;
        ValorTot = valorTot;
        Nit = nit;
        CantidadEntregada = cantidadEntregada;
        NumFactura = numFactura;
    }

    public FacturaCompras(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto, String item, int cantidad, Date fechaSolicitud, String autorizacionDirectorFi, int unidadMedida, Empresa empresa, FacturaCompras facturaCompras) {
        super(autorizacionJefeA, numeroSolicitud, centroCostos, presupuesto, numOrden, persona, codigoProducto, producto, item, cantidad, fechaSolicitud, autorizacionDirectorFi, unidadMedida, empresa, facturaCompras);
    }

    public FacturaCompras(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto) {
        super(autorizacionJefeA, numeroSolicitud, centroCostos, presupuesto, numOrden, persona, codigoProducto, producto);
    }
}
