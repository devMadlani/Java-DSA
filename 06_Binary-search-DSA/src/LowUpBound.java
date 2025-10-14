import java.util.Arrays;

public class LowUpBound {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 8, 8, 8, 10, 11, 14};
        int target = 8;
//        int lb = lowerBound(nums, target);
//        System.out.println(lb);
//        int up = upperBound(nums, target);
//        System.out.println(up);

        // also the lb and upperBound - 1  will be first and last occurrences of a target but just need to add one check
        // if lb points to hypothetical index(arr.length) or is not equal to target then will return {-1,-1 } because target is not found
        // else return the lb and up
        int[] firstLast = firstLastOccurrences(nums, target);
        System.out.println(Arrays.toString(firstLast));


    }

    static int lowerBound(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }

    static int upperBound(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }

    static int[] firstLastOccurrences(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{lb, upperBound(nums, target) - 1};
    }
}
