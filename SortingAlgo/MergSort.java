package SortingAlgo;
import java.util.*;
public class MergSort {
    public static void MergSort1(int arr1[],int arr2[]) {

        int c[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            c[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            c[arr1.length+i]=arr2[i];
        }
        Arrays.sort(c);
        for(int i=0;i<arr1.length+arr2.length;i++){
            System.out.println(c[i]+" ");
        }
    }
    public static void MergSort2(int arr1[],int m,int arr2[],int n) {
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                System.out.println(arr1[i]+" ");
                i++;
            }
            else{
                System.out.println(arr2[j]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.println(arr1[i]+" ");
            i++;
        }
        while(j<n){
            System.out.println(arr2[j]+" ");
            j++;
        }
    }
    public static void MergSort3(int arr1[],int m,int arr2[],int n) {
        {
            for(int i = 0 ; i < n ; i++)
                arr1[i + m] = arr2[i];
            Arrays.sort(arr1);
        }
    }
    public static void main(String args[]) {
        int arr1[]={2,7,5,3};
        int arr2[]={2,7,4,8,3};
        int m=arr1.length;
        int n=arr2.length;
        MergSort1(arr1, arr2);
        System.out.println();
        MergSort2(arr1,m, arr2,n);
        MergSort3(arr1, m, arr2, n);
    }
}
