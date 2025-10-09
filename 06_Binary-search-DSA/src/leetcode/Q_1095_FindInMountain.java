//https://leetcode.com/problems/find-in-mountain-array/

package leetcode;

public class Q_1095_FindInMountain {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 3, 2, 0};
        int target = 12;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int peak = peakInMountain(nums);
        int firstTry = orderAgnosticBS(nums, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(nums, target, peak + 1, nums.length - 1);
    }

    static int peakInMountain(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    static int orderAgnosticBS(int[] nums, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] > target) {
                    start = mid + 1;
                } else if (nums[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
