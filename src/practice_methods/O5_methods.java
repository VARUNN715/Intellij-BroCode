package practice_methods;

import java.util.Scanner;

public class O5_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println(count_words(str));
    }

    static int count_words(String str){
        int count = 0;
        if (!(" ".equals(str.substring(0,1))) || !(" ".equals(str.substring(str.length()-1)))){
            for (int i=0; i<str.length();i++){
                if (str.charAt(i) == ' '){
                    count++;
                }
            }
            count +=1;
        }
        return count;
    }
}
