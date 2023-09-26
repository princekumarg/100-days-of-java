package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class PairSum {
    public static boolean ispair(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ispair1(int arr[], int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(sum - arr[i])) {
                return true;
            }
            hs.add(arr[i]);
        }
        return true;
    }

    public static void ispair2(int arr[], int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(sum - arr[i])) {
                System.out.println("pair is =" + (sum - arr[i]) + " " + arr[i]);
            }
            hs.add(arr[i]);
        }

    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hash.containsKey(target - numbers[i])) {
                int toReturn[] = { hash.get(target - numbers[i]) + 1, i + 1 };
                return toReturn;
            }

            hash.put(numbers[i], i);

        }

        return null;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 15, -8 };
        int sum = 0;
        System.out.println(ispair(arr, sum));
        System.out.println(ispair1(arr, sum));
        ispair2(arr, sum);
        for (int i : twoSum(arr, sum)) {
            System.out.println(i);
        }
    }
}
