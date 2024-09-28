package practice_methods;

import javax.swing.*;

public class O4_methods {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a String: ");

        JOptionPane.showMessageDialog(null,+count_vowels(str));

    }

    static int count_vowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' ||str.charAt(i) =='u'){
                count ++;
            }
        }

        int a = str.length()-count;

       return factorial(a);
    }
    static int factorial(int n){
        if (n ==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
