public class Recursion_ {

//    public static int SUM(int arr[], int index) {
//        // Base case: If the index is out of bounds, return 0
//        if (index >= arr.length) {
//            return 0;
//        }
//
//        // Add the current element to the sum
//        int sum = arr[index];
//
//        // Recursively compute the sum for the remaining elements
//        sum += SUM(arr, index + 1);
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40};
//        System.out.println(SUM(arr, 0));
//    }
    public static int factorial(int n){
        if (n == 0 || n==1){
            return 1;
        }
        else {
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
}
