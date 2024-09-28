import java.util.ArrayList;

public class Two_D_array_List {
    public static void main(String[] args) {
        // 2 - dimensional array-list

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("pie");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomato");
        produceList.add("cheese");
        produceList.add("cream");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList.get(2).get(0));
    }
}
