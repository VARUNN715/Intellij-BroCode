package OOP;

public class body {
    public static void main(String[] args) {
        Human human1 = new Human("Varun",21,55);
        Human human2 = new Human("Tarun",21,65);
        System.out.println(human1.name);
        System.out.println();
        System.out.println(human2.name);

        human2.eat();
        human1.drink();


        human1.eat();
    }
}
