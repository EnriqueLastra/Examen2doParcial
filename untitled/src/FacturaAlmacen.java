import java.util.Date;

public class FacturaAlmacen extends Almacen {
    Date Fecha;
    double ValorUni;
    double ValorTot;
    int Nit;
    int CantidadEntregada;
    int NumFactura;

    public FacturaAlmacen(int cantidadIngresada, int numEntrada, Date fechaIngreso, Persona persona, Empresa empresa, Date fecha, double valorUni, double valorTot, int nit, int cantidadEntregada, int numFactura) {
        super(cantidadIngresada, numEntrada, fechaIngreso, persona, empresa);
        Fecha = fecha;
        ValorUni = valorUni;
        ValorTot = valorTot;
        Nit = nit;
        CantidadEntregada = cantidadEntregada;
        NumFactura = numFactura;
    }
}
