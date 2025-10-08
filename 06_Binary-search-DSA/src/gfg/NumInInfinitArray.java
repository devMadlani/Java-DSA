// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
package gfg;

import java.util.Arrays;
import java.util.Random;

public class NumInInfinitArray {

    public static void main(String[] args) {
        int[] nums = new Random()
                .ints(200, 1, 1001) // 200 numbers, between 1–1000
                .sorted()           // sort in ascending order
                .toArray();
        int ans = findAns(nums, 108);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }

    static int findAns(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int newStart = end;
            // end = prev end + sizeofBox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
            System.out.println(target + " " + nums[start] + " " + nums[end]);
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
