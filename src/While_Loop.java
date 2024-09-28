import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        // while loop = executes a block of code until the condition is true

        Scanner sc = new Scanner(System.in);
        String name ="";
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello "+name);
    }
}
