public class Pedido {

    private double monto;

    public Pedido(double monto) {
        this.monto = monto;
    }

    public String pagar() {

        CajaDelTurno caja = CajaDelTurno.obtenerInstancia();

        return caja.registrarVenta(monto);
    }
}