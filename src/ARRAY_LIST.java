import java.util.ArrayList;

public class ARRAY_LIST {
    public static void main(String[] args) {
        // Array list = resizable array
        // Elements can be added and removed after compilation phase
        // store reference data types


        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Ham Burger");
        food.add("Roti");


        food.set(1,"pasta");
        food.remove(0);
        food.clear();
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
