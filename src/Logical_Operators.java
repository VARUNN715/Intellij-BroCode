import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
//        // Logical operators used to connect 2 or more expressions
//
//        //     &&  = (AND both the conditions must be true
//        //     ||  = (OR) any one condition must be true
//        //      !  = (Not) reverses the boolean value of a condition
//        Scanner sc =new Scanner(System.in);
//        int temp = sc.nextInt();
//        if (temp>30){
//            System.out.println("it is hot!!");
//        }else if (temp >=20 && temp <= 30){
//            System.out.println("Warm");
//        }else {
//            System.out.println("It is cold outside");
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = sc.next();
        if (!response.equals("q") && !response.equals("Q")){

            System.out.println("You are still playing the game");
        }else {
            System.out.println("You quit the game");
        }
    }
}
