// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package leetcode;

import java.util.Arrays;

public class Q_34_FindFirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 8, 8, 8, 10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

        // find occurrences
        int occurrences = ans[1] - ans[0] + 1;
        System.out.println("Occurrence of " + target + " in array is " + occurrences );
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = findIndex(nums, target, true);
        ans[1] = findIndex(nums, target, false);
        return ans;
    }

    public static int findIndex(int[] nums, int target, Boolean isSearchFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isSearchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

}
