import java.util.*;
public class bitmanipulationoddoreven {
    public static void oddeven (int n){
        int bitmask = 1;
        if ((n & bitmask) ==0) {
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
       oddeven(5);
       oddeven(11);
       oddeven(6);
       oddeven(8);
       oddeven(16);
    }
}
