package SortingAlgo;
import java.util.*;
public class Metting_max_guest {
    public static int MaxGuest(int arr[],int dep[],int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String args[]) {
        int arr[]={900,600,700};
        int dep[]={1000,800,730};
        System.out.println(MaxGuest(arr,dep,3));
    }
}
