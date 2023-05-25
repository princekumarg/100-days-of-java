package SortingAlgo;

public class Segregate {
    public static void SegregatePosAndNeg(int arr[]) {
        int temp[]=new int[arr.length],i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>=0){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
                arr[j]=temp[j];
        }
    }
    public static void SegregatePosAndNeg1(int arr[]) {
        int i=-1,j=arr.length;
        while(true){
            do{
                i++;
            }while(arr[i]<0);
            do{
                j--;
            }while(arr[j]>=0);
            if(i>=j){
                return;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String args[]) {
        int arr[]={-2,4,-3,6,1,0};
        SegregatePosAndNeg(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        SegregatePosAndNeg1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
