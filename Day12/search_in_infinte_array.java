package Day12;

public class search_in_infinte_array {
    public static int SearchInfinte(int []arr,int x) {
        int i=0;
        while(true){
            if(arr[i]==x){
                return i;
            }
            if(arr[i]>x){
                return -1;
            }
            i++;
        }
    }
    public static int Binarysearch(int []arr,int x) {//iterative approach
        int start=0,end=arr.length-1;
        while(start<=end){
            int median=(start+end)/2;
            if(arr[median]==x){
                return median;
            }
            else if(arr[median]>x){
                end=median-1;
            }
            else{
                start=median+1;
            }
        }
        return -1;
    }
    public static int SearchInfinte1(int []arr,int x) {
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x){
            return i;
        }
        return Binarysearch(arr, x);
    }
    public static void main(String args[]) {
        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(SearchInfinte(arr,10));
        System.out.println(SearchInfinte1(arr, 12));
    }
}
