public class Main {

    public static void main(String[] args) {

        Salida salida = new Salida();

        salida.mostrar("BEBIDA");

        RegistroBebidas registro = new RegistroBebidas();

        Bebida bebida = registro.obtenerBebida("capuchino");

        bebida.setTamaño("Grande");
        bebida.setTipoLeche("Deslactosada");
        bebida.setConCanela(true);

        salida.mostrar(bebida.toString());


        // ==========================
        // BUILDER
        // ==========================

        salida.mostrar("\nDesayuno Builder");

        DesayunoBuilder builder = new DesayunoBuilder();

        Mesero mesero = new Mesero();

        Desayuno desayuno = mesero.tomarPedido(builder);

        salida.mostrar(desayuno.toString());

        salida.mostrar("\nPedido Singleton");

        Pedido pedido1 = new Pedido(15000);
        Pedido pedido2 = new Pedido(20000);

        salida.mostrar(pedido1.pagar());
        salida.mostrar(pedido2.pagar());

        CajaDelTurno caja = CajaDelTurno.obtenerInstancia();

        salida.mostrar(caja.cerrarCaja());

        ejecutarGrafica();
    }

    public static void ejecutarGrafica() {

    SalidaGrafica salida = new SalidaGrafica();

    RegistroBebidas registro = new RegistroBebidas();

    Bebida bebida = registro.obtenerBebida("capuchino");

    bebida.setTamaño("Grande");
    bebida.setTipoLeche("Deslactosada");
    bebida.setConCanela(true);

    salida.mostrarTitulo("BebidaPrototype", bebida.toString());


    DesayunoBuilder builder = new DesayunoBuilder();

    Mesero mesero = new Mesero();

    Desayuno desayuno = mesero.tomarPedido(builder);

    salida.mostrarTitulo("DesayunoBuilder", desayuno.toString());


    Pedido pedido1 = new Pedido(15000);
    Pedido pedido2 = new Pedido(20000);

    String pago1 = pedido1.pagar();
    String pago2 = pedido2.pagar();

    CajaDelTurno caja = CajaDelTurno.obtenerInstancia();

    salida.mostrarTitulo(
        "PedidoSingleton",
        pago1 + "\n" +
        pago2 + "\n\n" +
        caja.cerrarCaja()
    );
}
}