import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name? ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);

        System.out.println("How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("You are "+age+" years old");

        System.out.println("What is your favourite food? ");
        String food = sc.nextLine();
        System.out.println("OK your "+food+" is great");
    }

}
