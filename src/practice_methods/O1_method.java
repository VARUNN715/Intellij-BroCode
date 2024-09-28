package practice_methods;

public class O1_method {
    public static void main(String[] args) {
        smallest_among_three(10,100,30);
    }
    static void smallest_among_three(int a, int b, int c){
        if (a<b){
            if (a<c){
                System.out.println("Smallest is: "+a);
            }
            else {
                System.out.println("Smallest is: "+c);
            }
        }
        else {
            if (b<c){
                System.out.println("Smallest is: "+b);
            }
            else {
                System.out.println("Smaallest is: "+c);
            }
        }
    }
}
