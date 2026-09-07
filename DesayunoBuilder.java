public class DesayunoBuilder {

    private Desayuno desayuno;

    public DesayunoBuilder() {
        desayuno = new Desayuno();
    }

    public DesayunoBuilder limpiarOrden() {
        desayuno = new Desayuno();
        return this;
    }

    public DesayunoBuilder agregarProteina(String proteina) {
        desayuno.setProteina(proteina);
        return this;
    }

    public DesayunoBuilder agregarAcompañante(String acompañante) {
        desayuno.setAcompañante(acompañante);
        return this;
    }

    public DesayunoBuilder agregarBebida(String bebida) {
        desayuno.setBebida(bebida);
        return this;
    }

    public DesayunoBuilder agregarExtras(String extra) {
        desayuno.agregarExtra(extra);
        return this;
    }

    public Desayuno construir() {
        return desayuno;
    }
}