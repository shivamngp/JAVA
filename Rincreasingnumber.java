public class Rincreasingnumber {
    public static void pd(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        pd(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n = 20;
        pd(n);
    }
}
