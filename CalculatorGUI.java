
import javax.swing.*;

public class CalculatorGUI {
    // Homillada

    public static void main(String[] args) {

    JFrame f = new JFrame("Calculator");
   //Jumangpang
    JButton btnResult = new JButton("Show Result");


f.setSize(300, 400);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
//Cabusas
      JLabel label = new JLabel("Calculator");
             label.setBounds(20, 5, 245, 25);
    f.add(label);

    JTextField display = new JTextField();

display.setBounds(20, 35, 245, 40);

f.add(display);
