import java.util.*;
 
public class MultiplicationTableTrianglePattern {
 
    // Function to print tables in triangular form
 
    public static void main(String args[])
    {
        int rows, i, j;
 
        Scanner in = new Scanner(System.in);
 
        rows = 6;
 
        // Loop to print multiplication
        // table in triangular form
 
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}