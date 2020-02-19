package marcos;
import javax.swing.JOptionPane;
public class Marcos {
    public static void main(String[] args) {
        String op = JOptionPane.showInputDialog("Qual operação deseja escolher? 1-Multiplicação, 2-Subtração,3-Divisão, 4-Adição");
        int opera = Integer.parseInt(op);
        if (opera == 1) {
            String vm1 = JOptionPane.showInputDialog("Digite um valor:");
            String vm2 = JOptionPane.showInputDialog("Digite um valor:");
            int n1 = Integer.parseInt(vm1);
            int n2 = Integer.parseInt(vm2);
            int mult = n1 * n2;
            JOptionPane.showMessageDialog(null, "A multiplicção é:" + mult);
        } else if (opera == 2) {
            String vm1 = JOptionPane.showInputDialog("Digite um valor:");
            String vm2 = JOptionPane.showInputDialog("Digite um valor:");
            int n1 = Integer.parseInt(vm1);
            int n2 = Integer.parseInt(vm2);
            int mult = n1 - n2;
            JOptionPane.showMessageDialog(null, "A subtração é:" + mult);
        } else if (opera == 3) {
            String vm1 = JOptionPane.showInputDialog("Digite um valor:");
            String vm2 = JOptionPane.showInputDialog("Digite um valor:");
            int n1 = Integer.parseInt(vm1);
            int n2 = Integer.parseInt(vm2);
            int mult = n1 / n2;
            JOptionPane.showMessageDialog(null, "A divisão é:" + mult);
        } else if (opera == 4) {
            String vm1 = JOptionPane.showInputDialog("Digite um valor:");
            String vm2 = JOptionPane.showInputDialog("Digite um valor:");
            int n1 = Integer.parseInt(vm1);
            int n2 = Integer.parseInt(vm2);
            int mult = n1 + n2;
            JOptionPane.showMessageDialog(null, "A soma é:" + mult);
        }
    }
}
