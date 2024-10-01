import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        ArrayList<Integer> fib = new ArrayList<Integer>();
        for (int i=0; i<input; i++){
            fib.add(fibonacci(i));
        }
        JOptionPane.showMessageDialog(null,"The fibonacci Series is: "+fib);

    }

    static int fibonacci(int n){
        if ( n== 0){
            return 0;
        } else if ( n==1 ) {
            return 1;
        }
        else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }


}
