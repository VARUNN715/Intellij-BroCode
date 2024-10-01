public class Over_Load {
    public static void main(String[] args) {

        int x = add(10,20,30,40);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("this is overloaded method 1");
        return a+b;
    }
    static int add(int a, int b,int c){
        System.out.println("this is overloaded method 2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("this is overloaded method 3");
        return a+b+c+d;
    }

}
