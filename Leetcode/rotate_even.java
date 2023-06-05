package Leetcode;

public class rotate_even {
    public static void rotateEven(int []arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp; 
                i++;
                j--;
            }
        }        
    }
    public static void main(String args[]) {
        int arr[]={2,10,4,8,6};
        rotateEven(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
