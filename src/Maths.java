import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x;
        double y;
        double z;
        System.out.println("Enter side x: ");
        x = sc.nextDouble();

        System.out.println("Enter side y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The Hypotenuse is: " + z);
        sc.close();
    }
}

// this also includes several methods such as Math.max(), Math.min(), Math.abs(), Math.ceil(), math.round(), Math.floor()
// and many more
