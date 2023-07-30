public class best_time_to_buy_sell_stocks{
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,pro=0;
        for(int i:prices)
        {
            if(i<min)
                min=i;
            pro=(int)Math.max(pro,i-min);
        }
        return pro;
    }
    public static void main(String args[]){
        int arr[]={12,1,8,3,7};
        System.out.println(maxProfit(arr));
    }
}

