import java.util.ArrayList;

public class For_Each {
    public static void main(String[] args) {

        //String[] animals = {"cat","dog","camel","cow"};
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("camel");
        animals.add("cow");
        for (String i : animals){
            System.out.println(i);
        }
    }
}
