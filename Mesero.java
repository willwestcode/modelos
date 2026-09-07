public class Mesero {

    public Desayuno tomarPedido(DesayunoBuilder builder) {

        return builder.limpiarOrden()
                .agregarProteina("Huevos")
                .agregarAcompañante("Arepa")
                .agregarBebida("Café")
                .agregarExtras("Queso")
                .construir();
    }
}