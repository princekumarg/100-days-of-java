package Searching;
import java.util.*;
public class median_of_two_array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        int a1=arr1.length;
        int b1=arr2.length;
        int []a={2,3,4,5};
        int []a2={3,4,5,6,7,8,9};
        int c1=a1 + b1;
        int[] arr3=new int[c1];
        int sum=0;
        System.out.println("Enter the elements for arr1");
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the elements for arr2");
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }
        for (int i=0; i<a1; i=i + 1) {
            arr3[i]=arr1[i];
        }
        for (int i=0;i<b1;i=i+1) {
            arr3[a1+i] = arr2[i];
        }
        for (int i=0; i<c1;i=i+1) {
            sum=sum+arr3[i];
            //System.out.print(arr3[i]);
        }
        long mid=sum/c1;
        System.out.println("Median="+mid);
        //System.out.println(sum);
        System.out.println(getmedian(a,a2));
    }
    public static double getmedian(int a[],int a2[]) {
        int n1=a.length,n2=a2.length;
        int start=0,end=n1;
        while(start<=end){
            int i1=(start+end)/2;//(start+end)>>1;
            int i2=(n1+n2+1)/2-i1;
            int min1=(i1==n1)?Integer.MAX_VALUE:a[i1];
            int max1=(i1==0)?Integer.MIN_VALUE:a[i1-1];
            int min2=(i2==n2)?Integer.MAX_VALUE:a2[i2];
            int max2=(i2==0)?Integer.MIN_VALUE:a2[i2-1];
            if(max2<=min1 && max1<=min2){
                if((n1+n2)%2==0){
                    return ((double)Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else{
                    return (double)Math.max(max1,max2);
                }
            }
            else if(max1>min2){
                end=i1-1;
            }
            else{
                start=i1+1;
            }
        }
        return 0.0;
    }
}
