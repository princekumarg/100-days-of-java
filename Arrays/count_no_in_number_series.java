package Arrays;

import java.util.*;

public class count_no_in_number_series {
    public static int count_nodigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println(count_nodigits(n));
    }
}
