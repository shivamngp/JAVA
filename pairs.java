import java.util.*;
public class pairs {
    public static void pp(int numbers[]) {
        int tp=0;
        for (int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for (int j=i+1;j<numbers.length;j++) {
               System.out.print("("+curr + "," +numbers[j] + " )"); 
                tp++;
            }
            System.out.println();
        }
        System.out.println("total no of pairs = " +tp);
    }
    public static void main(String args[]){
        int numbers[]={1,5,6,7,9,5};
        pp(numbers);

    }
}
