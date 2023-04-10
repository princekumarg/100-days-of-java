package Day8;

public class product_except_itself {
    public static void prodArray(int a[], int n){
        int p[] = new int[n], prod=1;
        for(int i=0; i<n; i++){
            prod = prod * a[i];
        }
        for(int i=0; i<n; i++){
            p[i] = prod / a[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(p[i] + " ");
        }
    }
}
