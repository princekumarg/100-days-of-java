package Array;

public class maximum_circular_sum_sub_array {
    public static int max_circular_sum(int []arr) {
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr_sum=arr[i];
            int curr_max=arr[i];
            for(int j=1;j<arr.length;j++){
                int index=(i+j)%arr.length;
                curr_sum=curr_max+arr[index];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res=Math.max(res,curr_max);
        }
        return res;
    }
    public static void main(String args[]) {
        int []arr={2,3,4,5,-6};
        System.out.print(max_circular_sum(arr));
    }
}
