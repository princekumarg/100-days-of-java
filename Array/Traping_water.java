package Array;
import java.util.*;
public class Traping_water {
    public static int water_conservation(int []arr) {
        int res=0;
        for(int i=1;i<arr.length;i++){
            int lmax=arr[i];
            for(int j=0;j<i;j++){
                lmax=Math.max(lmax,arr[j]);
            }
            int rmax=arr[i];
            for(int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            res=res+(Math.min(lmax,rmax)-arr[i]);
        }
        return res;
    }
    /*public static int water_level(int []arr,int n) {
        int res=0;
        int leftmax[n],rightmax[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n;i<=0;i++){//get some error
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            res=res+(Math.min(leftmax[i],rightmax[i])-arr[i]);
        }
        return res;
    }*/
    public static void main(String args[]) {
        int []arr={3,0,1,2,5};
        //int n=arr.length;
        System.out.println(water_conservation(arr));
        //System.out.println(water_level(arr,n));
    }
}
