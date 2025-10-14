package leetcode;

public class Q_540_singleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4,4, 5, 6, 6};
        int ans = findSingleElement(nums);
        System.out.println(ans);
    }

    static int findSingleElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        int start = 1;
        int end = nums.length - 2;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
