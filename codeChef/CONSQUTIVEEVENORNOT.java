/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    sc.nextLine();
		    String s=sc.next();
		    s.toLowerCase();
		    if(n<4){
		        System.out.println("YES");
		    }
		    else{
		        int count=0;
		        for(int i=0;i<s.length();i++){
		            if(count==4){
		                break;
		            }
		            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		                count=0;
		            }
		            else{
		                count++;
		            }
		        }
		        if(count==4){
		            System.out.println("NO");
		        }
		        else{
		            System.out.println("YES");
		        }
		    }
		}
	}
}
