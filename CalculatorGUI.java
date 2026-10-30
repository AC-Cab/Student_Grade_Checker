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
JTextField txtNum1 = new JTextField(15);
JLabel lblNum2 = new JLabel("Enter #2");
JTextField txtNum2 = new JTextField(15);
//Jumangpang
JButton BtnResult = new JButton("Show Result");
JButton BtnClear = new JButton("Clear");
//Egas
BtnClear.setBounds(170, 140, 120, 30);

frame.add(lblNum1);
frame.add(txtNum1);
frame.add(lblNum2);
frame.add(txtNum2) ;
frame.add(BtnResult);
frame.add(BtnClear);



frame.setVisible(true);
}
}

