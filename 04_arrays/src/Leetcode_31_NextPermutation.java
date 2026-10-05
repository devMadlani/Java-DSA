import java.util.Arrays;

public class Leetcode_31_NextPermutation {
    static void nextPermutation(int[] nums) {
        int index = -1;
        // will find break point (long prefix)
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // will find > arr[index] such that value will be smallest large value than arr[index]
        for (int i = nums.length - 1; i >= index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // reverse index + 1 to n-1 element because we want next permutation bigger than current one
        reverse(nums, index + 1, nums.length - 1);
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
