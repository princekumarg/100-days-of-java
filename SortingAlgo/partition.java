package SortingAlgo;

public class partition {
    public static void Navic_partition(int arr[],int l,int h,int p){
        int temp[]=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            arr[i]=temp[i-l];
        }
    }
    public static int lamropartation(int arr[],int l,int h) {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[i]<pivot){
                i++;
                int sw=arr[i];
                arr[i]=arr[j];
                arr[j]=sw;
            }
        }
        int swa=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=swa;
        return i+1;
    }
    public static int RamrdoPartion(int arr[],int l,int h) {
        int pivote=arr[l];
        int i=l-1;
        int j=h-1;
        while(true){
            do{
                i++;
            }
            while(arr[i]<pivote);{
            }
            do{
                j--;
            }
            while(arr[j]>pivote);{
            }
            if(i>=j){
                return j;
            }
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
        }
    }
    public static void main(String args[]) {
        int arr[]={2,3,11,12,9,8};
        int l=0;
        int h=5;
        int p=5;
        Navic_partition(arr, l, h, p);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(RamrdoPartion(arr, l, h));
        System.out.println();
        System.out.print(lamropartation(arr, l, h));
    }
}
