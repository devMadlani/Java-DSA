package gfg;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,8,9,10,1,2,3};
        System.out.println("Rotation Count is : " + rotationCount(nums));
    }
    static int rotationCount(int[] nums){
        int pivot = findPivot(nums);
        return pivot + 1;
    }
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
