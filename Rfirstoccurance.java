public class Rfirstoccurance {
    public static int firstoccurance(int arr[],int key,int i) {
        if(i== arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstoccurance(arr,key,i+1);
    }
    public static void main (String args[]) {
        int arr[]={1,5,6,98,4,5,7,6,9,4};
        System.out.println(firstoccurance(arr,5,0));
    }
}
