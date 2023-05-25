package Leetcode;

public class happynumber {
    public static int numSquareSum(int n){
        int squareSum = 0;
        while (n!= 0){
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }
    public static boolean isHappynumber(int n){
        int slow, fast;
        slow = fast = n;
        do{
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        }
        while (slow != fast);
            return (slow == 1);
    }
    public static void main(String args[]) {
        {
            int n = 13;
            if (isHappynumber(n))
                System.out.println(n +" is a Happy number");
            else
                System.out.println(n +" is not a Happy number");
        }
    }
    
}

