public class tut3 {
    public static void pattern(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("*");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("* ");
    }
    System.out.println();
}
public static void main(String []args) {
    int arr[]=new int[5];
    pattern(arr);
}
}