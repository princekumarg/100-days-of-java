package SortingAlgo;

public class sort_Most_efficent {
    public static void sort(int arr[]) {
        int temp[]=new int[arr.length],i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==2){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=temp[j];
        }
    }
    public static void sort1(int arr[]) {
        int lo=0,hi=arr.length-1,mid=0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
    }
    public static void main(String args[]) {
        int arr[]={1,2,0,0,1,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
