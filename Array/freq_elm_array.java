package Array;
import java.util.*;
public class freq_elm_array {
    public static void freq_count(int []arr,int n) {
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+":"+count);
        }   
    }
    public static void print_freq(int nums[]) {
        int freq=1,i=1;
        while(i<nums.length){
            while(i<nums.length && nums[i]==nums[i-1]){
                freq++;
                i++;
            }
            System.out.println(nums[i-1]+":"+freq);// for sorted array
            i++;
            freq=1;
        }
        if(nums.length==1 || nums[i-1]!=nums[i-2]){
            System.out.println(nums[nums.length-1]+" "+1);
        }
    }
    public static void main(String args[]) {
        int arr[]=new int[]{10,20,20,10,10,20,5,20};
        int n=arr.length;
        freq_count(arr,n);
        System.out.println();
        int nums[]=new int[]{40,50,50,50};
        print_freq(nums);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;i<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
            if(count==2){
                System.out.println(arr[i]);
            }
            if(count==3){
                System.out.println(arr[i]);
            }
        }
    }
}
