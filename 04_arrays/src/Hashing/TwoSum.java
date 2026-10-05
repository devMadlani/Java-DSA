package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if (map.containsKey(more)) {
                return new int[]{map.get(more), i};
            }

            map.put(arr[i], i);

        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
