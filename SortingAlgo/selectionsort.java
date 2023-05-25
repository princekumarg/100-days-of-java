package SortingAlgo;

public class selectionsort {
    public static void Selectiosort1(int arr[]) {
        int n=arr.length;
        for( int i = 0; i < n - 1; i++ ){
            int minIndex = i;
            for( int j = i + 1; j < n; j++){
                if ( arr[j] < arr[minIndex] ){
                    minIndex = j;
                }
            }
            int temp=arr[minIndex];//swap(arr[midIndex],arr[i])
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]) {
        int arr[]={64,25,12,11,23};
        Selectiosort1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
