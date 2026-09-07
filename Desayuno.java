import java.util.ArrayList;
import java.util.List;

public class Desayuno {

    private String proteina;
    private String acompañante;
    private String bebida;
    private List<String> extras;

    public Desayuno() {
        extras = new ArrayList<>();
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public void setAcompañante(String acompañante) {
        this.acompañante = acompañante;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void agregarExtra(String extra) {
        extras.add(extra);
    }

    @Override
    public String toString() {
        return "Proteína: " + proteina +
               "\nAcompañante: " + acompañante +
               "\nBebida: " + bebida +
               "\nExtras: " + extras;
    }
}