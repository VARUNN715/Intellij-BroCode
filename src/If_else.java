import java.util.Scanner;
import javax.swing.JOptionPane;
public class If_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        if (age>=18 && age <75){
            System.out.println("You are old enough");
            JOptionPane.showMessageDialog(null,"You are an adult");
        } else if (age >=75) {
            System.out.println("You have crossed 75");
            JOptionPane.showMessageDialog(null ,"Boomer");
        } else {
            System.out.println("you are not old enough");
            JOptionPane.showMessageDialog(null,"You are not an adult");
        }
        sc.close();

    }
}
