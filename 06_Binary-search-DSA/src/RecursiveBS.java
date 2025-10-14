public class RecursiveBS {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;
        System.out.println(recursiveBs(nums, target, 0, nums.length - 1));
    }

    static int recursiveBs(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target > nums[mid]) {
            return recursiveBs(nums, target, mid + 1, end);
        } else if (target < nums[mid]) {
            return recursiveBs(nums, target, start, mid - 1);

        } else {
            return mid;
        }
    }
}
