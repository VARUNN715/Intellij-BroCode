import java.util.Scanner;

public class Nested_Loops {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(" "+ (i+=2));                  // this is nested for loop = loop inside a loop
//            }
//            System.out.println();
//        }
        int rows = 4,columns = 5;

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++){
                System.out.print("*");
            }
        }
    }
}
