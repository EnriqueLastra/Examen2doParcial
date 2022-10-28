public class Compras {
    String AutorizacionJefeA;
    int NumeroSolicitud;
    String CentroCostos;
    Double Presupuesto;
    int NumOrden;
    Persona persona;
    int CodigoProducto;
    Producto producto;

    public Compras(String autorizacionJefeA, int numeroSolicitud, String centroCostos, Double presupuesto, int numOrden, Persona persona, int codigoProducto, Producto producto) {
        AutorizacionJefeA = autorizacionJefeA;
        NumeroSolicitud = numeroSolicitud;
        CentroCostos = centroCostos;
        Presupuesto = presupuesto;
        NumOrden = numOrden;
        this.persona = persona;
        CodigoProducto = codigoProducto;
    }
}
