public class Hello_method {
    public static void main(String[] args) {
//        hello("Bro");
//        add(10,20);
//        mul(10,20);

        System.out.println(count_variable("varun"));

    }

//    static void hello(String str){
//        System.out.println("Hello "+ str);
//    }
//
//    static void add(int a, int b){
//        int sum = 0;
//        sum = a + b;
//
//        System.out.println(sum);
//    }
//
//    static void mul(int a, int b){
//        int mult = a * b;
//        System.out.println(mult);
//    }
//
    static int count_variable(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }

        }
        return factorial(str.length()-count);
    }

    static int factorial(int n){
        if (n == 0 || n ==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

}
