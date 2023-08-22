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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    String str=s.next();
		    int n=str.length();
		    if(str.substring(0,n/2).equals(str.substring(n/2,n)))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
