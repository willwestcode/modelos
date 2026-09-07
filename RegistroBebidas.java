public class RegistroBebidas {

    private Bebida capuchinoBase;
    private Bebida latteBase;

    public RegistroBebidas() {
        capuchinoBase = new Capuchino(
                "Capuchino",
                "Mediano",
                "Entera",
                false
        );

        latteBase = new Latte(
                "Latte",
                "Mediano",
                "Entera",
                false
        );
    }

    public Bebida obtenerBebida(String nombre) {

        if (nombre.equalsIgnoreCase("capuchino")) {
            return capuchinoBase.clonar();
        }

        if (nombre.equalsIgnoreCase("latte")) {
            return latteBase.clonar();
        }

        return null;
    }
}