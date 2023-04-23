package Day3;

import java.util.Scanner;

public class fibioacci {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int n1=0,n2=1,sum;
        System.out.println(n1);
        for(int i=1;i<n;i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
}
