public class Factorial {
    public static void main(String[] args) {
        System.out.println(factor(4));
    }

    static int factor(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n*factor(n-1);
        }
    }
}
