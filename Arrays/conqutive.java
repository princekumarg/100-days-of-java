package Arrays;

public class conqutive {
    public static int evenodd(int arr[], int n) {
        int count = 1, res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i - 1] % 2 != 0 || arr[i] % 2 != 0 && arr[i - 1] % 2 == 0) {
                count++;
                res = Math.max(res, count);

            } else {
                count = 1;
            }
        }
        return res;
    }

    public static int maxconsetiveelm(int arr[]) {
        int max = 0;
        int count = 1;
        int el = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (max > count) {
                max = count;
                el = arr[i];
            }
        }
        return el;
    }

    public static int[] maxindexelm(int arr[]) {
        int max = 0;
        int count = 1;
        int lastindex = -1;
        int firstindex = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) {
                max = count;
                lastindex = i;
                firstindex = lastindex - max + 1;
            }
        }
        int res[] = new int[2];
        res[0] = firstindex;
        res[1] = lastindex;
        return res;
    }

    public static int conseqtiveeven(int arr[], int n) {
        int count = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                res = Math.max(res, count);
                count++;
            } else {
                count = 0;
            }
        }
        return res;
    }

    public static int evencount(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (numberdigit(arr[i]) % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    public static int numberdigit(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    public static boolean palinderom(int n) {
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pallindromarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (palinderom(arr[i]) == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        int n = arr.length;
        System.out.println(evenodd(arr, n));
        System.out.println(conseqtiveeven(arr, n));
        System.out.println(evencount(arr, n));
        System.out.println(pallindromarray(arr));
        int temp = 10;
        int res[] = consecutiveArray(arr, n, temp);
        System.out.println(res[0] + " " + res[1]);
    }
}
