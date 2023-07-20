public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5; // Change this to the desired number for which you want to find the factorial
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}