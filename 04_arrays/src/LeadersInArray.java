import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    static List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                ans.addFirst(nums[i]);
            }
//            max = Math.max(max, nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(leaders(arr));
    }
}
