import javax.swing.*; 
import java.awt.*;

public class CalculatorGUI{

public static void main(String[] args){
JFrame frame=new JFrame("Calculator"); frame.setSize (500,509);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout (FlowLayout .LEFT,20,10));
frame.setVisible(true);
}
}
