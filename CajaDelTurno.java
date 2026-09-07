public class CajaDelTurno {

    private static CajaDelTurno instancia;

    private double totalVentas;
    private int consecutivoRecibos;

    private CajaDelTurno() {
        totalVentas = 0;
        consecutivoRecibos = 0;
    }

    public static CajaDelTurno obtenerInstancia() {

        if (instancia == null) {
            instancia = new CajaDelTurno();
        }

        return instancia;
    }

    public String registrarVenta(double monto) {

        totalVentas += monto;
        consecutivoRecibos++;

        return "Venta registrada: $" + monto +
               "\nRecibo #" + consecutivoRecibos;
    }

    public String cerrarCaja() {

        return "Cierre de Caja" +
               "\nTotal de ventas: $" + totalVentas +
               "\nRecibos generados: " + consecutivoRecibos;
    }
}