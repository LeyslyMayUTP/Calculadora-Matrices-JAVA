import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.List;

public class ventanaDesarrollo extends JFrame {
    public ventanaDesarrollo(List<String> pasosDesarrollo) {
        super("Desarrollo del Procedimiento");

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // Esto evita que el usuario pueda editar el texto

        // Agrega cada paso del desarrollo al JTextArea
        for (String paso : pasosDesarrollo) {
            textArea.append(paso + "\n"); // Agrega cada paso en una nueva línea
        }

        add(textArea);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
