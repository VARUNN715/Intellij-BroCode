import javax.swing.JOptionPane;

import static java.lang.System.exit;

public class Project {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,name);

        while (name != null){
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2: "));
            double result = 0;
            String operator = JOptionPane.showInputDialog("Enter the operator: ");
            switch (operator){
                case "+":
                    result = num1+num2;
                    JOptionPane.showMessageDialog(null,"Addition is: "+result);
                    break;
                case "-":
                    result = num1-num2;
                    JOptionPane.showMessageDialog(null,"Subtraction is: "+result);
                    break;
                case "*":
                    result = num1*num2;
                    JOptionPane.showMessageDialog(null,"Multiplication is: "+result);
                    break;
                case "/":
                    result = num1/num2;
                    JOptionPane.showMessageDialog(null,"Division is: "+result);
                    break;
                case "%":
                    result = num1%num2;
                    JOptionPane.showMessageDialog(null,"Remainder is: "+result);
                default:
                    exit(0);
                    break;

            }
        }
    }
}
