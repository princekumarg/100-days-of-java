package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class max_min {
    public static int maximum(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimum(int arr[], int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int removeminimax(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxi = 0, mini = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxi = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                mini = i;
            }
        }
        return Math.min(Math.max(maxi + 1, min + 1),
                Math.min(Math.max(n - maxi, n - mini), Math.max(maxi + 1 + n - mini, mini + n - maxi)));
    }

    public static int maximum1(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int secondlargest(int arr[], int n) {
        int max = arr[0];
        int res = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                res = max;
                max = arr[i];
            } else if (arr[i] != max) {
                if (res == -1 || arr[i] > res) {
                    res = arr[i];
                }
            }
        }
        return res;
    }

    public static int secondlargest1(int arr[], int n) {
        int max = maximum(arr, n);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                if (res == -1) {
                    res = arr[i];
                } else if (arr[i] > res) {
                    res = arr[i];
                }
            }
        }
        return res;
    }

    public static int secondsmallest(int arr[], int n) {
        int min = minimum(arr, n);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != min) {
                if (res == -1) {
                    res = arr[i];
                }
                if (arr[i] < res) {
                    res = arr[i];
                }
            }
        }
        return res;
    }

    public static int[] getSecondOrderElements(int arr[], int n) {
        int x = secondlargest(arr, n);
        int y = secondsmallest(arr, n);
        int res[] = new int[2];
        res[0] = x;
        res[1] = y;
        return res;

    }

    public static int maxoccurance(int arr[], int n) {
        int max = 0;
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                element = arr[i];
            }
        }
        return element;
    }

    public static int maxoccarr(int arr[], int n) {
        int max = 0;
        /*
         * Map<Integer, Integer> hm = new HashMap<>();
         * for (int i = 0; i < n; i++) {
         * if (hm.containsKey(arr[i])) {
         * hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
         * } else {
         * hm.put(arr[i], 1);
         * }
         * }
         * for (Map.Entry<Integer, Integer> en : hm.entrySet()) {
         * if (en.getValue() > max) {
         * max = en.getValue();
         * }
         * }
         */
        int count[] = new int[1000];
        int elem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                count[arr[i]]++;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (count[i] > max) {
                max = count[i];
                elem = arr[i];
            }
        }
        return elem;
    }

    public static int maxdiff(int arr[], int n) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        return max - min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4, 5 };
        int n = arr.length;
        System.out.println(maximum(arr, n));
        System.out.println(minimum(arr, n));
        System.out.println(maximum1(arr, n));
        System.out.println(secondlargest(arr, n));
        System.out.println(secondlargest1(arr, n));
        System.out.println(secondsmallest(arr, n));
        int res[] = getSecondOrderElements(arr, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        System.out.println(maxdiff(arr, n));
        System.out.println(maxoccurance(arr, n));
    }
}
