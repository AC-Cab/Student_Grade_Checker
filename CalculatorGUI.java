//Homillada
import javax.swing.*; 
import java.awt.*;

public class CalculatorGUI{

public static void main(String[] args){
JFrame frame=new JFrame("Calculator"); frame.setSize (500,509);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout (FlowLayout .LEFT,20,10));
//Cabusas
JLabel lblNum1 = new JLabel("Enter #1 ");
JTextField txtNuml = new JTextField(15);
JLabel IblNum2 = new JLabel("Enter #2");
JTextField txtNum2 = new JTextField(15);
//Jumangpang
JButton gtnResult = new JButton("Show Result");
JButton gtnClear = new JButton("Clear");



frame.setVisible(true);
}
}

