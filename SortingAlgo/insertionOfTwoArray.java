package SortingAlgo;

public class insertionOfTwoArray {
    public static void Insertion(int arr1[],int arr2[]) {
        int m=arr1.length;
        int n=arr2.length;
        for(int i=0;i<m;i++){
            if(i>0 && arr1[i]==arr1[i-1]){
                continue;
            }
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                    break;
                }
            }
        }
    }
    public static void Insertion1(int arr1[],int arr2[]) {
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                System.out.println(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String args[]) {
        int arr1[]={2,3,3,1,1};
        int arr2[]={3,3,4,5,3};
        Insertion(arr1, arr2);
        Insertion1(arr1, arr2);
    }
}
