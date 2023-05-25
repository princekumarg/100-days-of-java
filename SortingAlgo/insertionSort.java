package SortingAlgo;

public class insertionSort {
    public static void insertionSort1(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;//left shifting the values
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String args[]) {
        int arr[]={20,5,40,50,60,22,10};
        insertionSort1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
