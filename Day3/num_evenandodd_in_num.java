package Day3;
import java.util.*;
public class num_evenandodd_in_num {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=s.nextInt();
        int count_even=0;
        int count_odd=0;
        while(n!=0){
            int rem_even=n%10;
            int rem_odd=n%10;
            n=n/10;
            if(rem_even%2==0){
                count_even ++;
            }
            if(rem_odd%2!=0){
                count_odd ++;
            }
        }
        while(n!=0){

        }
        System.out.println("even="+count_even);
        System.out.println("odd="+count_odd);
    }
}
