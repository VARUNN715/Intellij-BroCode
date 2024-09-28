import javax.swing.JOptionPane;

import java.util.Scanner;

import static java.lang.System.exit;

public class Switches {
    public static void main(String[] args) {
        // if there are many if else ladder we can use switch statement
        Scanner sc = new Scanner(System.in);
        while(true) {
            String day;
            day = JOptionPane.showInputDialog("Enter a day in week: ");

            switch (day) {
                case "Sunday":
                    System.out.println("Is is Sunday");
                    JOptionPane.showMessageDialog(null, " Is is Sunday ");
                    break;
                case "Monday":
                    System.out.println("it is monday");
                    JOptionPane.showMessageDialog(null, " Is is Monday ");
                    break;
                case "Tuesday":
                    System.out.println("it is Tuesday");
                    JOptionPane.showMessageDialog(null, " Is is Tuesday ");
                    break;
                case "Wednesday":
                    System.out.println("it is Wednesday");
                    JOptionPane.showMessageDialog(null, " Is is Wednesday ");
                    break;
                case "Thrusday":
                    System.out.println("it is thrusday");
                    JOptionPane.showMessageDialog(null, " Is is Thrusday ");
                    break;
                case "Friday":
                    System.out.println("it is Friday");
                    JOptionPane.showMessageDialog(null, " Is is Friday ");
                    break;
                case "Satuarday":
                    System.out.println("It is satuarday");
                    JOptionPane.showMessageDialog(null, " Is is Satuarday ");
                    break;
                default: exit(0);
            }
        }
    }
}
