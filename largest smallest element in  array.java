import java.util.*;
public class largestsmallestelementinarray {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(Largest<number[i]){
                Largest=number[i]
            }
        }
        return Largest;
    }
    public static void main(String args[]){
        int number[]={5,8,9,4,,6,3,7,5};
        System.out.println("largest value is : " +getLargest(number));
    }
}
