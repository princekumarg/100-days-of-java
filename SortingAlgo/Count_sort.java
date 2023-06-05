package SortingAlgo;

public class Count_sort {
    public static void countsort(int arr[],int n,int k) {
        int count[]=new int[k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<count[i];j++){
                arr[index]=i;
                index++;
            }
        }
    }
    public static void countsort1(int arr[],int n,int k) {
        int count[]=new int[k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<k;i++){
            count[i]=count[i-1]+count[i];
        }
        int output[]=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static void main(String args[]) {
        int arr[]={2,3,4,5,6,8};
        int k=3;
        int n=arr.length;
        countsort(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        countsort1(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
