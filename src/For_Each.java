import java.util.ArrayList;
import java.util.Scanner;

public class For_Each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] animals = {"cat","dog","camel","cow"};
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("camel");
//        animals.add("cow");
//        for (String i : animals){
//            System.out.println(i);
//        }
        int size;

        System.out.println("enter the size: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array items: ");
        for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
        }

        System.out.println("The array items are: ");

        for (int i : arr){
            System.out.println(i);
        }

    }
}
