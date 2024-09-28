import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello"+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age: "));

        JOptionPane.showMessageDialog(null,"You are "+age+" Years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height? "));

        JOptionPane.showMessageDialog(null,"Your height is "+height);

        String college = JOptionPane.showInputDialog("Enter your college name? ");
        JOptionPane.showMessageDialog(null,"We are atonomus "+college);


        float salary = Float.parseFloat(JOptionPane.showInputDialog("Enter your salary "));

        JOptionPane.showMessageDialog(null,"Your salary is: "+salary);



    }
}
