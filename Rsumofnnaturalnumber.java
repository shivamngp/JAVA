public class Rsumofnnaturalnumber {
 public static int sumOfN(int n) {
        if (n <= 0) {
            return 0; 
        } else {
            return n + sumOfN(n - 1); 
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        int sum = sumOfN(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}