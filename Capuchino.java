public class Capuchino extends Bebida {

    public Capuchino(String nombre, String tamaño, String tipoLeche, boolean conCanela) {
        super(nombre, tamaño, tipoLeche, conCanela);
    }

    @Override
    public Bebida clonar() {
        return new Capuchino(nombre, tamaño, tipoLeche, conCanela);
    }
}