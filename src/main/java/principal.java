
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 9 "));

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "zero");
        } else {
            if (numero == 1) {
                JOptionPane.showMessageDialog(null, "um");
            } else {
                if (numero == 2) {
                    JOptionPane.showMessageDialog(null, "dois");
                } else {
                    if (numero == 3) {
                        JOptionPane.showMessageDialog(null, "tres");
                    } else {
                        if (numero == 4) {
                            JOptionPane.showMessageDialog(null, "quatro");
                        } else if (numero == 5) {
                            JOptionPane.showMessageDialog(null, "cinco");
                        } else if (numero == 6) {
                            JOptionPane.showMessageDialog(null, "seis");
                        } else if (numero == 7) {
                            JOptionPane.showMessageDialog(null, "sete");
                        } else if (numero == 8) {
                            JOptionPane.showMessageDialog(null, "oito");
                        } else if (numero == 9) {
                            JOptionPane.showMessageDialog(null, "nove");
                        }
                    }
                }
            }
        }
    }
}
