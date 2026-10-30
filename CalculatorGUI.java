
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

//Jumangpang

String[] buttons = {
    "7", "8", "9", "/",
    "4", "5", "6", "*",
    "1", "2", "3", "-",
    "0", ".", "=", "+"
};

for (int i = 0; i < buttons.length; i++) {

    JButton b = new JButton(buttons[i]);

    b.setBounds(
        20 + (i % 4) * 62,
        90 + (i / 4) * 55,
        55, 45
    );

    f.add(b);

    b.addActionListener(e -> {
        display.setText(
            display.getText() + b.getText()
        );
    });
}