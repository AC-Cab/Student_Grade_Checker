
import javax.swing.*;

public class CalculatorGUI{
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");
        f.setSize(300, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField display = new JTextField();
        display.setBounds(20, 20, 245, 40);
        f.add(display);

        String[] buttons = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "C","0","=","+"
        };

        for (int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttons[i]);
            b.setBounds(20 + (i % 4) * 62,
                        80 + (i / 4) * 55, 55, 45);
            f.add(b);
        }

        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}


