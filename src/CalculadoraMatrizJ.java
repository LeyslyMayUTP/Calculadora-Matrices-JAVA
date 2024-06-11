import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CalculadoraMatrizJ {

    public static void main(String[] args) {

        String ax = System.getProperty("os.name");

        if(ax.equals("Windows 10") || ax.equals("Windows")){
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                interfazMatriz1 objClasInteMat = new interfazMatriz1();
                // TODO code application logic here
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
