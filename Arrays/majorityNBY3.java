package Arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityNBY3 {
    public static List<Integer> majoritynby3(int arr[]) {
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != arr[i]) {
                cnt1 = 0;
                el1 = arr[i];
            } else if (cnt2 == 0 && el1 != arr[i]) {
                cnt2 = 0;
                el2 = arr[i];
            } else if (el1 == arr[i]) {
                cnt1++;
            } else if (el2 == arr[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1) {
                cnt1++;
            }
            if (arr[i] == el2) {
                cnt2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int mini = (int) n / 3 + 1;
        if (cnt1 >= mini) {
            ans.add(el1);
        }
        if (cnt2 >= mini) {
            ans.add(el2);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
