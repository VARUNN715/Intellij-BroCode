package OOP;

public class Food_demo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        char[] character = new char[4];
        String[] mystring = new String[3];

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("This is Pizza");
        Food food2 = new Food("HamBurger");
        Food food3 = new Food("pasta");


        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
