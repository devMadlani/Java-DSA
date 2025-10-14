package leetcode;

public class Q_35_InsertPos {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
//        int[] nums = {1, 2, 3, 4, 5, 6, 8, 8, 10, 14};
//        int[] nums = {1, 2, 3, 4, 5, 6};
//        int[] nums = {1, 2, 8, 10, 14};
        int target = 2;
        System.out.println(insertPosition(nums, target));
    }

    static int insertPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
