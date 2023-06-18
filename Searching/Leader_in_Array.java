package Searching;
public class Leader_in_Array{
    public static void Leaders(int arr[],int n) {
        for(int i=0;i<n;i++){
            Boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
            System.out.println(arr[i]+" ");
        }
        }
    }
    public static void leaders(int arr[],int n) {
        int curr_leader=arr[n-1];
        System.out.println(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.println(curr_leader+" ");
            }
        }
    }
    public static void main(String args[]) {
        int []arr={7,10,4,10,6,5,2};
        int n=arr.length;
        Leaders(arr, n);
        System.out.println();
        leaders(arr, n);
    }
}