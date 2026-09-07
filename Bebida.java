public abstract class Bebida {

    protected String nombre;
    protected String tamaño;
    protected String tipoLeche;
    protected boolean conCanela;

    public Bebida(String nombre, String tamaño, String tipoLeche, boolean conCanela) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.tipoLeche = tipoLeche;
        this.conCanela = conCanela;
    }

    public abstract Bebida clonar();

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    public void setConCanela(boolean conCanela) {
        this.conCanela = conCanela;
    }

    @Override
    public String toString() {
        return "Bebida: " + nombre +
               "\nTamaño: " + tamaño +
               "\nTipo de leche: " + tipoLeche +
               "\nCon canela: " + (conCanela ? "Sí" : "No");
    }
}