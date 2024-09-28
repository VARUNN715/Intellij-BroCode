package practice_methods;

public class O2_method {
    public static void main(String[] args) {
        avg_of_three(25,45 ,65);
    }
    static void avg_of_three(int a, int b, int c){
        double avg = (double) (a+b+c)/3;
        System.out.println("Average of 3 numbers is: "+avg);
    }
}
