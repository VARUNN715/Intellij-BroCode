package OOP;

public class Car {
    String Make = "Tata";
    String Model = "nano";
    int year = 2003;
    String color = "Red";
    double price = 100000;

    void drive(){
        System.out.println("You are driving");
    }

    void brake(){
        System.out.println("You stepped on the brake");
    }

    public String toString(){
        String myString = Make+"\n"+Model+"\n"+color+"\n"+price;
        return myString;
    }
}
