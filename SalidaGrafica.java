import javax.swing.JOptionPane;

public class SalidaGrafica {

    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarTitulo(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}