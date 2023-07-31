public class Rlastoccurance {
    public static int lastoccurance(int arr[],int key,int i) {
        if(i== arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return lastoccurance(arr,key,i+1);
    }
    public static void main (String args[]) {
        int arr[]={1,5,6,98,4,5,7,6,9,4};
        System.out.println(lastoccurance(arr,5,0));
    }
}
