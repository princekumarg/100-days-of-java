package Array;
import java.util.*;
public class stock_buy_sell {
    public static int maxprofitstock(int []arr,int start,int end) {
        int profit=0;
        if(end<=start){
            return 0;
        }
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int curr_profit=arr[j]-arr[i]+maxprofitstock(arr,start,i-1)+maxprofitstock(arr,j+1,end);
                    profit=Math.max(profit,curr_profit);
                }
            }
        }
        return profit;
    }
    public static int maxprofitstock1(int []arr) {
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit=profit+(arr[i]-arr[i-1]);
            }
        }
        return profit;
    }
    public static void main(String args[]) {
        int []arr={1,5,3,8,12};
        System.out.println(maxprofitstock(arr, 0, 4));
        System.out.println(maxprofitstock1(arr));
    }
}
