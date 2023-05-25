package SortingAlgo;
import java.util.*;
public class unionOfTwoArray {
    public static void union(int arr1[],int arr2[]) {
        int arr3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+1]=arr2[i];
        }
        Arrays.sort(arr3);
        for(int i=0;i<arr1.length+arr2.length;i++){
            if(i==0 || arr3[i]!=arr3[i-1]){
                System.out.println(arr3[i]+" ");
            }
        }
    }
    public static int union1(int arr1[],int arr2[]) {
        int m=arr1.length,n=arr2.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr2[i]==arr2[i-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i++]+" ");
            }
            else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j++]+" ");
            }
            else{
                System.out.println(arr1[j++]+" ");
                i++;
            }
        }
        while(i<m){
            if(i>0 && arr1[i]!=arr1[i-1]){
                System.out.println(arr1[i++]+" ");
            }
        }
        while(j<n){
            if(j>0 && arr2[j]!=arr2[j-1]){
                System.out.println(arr2[j++]+" ");
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int arr1[]={2,3,4,5,2};
        int arr2[]={1,2,3,4,5,1};
        union(arr1, arr2);
        union1(arr1, arr2);
    }
}
