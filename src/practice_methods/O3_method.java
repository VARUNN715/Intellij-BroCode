package practice_methods;

import javax.swing.*;
import java.util.Scanner;

public class O3_method {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a String: ");
        JOptionPane.showMessageDialog(null,"The middle of the string is: "+middle(str));

    }
    static String middle(String str){
        int position;
        int length;
        if (str.length() %2 == 0){
            position = str.length()/2 -1;
            length = 2;
        }
        else {
            position = str.length()/2;
            length = 1;
        }

        return str.substring(position, position + length);
    }
}
