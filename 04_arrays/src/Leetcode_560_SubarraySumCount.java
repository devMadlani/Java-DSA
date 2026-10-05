import java.util.HashMap;
import java.util.Map;

public class Leetcode_560_SubarraySumCount {
    static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        map.put(0, 1);
        for (int val : nums) {
            sum += val;
            int rem = sum - k;
            if (map.containsKey(rem)) {
                cnt += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return cnt;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(subarraySum(arr, k));
    }
}
