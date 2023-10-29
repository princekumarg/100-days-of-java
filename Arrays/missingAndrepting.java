package Arrays;

public class missingAndrepting {
    public static int[] missrepte(int arr[]) {
        int n = arr.length;
        int miss = -1, rept = -1;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                miss = i;
            }
            if (cnt == 2) {
                rept = i;
            }
            if (miss != -1 && rept != -1) {
                break;
            }
        }
        int ans[] = { miss, rept };
        return ans;
    }

    public static int[] missrepte1(int arr[]) {
        int hash[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int miss = -1, rept = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (hash[i] == 0) {
                miss = i;
            }
            if (hash[i] == 2) {
                rept = i;
            }
            if (miss != -1 && rept != -1) {
                break;
            }
        }
        int ans[] = { miss, rept };
        return ans;
    }

    public static int[] missrepte3(int arr[]) {
        int n = arr.length;
        long sn = (n * (n + 1)) / 2;
        long sn2 = (n * (n + 1) * (2 * n + 1)) / 6;
        long SN = 0, SN2 = 0;
        for (int i = 0; i < n; i++) {
            SN += arr[i];
            SN2 += (arr[i] * arr[i]);
        }
        long val1 = sn - SN;
        long val2 = sn2 - SN2;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        int ans[] = { (int) x, (int) y };
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2 };
        int ans[] = missrepte(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
