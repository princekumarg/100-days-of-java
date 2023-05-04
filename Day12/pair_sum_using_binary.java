package Day12;
public class pair_sum_using_binary {
    public static int isPair(int []arr,int n,int x) {
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]+arr[right]==x){
                return 1;
            }
            else if(arr[left]+arr[right]>x){
                right--;
            }
            else{
                left++;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int arr[]={2,1,3,4,5,10};
        int n=arr.length;
        System.out.println(isPair(arr,n,15));
    }
}
