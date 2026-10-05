import java.util.ArrayList;
import java.util.List;

public class Leetcode_229_MajorityElement_II {
    static List<Integer> majorityElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (cnt1 == 0 && arr[i] != el2) {
                cnt1 = 1;
                el1 = arr[i];
            } else if (cnt2 == 0 && arr[i] != el1) {
                cnt2 = 1;
                el2 = arr[i];
            } else if (arr[i] == el1) cnt1++;
            else if (arr[i] == el2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int j : arr) {
            if (j == el1) {
                cnt1++;
            } else if (j == el2) {
                cnt2++;
            }
        }
        int min = (int) (arr.length / 3) + 1;
        if (cnt1 >= min) {
            ans.add(el1);
        }
        if (cnt2 >= min) {
            ans.add(el2);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(majorityElement(arr));

    }
}
