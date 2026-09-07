public class Latte extends Bebida {

    public Latte(String nombre, String tamaño, String tipoLeche, boolean conCanela) {
        super(nombre, tamaño, tipoLeche, conCanela);
    }

    @Override
    public Bebida clonar() {
        return new Latte(nombre, tamaño, tipoLeche, conCanela);
    }
}