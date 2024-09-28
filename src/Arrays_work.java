import java.util.Scanner;

public class Arrays_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        int numbers[] = new int[3];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        String cars[] = new String[size];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = sc.nextLine();
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
